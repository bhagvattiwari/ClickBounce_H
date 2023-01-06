/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxstxarcvxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxarcv;
/*     */   private Pxstxarcvxm pxstxarcvxm;
/*     */   private String fxfrmtxotpt;
/*     */   private String fxdt;
/*     */   private String mdxge;
/*     */   private String fxarcv;
/*     */   private String fxrstr;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxstxarcvxdtls() {}
/*     */   
/*     */   public Pxstxarcvxdtls(Long ixdtlsxarcv) {
/*  31 */     this.ixdtlsxarcv = ixdtlsxarcv;
/*     */   }
/*     */   public Pxstxarcvxdtls(Long ixdtlsxarcv, Pxstxarcvxm pxstxarcvxm, String fxfrmtxotpt, String fxdt, String mdxge, String fxarcv, String fxrstr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  34 */     this.ixdtlsxarcv = ixdtlsxarcv;
/*  35 */     this.pxstxarcvxm = pxstxarcvxm;
/*  36 */     this.fxfrmtxotpt = fxfrmtxotpt;
/*  37 */     this.fxdt = fxdt;
/*  38 */     this.mdxge = mdxge;
/*  39 */     this.fxarcv = fxarcv;
/*  40 */     this.fxrstr = fxrstr;
/*  41 */     this.dxctd = dxctd;
/*  42 */     this.bxctd = bxctd;
/*  43 */     this.dxmfdxlst = dxmfdxlst;
/*  44 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxarcv() {
/*  48 */     return this.ixdtlsxarcv;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxarcv(Long ixdtlsxarcv) {
/*  52 */     this.ixdtlsxarcv = ixdtlsxarcv;
/*     */   }
/*     */   public Pxstxarcvxm getPxstxarcvxm() {
/*  55 */     return this.pxstxarcvxm;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxm(Pxstxarcvxm pxstxarcvxm) {
/*  59 */     this.pxstxarcvxm = pxstxarcvxm;
/*     */   }
/*     */   public String getFxfrmtxotpt() {
/*  62 */     return this.fxfrmtxotpt;
/*     */   }
/*     */   
/*     */   public void setFxfrmtxotpt(String fxfrmtxotpt) {
/*  66 */     this.fxfrmtxotpt = fxfrmtxotpt;
/*     */   }
/*     */   public String getFxdt() {
/*  69 */     return this.fxdt;
/*     */   }
/*     */   
/*     */   public void setFxdt(String fxdt) {
/*  73 */     this.fxdt = fxdt;
/*     */   }
/*     */   public String getMdxge() {
/*  76 */     return this.mdxge;
/*     */   }
/*     */   
/*     */   public void setMdxge(String mdxge) {
/*  80 */     this.mdxge = mdxge;
/*     */   }
/*     */   public String getFxarcv() {
/*  83 */     return this.fxarcv;
/*     */   }
/*     */   
/*     */   public void setFxarcv(String fxarcv) {
/*  87 */     this.fxarcv = fxarcv;
/*     */   }
/*     */   public String getFxrstr() {
/*  90 */     return this.fxrstr;
/*     */   }
/*     */   
/*     */   public void setFxrstr(String fxrstr) {
/*  94 */     this.fxrstr = fxrstr;
/*     */   }
/*     */   public Date getDxctd() {
/*  97 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 101 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 104 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 108 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 111 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 115 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 118 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 122 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxstxarcvxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */