package com.contactsunny.poc.MongoDBSpringBootCascadingPOC.utils;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

@Component
public class EncryptionUtil {

    private BasicTextEncryptor textEncryptor = null;

    public EncryptionUtil() {

        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("some-random-passwprd");
    }


    public String encrypt(String textToEncrypt) {
        return this.textEncryptor.encrypt(textToEncrypt);
    }

    public String decrypt(String encryptedText) {
        return this.textEncryptor.decrypt(encryptedText);
    }
}
