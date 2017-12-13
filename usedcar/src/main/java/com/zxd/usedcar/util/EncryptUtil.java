package com.zxd.usedcar.util;

import org.apache.commons.codec.digest.DigestUtils;



public class EncryptUtil {
	public static String md5(String passwd){
		return DigestUtils.md5Hex(passwd);
	}
}
