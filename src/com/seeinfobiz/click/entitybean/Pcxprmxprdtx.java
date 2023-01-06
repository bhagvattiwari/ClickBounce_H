/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pcxprmxprdtx
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixprmtprd;
/*    */   private Long ixprm;
/*    */   private Long ixprdt;
/*    */   
/*    */   public Pcxprmxprdtx() {}
/*    */   
/*    */   public Pcxprmxprdtx(Long ixprmtprd) {
/* 20 */     this.ixprmtprd = ixprmtprd;
/*    */   }
/*    */   public Pcxprmxprdtx(Long ixprmtprd, Long ixprm, Long ixprdt) {
/* 23 */     this.ixprmtprd = ixprmtprd;
/* 24 */     this.ixprm = ixprm;
/* 25 */     this.ixprdt = ixprdt;
/*    */   }
/*    */   
/*    */   public Long getIxprmtprd() {
/* 29 */     return this.ixprmtprd;
/*    */   }
/*    */   
/*    */   public void setIxprmtprd(Long ixprmtprd) {
/* 33 */     this.ixprmtprd = ixprmtprd;
/*    */   }
/*    */   public Long getIxprm() {
/* 36 */     return this.ixprm;
/*    */   }
/*    */   
/*    */   public void setIxprm(Long ixprm) {
/* 40 */     this.ixprm = ixprm;
/*    */   }
/*    */   public Long getIxprdt() {
/* 43 */     return this.ixprdt;
/*    */   }
/*    */   
/*    */   public void setIxprdt(Long ixprdt) {
/* 47 */     this.ixprdt = ixprdt;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pcxprmxprdtx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */