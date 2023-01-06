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
/*    */ 
/*    */ public class Pxmxc
/*    */   implements Serializable
/*    */ {
/*    */   private Long sxno;
/*    */   private String crn;
/*    */   private Long ixprcs;
/*    */   private Long ixstmt;
/*    */   private Long ixprdt;
/*    */   
/*    */   public Pxmxc() {}
/*    */   
/*    */   public Pxmxc(Long sxno) {
/* 24 */     this.sxno = sxno;
/*    */   }
/*    */   public Pxmxc(Long sxno, String crn, Long ixprcs, Long ixstmt, Long ixprdt) {
/* 27 */     this.sxno = sxno;
/* 28 */     this.crn = crn;
/* 29 */     this.ixprcs = ixprcs;
/* 30 */     this.ixstmt = ixstmt;
/* 31 */     this.ixprdt = ixprdt;
/*    */   }
/*    */   
/*    */   public Long getSxno() {
/* 35 */     return this.sxno;
/*    */   }
/*    */   
/*    */   public void setSxno(Long sxno) {
/* 39 */     this.sxno = sxno;
/*    */   }
/*    */   public String getCrn() {
/* 42 */     return this.crn;
/*    */   }
/*    */   
/*    */   public void setCrn(String crn) {
/* 46 */     this.crn = crn;
/*    */   }
/*    */   public Long getIxprcs() {
/* 49 */     return this.ixprcs;
/*    */   }
/*    */   
/*    */   public void setIxprcs(Long ixprcs) {
/* 53 */     this.ixprcs = ixprcs;
/*    */   }
/*    */   public Long getIxstmt() {
/* 56 */     return this.ixstmt;
/*    */   }
/*    */   
/*    */   public void setIxstmt(Long ixstmt) {
/* 60 */     this.ixstmt = ixstmt;
/*    */   }
/*    */   public Long getIxprdt() {
/* 63 */     return this.ixprdt;
/*    */   }
/*    */   
/*    */   public void setIxprdt(Long ixprdt) {
/* 67 */     this.ixprdt = ixprdt;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmxc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */