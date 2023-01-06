/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxbncdxmlxcng
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixcfgxmlxbncd;
/*     */   private String ixmlxsndrxbncd;
/*     */   private String psdxbncd;
/*     */   private String hstxrcvrxbncd;
/*     */   private String prtxrcvrxbncd;
/*     */   private String fxdlxbncd;
/*     */   private String rmxbncd;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  27 */   private Set pxprdctxms = new HashSet(0);
/*  28 */   private Set pxbncdxlstxrds = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxbncdxmlxcng() {}
/*     */ 
/*     */   
/*     */   public Pxbncdxmlxcng(Long ixcfgxmlxbncd) {
/*  35 */     this.ixcfgxmlxbncd = ixcfgxmlxbncd;
/*     */   }
/*     */   public Pxbncdxmlxcng(Long ixcfgxmlxbncd, String ixmlxsndrxbncd, String psdxbncd, String hstxrcvrxbncd, String prtxrcvrxbncd, String fxdlxbncd, String rmxbncd, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxprdctxms, Set pxbncdxlstxrds) {
/*  38 */     this.ixcfgxmlxbncd = ixcfgxmlxbncd;
/*  39 */     this.ixmlxsndrxbncd = ixmlxsndrxbncd;
/*  40 */     this.psdxbncd = psdxbncd;
/*  41 */     this.hstxrcvrxbncd = hstxrcvrxbncd;
/*  42 */     this.prtxrcvrxbncd = prtxrcvrxbncd;
/*  43 */     this.fxdlxbncd = fxdlxbncd;
/*  44 */     this.rmxbncd = rmxbncd;
/*  45 */     this.dxctd = dxctd;
/*  46 */     this.bxctd = bxctd;
/*  47 */     this.dxmfdxlst = dxmfdxlst;
/*  48 */     this.bxmfdxlst = bxmfdxlst;
/*  49 */     this.pxprdctxms = pxprdctxms;
/*  50 */     this.pxbncdxlstxrds = pxbncdxlstxrds;
/*     */   }
/*     */   
/*     */   public Long getIxcfgxmlxbncd() {
/*  54 */     return this.ixcfgxmlxbncd;
/*     */   }
/*     */   
/*     */   public void setIxcfgxmlxbncd(Long ixcfgxmlxbncd) {
/*  58 */     this.ixcfgxmlxbncd = ixcfgxmlxbncd;
/*     */   }
/*     */   public String getIxmlxsndrxbncd() {
/*  61 */     return this.ixmlxsndrxbncd;
/*     */   }
/*     */   
/*     */   public void setIxmlxsndrxbncd(String ixmlxsndrxbncd) {
/*  65 */     this.ixmlxsndrxbncd = ixmlxsndrxbncd;
/*     */   }
/*     */   public String getPsdxbncd() {
/*  68 */     return this.psdxbncd;
/*     */   }
/*     */   
/*     */   public void setPsdxbncd(String psdxbncd) {
/*  72 */     this.psdxbncd = psdxbncd;
/*     */   }
/*     */   public String getHstxrcvrxbncd() {
/*  75 */     return this.hstxrcvrxbncd;
/*     */   }
/*     */   
/*     */   public void setHstxrcvrxbncd(String hstxrcvrxbncd) {
/*  79 */     this.hstxrcvrxbncd = hstxrcvrxbncd;
/*     */   }
/*     */   public String getPrtxrcvrxbncd() {
/*  82 */     return this.prtxrcvrxbncd;
/*     */   }
/*     */   
/*     */   public void setPrtxrcvrxbncd(String prtxrcvrxbncd) {
/*  86 */     this.prtxrcvrxbncd = prtxrcvrxbncd;
/*     */   }
/*     */   public String getFxdlxbncd() {
/*  89 */     return this.fxdlxbncd;
/*     */   }
/*     */   
/*     */   public void setFxdlxbncd(String fxdlxbncd) {
/*  93 */     this.fxdlxbncd = fxdlxbncd;
/*     */   }
/*     */   public String getRmxbncd() {
/*  96 */     return this.rmxbncd;
/*     */   }
/*     */   
/*     */   public void setRmxbncd(String rmxbncd) {
/* 100 */     this.rmxbncd = rmxbncd;
/*     */   }
/*     */   public Date getDxctd() {
/* 103 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 107 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 110 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 114 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 117 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 121 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 124 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 128 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set getPxprdctxms() {
/* 131 */     return this.pxprdctxms;
/*     */   }
/*     */   
/*     */   public void setPxprdctxms(Set pxprdctxms) {
/* 135 */     this.pxprdctxms = pxprdctxms;
/*     */   }
/*     */   public Set getPxbncdxlstxrds() {
/* 138 */     return this.pxbncdxlstxrds;
/*     */   }
/*     */   
/*     */   public void setPxbncdxlstxrds(Set pxbncdxlstxrds) {
/* 142 */     this.pxbncdxlstxrds = pxbncdxlstxrds;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxmlxcng.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */