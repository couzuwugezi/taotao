package com.springboot.taotao.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author liqiang
 * 时间 2018-11-04 22:07
 * 描述 md5加解密
 */
public class MD5Util {

    private static MessageDigest MD5 = null;

    private static Logger log = LoggerFactory.getLogger(MD5Util.class);

    static {
        try {
            MD5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ne) {
            log.error("MD5Util init error", ne);
        }
    }

    /**
     * 获得字符串的MD5值
     */
    public static String encryptMD5(String strInput) throws Exception {
        StringBuffer buf;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(strInput.getBytes("UTF-8"));
        byte b[] = md.digest();
        buf = new StringBuffer(b.length * 2);
        for (byte aB : b) {
            /* & 0xff转换无符号整型 */
            if ((aB & 0xff) < 0x10) {
                buf.append("0");
            }
            /* 转换16进制,下方法同 */
            buf.append(Long.toHexString(aB & 0xff));
        }

        return buf.toString();
    }

}
