/**
 * 
 */
package ppa;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import polyglot.ast.Stmt;
import soot.Body;
import soot.BodyTransformer;
import soot.PackManager;

/**
 * @author islamazhar
 *
 */

import soot.Scene;
import soot.SootClass;
import soot.Transform;
import soot.Unit;
import soot.options.Options;

public class CreateJimple extends BodyTransformer{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String mainclass = "ppa.HelloThread";
		
		//String javaHome = System.getenv("JAVA_HOME");
		//String [] loadClasses = ("/jre/lib/rt.jar");
		String javahome = "/usr/lib/jvm/java-8-openjdk-amd64";
		//String javapath = "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/islamazhar/Desktop/a1/out/production/a1:/home/islamazhar/Desktop/a1/libs/soot-3.3.0.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar";
		//String javapath = System.getProperty("java.class.path");
		//System.out.println(javapath);
        String path = javahome+"/jre/lib/rt.jar"+File.pathSeparator+javahome+"/jre/lib/jce.jar";
        System.out.println(path);
        Scene.v().setSootClassPath(path);

        //add an intra-procedural analysis phase to Soot
        CreateJimple analysis = new CreateJimple();
        PackManager.v().getPack("jtp").add(new Transform("jtp.TestSoot", analysis));

        //load and set main class
        Options.v().set_app(true);
        SootClass appclass = Scene.v().loadClassAndSupport(mainclass);
        Scene.v().setMainClass(appclass);
        Scene.v().loadNecessaryClasses();

        //start working
        PackManager.v().runPacks();
        
      
	}

	@Override
	protected void internalTransform(Body b, String phaseName, Map options) {
			Iterator<Unit> it = b.getUnits().snapshotIterator();
		    while(it.hasNext()){
		    	Stmt stmt = (Stmt)it.next();

		    	System.out.println(stmt);
		    }
	}

}
