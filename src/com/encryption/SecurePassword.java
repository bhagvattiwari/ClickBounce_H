/*    */ package com.encryption;
/*    */ 
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.spec.SecretKeySpec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SecurePassword
/*    */ {
/*    */   private static final String Algorithm = "DES";
/*    */   private static final String PASSWORD_CRYPT_KEY = "__f5ads_";
/*    */   
/*    */   public static String byte2hex(byte[] b) {
/* 19 */     String hs = "";
/* 20 */     for (byte element : b) {
/*    */       
/* 22 */       String s2 = Integer.toHexString(element & 0xFF);
/* 23 */       if (s2.length() == 1) {
/*    */         
/* 25 */         hs = hs + "0" + s2;
/*    */       } else {
/*    */         
/* 28 */         hs = hs + s2;
/*    */       } 
/*    */     } 
/* 31 */     return hs.toUpperCase();
/*    */   }
/*    */   
/*    */   public static String decode(String input) throws Exception {
/* 35 */     SecretKey deskey = new SecretKeySpec(getKey(), "DES");
/* 36 */     Cipher c1 = Cipher.getInstance("DES");
/* 37 */     c1.init(2, deskey);
/* 38 */     byte[] clearByte = c1.doFinal(hex2byte(input));
/* 39 */     return new String(clearByte);
/*    */   }
/*    */   
/*    */   public static String encode(String input) throws Exception {
/* 43 */     SecretKey deskey = new SecretKeySpec(getKey(), "DES");
/* 44 */     Cipher c1 = Cipher.getInstance("DES");
/* 45 */     c1.init(1, deskey);
/* 46 */     byte[] cipherByte = c1.doFinal(input.getBytes());
/* 47 */     return byte2hex(cipherByte);
/*    */   }
/*    */   
/*    */   public static byte[] getKey() throws Exception {
/* 51 */     return "__f5ads_".getBytes();
/*    */   }
/*    */   
/*    */   public static byte[] hex2byte(String h) {
/* 55 */     byte[] ret = new byte[h.length() / 2];
/* 56 */     for (int i = 0; i < ret.length; i++) {
/* 57 */       ret[i] = Integer.decode("#" + h.substring(2 * i, 2 * i + 2)).byteValue();
/*    */     }
/* 59 */     return ret;
/*    */   }
/*    */   public static void main(String[] args) {
/* 62 */     String text = "CLICKPSS123";
/* 63 */     byte[] bytes = text.getBytes();
/* 64 */     System.out.println(bytes);
/* 65 */     String byte2hex = byte2hex(bytes);
/* 66 */     System.out.println(byte2hex);
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\encryption\SecurePassword.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */