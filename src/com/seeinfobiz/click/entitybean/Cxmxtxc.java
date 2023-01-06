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
/*    */ public class Cxmxtxc
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixcmtc;
/*    */   private Long ttlxprcs;
/*    */   private Long ttlxthrd;
/*    */   private String vmxoptn;
/*    */   
/*    */   public Cxmxtxc() {}
/*    */   
/*    */   public Cxmxtxc(Long ixcmtc) {
/* 23 */     this.ixcmtc = ixcmtc;
/*    */   }
/*    */   public Cxmxtxc(Long ixcmtc, Long ttlxprcs, Long ttlxthrd, String vmxoptn) {
/* 26 */     this.ixcmtc = ixcmtc;
/* 27 */     this.ttlxprcs = ttlxprcs;
/* 28 */     this.ttlxthrd = ttlxthrd;
/* 29 */     this.vmxoptn = vmxoptn;
/*    */   }
/*    */   
/*    */   public Long getIxcmtc() {
/* 33 */     return this.ixcmtc;
/*    */   }
/*    */   
/*    */   public void setIxcmtc(Long ixcmtc) {
/* 37 */     this.ixcmtc = ixcmtc;
/*    */   }
/*    */   public Long getTtlxprcs() {
/* 40 */     return this.ttlxprcs;
/*    */   }
/*    */   
/*    */   public void setTtlxprcs(Long ttlxprcs) {
/* 44 */     this.ttlxprcs = ttlxprcs;
/*    */   }
/*    */   public Long getTtlxthrd() {
/* 47 */     return this.ttlxthrd;
/*    */   }
/*    */   
/*    */   public void setTtlxthrd(Long ttlxthrd) {
/* 51 */     this.ttlxthrd = ttlxthrd;
/*    */   }
/*    */   public String getVmxoptn() {
/* 54 */     return this.vmxoptn;
/*    */   }
/*    */   
/*    */   public void setVmxoptn(String vmxoptn) {
/* 58 */     this.vmxoptn = vmxoptn;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxmxtxc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */