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
/*     */ public class Pxmtxrlxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrlxm;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxrlxm;
/*     */   private Long ixst;
/*     */   private String fxstts;
/*     */   private String rmxmkr;
/*     */   private String rmxaprvl;
/*     */   private String rmxchkrs;
/*     */   private String pmtrxqry;
/*     */   private String crtxsrvngxad;
/*     */   private Long sltsxmxtot;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long ixdpt;
/*  31 */   private Set pxmtxrlxgrpxlnks = new HashSet(0);
/*  32 */   private Set pxmtxrlxdtlses = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxmtxrlxm() {}
/*     */   
/*     */   public Pxmtxrlxm(Long ixrlxm, String fxstts, String crtxsrvngxad) {
/*  38 */     this.ixrlxm = ixrlxm;
/*  39 */     this.fxstts = fxstts;
/*  40 */     this.crtxsrvngxad = crtxsrvngxad;
/*     */   }
/*     */   
/*     */   public Pxmtxrlxm(Long ixrlxm, Pxprdctxm pxprdctxm, String nmxrlxm, Long ixst, String fxstts, String rmxmkr, String rmxaprvl, String rmxchkrs, String pmtrxqry, String crtxsrvngxad, Long sltsxmxtot, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxmtxrlxgrpxlnks, Set pxmtxrlxdtlses) {
/*  44 */     this.ixrlxm = ixrlxm;
/*  45 */     this.pxprdctxm = pxprdctxm;
/*  46 */     this.nmxrlxm = nmxrlxm;
/*  47 */     this.ixst = ixst;
/*  48 */     this.fxstts = fxstts;
/*  49 */     this.rmxmkr = rmxmkr;
/*  50 */     this.rmxaprvl = rmxaprvl;
/*  51 */     this.rmxchkrs = rmxchkrs;
/*  52 */     this.pmtrxqry = pmtrxqry;
/*  53 */     this.crtxsrvngxad = crtxsrvngxad;
/*  54 */     this.sltsxmxtot = sltsxmxtot;
/*  55 */     this.dxctd = dxctd;
/*  56 */     this.bxctd = bxctd;
/*  57 */     this.dxmfdxlst = dxmfdxlst;
/*  58 */     this.bxmfdxlst = bxmfdxlst;
/*  59 */     this.pxmtxrlxgrpxlnks = pxmtxrlxgrpxlnks;
/*  60 */     this.pxmtxrlxdtlses = pxmtxrlxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxrlxm() {
/*  64 */     return this.ixrlxm;
/*     */   }
/*     */   
/*     */   public void setIxrlxm(Long ixrlxm) {
/*  68 */     this.ixrlxm = ixrlxm;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  71 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  75 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getNmxrlxm() {
/*  78 */     return this.nmxrlxm;
/*     */   }
/*     */   
/*     */   public void setNmxrlxm(String nmxrlxm) {
/*  82 */     this.nmxrlxm = nmxrlxm;
/*     */   }
/*     */   public Long getIxst() {
/*  85 */     return this.ixst;
/*     */   }
/*     */   
/*     */   public void setIxst(Long ixst) {
/*  89 */     this.ixst = ixst;
/*     */   }
/*     */   public String getFxstts() {
/*  92 */     return this.fxstts;
/*     */   }
/*     */   
/*     */   public void setFxstts(String fxstts) {
/*  96 */     this.fxstts = fxstts;
/*     */   }
/*     */   public String getRmxmkr() {
/*  99 */     return this.rmxmkr;
/*     */   }
/*     */   
/*     */   public void setRmxmkr(String rmxmkr) {
/* 103 */     this.rmxmkr = rmxmkr;
/*     */   }
/*     */   public String getRmxaprvl() {
/* 106 */     return this.rmxaprvl;
/*     */   }
/*     */   
/*     */   public void setRmxaprvl(String rmxaprvl) {
/* 110 */     this.rmxaprvl = rmxaprvl;
/*     */   }
/*     */   public String getRmxchkrs() {
/* 113 */     return this.rmxchkrs;
/*     */   }
/*     */   
/*     */   public void setRmxchkrs(String rmxchkrs) {
/* 117 */     this.rmxchkrs = rmxchkrs;
/*     */   }
/*     */   public String getPmtrxqry() {
/* 120 */     return this.pmtrxqry;
/*     */   }
/*     */   
/*     */   public void setPmtrxqry(String pmtrxqry) {
/* 124 */     this.pmtrxqry = pmtrxqry;
/*     */   }
/*     */   public String getCrtxsrvngxad() {
/* 127 */     return this.crtxsrvngxad;
/*     */   }
/*     */   
/*     */   public void setCrtxsrvngxad(String crtxsrvngxad) {
/* 131 */     this.crtxsrvngxad = crtxsrvngxad;
/*     */   }
/*     */   public Long getSltsxmxtot() {
/* 134 */     return this.sltsxmxtot;
/*     */   }
/*     */   
/*     */   public void setSltsxmxtot(Long sltsxmxtot) {
/* 138 */     this.sltsxmxtot = sltsxmxtot;
/*     */   }
/*     */   public Date getDxctd() {
/* 141 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 145 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 148 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 152 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 155 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 159 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 162 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 166 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Set getPxmtxrlxdtlses() {
/* 170 */     return this.pxmtxrlxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxdtlses(Set pxmtxrlxdtlses) {
/* 174 */     this.pxmtxrlxdtlses = pxmtxrlxdtlses;
/*     */   }
/*     */   
/*     */   public Set getPxmtxrlxgrpxlnks() {
/* 178 */     return this.pxmtxrlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxgrpxlnks(Set pxmtxrlxgrpxlnks) {
/* 182 */     this.pxmtxrlxgrpxlnks = pxmtxrlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 186 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 190 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmtxrlxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */