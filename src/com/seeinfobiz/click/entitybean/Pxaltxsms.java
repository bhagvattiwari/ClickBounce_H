/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxaltxsms
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixaltxsms;
/*     */   private String crn;
/*     */   private String tyxevntxsms;
/*     */   private String noxmbl;
/*     */   private String msg;
/*     */   private String flxsnt;
/*     */   private Long noxaccsxcnt;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxaltxsms() {}
/*     */   
/*     */   public Pxaltxsms(Long ixaltxsms) {
/*  28 */     this.ixaltxsms = ixaltxsms;
/*     */   }
/*     */   public Pxaltxsms(Long ixaltxsms, String crn, String tyxevntxsms, String noxmbl, String msg, String flxsnt, Long noxaccsxcnt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  31 */     this.ixaltxsms = ixaltxsms;
/*  32 */     this.crn = crn;
/*  33 */     this.tyxevntxsms = tyxevntxsms;
/*  34 */     this.noxmbl = noxmbl;
/*  35 */     this.msg = msg;
/*  36 */     this.flxsnt = flxsnt;
/*  37 */     this.noxaccsxcnt = noxaccsxcnt;
/*  38 */     this.dxctd = dxctd;
/*  39 */     this.bxctd = bxctd;
/*  40 */     this.dxmfdxlst = dxmfdxlst;
/*  41 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxaltxsms() {
/*  45 */     return this.ixaltxsms;
/*     */   }
/*     */   
/*     */   public void setIxaltxsms(Long ixaltxsms) {
/*  49 */     this.ixaltxsms = ixaltxsms;
/*     */   }
/*     */   public String getCrn() {
/*  52 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/*  56 */     this.crn = crn;
/*     */   }
/*     */   public String getTyxevntxsms() {
/*  59 */     return this.tyxevntxsms;
/*     */   }
/*     */   
/*     */   public void setTyxevntxsms(String tyxevntxsms) {
/*  63 */     this.tyxevntxsms = tyxevntxsms;
/*     */   }
/*     */   public String getNoxmbl() {
/*  66 */     return this.noxmbl;
/*     */   }
/*     */   
/*     */   public void setNoxmbl(String noxmbl) {
/*  70 */     this.noxmbl = noxmbl;
/*     */   }
/*     */   public String getMsg() {
/*  73 */     return this.msg;
/*     */   }
/*     */   
/*     */   public void setMsg(String msg) {
/*  77 */     this.msg = msg;
/*     */   }
/*     */   public String getFlxsnt() {
/*  80 */     return this.flxsnt;
/*     */   }
/*     */   
/*     */   public void setFlxsnt(String flxsnt) {
/*  84 */     this.flxsnt = flxsnt;
/*     */   }
/*     */   public Long getNoxaccsxcnt() {
/*  87 */     return this.noxaccsxcnt;
/*     */   }
/*     */   
/*     */   public void setNoxaccsxcnt(Long noxaccsxcnt) {
/*  91 */     this.noxaccsxcnt = noxaccsxcnt;
/*     */   }
/*     */   public Date getDxctd() {
/*  94 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  98 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 101 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 105 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 108 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 112 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 115 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 119 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxaltxsms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */