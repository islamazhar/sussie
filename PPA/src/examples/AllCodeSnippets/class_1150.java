package examples.AllCodeSnippets; 
   public class class_1150 extends Activity {

String p_name;
String p_desc;

String path;
String timeStamp;
String senduri;
Boolean canshare=false;



 private static final String PERMISSION = "publish_actions";



int fun=0;
SharedPreferences settings;
WebDialog feedDialog;
Button facebookButton;

private static final String TAG = "Facebook";

  boolean isClicked=false;
private Session.StatusCallback statusCallback = 
        new Session.StatusCallback() {
        @Override
        public void call(Session session, 
                SessionState state, Exception exception) {
            onSessionStateChange(session, state, exception);
        }
    };
    private static final List<String> PERMISSIONS = Arrays.asList("publish_actions");
    private static final String PENDING_PUBLISH_KEY = "pendingPublishReauthorization";
    private boolean pendingPublishReauthorization = false;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_facebook);


    //facebook connector initialization************************
     Settings.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
     Session session = Session.getActiveSession();
     if (session == null) { 
         if (savedInstanceState != null) {
             session = Session.restoreSession(this, null, statusCallback, savedInstanceState);
         }
         if (session == null) {
             session = new Session(this);
         }
         Session.setActiveSession(session);
         if (session.getState().equals(SessionState.CREATED_TOKEN_LOADED)) {

         }
     }

     try {
         PackageInfo info = getPackageManager().getPackageInfo(
                 getApplicationContext().getPackageName(), PackageManager.GET_SIGNATURES);
         for (Signature signature : info.signatures) 
         {
             MessageDigest md = MessageDigest.getInstance("SHA");
             md.update(signature.toByteArray());
             Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
         }

     } catch (NameNotFoundException ex) {
     } catch (NoSuchAlgorithmException ex2) {
     }









}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.facebook, menu);
    return true;
}



@Override
protected void onStart() {
    Log.d(TAG, "onStart");
    super.onStart();


    Session.getActiveSession().addCallback(statusCallback);
}
@Override
protected void onDestroy() {
    Log.d(TAG, "onDestroy");
    super.onDestroy();



}
@Override
public void onStop() {
    Log.d(TAG, "onStop");
    super.onStop();

    Session.getActiveSession().removeCallback(statusCallback);
}

public void onClickPublishPic(View v) {

    //postPhoto();
        fun=1;
        onClickLogin();
        isClicked=true;



}
public void onClickPublishStory(View v) {

    //postPhoto();
        fun=2;
        onClickLogin();
        isClicked=true;



}


protected void onSessionStateChange(Session session, SessionState state,
        Exception exception) {
    session = Session.getActiveSession();
    if (session.isOpened()) {
        if(fun==1){
        postPhoto();
        }else if(fun==2){
            publishStory();
        }
    } else {
        //nothing .. maybe message
    }

}

private void onClickLogin() {


        Session.openActiveSession(this, true, statusCallback);

}
 @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Session session = Session.getActiveSession();
        Session.saveSession(session, outState);
    }

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

        Session.getActiveSession().onActivityResult(this, requestCode, resultCode, data);
        //Session.openActiveSession(this, true, statusCallback);

    Log.d("msg"," "+resultCode);

}


 private void postPhoto() {

     Session session = Session.getActiveSession();
        if (session != null) {
            //pendingAction = action;
            if (hasPublishPermission()) {
                Bitmap image = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher);
                Request request = Request.newUploadPhotoRequest(session, image, new Request.Callback() {
                    @Override
                    public void onCompleted(Response response) {
                        //showPublishResult(getString(R.string.app_name), response.getGraphObject(), response.getError());
                        Toast.makeText(getBaseContext(),
                                "Image Uploaded to facebook",
                                Toast.LENGTH_SHORT).show();
                    }
                });

                Bundle params = request.getParameters();
                params.putString("name", "My Science Lab Diagram");
                request.setParameters(params);
                Request.executeBatchAsync(request);

                // We can do the action right away.
                //handlePendingAction();
                //return;
            } else if (session.isOpened()) {
                // We need to get new permissions, then complete the action when we get called back.
                session.requestNewPublishPermissions(new Session.NewPermissionsRequest(this, PERMISSION));
                //return;
            }
        }



    }

 private void publishStory() {
        Session session = Session.getActiveSession();

        if (session != null){

            // Check for publish permissions    
            List<String> permissions = session.getPermissions();
            if (!isSubsetOf(PERMISSIONS, permissions)) {
                pendingPublishReauthorization = true;
                Session.NewPermissionsRequest newPermissionsRequest = new Session
                        .NewPermissionsRequest(this, PERMISSIONS);
            session.requestNewPublishPermissions(newPermissionsRequest);
                return;
            }

            Bundle postParams = new Bundle();
            postParams.putString("name", "Facebook SDK for Android");
            postParams.putString("caption", "Build great social apps and get more installs.");
            postParams.putString("description", "The Facebook SDK for Android makes it easier and faster to develop Facebook integrated Android apps.");
            postParams.putString("link", "https://developers.facebook.com/android");
            postParams.putString("picture", "https://raw.github.com/fbsamples/ios-3.x-howtos/master/Images/iossdk_logo.png");

            Request.Callback callback= new Request.Callback() {
                public void onCompleted(Response response) {
                    JSONObject graphResponse = response
                                               .getGraphObject()
                                               .getInnerJSONObject();
                    String postId = null;
                    try {
                        postId = graphResponse.getString("id");
                    } catch (JSONException e) {
                        Log.i(TAG,
                            "JSON error "+ e.getMessage());
                    }
                    FacebookRequestError error = response.getError();
                    if (error != null) {
                        Toast.makeText(FacebookActivity.this
                             .getApplicationContext(),
                             error.getErrorMessage(),
                             Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(FacebookActivity.this
                                 .getApplicationContext(), 
                                 postId,
                                 Toast.LENGTH_LONG).show();
                    }
                }
            };

            Request request = new Request(session, "me/feed", postParams, 
                                  HttpMethod.POST, callback);

            RequestAsyncTask task = new RequestAsyncTask(request);
            task.execute();
        }

    }


 private boolean isSubsetOf(Collection<String> subset, Collection<String> superset) {
        for (String string : subset) {
            if (!superset.contains(string)) {
                return false;
            }
        }
        return true;
    }

 private boolean hasPublishPermission() {
        Session session = Session.getActiveSession();
        return session != null &&       session.getPermissions().contains("publish_actions");
     }
