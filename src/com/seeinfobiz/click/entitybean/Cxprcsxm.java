/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cxprcsxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprcs;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Date dxprcs;
/*     */   private String nmxprcs;
/*     */   private Long ixstmt;
/*     */   private Date dxstmt;
/*     */   private String mdxprs;
/*     */   private String fxprcsxprs;
/*     */   private String frmtxotpt;
/*     */   private String cdexomrxbr;
/*     */   private String flxfrncyxprs;
/*     */   private Date stxdt;
/*     */   private Date edxdt;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String txprcs;
/*     */   private String flgxlgoxw;
/*     */   private String flgxlgoxwo;
/*     */   private String flgxlgoxeml;
/*     */   private String fxprcsxgen;
/*     */   private String fxprcsxeml;
/*     */   private Long ixlcl;
/*     */   private Long ixmxshldr;
/*  38 */   private Set cxprcsxdtlses = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Cxprcsxm() {}
/*     */   
/*     */   public Cxprcsxm(Long ixprcs, String fxprcsxprs, String fxprcsxgen, String fxprcsxeml) {
/*  44 */     this.ixprcs = ixprcs;
/*  45 */     this.fxprcsxprs = fxprcsxprs;
/*  46 */     this.fxprcsxeml = fxprcsxeml;
/*  47 */     this.fxprcsxgen = fxprcsxgen;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Cxprcsxm(Long ixprcs, Pxprdctxm pxprdctxm, Date dxprcs, String nmxprcs, Long ixstmt, Date dxstmt, String mdxprs, String fxprcsxprs, String frmtxotpt, String cdexomrxbr, String flxfrncyxprs, Date stxdt, Date edxdt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long ixlcl, Set cxprcsxdtlses, String flgxlgoxw, String flgxlgoxwo, String fxprcsxgen, String fxprcsxeml, String txprcs, String flgxlgoxeml, Long ixmxshldr) {
/*  55 */     this.ixprcs = ixprcs;
/*  56 */     this.pxprdctxm = pxprdctxm;
/*  57 */     this.dxprcs = dxprcs;
/*  58 */     this.nmxprcs = nmxprcs;
/*  59 */     this.ixstmt = ixstmt;
/*  60 */     this.dxstmt = dxstmt;
/*  61 */     this.mdxprs = mdxprs;
/*  62 */     this.fxprcsxprs = fxprcsxprs;
/*  63 */     this.frmtxotpt = frmtxotpt;
/*  64 */     this.cdexomrxbr = cdexomrxbr;
/*  65 */     this.flxfrncyxprs = flxfrncyxprs;
/*  66 */     this.stxdt = stxdt;
/*  67 */     this.edxdt = edxdt;
/*  68 */     this.dxctd = dxctd;
/*  69 */     this.bxctd = bxctd;
/*  70 */     this.dxmfdxlst = dxmfdxlst;
/*  71 */     this.bxmfdxlst = bxmfdxlst;
/*  72 */     this.ixlcl = ixlcl;
/*  73 */     this.cxprcsxdtlses = cxprcsxdtlses;
/*  74 */     this.flgxlgoxw = flgxlgoxw;
/*  75 */     this.flgxlgoxwo = flgxlgoxwo;
/*  76 */     this.fxprcsxeml = fxprcsxeml;
/*  77 */     this.fxprcsxgen = fxprcsxgen;
/*  78 */     this.txprcs = txprcs;
/*  79 */     this.ixmxshldr = ixmxshldr;
/*  80 */     this.flgxlgoxeml = flgxlgoxeml;
/*     */   }
/*     */   
/*     */   public Long getIxprcs() {
/*  84 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(Long ixprcs) {
/*  88 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   
/*     */   public Pxprdctxm getPxprdctxm() {
/*  92 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  96 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   
/*     */   public Date getDxprcs() {
/* 100 */     return this.dxprcs;
/*     */   }
/*     */   
/*     */   public void setDxprcs(Date dxprcs) {
/* 104 */     this.dxprcs = dxprcs;
/*     */   }
/*     */   
/*     */   public String getNmxprcs() {
/* 108 */     return this.nmxprcs;
/*     */   }
/*     */   
/*     */   public void setNmxprcs(String nmxprcs) {
/* 112 */     this.nmxprcs = nmxprcs;
/*     */   }
/*     */   
/*     */   public Long getIxstmt() {
/* 116 */     return this.ixstmt;
/*     */   }
/*     */   
/*     */   public void setIxstmt(Long ixstmt) {
/* 120 */     this.ixstmt = ixstmt;
/*     */   }
/*     */   
/*     */   public Date getDxstmt() {
/* 124 */     return this.dxstmt;
/*     */   }
/*     */   
/*     */   public void setDxstmt(Date dxstmt) {
/* 128 */     this.dxstmt = dxstmt;
/*     */   }
/*     */   
/*     */   public String getMdxprs() {
/* 132 */     return this.mdxprs;
/*     */   }
/*     */   
/*     */   public void setMdxprs(String mdxprs) {
/* 136 */     this.mdxprs = mdxprs;
/*     */   }
/*     */   
/*     */   public String getFxprcsxprs() {
/* 140 */     return this.fxprcsxprs;
/*     */   }
/*     */   
/*     */   public void setFxprcsxprs(String fxprcsxprs) {
/* 144 */     this.fxprcsxprs = fxprcsxprs;
/*     */   }
/*     */   
/*     */   public String getFrmtxotpt() {
/* 148 */     return this.frmtxotpt;
/*     */   }
/*     */   
/*     */   public void setFrmtxotpt(String frmtxotpt) {
/* 152 */     this.frmtxotpt = frmtxotpt;
/*     */   }
/*     */   
/*     */   public String getCdexomrxbr() {
/* 156 */     return this.cdexomrxbr;
/*     */   }
/*     */   
/*     */   public void setCdexomrxbr(String cdexomrxbr) {
/* 160 */     this.cdexomrxbr = cdexomrxbr;
/*     */   }
/*     */   
/*     */   public String getFlxfrncyxprs() {
/* 164 */     return this.flxfrncyxprs;
/*     */   }
/*     */   
/*     */   public void setFlxfrncyxprs(String flxfrncyxprs) {
/* 168 */     this.flxfrncyxprs = flxfrncyxprs;
/*     */   }
/*     */   
/*     */   public Date getStxdt() {
/* 172 */     return this.stxdt;
/*     */   }
/*     */   
/*     */   public void setStxdt(Date stxdt) {
/* 176 */     this.stxdt = stxdt;
/*     */   }
/*     */   
/*     */   public Date getEdxdt() {
/* 180 */     return this.edxdt;
/*     */   }
/*     */   
/*     */   public void setEdxdt(Date edxdt) {
/* 184 */     this.edxdt = edxdt;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 188 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 192 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 196 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 200 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 204 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 208 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 212 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 216 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxlcl() {
/* 220 */     return this.ixlcl;
/*     */   }
/*     */   
/*     */   public void setIxlcl(Long ixlcl) {
/* 224 */     this.ixlcl = ixlcl;
/*     */   }
/*     */   
/*     */   public Set getCxprcsxdtlses() {
/* 228 */     return this.cxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public void setCxprcsxdtlses(Set cxprcsxdtlses) {
/* 232 */     this.cxprcsxdtlses = cxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxw() {
/* 236 */     return this.flgxlgoxw;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxw(String flgxlgoxw) {
/* 240 */     this.flgxlgoxw = flgxlgoxw;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxwo() {
/* 244 */     return this.flgxlgoxwo;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxwo(String flgxlgoxwo) {
/* 248 */     this.flgxlgoxwo = flgxlgoxwo;
/*     */   }
/*     */   
/*     */   public String getFxprcsxeml() {
/* 252 */     return this.fxprcsxeml;
/*     */   }
/*     */   
/*     */   public void setFxprcsxeml(String fxprcsxeml) {
/* 256 */     this.fxprcsxeml = fxprcsxeml;
/*     */   }
/*     */   
/*     */   public String getFxprcsxgen() {
/* 260 */     return this.fxprcsxgen;
/*     */   }
/*     */   
/*     */   public void setFxprcsxgen(String fxprcsxgen) {
/* 264 */     this.fxprcsxgen = fxprcsxgen;
/*     */   }
/*     */   
/*     */   public String getTxprcs() {
/* 268 */     return this.txprcs;
/*     */   }
/*     */   
/*     */   public void setTxprcs(String txprcs) {
/* 272 */     this.txprcs = txprcs;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxeml() {
/* 276 */     return this.flgxlgoxeml;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxeml(String flgxlgoxeml) {
/* 280 */     this.flgxlgoxeml = flgxlgoxeml;
/*     */   }
/*     */   
/*     */   public Long getIxmxshldr() {
/* 284 */     return this.ixmxshldr;
/*     */   }
/*     */   
/*     */   public void setIxmxshldr(Long ixmxshldr) {
/* 288 */     this.ixmxshldr = ixmxshldr;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxprcsxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */