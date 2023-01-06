/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxdeptxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixdpt;
/*    */   private String nmxdpt;
/*    */   private String rmxdpt;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/* 22 */   private Set pxusrxms = new HashSet(0);
/*    */ 
/*    */   
/*    */   public Pxdeptxm() {}
/*    */ 
/*    */   
/*    */   public Pxdeptxm(Long ixdpt) {
/* 29 */     this.ixdpt = ixdpt;
/*    */   }
/*    */   public Pxdeptxm(Long ixdpt, String nmxdpt, String rmxdpt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxusrxms) {
/* 32 */     this.ixdpt = ixdpt;
/* 33 */     this.nmxdpt = nmxdpt;
/* 34 */     this.rmxdpt = rmxdpt;
/* 35 */     this.dxctd = dxctd;
/* 36 */     this.bxctd = bxctd;
/* 37 */     this.dxmfdxlst = dxmfdxlst;
/* 38 */     this.bxmfdxlst = bxmfdxlst;
/* 39 */     this.pxusrxms = pxusrxms;
/*    */   }
/*    */   
/*    */   public Long getIxdpt() {
/* 43 */     return this.ixdpt;
/*    */   }
/*    */   
/*    */   public void setIxdpt(Long ixdpt) {
/* 47 */     this.ixdpt = ixdpt;
/*    */   }
/*    */   public String getNmxdpt() {
/* 50 */     return this.nmxdpt;
/*    */   }
/*    */   
/*    */   public void setNmxdpt(String nmxdpt) {
/* 54 */     this.nmxdpt = nmxdpt;
/*    */   }
/*    */   public String getRmxdpt() {
/* 57 */     return this.rmxdpt;
/*    */   }
/*    */   
/*    */   public void setRmxdpt(String rmxdpt) {
/* 61 */     this.rmxdpt = rmxdpt;
/*    */   }
/*    */   public Date getDxctd() {
/* 64 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 68 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 71 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 75 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 78 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 82 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 85 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 89 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   public Set getPxusrxms() {
/* 92 */     return this.pxusrxms;
/*    */   }
/*    */   
/*    */   public void setPxusrxms(Set pxusrxms) {
/* 96 */     this.pxusrxms = pxusrxms;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxdeptxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */