/*    */ package com.seeinfobiz.click.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import org.apache.xerces.parsers.DOMParser;
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.NamedNodeMap;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ import org.xml.sax.SAXException;
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
/*    */ public class SIBXmlWorker
/*    */ {
/*    */   public static void main(String[] args) throws SAXException, IOException {
/* 26 */     SIBXmlWorker sibXmlWorker = new SIBXmlWorker();
/* 27 */     String str = sibXmlWorker.ParseXmlToKeyValue("C:\\Data\\ETL\\JobParam.xml", "Param", "Key", "Value", "isString", " --context_param ");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String ParseXmlToKeyValue(String fileName, String parentTag, String key, String value, String type, String keyPreFix) {
/* 37 */     StringBuilder builder = new StringBuilder();
/* 38 */     boolean isFileExist = false;
/* 39 */     DOMParser parser = new DOMParser();
/*    */     try {
/* 41 */       parser.parse(fileName);
/*    */       
/* 43 */       Document dom = parser.getDocument();
/* 44 */       NodeList games = dom.getElementsByTagName(parentTag);
/* 45 */       for (int i = 0; i < games.getLength(); i++) {
/* 46 */         Node aNode = games.item(i);
/* 47 */         NamedNodeMap attributes = aNode.getAttributes();
/* 48 */         builder.append(keyPreFix + attributes.getNamedItem(key).getNodeValue() + " = " + (((attributes.getNamedItem(type).getNodeValue() == null) ? ("Yes" == null) : attributes.getNamedItem(type).getNodeValue().equals("Yes")) ? ("\"" + attributes.getNamedItem(value).getNodeValue() + "\"") : attributes.getNamedItem(value).getNodeValue()));
/*    */       
/*    */       }
/*    */ 
/*    */     
/*    */     }
/* 54 */     catch (SAXException ex) {
/* 55 */       Logger.getLogger(SIBXmlWorker.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 56 */     } catch (IOException ex) {
/* 57 */       Logger.getLogger(SIBXmlWorker.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */     
/* 60 */     return builder.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String ParseXmlToKeyValue(String key, String value, String type, String keyPreFix) {
/* 66 */     StringBuilder builder = new StringBuilder();
/* 67 */     boolean isFileExist = false;
/* 68 */     builder.append(keyPreFix + key + " = " + value);
/*    */ 
/*    */ 
/*    */     
/* 72 */     return builder.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\SIBXmlWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */