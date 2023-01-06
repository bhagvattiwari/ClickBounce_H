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
/*     */ 
/*     */ 
/*     */ public class Cxsuprsnxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixsuprsn;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxsuprs;
/*     */   private String lstxupld;
/*     */   private String nmxclmn;
/*     */   private String crtraxqry;
/*     */   private String flxdflt;
/*     */   private Date dxfrm;
/*     */   private Date dxto;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String flxsuprn;
/*     */   private Long ixdpt;
/*     */   private String newFromDate;
/*     */   private String newToDate;
/*     */   
/*     */   public Cxsuprsnxm() {}
/*     */   
/*     */   public Cxsuprsnxm(Long ixsuprsn) {
/*  39 */     this.ixsuprsn = ixsuprsn;
/*     */   }
/*     */   public Cxsuprsnxm(Long ixsuprsn, Pxprdctxm pxprdctxm, String nmxsuprs, String lstxupld, String nmxclmn, String crtraxqry, String flxdflt, Date dxfrm, Date dxto, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String flxsuprn, Long ixdpt) {
/*  42 */     this.ixsuprsn = ixsuprsn;
/*  43 */     this.pxprdctxm = pxprdctxm;
/*  44 */     this.nmxsuprs = nmxsuprs;
/*  45 */     this.lstxupld = lstxupld;
/*  46 */     this.nmxclmn = nmxclmn;
/*  47 */     this.crtraxqry = crtraxqry;
/*  48 */     this.flxdflt = flxdflt;
/*  49 */     this.dxfrm = dxfrm;
/*  50 */     this.dxto = dxto;
/*  51 */     this.dxctd = dxctd;
/*  52 */     this.bxctd = bxctd;
/*  53 */     this.dxmfdxlst = dxmfdxlst;
/*  54 */     this.bxmfdxlst = bxmfdxlst;
/*  55 */     this.flxsuprn = flxsuprn;
/*  56 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public String getNewFromDate() {
/*  60 */     return this.newFromDate;
/*     */   }
/*     */   
/*     */   public void setNewFromDate(String newFromDate) {
/*  64 */     this.newFromDate = newFromDate;
/*     */   }
/*     */   
/*     */   public String getNewToDate() {
/*  68 */     return this.newToDate;
/*     */   }
/*     */   
/*     */   public void setNewToDate(String newToDate) {
/*  72 */     this.newToDate = newToDate;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getIxsuprsn() {
/*  78 */     return this.ixsuprsn;
/*     */   }
/*     */   
/*     */   public void setIxsuprsn(Long ixsuprsn) {
/*  82 */     this.ixsuprsn = ixsuprsn;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  85 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  89 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getNmxsuprs() {
/*  92 */     return this.nmxsuprs;
/*     */   }
/*     */   
/*     */   public void setNmxsuprs(String nmxsuprs) {
/*  96 */     this.nmxsuprs = nmxsuprs;
/*     */   }
/*     */   public String getLstxupld() {
/*  99 */     return this.lstxupld;
/*     */   }
/*     */   
/*     */   public void setLstxupld(String lstxupld) {
/* 103 */     this.lstxupld = lstxupld;
/*     */   }
/*     */   public String getNmxclmn() {
/* 106 */     return this.nmxclmn;
/*     */   }
/*     */   
/*     */   public void setNmxclmn(String nmxclmn) {
/* 110 */     this.nmxclmn = nmxclmn;
/*     */   }
/*     */   public String getCrtraxqry() {
/* 113 */     return this.crtraxqry;
/*     */   }
/*     */   
/*     */   public void setCrtraxqry(String crtraxqry) {
/* 117 */     this.crtraxqry = crtraxqry;
/*     */   }
/*     */   public String getFlxdflt() {
/* 120 */     return this.flxdflt;
/*     */   }
/*     */   
/*     */   public void setFlxdflt(String flxdflt) {
/* 124 */     this.flxdflt = flxdflt;
/*     */   }
/*     */   public Date getDxfrm() {
/* 127 */     return this.dxfrm;
/*     */   }
/*     */   
/*     */   public void setDxfrm(Date dxfrm) {
/* 131 */     this.dxfrm = dxfrm;
/*     */   }
/*     */   public Date getDxto() {
/* 134 */     return this.dxto;
/*     */   }
/*     */   
/*     */   public void setDxto(Date dxto) {
/* 138 */     this.dxto = dxto;
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
/*     */   public String getFlxsuprn() {
/* 169 */     return this.flxsuprn;
/*     */   }
/*     */   
/*     */   public void setFlxsuprn(String flxsuprn) {
/* 173 */     this.flxsuprn = flxsuprn;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 177 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 181 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxsuprsnxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */