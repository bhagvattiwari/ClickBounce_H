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
/*     */ public class Pxemxsrvxcnfg
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixsrxem;
/*     */   private String nmxsrxem;
/*     */   private String typxsrxem;
/*     */   private String hstxsrxem;
/*     */   private String nmuxsrxem;
/*     */   private String wdxpsrxem;
/*     */   private Long prtxsrxem;
/*     */   private String rmksxem;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  28 */   private Set pxprdctxms = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxemxsrvxcnfg() {}
/*     */ 
/*     */   
/*     */   public Pxemxsrvxcnfg(Long ixsrxem) {
/*  35 */     this.ixsrxem = ixsrxem;
/*     */   }
/*     */   public Pxemxsrvxcnfg(Long ixsrxem, String nmxsrxem, String typxsrxem, String hstxsrxem, String nmuxsrxem, String wdxpsrxem, Long prtxsrxem, String rmksxem, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxprdctxms) {
/*  38 */     this.ixsrxem = ixsrxem;
/*  39 */     this.nmxsrxem = nmxsrxem;
/*  40 */     this.typxsrxem = typxsrxem;
/*  41 */     this.hstxsrxem = hstxsrxem;
/*  42 */     this.nmuxsrxem = nmuxsrxem;
/*  43 */     this.wdxpsrxem = wdxpsrxem;
/*  44 */     this.prtxsrxem = prtxsrxem;
/*  45 */     this.rmksxem = rmksxem;
/*  46 */     this.dxctd = dxctd;
/*  47 */     this.bxctd = bxctd;
/*  48 */     this.dxmfdxlst = dxmfdxlst;
/*  49 */     this.bxmfdxlst = bxmfdxlst;
/*  50 */     this.pxprdctxms = pxprdctxms;
/*     */   }
/*     */   
/*     */   public Long getIxsrxem() {
/*  54 */     return this.ixsrxem;
/*     */   }
/*     */   
/*     */   public void setIxsrxem(Long ixsrxem) {
/*  58 */     this.ixsrxem = ixsrxem;
/*     */   }
/*     */   public String getNmxsrxem() {
/*  61 */     return this.nmxsrxem;
/*     */   }
/*     */   
/*     */   public void setNmxsrxem(String nmxsrxem) {
/*  65 */     this.nmxsrxem = nmxsrxem;
/*     */   }
/*     */   public String getTypxsrxem() {
/*  68 */     return this.typxsrxem;
/*     */   }
/*     */   
/*     */   public void setTypxsrxem(String typxsrxem) {
/*  72 */     this.typxsrxem = typxsrxem;
/*     */   }
/*     */   public String getHstxsrxem() {
/*  75 */     return this.hstxsrxem;
/*     */   }
/*     */   
/*     */   public void setHstxsrxem(String hstxsrxem) {
/*  79 */     this.hstxsrxem = hstxsrxem;
/*     */   }
/*     */   public String getNmuxsrxem() {
/*  82 */     return this.nmuxsrxem;
/*     */   }
/*     */   
/*     */   public void setNmuxsrxem(String nmuxsrxem) {
/*  86 */     this.nmuxsrxem = nmuxsrxem;
/*     */   }
/*     */   public String getWdxpsrxem() {
/*  89 */     return this.wdxpsrxem;
/*     */   }
/*     */   
/*     */   public void setWdxpsrxem(String wdxpsrxem) {
/*  93 */     this.wdxpsrxem = wdxpsrxem;
/*     */   }
/*     */   public Long getPrtxsrxem() {
/*  96 */     return this.prtxsrxem;
/*     */   }
/*     */   
/*     */   public void setPrtxsrxem(Long prtxsrxem) {
/* 100 */     this.prtxsrxem = prtxsrxem;
/*     */   }
/*     */   public String getRmksxem() {
/* 103 */     return this.rmksxem;
/*     */   }
/*     */   
/*     */   public void setRmksxem(String rmksxem) {
/* 107 */     this.rmksxem = rmksxem;
/*     */   }
/*     */   public Date getDxctd() {
/* 110 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 114 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 117 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 121 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 124 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 128 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 131 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 135 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set getPxprdctxms() {
/* 138 */     return this.pxprdctxms;
/*     */   }
/*     */   
/*     */   public void setPxprdctxms(Set pxprdctxms) {
/* 142 */     this.pxprdctxms = pxprdctxms;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemxsrvxcnfg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */