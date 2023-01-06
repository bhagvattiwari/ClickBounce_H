/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxshdlrxarcv
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixarcvxshdlr;
/*     */   private Pxshdlrxm pxshdlrxm;
/*     */   private Date ixrndxshdlr;
/*     */   private String ixtmexshdlr;
/*     */   private String nmxzpxetl;
/*     */   private String ptxbatxetl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String stts;
/*     */   private String nmxschxm;
/*     */   private String fxprcsxprs;
/*     */   private String fxprcsxgen;
/*     */   private String fxprcsxeml;
/*     */   private long ixprcs;
/*     */   private String flgxschxebpxmnl;
/*     */   private String flgxrecsv;
/*     */   private String crnt_stts;
/*     */   
/*     */   public Pxshdlrxarcv() {}
/*     */   
/*     */   public Pxshdlrxarcv(Long ixarcvxshdlr) {
/*  36 */     this.ixarcvxshdlr = ixarcvxshdlr;
/*     */   }
/*     */ 
/*     */   
/*     */   public Pxshdlrxarcv(Long ixarcvxshdlr, Pxshdlrxm pxshdlrxm, Date ixrndxshdlr, String ixtmexshdlr, String ptxbatxetl, String nmxzpxetl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String stts, String nmxschxm, String fxprcsxprs, String fxprcsxgen, String fxprcsxeml, long ixprcs, String flgxschxebpxmnl, String flgxrecsv) {
/*  41 */     this.ixarcvxshdlr = ixarcvxshdlr;
/*  42 */     this.pxshdlrxm = pxshdlrxm;
/*  43 */     this.ixrndxshdlr = ixrndxshdlr;
/*  44 */     this.ixtmexshdlr = ixtmexshdlr;
/*  45 */     this.nmxzpxetl = nmxzpxetl;
/*  46 */     this.ptxbatxetl = ptxbatxetl;
/*  47 */     this.stts = stts;
/*  48 */     this.dxctd = dxctd;
/*  49 */     this.bxctd = bxctd;
/*  50 */     this.nmxschxm = nmxschxm;
/*  51 */     this.dxmfdxlst = dxmfdxlst;
/*  52 */     this.bxmfdxlst = bxmfdxlst;
/*  53 */     this.fxprcsxprs = fxprcsxprs;
/*  54 */     this.fxprcsxgen = fxprcsxgen;
/*  55 */     this.fxprcsxeml = fxprcsxeml;
/*  56 */     this.ixprcs = ixprcs;
/*  57 */     this.flgxschxebpxmnl = flgxschxebpxmnl;
/*  58 */     this.flgxrecsv = flgxrecsv;
/*     */   }
/*     */   
/*     */   public Long getIxarcvxshdlr() {
/*  62 */     return this.ixarcvxshdlr;
/*     */   }
/*     */   
/*     */   public void setIxarcvxshdlr(Long ixarcvxshdlr) {
/*  66 */     this.ixarcvxshdlr = ixarcvxshdlr;
/*     */   }
/*     */   
/*     */   public Pxshdlrxm getPxshdlrxm() {
/*  70 */     return this.pxshdlrxm;
/*     */   }
/*     */   
/*     */   public void setPxshdlrxm(Pxshdlrxm pxshdlrxm) {
/*  74 */     this.pxshdlrxm = pxshdlrxm;
/*     */   }
/*     */   
/*     */   public Date getIxrndxshdlr() {
/*  78 */     return this.ixrndxshdlr;
/*     */   }
/*     */   
/*     */   public void setIxrndxshdlr(Date ixrndxshdlr) {
/*  82 */     this.ixrndxshdlr = ixrndxshdlr;
/*     */   }
/*     */   
/*     */   public String getIxtmexshdlr() {
/*  86 */     return this.ixtmexshdlr;
/*     */   }
/*     */   
/*     */   public void setIxtmexshdlr(String ixtmexshdlr) {
/*  90 */     this.ixtmexshdlr = ixtmexshdlr;
/*     */   }
/*     */   
/*     */   public String getNmxzpxetl() {
/*  94 */     return this.nmxzpxetl;
/*     */   }
/*     */   
/*     */   public void setNmxzpxetl(String nmxzpxetl) {
/*  98 */     this.nmxzpxetl = nmxzpxetl;
/*     */   }
/*     */   
/*     */   public String getPtxbatxetl() {
/* 102 */     return this.ptxbatxetl;
/*     */   }
/*     */   
/*     */   public void setPtxbatxetl(String ptxbatxetl) {
/* 106 */     this.ptxbatxetl = ptxbatxetl;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 110 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 114 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 118 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 122 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 126 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 130 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 134 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 138 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getStts() {
/* 142 */     return this.stts;
/*     */   }
/*     */   
/*     */   public void setStts(String stts) {
/* 146 */     this.stts = stts;
/*     */   }
/*     */   
/*     */   public String getNmxschxm() {
/* 150 */     return this.nmxschxm;
/*     */   }
/*     */   
/*     */   public void setNmxschxm(String nmxschxm) {
/* 154 */     this.nmxschxm = nmxschxm;
/*     */   }
/*     */   
/*     */   public String getFxprcsxeml() {
/* 158 */     return this.fxprcsxeml;
/*     */   }
/*     */   
/*     */   public void setFxprcsxeml(String fxprcsxeml) {
/* 162 */     this.fxprcsxeml = fxprcsxeml;
/*     */   }
/*     */   
/*     */   public String getFxprcsxgen() {
/* 166 */     return this.fxprcsxgen;
/*     */   }
/*     */   
/*     */   public void setFxprcsxgen(String fxprcsxgen) {
/* 170 */     this.fxprcsxgen = fxprcsxgen;
/*     */   }
/*     */   
/*     */   public String getFxprcsxprs() {
/* 174 */     return this.fxprcsxprs;
/*     */   }
/*     */   
/*     */   public void setFxprcsxprs(String fxprcsxprs) {
/* 178 */     this.fxprcsxprs = fxprcsxprs;
/*     */   }
/*     */   
/*     */   public long getIxprcs() {
/* 182 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(long ixprcs) {
/* 186 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   
/*     */   public String getFlgxrecsv() {
/* 190 */     return this.flgxrecsv;
/*     */   }
/*     */   
/*     */   public void setFlgxrecsv(String flgxrecsv) {
/* 194 */     this.flgxrecsv = flgxrecsv;
/*     */   }
/*     */   
/*     */   public String getFlgxschxebpxmnl() {
/* 198 */     return this.flgxschxebpxmnl;
/*     */   }
/*     */   
/*     */   public void setFlgxschxebpxmnl(String flgxschxebpxmnl) {
/* 202 */     this.flgxschxebpxmnl = flgxschxebpxmnl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCrnt_stts() {
/* 209 */     return this.crnt_stts;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCrnt_stts(String crnt_stts) {
/* 216 */     this.crnt_stts = crnt_stts;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxshdlrxarcv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */