/*    */ package com.seeinfobiz.click.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommonLabelSetting
/*    */ {
/*    */   public static Map setLabel() {
/* 20 */     Map<String, String> lblMap = new HashMap<String, String>();
/* 21 */     lblMap.put("CGEN", "Complete Generation");
/* 22 */     lblMap.put("FGEN", "Failed Generation");
/* 23 */     lblMap.put("SGEN", "Selected Generation");
/* 24 */     lblMap.put("CREGEN", "Complete Regeneration ");
/* 25 */     lblMap.put("SREGEN", "Selected Regeneration ");
/* 26 */     return lblMap;
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getMapVlaue(String key, Map mapValue) {
/* 31 */     return (String)mapValue.get(key.toString());
/*    */   }
/*    */   
/*    */   public static Map setInetSetting() {
/* 35 */     HashMap<String, String> inetCodeMap = new HashMap<String, String>();
/* 36 */     inetCodeMap.put("PDF", "9");
/* 37 */     inetCodeMap.put("PS", "14");
/* 38 */     inetCodeMap.put("TEXT", "11");
/* 39 */     inetCodeMap.put("EXCEL", "1003");
/* 40 */     return inetCodeMap;
/*    */   }
/*    */   public static void main(String[] args) {
/* 43 */     Map m = setInetSetting();
/* 44 */     String vale = getMapVlaue("PDF", m);
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\CommonLabelSetting.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */