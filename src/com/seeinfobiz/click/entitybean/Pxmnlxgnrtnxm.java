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
/*     */ public class Pxmnlxgnrtnxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixgnrtnxmnl;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String mdxprcsxebp;
/*     */   private Long dxstmt;
/*     */   private String fxsrc;
/*     */   private String rnxbkxstmtxgnrtn;
/*     */   private String rnxbkxemxbrdcst;
/*     */   private String fxmdxgnrtn;
/*     */   private String dtlsxslctxgnrtn;
/*     */   private String fxfrmtxotpt;
/*     */   private String fxchnlxdlvry;
/*     */   private String fxmdxbdcst;
/*     */   private String dtlsxslctxbdcst;
/*     */   private String fxnwxrn;
/*     */   private String tmexschdlr;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Date prcxdt;
/*     */   
/*     */   public Pxmnlxgnrtnxm() {}
/*     */   
/*     */   public Pxmnlxgnrtnxm(Long ixgnrtnxmnl, String fxfrmtxotpt, String fxchnlxdlvry, String fxnwxrn) {
/*  40 */     this.ixgnrtnxmnl = ixgnrtnxmnl;
/*  41 */     this.fxfrmtxotpt = fxfrmtxotpt;
/*  42 */     this.fxchnlxdlvry = fxchnlxdlvry;
/*  43 */     this.fxnwxrn = fxnwxrn;
/*     */   }
/*     */   public Pxmnlxgnrtnxm(Long ixgnrtnxmnl, Pxprdctxm pxprdctxm, String mdxprcsxebp, Long dxstmt, String fxsrc, String rnxbkxstmtxgnrtn, String rnxbkxemxbrdcst, String fxmdxgnrtn, String dtlsxslctxgnrtn, String fxfrmtxotpt, String fxchnlxdlvry, String fxmdxbdcst, String dtlsxslctxbdcst, String fxnwxrn, String tmexschdlr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Date prcxdt) {
/*  46 */     this.ixgnrtnxmnl = ixgnrtnxmnl;
/*  47 */     this.pxprdctxm = pxprdctxm;
/*  48 */     this.mdxprcsxebp = mdxprcsxebp;
/*  49 */     this.dxstmt = dxstmt;
/*  50 */     this.fxsrc = fxsrc;
/*  51 */     this.rnxbkxstmtxgnrtn = rnxbkxstmtxgnrtn;
/*  52 */     this.rnxbkxemxbrdcst = rnxbkxemxbrdcst;
/*  53 */     this.fxmdxgnrtn = fxmdxgnrtn;
/*  54 */     this.dtlsxslctxgnrtn = dtlsxslctxgnrtn;
/*  55 */     this.fxfrmtxotpt = fxfrmtxotpt;
/*  56 */     this.fxchnlxdlvry = fxchnlxdlvry;
/*  57 */     this.fxmdxbdcst = fxmdxbdcst;
/*  58 */     this.dtlsxslctxbdcst = dtlsxslctxbdcst;
/*  59 */     this.fxnwxrn = fxnwxrn;
/*  60 */     this.tmexschdlr = tmexschdlr;
/*  61 */     this.dxctd = dxctd;
/*  62 */     this.bxctd = bxctd;
/*  63 */     this.dxmfdxlst = dxmfdxlst;
/*  64 */     this.bxmfdxlst = bxmfdxlst;
/*  65 */     this.prcxdt = prcxdt;
/*     */   }
/*     */   
/*     */   public Long getIxgnrtnxmnl() {
/*  69 */     return this.ixgnrtnxmnl;
/*     */   }
/*     */   
/*     */   public void setIxgnrtnxmnl(Long ixgnrtnxmnl) {
/*  73 */     this.ixgnrtnxmnl = ixgnrtnxmnl;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  76 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  80 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getMdxprcsxebp() {
/*  83 */     return this.mdxprcsxebp;
/*     */   }
/*     */   
/*     */   public void setMdxprcsxebp(String mdxprcsxebp) {
/*  87 */     this.mdxprcsxebp = mdxprcsxebp;
/*     */   }
/*     */   public Long getDxstmt() {
/*  90 */     return this.dxstmt;
/*     */   }
/*     */   
/*     */   public void setDxstmt(Long dxstmt) {
/*  94 */     this.dxstmt = dxstmt;
/*     */   }
/*     */   public String getFxsrc() {
/*  97 */     return this.fxsrc;
/*     */   }
/*     */   
/*     */   public void setFxsrc(String fxsrc) {
/* 101 */     this.fxsrc = fxsrc;
/*     */   }
/*     */   public String getRnxbkxstmtxgnrtn() {
/* 104 */     return this.rnxbkxstmtxgnrtn;
/*     */   }
/*     */   
/*     */   public void setRnxbkxstmtxgnrtn(String rnxbkxstmtxgnrtn) {
/* 108 */     this.rnxbkxstmtxgnrtn = rnxbkxstmtxgnrtn;
/*     */   }
/*     */   public String getRnxbkxemxbrdcst() {
/* 111 */     return this.rnxbkxemxbrdcst;
/*     */   }
/*     */   
/*     */   public void setRnxbkxemxbrdcst(String rnxbkxemxbrdcst) {
/* 115 */     this.rnxbkxemxbrdcst = rnxbkxemxbrdcst;
/*     */   }
/*     */   public String getFxmdxgnrtn() {
/* 118 */     return this.fxmdxgnrtn;
/*     */   }
/*     */   
/*     */   public void setFxmdxgnrtn(String fxmdxgnrtn) {
/* 122 */     this.fxmdxgnrtn = fxmdxgnrtn;
/*     */   }
/*     */   public String getDtlsxslctxgnrtn() {
/* 125 */     return this.dtlsxslctxgnrtn;
/*     */   }
/*     */   
/*     */   public void setDtlsxslctxgnrtn(String dtlsxslctxgnrtn) {
/* 129 */     this.dtlsxslctxgnrtn = dtlsxslctxgnrtn;
/*     */   }
/*     */   public String getFxfrmtxotpt() {
/* 132 */     return this.fxfrmtxotpt;
/*     */   }
/*     */   
/*     */   public void setFxfrmtxotpt(String fxfrmtxotpt) {
/* 136 */     this.fxfrmtxotpt = fxfrmtxotpt;
/*     */   }
/*     */   public String getFxchnlxdlvry() {
/* 139 */     return this.fxchnlxdlvry;
/*     */   }
/*     */   
/*     */   public void setFxchnlxdlvry(String fxchnlxdlvry) {
/* 143 */     this.fxchnlxdlvry = fxchnlxdlvry;
/*     */   }
/*     */   public String getFxmdxbdcst() {
/* 146 */     return this.fxmdxbdcst;
/*     */   }
/*     */   
/*     */   public void setFxmdxbdcst(String fxmdxbdcst) {
/* 150 */     this.fxmdxbdcst = fxmdxbdcst;
/*     */   }
/*     */   public String getDtlsxslctxbdcst() {
/* 153 */     return this.dtlsxslctxbdcst;
/*     */   }
/*     */   
/*     */   public void setDtlsxslctxbdcst(String dtlsxslctxbdcst) {
/* 157 */     this.dtlsxslctxbdcst = dtlsxslctxbdcst;
/*     */   }
/*     */   public String getFxnwxrn() {
/* 160 */     return this.fxnwxrn;
/*     */   }
/*     */   
/*     */   public void setFxnwxrn(String fxnwxrn) {
/* 164 */     this.fxnwxrn = fxnwxrn;
/*     */   }
/*     */   public String getTmexschdlr() {
/* 167 */     return this.tmexschdlr;
/*     */   }
/*     */   
/*     */   public void setTmexschdlr(String tmexschdlr) {
/* 171 */     this.tmexschdlr = tmexschdlr;
/*     */   }
/*     */   public Date getDxctd() {
/* 174 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 178 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 181 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 185 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 188 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 192 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 195 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 199 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Date getPrcxdt() {
/* 202 */     return this.prcxdt;
/*     */   }
/*     */   
/*     */   public void setPrcxdt(Date prcxdt) {
/* 206 */     this.prcxdt = prcxdt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmnlxgnrtnxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */