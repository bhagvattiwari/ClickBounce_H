/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxbncdxshdlrxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxshdlrxbncd;
/*     */   private Pxbncdxschdlrxm pxbncdxschdlrxm;
/*     */   private String mnthxschldrx1;
/*     */   private String dxschldrx1;
/*     */   private String mnthxschldrx2;
/*     */   private String dxschldrx2;
/*     */   private String mnthxschldrx3;
/*     */   private String dxschldrx3;
/*     */   private String mnthxschldrx4;
/*     */   private String dxschldrx4;
/*     */   private String dyxwk;
/*     */   private String tmxschldrxwk;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxbncdxshdlrxdtls() {}
/*     */   
/*     */   public Pxbncdxshdlrxdtls(Long ixdtlsxshdlrxbncd) {
/*  33 */     this.ixdtlsxshdlrxbncd = ixdtlsxshdlrxbncd;
/*     */   }
/*     */   public Pxbncdxshdlrxdtls(Long ixdtlsxshdlrxbncd, Pxbncdxschdlrxm pxbncdxschdlrxm, String mnthxschldrx1, String dxschldrx1, String mnthxschldrx2, String dxschldrx2, String mnthxschldrx3, String dxschldrx3, String mnthxschldrx4, String dxschldrx4, String dyxwk, String tmxschldrxwk, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  36 */     this.ixdtlsxshdlrxbncd = ixdtlsxshdlrxbncd;
/*  37 */     this.pxbncdxschdlrxm = pxbncdxschdlrxm;
/*  38 */     this.mnthxschldrx1 = mnthxschldrx1;
/*  39 */     this.dxschldrx1 = dxschldrx1;
/*  40 */     this.mnthxschldrx2 = mnthxschldrx2;
/*  41 */     this.dxschldrx2 = dxschldrx2;
/*  42 */     this.mnthxschldrx3 = mnthxschldrx3;
/*  43 */     this.dxschldrx3 = dxschldrx3;
/*  44 */     this.mnthxschldrx4 = mnthxschldrx4;
/*  45 */     this.dxschldrx4 = dxschldrx4;
/*  46 */     this.dyxwk = dyxwk;
/*  47 */     this.tmxschldrxwk = tmxschldrxwk;
/*  48 */     this.dxctd = dxctd;
/*  49 */     this.bxctd = bxctd;
/*  50 */     this.dxmfdxlst = dxmfdxlst;
/*  51 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxshdlrxbncd() {
/*  55 */     return this.ixdtlsxshdlrxbncd;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxshdlrxbncd(Long ixdtlsxshdlrxbncd) {
/*  59 */     this.ixdtlsxshdlrxbncd = ixdtlsxshdlrxbncd;
/*     */   }
/*     */   public Pxbncdxschdlrxm getPxbncdxschdlrxm() {
/*  62 */     return this.pxbncdxschdlrxm;
/*     */   }
/*     */   
/*     */   public void setPxbncdxschdlrxm(Pxbncdxschdlrxm pxbncdxschdlrxm) {
/*  66 */     this.pxbncdxschdlrxm = pxbncdxschdlrxm;
/*     */   }
/*     */   public String getMnthxschldrx1() {
/*  69 */     return this.mnthxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx1(String mnthxschldrx1) {
/*  73 */     this.mnthxschldrx1 = mnthxschldrx1;
/*     */   }
/*     */   public String getDxschldrx1() {
/*  76 */     return this.dxschldrx1;
/*     */   }
/*     */   
/*     */   public void setDxschldrx1(String dxschldrx1) {
/*  80 */     this.dxschldrx1 = dxschldrx1;
/*     */   }
/*     */   public String getMnthxschldrx2() {
/*  83 */     return this.mnthxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx2(String mnthxschldrx2) {
/*  87 */     this.mnthxschldrx2 = mnthxschldrx2;
/*     */   }
/*     */   public String getDxschldrx2() {
/*  90 */     return this.dxschldrx2;
/*     */   }
/*     */   
/*     */   public void setDxschldrx2(String dxschldrx2) {
/*  94 */     this.dxschldrx2 = dxschldrx2;
/*     */   }
/*     */   public String getMnthxschldrx3() {
/*  97 */     return this.mnthxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx3(String mnthxschldrx3) {
/* 101 */     this.mnthxschldrx3 = mnthxschldrx3;
/*     */   }
/*     */   public String getDxschldrx3() {
/* 104 */     return this.dxschldrx3;
/*     */   }
/*     */   
/*     */   public void setDxschldrx3(String dxschldrx3) {
/* 108 */     this.dxschldrx3 = dxschldrx3;
/*     */   }
/*     */   public String getMnthxschldrx4() {
/* 111 */     return this.mnthxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx4(String mnthxschldrx4) {
/* 115 */     this.mnthxschldrx4 = mnthxschldrx4;
/*     */   }
/*     */   public String getDxschldrx4() {
/* 118 */     return this.dxschldrx4;
/*     */   }
/*     */   
/*     */   public void setDxschldrx4(String dxschldrx4) {
/* 122 */     this.dxschldrx4 = dxschldrx4;
/*     */   }
/*     */   public String getDyxwk() {
/* 125 */     return this.dyxwk;
/*     */   }
/*     */   
/*     */   public void setDyxwk(String dyxwk) {
/* 129 */     this.dyxwk = dyxwk;
/*     */   }
/*     */   public String getTmxschldrxwk() {
/* 132 */     return this.tmxschldrxwk;
/*     */   }
/*     */   
/*     */   public void setTmxschldrxwk(String tmxschldrxwk) {
/* 136 */     this.tmxschldrxwk = tmxschldrxwk;
/*     */   }
/*     */   public Date getDxctd() {
/* 139 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 143 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 146 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 150 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 153 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 157 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 160 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 164 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxshdlrxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */