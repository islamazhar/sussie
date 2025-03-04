package examples.RSA; 
public class class_619 { 
public static PKCS10CertificationRequest generateCSRFile(KeyPair keyPair, KeyUsage keyUsage) throws IOException, OperatorCreationException {
    String principal = "CN=" + Utils.getCertificateCommonName() + ", O=" + Utils.getCertificateOrganization();
    AsymmetricKeyParameter privateKey = PrivateKeyFactory.createKey(keyPair.getPrivate().getEncoded());
    AlgorithmIdentifier signatureAlgorithm = new DefaultSignatureAlgorithmIdentifierFinder().find("SHA1WITHRSA");
    AlgorithmIdentifier digestAlgorithm = new DefaultDigestAlgorithmIdentifierFinder().find("SHA-1");
    ContentSigner signer = new BcRSAContentSignerBuilder(signatureAlgorithm, digestAlgorithm).build(privateKey);

    PKCS10CertificationRequestBuilder csrBuilder = new JcaPKCS10CertificationRequestBuilder(new X500Name(principal), keyPair.getPublic());
    ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
    extensionsGenerator.addExtension(Extension.basicConstraints, true, new BasicConstraints(true));
    extensionsGenerator.addExtension(Extension.keyUsage, true, keyUsage);
    csrBuilder.addAttribute(PKCSObjectIdentifiers.pkcs_9_at_extensionRequest, extensionsGenerator.generate());
    PKCS10CertificationRequest csr = csrBuilder.build(signer);

    return csr;
}

}