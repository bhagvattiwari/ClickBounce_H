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
/*     */ public class Pxeshdlrxprsxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprcsxeshdlr;
/*     */   private Pxloclexm pxloclexm;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String mdxprcsxe;
/*     */   private String flxjbxtrm;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Date sc1xtm;
/*     */   private Date sc2xtm;
/*     */   private Date sc3xtm;
/*     */   private Date sc4xtm;
/*  29 */   private Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls = new HashSet<Pxeshdlrxprcsxetl>(0);
/*  30 */   private Set<Pxeshlrxprcsxmde> pxeshlrxprcsxmdes = new HashSet<Pxeshlrxprcsxmde>(0);
/*  31 */   private Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses = new HashSet<Pxeshlrxprcsxdtls>(0);
/*     */ 
/*     */   
/*     */   public Pxeshdlrxprsxm() {}
/*     */ 
/*     */   
/*     */   public Pxeshdlrxprsxm(Long ixprcsxeshdlr) {
/*  38 */     this.ixprcsxeshdlr = ixprcsxeshdlr;
/*     */   }
/*     */   public Pxeshdlrxprsxm(Long ixprcsxeshdlr, Pxloclexm pxloclexm, Pxprdctxm pxprdctxm, String mdxprcsxe, String flxjbxtrm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Date sc1xtm, Date sc2xtm, Date sc3xtm, Date sc4xtm, Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls, Set<Pxeshlrxprcsxmde> pxeshlrxprcsxmdes, Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses) {
/*  41 */     this.ixprcsxeshdlr = ixprcsxeshdlr;
/*  42 */     this.pxloclexm = pxloclexm;
/*  43 */     this.pxprdctxm = pxprdctxm;
/*  44 */     this.mdxprcsxe = mdxprcsxe;
/*  45 */     this.flxjbxtrm = flxjbxtrm;
/*  46 */     this.dxctd = dxctd;
/*  47 */     this.bxctd = bxctd;
/*  48 */     this.dxmfdxlst = dxmfdxlst;
/*  49 */     this.bxmfdxlst = bxmfdxlst;
/*  50 */     this.sc1xtm = sc1xtm;
/*  51 */     this.sc2xtm = sc2xtm;
/*  52 */     this.sc3xtm = sc3xtm;
/*  53 */     this.sc4xtm = sc4xtm;
/*  54 */     this.pxeshdlrxprcsxetls = pxeshdlrxprcsxetls;
/*  55 */     this.pxeshlrxprcsxmdes = pxeshlrxprcsxmdes;
/*  56 */     this.pxeshlrxprcsxdtlses = pxeshlrxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxprcsxeshdlr() {
/*  60 */     return this.ixprcsxeshdlr;
/*     */   }
/*     */   
/*     */   public void setIxprcsxeshdlr(Long ixprcsxeshdlr) {
/*  64 */     this.ixprcsxeshdlr = ixprcsxeshdlr;
/*     */   }
/*     */   public Pxloclexm getPxloclexm() {
/*  67 */     return this.pxloclexm;
/*     */   }
/*     */   
/*     */   public void setPxloclexm(Pxloclexm pxloclexm) {
/*  71 */     this.pxloclexm = pxloclexm;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  74 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  78 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getMdxprcsxe() {
/*  81 */     return this.mdxprcsxe;
/*     */   }
/*     */   
/*     */   public void setMdxprcsxe(String mdxprcsxe) {
/*  85 */     this.mdxprcsxe = mdxprcsxe;
/*     */   }
/*     */   public String getFlxjbxtrm() {
/*  88 */     return this.flxjbxtrm;
/*     */   }
/*     */   
/*     */   public void setFlxjbxtrm(String flxjbxtrm) {
/*  92 */     this.flxjbxtrm = flxjbxtrm;
/*     */   }
/*     */   public Date getDxctd() {
/*  95 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  99 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 102 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 106 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 109 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 113 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 116 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 120 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Date getSc1xtm() {
/* 123 */     return this.sc1xtm;
/*     */   }
/*     */   
/*     */   public void setSc1xtm(Date sc1xtm) {
/* 127 */     this.sc1xtm = sc1xtm;
/*     */   }
/*     */   public Date getSc2xtm() {
/* 130 */     return this.sc2xtm;
/*     */   }
/*     */   
/*     */   public void setSc2xtm(Date sc2xtm) {
/* 134 */     this.sc2xtm = sc2xtm;
/*     */   }
/*     */   public Date getSc3xtm() {
/* 137 */     return this.sc3xtm;
/*     */   }
/*     */   
/*     */   public void setSc3xtm(Date sc3xtm) {
/* 141 */     this.sc3xtm = sc3xtm;
/*     */   }
/*     */   public Date getSc4xtm() {
/* 144 */     return this.sc4xtm;
/*     */   }
/*     */   
/*     */   public void setSc4xtm(Date sc4xtm) {
/* 148 */     this.sc4xtm = sc4xtm;
/*     */   }
/*     */   public Set<Pxeshdlrxprcsxetl> getPxeshdlrxprcsxetls() {
/* 151 */     return this.pxeshdlrxprcsxetls;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprcsxetls(Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls) {
/* 155 */     this.pxeshdlrxprcsxetls = pxeshdlrxprcsxetls;
/*     */   }
/*     */   public Set<Pxeshlrxprcsxmde> getPxeshlrxprcsxmdes() {
/* 158 */     return this.pxeshlrxprcsxmdes;
/*     */   }
/*     */   
/*     */   public void setPxeshlrxprcsxmdes(Set<Pxeshlrxprcsxmde> pxeshlrxprcsxmdes) {
/* 162 */     this.pxeshlrxprcsxmdes = pxeshlrxprcsxmdes;
/*     */   }
/*     */   public Set<Pxeshlrxprcsxdtls> getPxeshlrxprcsxdtlses() {
/* 165 */     return this.pxeshlrxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxeshlrxprcsxdtlses(Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses) {
/* 169 */     this.pxeshlrxprcsxdtlses = pxeshlrxprcsxdtlses;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxeshdlrxprsxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */