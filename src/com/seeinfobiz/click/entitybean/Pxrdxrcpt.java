/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxrdxrcpt
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixcnt;
/*    */   private String ixem;
/*    */   private String exsntxdt;
/*    */   private String exrdxdt;
/*    */   private String ixprcs;
/*    */   private String cxcrdxnum;
/*    */   private Date pxprcxdt;
/*    */   
/*    */   public Pxrdxrcpt() {}
/*    */   
/*    */   public Pxrdxrcpt(Long ixcnt, String ixem) {
/* 27 */     this.ixcnt = ixcnt;
/* 28 */     this.ixem = ixem;
/*    */   }
/*    */   public Pxrdxrcpt(Long ixcnt, String ixem, String exsntxdt, String exrdxdt, String ixprcs, String cxcrdxnum, Date pxprcxdt) {
/* 31 */     this.ixcnt = ixcnt;
/* 32 */     this.ixem = ixem;
/* 33 */     this.exsntxdt = exsntxdt;
/* 34 */     this.exrdxdt = exrdxdt;
/* 35 */     this.ixprcs = ixprcs;
/* 36 */     this.cxcrdxnum = cxcrdxnum;
/* 37 */     this.pxprcxdt = pxprcxdt;
/*    */   }
/*    */   
/*    */   public Long getIxcnt() {
/* 41 */     return this.ixcnt;
/*    */   }
/*    */   
/*    */   public void setIxcnt(Long ixcnt) {
/* 45 */     this.ixcnt = ixcnt;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getIxem() {
/* 50 */     return this.ixem;
/*    */   }
/*    */   
/*    */   public void setIxem(String ixem) {
/* 54 */     this.ixem = ixem;
/*    */   }
/*    */   public String getExsntxdt() {
/* 57 */     return this.exsntxdt;
/*    */   }
/*    */   
/*    */   public void setExsntxdt(String exsntxdt) {
/* 61 */     this.exsntxdt = exsntxdt;
/*    */   }
/*    */   public String getExrdxdt() {
/* 64 */     return this.exrdxdt;
/*    */   }
/*    */   
/*    */   public void setExrdxdt(String exrdxdt) {
/* 68 */     this.exrdxdt = exrdxdt;
/*    */   }
/*    */   public String getIxprcs() {
/* 71 */     return this.ixprcs;
/*    */   }
/*    */   
/*    */   public void setIxprcs(String ixprcs) {
/* 75 */     this.ixprcs = ixprcs;
/*    */   }
/*    */   public String getCxcrdxnum() {
/* 78 */     return this.cxcrdxnum;
/*    */   }
/*    */   
/*    */   public void setCxcrdxnum(String cxcrdxnum) {
/* 82 */     this.cxcrdxnum = cxcrdxnum;
/*    */   }
/*    */   public Date getPxprcxdt() {
/* 85 */     return this.pxprcxdt;
/*    */   }
/*    */   
/*    */   public void setPxprcxdt(Date pxprcxdt) {
/* 89 */     this.pxprcxdt = pxprcxdt;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxrdxrcpt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */