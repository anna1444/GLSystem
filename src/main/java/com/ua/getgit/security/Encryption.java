package com.ua.getgit.security;

import org.apache.commons.codec.digest.DigestUtils;

public class Encryption {
    public static String getPassword(String password){
        return DigestUtils.md5Hex(password);
    }
}
