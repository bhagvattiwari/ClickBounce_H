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
/*    */ public class Pxaltxevtxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixalrt;
/*    */   private String nmxevnt;
/*    */   private String crtraxalrt;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/* 22 */   private Set<Pxaltxevtxdts> pxaltxevtxdtses = new HashSet<Pxaltxevtxdts>(0);
/*    */ 
/*    */   
/*    */   public Pxaltxevtxm() {}
/*    */ 
/*    */   
/*    */   public Pxaltxevtxm(Long ixalrt) {
/* 29 */     this.ixalrt = ixalrt;
/*    */   }
/*    */   public Pxaltxevtxm(Long ixalrt, String nmxevnt, String crtraxalrt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxaltxevtxdts> pxaltxevtxdtses) {
/* 32 */     this.ixalrt = ixalrt;
/* 33 */     this.nmxevnt = nmxevnt;
/* 34 */     this.crtraxalrt = crtraxalrt;
/* 35 */     this.dxctd = dxctd;
/* 36 */     this.bxctd = bxctd;
/* 37 */     this.dxmfdxlst = dxmfdxlst;
/* 38 */     this.bxmfdxlst = bxmfdxlst;
/* 39 */     this.pxaltxevtxdtses = pxaltxevtxdtses;
/*    */   }
/*    */   
/*    */   public Long getIxalrt() {
/* 43 */     return this.ixalrt;
/*    */   }
/*    */   
/*    */   public void setIxalrt(Long ixalrt) {
/* 47 */     this.ixalrt = ixalrt;
/*    */   }
/*    */   public String getNmxevnt() {
/* 50 */     return this.nmxevnt;
/*    */   }
/*    */   
/*    */   public void setNmxevnt(String nmxevnt) {
/* 54 */     this.nmxevnt = nmxevnt;
/*    */   }
/*    */   public String getCrtraxalrt() {
/* 57 */     return this.crtraxalrt;
/*    */   }
/*    */   
/*    */   public void setCrtraxalrt(String crtraxalrt) {
/* 61 */     this.crtraxalrt = crtraxalrt;
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
/*    */   public Set<Pxaltxevtxdts> getPxaltxevtxdtses() {
/* 92 */     return this.pxaltxevtxdtses;
/*    */   }
/*    */   
/*    */   public void setPxaltxevtxdtses(Set<Pxaltxevtxdts> pxaltxevtxdtses) {
/* 96 */     this.pxaltxevtxdtses = pxaltxevtxdtses;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxaltxevtxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */