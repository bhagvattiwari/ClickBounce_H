/*    */ package SIBMAILAPI.SIBMailHelper;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
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
/*    */ public class FileWrite
/*    */ {
/*    */   public void writeFile(String filePath, String finalRecord) throws IOException {
/* 21 */     BufferedWriter out = null;
/* 22 */     File f = new File(filePath);
/*    */     
/* 24 */     if (f.exists()) {
/* 25 */       out = new BufferedWriter(new FileWriter(filePath, true));
/* 26 */       out.write("\n");
/*    */     } else {
/* 28 */       f.createNewFile();
/* 29 */       out = new BufferedWriter(new FileWriter(filePath, false));
/*    */     } 
/* 31 */     out.write(finalRecord);
/* 32 */     out.close();
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SIBMAILAPI\SIBMailHelper\FileWrite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */