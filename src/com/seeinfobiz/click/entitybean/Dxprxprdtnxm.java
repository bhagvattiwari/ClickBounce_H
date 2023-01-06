/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Dxprxprdtnxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprdtnxpr;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Date dtxcycxbil;
/*     */   private String flxprexpro;
/*     */   private String paxfil;
/*     */   private Long genxstmtxnum;
/*     */   private String frmtxotpt;
/*     */   private String flxexec;
/*     */   private Date dtxsch;
/*     */   private String flxgo;
/*     */   private String commxgo;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long qtxsmpl;
/*     */   private String comm;
/*     */   private Date dxqaxdt;
/*     */   private String nmxprdtnxpr;
/*     */   private String flxqa;
/*     */   private Long ixdpt;
/*     */   private String billDateStr;
/*     */   private String QADateStr;
/*     */   private String cxfile;
/*     */   
/*     */   public Dxprxprdtnxm(Long ixprdtnxpr, Pxprdctxm pxprdctxm, Date dtxcycxbil, String flxprexpro, String paxfil, Long genxstmtxnum, String frmtxotpt, String flxexec, Date dtxsch, String flxgo, String commxgo, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long qtxsmpl, String comm, Date dxqaxdt, String nmxprdtnxpr, String flxqa, Long ixdpt) {
/*  38 */     this.ixprdtnxpr = ixprdtnxpr;
/*  39 */     this.pxprdctxm = pxprdctxm;
/*  40 */     this.dtxcycxbil = dtxcycxbil;
/*  41 */     this.flxprexpro = flxprexpro;
/*  42 */     this.paxfil = paxfil;
/*  43 */     this.genxstmtxnum = genxstmtxnum;
/*  44 */     this.frmtxotpt = frmtxotpt;
/*  45 */     this.flxexec = flxexec;
/*  46 */     this.dtxsch = dtxsch;
/*  47 */     this.flxgo = flxgo;
/*  48 */     this.commxgo = commxgo;
/*  49 */     this.dxctd = dxctd;
/*  50 */     this.bxctd = bxctd;
/*  51 */     this.dxmfdxlst = dxmfdxlst;
/*  52 */     this.bxmfdxlst = bxmfdxlst;
/*  53 */     this.qtxsmpl = qtxsmpl;
/*  54 */     this.comm = comm;
/*  55 */     this.dxqaxdt = dxqaxdt;
/*  56 */     this.nmxprdtnxpr = nmxprdtnxpr;
/*  57 */     this.flxqa = flxqa;
/*  58 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dxprxprdtnxm() {}
/*     */   
/*     */   public Dxprxprdtnxm(Long ixprdtnxpr, String frmtxotpt) {
/*  65 */     this.ixprdtnxpr = ixprdtnxpr;
/*  66 */     this.frmtxotpt = frmtxotpt;
/*     */   }
/*     */   
/*     */   public String getFlxqa() {
/*  70 */     return this.flxqa;
/*     */   }
/*     */   
/*     */   public void setFlxqa(String flxqa) {
/*  74 */     this.flxqa = flxqa;
/*     */   }
/*     */   
/*     */   public Long getIxprdtnxpr() {
/*  78 */     return this.ixprdtnxpr;
/*     */   }
/*     */   
/*     */   public void setIxprdtnxpr(Long ixprdtnxpr) {
/*  82 */     this.ixprdtnxpr = ixprdtnxpr;
/*     */   }
/*     */   
/*     */   public Pxprdctxm getPxprdctxm() {
/*  86 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  90 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   
/*     */   public Date getDtxcycxbil() {
/*  94 */     return this.dtxcycxbil;
/*     */   }
/*     */   
/*     */   public void setDtxcycxbil(Date dtxcycxbil) {
/*  98 */     this.dtxcycxbil = dtxcycxbil;
/*     */   }
/*     */   
/*     */   public String getFlxprexpro() {
/* 102 */     return this.flxprexpro;
/*     */   }
/*     */   
/*     */   public void setFlxprexpro(String flxprexpro) {
/* 106 */     this.flxprexpro = flxprexpro;
/*     */   }
/*     */   
/*     */   public String getPaxfil() {
/* 110 */     return this.paxfil;
/*     */   }
/*     */   
/*     */   public void setPaxfil(String paxfil) {
/* 114 */     this.paxfil = paxfil;
/*     */   }
/*     */   
/*     */   public Long getGenxstmtxnum() {
/* 118 */     return this.genxstmtxnum;
/*     */   }
/*     */   
/*     */   public void setGenxstmtxnum(Long genxstmtxnum) {
/* 122 */     this.genxstmtxnum = genxstmtxnum;
/*     */   }
/*     */   
/*     */   public String getFrmtxotpt() {
/* 126 */     return this.frmtxotpt;
/*     */   }
/*     */   
/*     */   public void setFrmtxotpt(String frmtxotpt) {
/* 130 */     this.frmtxotpt = frmtxotpt;
/*     */   }
/*     */   
/*     */   public String getFlxexec() {
/* 134 */     return this.flxexec;
/*     */   }
/*     */   
/*     */   public void setFlxexec(String flxexec) {
/* 138 */     this.flxexec = flxexec;
/*     */   }
/*     */   
/*     */   public Date getDtxsch() {
/* 142 */     return this.dtxsch;
/*     */   }
/*     */   
/*     */   public void setDtxsch(Date dtxsch) {
/* 146 */     this.dtxsch = dtxsch;
/*     */   }
/*     */   
/*     */   public String getFlxgo() {
/* 150 */     return this.flxgo;
/*     */   }
/*     */   
/*     */   public void setFlxgo(String flxgo) {
/* 154 */     this.flxgo = flxgo;
/*     */   }
/*     */   
/*     */   public String getCommxgo() {
/* 158 */     return this.commxgo;
/*     */   }
/*     */   
/*     */   public void setCommxgo(String commxgo) {
/* 162 */     this.commxgo = commxgo;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 166 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 170 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 174 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 178 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 182 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 186 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 190 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 194 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getQtxsmpl() {
/* 198 */     return this.qtxsmpl;
/*     */   }
/*     */   
/*     */   public void setQtxsmpl(Long qtxsmpl) {
/* 202 */     this.qtxsmpl = qtxsmpl;
/*     */   }
/*     */   
/*     */   public String getComm() {
/* 206 */     return this.comm;
/*     */   }
/*     */   
/*     */   public void setComm(String comm) {
/* 210 */     this.comm = comm;
/*     */   }
/*     */   
/*     */   public Date getDxqaxdt() {
/* 214 */     return this.dxqaxdt;
/*     */   }
/*     */   
/*     */   public void setDxqaxdt(Date dxqaxdt) {
/* 218 */     this.dxqaxdt = dxqaxdt;
/*     */   }
/*     */   
/*     */   public String getNmxprdtnxpr() {
/* 222 */     return this.nmxprdtnxpr;
/*     */   }
/*     */   
/*     */   public void setNmxprdtnxpr(String nmxprdtnxpr) {
/* 226 */     this.nmxprdtnxpr = nmxprdtnxpr;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 230 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 234 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public String getBillDateStr() {
/* 238 */     return this.billDateStr;
/*     */   }
/*     */   
/*     */   public void setBillDateStr(String billDateStr) {
/* 242 */     this.billDateStr = billDateStr;
/*     */   }
/*     */   
/*     */   public String getQADateStr() {
/* 246 */     return this.QADateStr;
/*     */   }
/*     */   
/*     */   public void setQADateStr(String QADateStr) {
/* 250 */     this.QADateStr = QADateStr;
/*     */   }
/*     */   
/*     */   public String getCxfile() {
/* 254 */     return this.cxfile;
/*     */   }
/*     */   
/*     */   public void setCxfile(String cxfile) {
/* 258 */     this.cxfile = cxfile;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxprxprdtnxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */