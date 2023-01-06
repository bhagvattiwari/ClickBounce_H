/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Cxvarxlsxt
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixvarxlst;
/*    */   private String mnxnmx;
/*    */   private String varxblxnm;
/*    */   
/*    */   public Cxvarxlsxt() {}
/*    */   
/*    */   public Cxvarxlsxt(Long ixvarxlst) {
/* 21 */     this.ixvarxlst = ixvarxlst;
/*    */   }
/*    */   public Cxvarxlsxt(Long ixvarxlst, String mnxnmx, String varxblxnm) {
/* 24 */     this.ixvarxlst = ixvarxlst;
/* 25 */     this.mnxnmx = mnxnmx;
/* 26 */     this.varxblxnm = varxblxnm;
/*    */   }
/*    */   
/*    */   public Long getIxvarxlst() {
/* 30 */     return this.ixvarxlst;
/*    */   }
/*    */   
/*    */   public void setIxvarxlst(Long ixvarxlst) {
/* 34 */     this.ixvarxlst = ixvarxlst;
/*    */   }
/*    */   public String getMnxnmx() {
/* 37 */     return this.mnxnmx;
/*    */   }
/*    */   
/*    */   public void setMnxnmx(String mnxnmx) {
/* 41 */     this.mnxnmx = mnxnmx;
/*    */   }
/*    */   public String getVarxblxnm() {
/* 44 */     return this.varxblxnm;
/*    */   }
/*    */   
/*    */   public void setVarxblxnm(String varxblxnm) {
/* 48 */     this.varxblxnm = varxblxnm;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxvarxlsxt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */