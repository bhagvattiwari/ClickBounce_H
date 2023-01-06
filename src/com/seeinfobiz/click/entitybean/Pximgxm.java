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
/*     */ public class Pximgxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long iximg;
/*     */   private String nmximg;
/*     */   private String urlximg;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String extximg;
/*     */   private String ixprd;
/*     */   private String isxembdximg;
/*     */   
/*     */   public Pximgxm() {}
/*     */   
/*     */   public Pximgxm(Long iximg) {
/*  30 */     this.iximg = iximg;
/*     */   }
/*     */   public Pximgxm(Long iximg, String nmximg, String urlximg, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String extximg, String ixprd, String isxembdximg) {
/*  33 */     this.iximg = iximg;
/*  34 */     this.nmximg = nmximg;
/*  35 */     this.urlximg = urlximg;
/*  36 */     this.dxctd = dxctd;
/*  37 */     this.bxctd = bxctd;
/*  38 */     this.dxmfdxlst = dxmfdxlst;
/*  39 */     this.bxmfdxlst = bxmfdxlst;
/*  40 */     this.extximg = extximg;
/*  41 */     this.ixprd = ixprd;
/*  42 */     this.isxembdximg = isxembdximg;
/*     */   }
/*     */   
/*     */   public Long getIximg() {
/*  46 */     return this.iximg;
/*     */   }
/*     */   
/*     */   public void setIximg(Long iximg) {
/*  50 */     this.iximg = iximg;
/*     */   }
/*     */   public String getNmximg() {
/*  53 */     return this.nmximg;
/*     */   }
/*     */   
/*     */   public void setNmximg(String nmximg) {
/*  57 */     this.nmximg = nmximg;
/*     */   }
/*     */   public String getUrlximg() {
/*  60 */     return this.urlximg;
/*     */   }
/*     */   
/*     */   public void setUrlximg(String urlximg) {
/*  64 */     this.urlximg = urlximg;
/*     */   }
/*     */   public Date getDxctd() {
/*  67 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  71 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  74 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  78 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  81 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  85 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  88 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  92 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getExtximg() {
/*  95 */     return this.extximg;
/*     */   }
/*     */   
/*     */   public void setExtximg(String extximg) {
/*  99 */     this.extximg = extximg;
/*     */   }
/*     */   public String getIxprd() {
/* 102 */     return this.ixprd;
/*     */   }
/*     */   
/*     */   public void setIxprd(String ixprd) {
/* 106 */     this.ixprd = ixprd;
/*     */   }
/*     */   public String getIsxembdximg() {
/* 109 */     return this.isxembdximg;
/*     */   }
/*     */   
/*     */   public void setIsxembdximg(String isxembdximg) {
/* 113 */     this.isxembdximg = isxembdximg;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pximgxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */