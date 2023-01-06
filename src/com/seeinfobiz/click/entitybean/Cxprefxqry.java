/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Cxprefxqry
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixd;
/*    */   private Long crn;
/*    */   private String cxqryxid;
/*    */   
/*    */   public Cxprefxqry() {}
/*    */   
/*    */   public Cxprefxqry(Long ixd) {
/* 19 */     this.ixd = ixd;
/*    */   }
/*    */   
/*    */   public Cxprefxqry(Long ixd, Long crn, String cxqryxid) {
/* 23 */     this.ixd = ixd;
/* 24 */     this.crn = crn;
/* 25 */     this.cxqryxid = cxqryxid;
/*    */   }
/*    */   
/*    */   public Long getCrn() {
/* 29 */     return this.crn;
/*    */   }
/*    */   
/*    */   public void setCrn(Long crn) {
/* 33 */     this.crn = crn;
/*    */   }
/*    */   
/*    */   public Long getIxd() {
/* 37 */     return this.ixd;
/*    */   }
/*    */   
/*    */   public void setIxd(Long ixd) {
/* 41 */     this.ixd = ixd;
/*    */   }
/*    */   
/*    */   public String getCxqryxid() {
/* 45 */     return this.cxqryxid;
/*    */   }
/*    */   
/*    */   public void setCxqryxid(String cxqryxid) {
/* 49 */     this.cxqryxid = cxqryxid;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxprefxqry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */