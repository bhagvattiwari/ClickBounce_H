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
/*     */ public class Pxmnxds
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixmnu;
/*     */   private String nmxmn;
/*     */   private String urlxmn;
/*     */   private String ixprntxmn;
/*     */   private String tltpxmn;
/*     */   private String orxmn;
/*     */   private String nmxdpyxmn;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  27 */   private Set<Pxacnxnm> pxacnxnms = new HashSet<Pxacnxnm>(0);
/*  28 */   private Set<Pximplxm> pximplxms = new HashSet<Pximplxm>(0);
/*     */ 
/*     */   
/*     */   public Pxmnxds() {}
/*     */ 
/*     */   
/*     */   public Pxmnxds(Long ixmnu) {
/*  35 */     this.ixmnu = ixmnu;
/*     */   }
/*     */   public Pxmnxds(Long ixmnu, String nmxmn, String urlxmn, String ixprntxmn, String tltpxmn, String orxmn, String nmxdpyxmn, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxacnxnm> pxacnxnms, Set<Pximplxm> pximplxms) {
/*  38 */     this.ixmnu = ixmnu;
/*  39 */     this.nmxmn = nmxmn;
/*  40 */     this.urlxmn = urlxmn;
/*  41 */     this.ixprntxmn = ixprntxmn;
/*  42 */     this.tltpxmn = tltpxmn;
/*  43 */     this.orxmn = orxmn;
/*  44 */     this.nmxdpyxmn = nmxdpyxmn;
/*  45 */     this.dxctd = dxctd;
/*  46 */     this.bxctd = bxctd;
/*  47 */     this.dxmfdxlst = dxmfdxlst;
/*  48 */     this.bxmfdxlst = bxmfdxlst;
/*  49 */     this.pxacnxnms = pxacnxnms;
/*  50 */     this.pximplxms = pximplxms;
/*     */   }
/*     */   
/*     */   public Long getIxmnu() {
/*  54 */     return this.ixmnu;
/*     */   }
/*     */   
/*     */   public void setIxmnu(Long ixmnu) {
/*  58 */     this.ixmnu = ixmnu;
/*     */   }
/*     */   public String getNmxmn() {
/*  61 */     return this.nmxmn;
/*     */   }
/*     */   
/*     */   public void setNmxmn(String nmxmn) {
/*  65 */     this.nmxmn = nmxmn;
/*     */   }
/*     */   public String getUrlxmn() {
/*  68 */     return this.urlxmn;
/*     */   }
/*     */   
/*     */   public void setUrlxmn(String urlxmn) {
/*  72 */     this.urlxmn = urlxmn;
/*     */   }
/*     */   public String getIxprntxmn() {
/*  75 */     return this.ixprntxmn;
/*     */   }
/*     */   
/*     */   public void setIxprntxmn(String ixprntxmn) {
/*  79 */     this.ixprntxmn = ixprntxmn;
/*     */   }
/*     */   public String getTltpxmn() {
/*  82 */     return this.tltpxmn;
/*     */   }
/*     */   
/*     */   public void setTltpxmn(String tltpxmn) {
/*  86 */     this.tltpxmn = tltpxmn;
/*     */   }
/*     */   public String getOrxmn() {
/*  89 */     return this.orxmn;
/*     */   }
/*     */   
/*     */   public void setOrxmn(String orxmn) {
/*  93 */     this.orxmn = orxmn;
/*     */   }
/*     */   public String getNmxdpyxmn() {
/*  96 */     return this.nmxdpyxmn;
/*     */   }
/*     */   
/*     */   public void setNmxdpyxmn(String nmxdpyxmn) {
/* 100 */     this.nmxdpyxmn = nmxdpyxmn;
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
/*     */   public Set<Pxacnxnm> getPxacnxnms() {
/* 131 */     return this.pxacnxnms;
/*     */   }
/*     */   
/*     */   public void setPxacnxnms(Set<Pxacnxnm> pxacnxnms) {
/* 135 */     this.pxacnxnms = pxacnxnms;
/*     */   }
/*     */   public Set<Pximplxm> getPximplxms() {
/* 138 */     return this.pximplxms;
/*     */   }
/*     */   
/*     */   public void setPximplxms(Set<Pximplxm> pximplxms) {
/* 142 */     this.pximplxms = pximplxms;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmnxds.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */