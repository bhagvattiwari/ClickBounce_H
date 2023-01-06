/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Usreqa
/*    */   implements Serializable
/*    */ {
/*    */   private long ixr;
/*    */   private Pxusrxm pxusrxm;
/*    */   private String uxactdtl;
/*    */   
/*    */   public Usreqa() {}
/*    */   
/*    */   public Usreqa(long ixr) {
/* 20 */     this.ixr = ixr;
/*    */   }
/*    */   public Usreqa(long ixr, Pxusrxm pxusrxm, String uxactdtl) {
/* 23 */     this.ixr = ixr;
/* 24 */     this.pxusrxm = pxusrxm;
/* 25 */     this.uxactdtl = uxactdtl;
/*    */   }
/*    */   
/*    */   public long getIxr() {
/* 29 */     return this.ixr;
/*    */   }
/*    */   
/*    */   public void setIxr(long ixr) {
/* 33 */     this.ixr = ixr;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 36 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 40 */     this.pxusrxm = pxusrxm;
/*    */   }
/*    */   public String getUxactdtl() {
/* 43 */     return this.uxactdtl;
/*    */   }
/*    */   
/*    */   public void setUxactdtl(String uxactdtl) {
/* 47 */     this.uxactdtl = uxactdtl;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Usreqa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */