/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxprmxemlxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprm;
/*     */   private String nmxrlxprm;
/*     */   private String adrsxfrmxem;
/*     */   private String ixbncdxem;
/*     */   private String sbxem;
/*     */   private String bdyxem;
/*     */   private boolean fxatchxem;
/*     */   private String nmxflximg;
/*     */   private String newSendDate;
/*     */   private String qlfrxcrt;
/*     */   private String prmtrxqryxem;
/*     */   private Date dxsnt;
/*     */   private String fxstts;
/*     */   private String rmksxmkrs;
/*     */   private String chkrsxmkrs;
/*     */   private String rmksxem;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fxsubxbe;
/*     */   private String fxsttsxsd;
/*     */   private Date dtxsd;
/*     */   private String fxflxpath;
/*     */   private String feildxx1;
/*     */   private String feildxx2;
/*     */   private String feildxx3;
/*     */   private String exexstts;
/*     */   private String fxunsubxbe;
/*     */   private String fxrdxrept;
/*     */   private String fxunrdxrept;
/*     */   private String ptxfilxin;
/*     */   private Long ixdpt;
/*     */   private String typxsch;
/*  47 */   private Set pxprmxemlxdtlses = new HashSet(0);
/*  48 */   private Set pxprmxemlxshdlrxdtlses = new HashSet(0);
/*  49 */   private Set pxprmximgxdtlses = new HashSet(0);
/*  50 */   private Set pxprmxemlxrunxdtls = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxprmxemlxm() {}
/*     */   
/*     */   public Pxprmxemlxm(Long ixprm, boolean fxatchxem, String qlfrxcrt, String fxstts) {
/*  56 */     this.ixprm = ixprm;
/*  57 */     this.fxatchxem = fxatchxem;
/*  58 */     this.qlfrxcrt = qlfrxcrt;
/*  59 */     this.fxstts = fxstts;
/*     */   }
/*     */   
/*     */   public Pxprmxemlxm(Long ixprm, String nmxrlxprm, String adrsxfrmxem, String ixbncdxem, String sbxem, String bdyxem, boolean fxatchxem, String nmxflximg, String qlfrxcrt, String prmtrxqryxem, Date dxsnt, String fxstts, String rmksxmkrs, String chkrsxmkrs, String rmksxem, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fxsubxbe, String fxsttsxsd, Date dtxsd, String fxflxpath, String feildxx1, String feildxx2, String feildxx3, String exexstts, String fxunsubxbe, String fxrdxrept, String fxunrdxrept, String ptxfilxin, Long ixdpt, String typxsch, Set pxprmxemlxdtlses, Set pxprmxemlxshdlrxdtlses, Set pxprmximgxdtlses, Set pxprmxemlxrunxdtls) {
/*  63 */     this.ixprm = ixprm;
/*  64 */     this.nmxrlxprm = nmxrlxprm;
/*  65 */     this.adrsxfrmxem = adrsxfrmxem;
/*  66 */     this.ixbncdxem = ixbncdxem;
/*  67 */     this.sbxem = sbxem;
/*  68 */     this.bdyxem = bdyxem;
/*  69 */     this.fxatchxem = fxatchxem;
/*  70 */     this.nmxflximg = nmxflximg;
/*  71 */     this.qlfrxcrt = qlfrxcrt;
/*  72 */     this.prmtrxqryxem = prmtrxqryxem;
/*  73 */     this.dxsnt = dxsnt;
/*  74 */     this.fxstts = fxstts;
/*  75 */     this.rmksxmkrs = rmksxmkrs;
/*  76 */     this.chkrsxmkrs = chkrsxmkrs;
/*  77 */     this.rmksxem = rmksxem;
/*  78 */     this.dxctd = dxctd;
/*  79 */     this.bxctd = bxctd;
/*  80 */     this.dxmfdxlst = dxmfdxlst;
/*  81 */     this.bxmfdxlst = bxmfdxlst;
/*  82 */     this.fxsubxbe = fxsubxbe;
/*  83 */     this.fxsttsxsd = fxsttsxsd;
/*  84 */     this.dtxsd = dtxsd;
/*  85 */     this.fxflxpath = fxflxpath;
/*  86 */     this.feildxx1 = feildxx1;
/*  87 */     this.feildxx2 = feildxx2;
/*  88 */     this.feildxx3 = feildxx3;
/*  89 */     this.exexstts = exexstts;
/*  90 */     this.fxunsubxbe = fxunsubxbe;
/*  91 */     this.fxrdxrept = fxrdxrept;
/*  92 */     this.fxunrdxrept = fxunrdxrept;
/*  93 */     this.ptxfilxin = ptxfilxin;
/*  94 */     this.ixdpt = ixdpt;
/*  95 */     this.typxsch = typxsch;
/*  96 */     this.pxprmxemlxdtlses = pxprmxemlxdtlses;
/*  97 */     this.pxprmxemlxshdlrxdtlses = pxprmxemlxshdlrxdtlses;
/*  98 */     this.pxprmximgxdtlses = pxprmximgxdtlses;
/*  99 */     this.pxprmxemlxrunxdtls = pxprmxemlxrunxdtls;
/*     */   }
/*     */   
/*     */   public Long getIxprm() {
/* 103 */     return this.ixprm;
/*     */   }
/*     */   
/*     */   public void setIxprm(Long ixprm) {
/* 107 */     this.ixprm = ixprm;
/*     */   }
/*     */   
/*     */   public String getNmxrlxprm() {
/* 111 */     return this.nmxrlxprm;
/*     */   }
/*     */   
/*     */   public void setNmxrlxprm(String nmxrlxprm) {
/* 115 */     this.nmxrlxprm = nmxrlxprm;
/*     */   }
/*     */   
/*     */   public String getAdrsxfrmxem() {
/* 119 */     return this.adrsxfrmxem;
/*     */   }
/*     */   
/*     */   public void setAdrsxfrmxem(String adrsxfrmxem) {
/* 123 */     this.adrsxfrmxem = adrsxfrmxem;
/*     */   }
/*     */   
/*     */   public String getIxbncdxem() {
/* 127 */     return this.ixbncdxem;
/*     */   }
/*     */   
/*     */   public void setIxbncdxem(String ixbncdxem) {
/* 131 */     this.ixbncdxem = ixbncdxem;
/*     */   }
/*     */   
/*     */   public String getSbxem() {
/* 135 */     return this.sbxem;
/*     */   }
/*     */   
/*     */   public void setSbxem(String sbxem) {
/* 139 */     this.sbxem = sbxem;
/*     */   }
/*     */   
/*     */   public String getBdyxem() {
/* 143 */     return this.bdyxem;
/*     */   }
/*     */   
/*     */   public void setBdyxem(String bdyxem) {
/* 147 */     this.bdyxem = bdyxem;
/*     */   }
/*     */   
/*     */   public boolean isFxatchxem() {
/* 151 */     return this.fxatchxem;
/*     */   }
/*     */   
/*     */   public void setFxatchxem(boolean fxatchxem) {
/* 155 */     this.fxatchxem = fxatchxem;
/*     */   }
/*     */   
/*     */   public String getNmxflximg() {
/* 159 */     return this.nmxflximg;
/*     */   }
/*     */   
/*     */   public void setNmxflximg(String nmxflximg) {
/* 163 */     this.nmxflximg = nmxflximg;
/*     */   }
/*     */   
/*     */   public String getQlfrxcrt() {
/* 167 */     return this.qlfrxcrt;
/*     */   }
/*     */   
/*     */   public void setQlfrxcrt(String qlfrxcrt) {
/* 171 */     this.qlfrxcrt = qlfrxcrt;
/*     */   }
/*     */   
/*     */   public String getPrmtrxqryxem() {
/* 175 */     return this.prmtrxqryxem;
/*     */   }
/*     */   
/*     */   public void setPrmtrxqryxem(String prmtrxqryxem) {
/* 179 */     this.prmtrxqryxem = prmtrxqryxem;
/*     */   }
/*     */   
/*     */   public Date getDxsnt() {
/* 183 */     return this.dxsnt;
/*     */   }
/*     */   
/*     */   public void setDxsnt(Date dxsnt) {
/* 187 */     this.dxsnt = dxsnt;
/*     */   }
/*     */   
/*     */   public String getFxstts() {
/* 191 */     return this.fxstts;
/*     */   }
/*     */   
/*     */   public void setFxstts(String fxstts) {
/* 195 */     this.fxstts = fxstts;
/*     */   }
/*     */   
/*     */   public String getRmksxmkrs() {
/* 199 */     return this.rmksxmkrs;
/*     */   }
/*     */   
/*     */   public void setRmksxmkrs(String rmksxmkrs) {
/* 203 */     this.rmksxmkrs = rmksxmkrs;
/*     */   }
/*     */   
/*     */   public String getChkrsxmkrs() {
/* 207 */     return this.chkrsxmkrs;
/*     */   }
/*     */   
/*     */   public void setChkrsxmkrs(String chkrsxmkrs) {
/* 211 */     this.chkrsxmkrs = chkrsxmkrs;
/*     */   }
/*     */   
/*     */   public String getRmksxem() {
/* 215 */     return this.rmksxem;
/*     */   }
/*     */   
/*     */   public void setRmksxem(String rmksxem) {
/* 219 */     this.rmksxem = rmksxem;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 223 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 227 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 231 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 235 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 239 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 243 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 247 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 251 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getFxsubxbe() {
/* 255 */     return this.fxsubxbe;
/*     */   }
/*     */   
/*     */   public void setFxsubxbe(String fxsubxbe) {
/* 259 */     this.fxsubxbe = fxsubxbe;
/*     */   }
/*     */   
/*     */   public String getFxsttsxsd() {
/* 263 */     return this.fxsttsxsd;
/*     */   }
/*     */   
/*     */   public void setFxsttsxsd(String fxsttsxsd) {
/* 267 */     this.fxsttsxsd = fxsttsxsd;
/*     */   }
/*     */   
/*     */   public Date getDtxsd() {
/* 271 */     return this.dtxsd;
/*     */   }
/*     */   
/*     */   public void setDtxsd(Date dtxsd) {
/* 275 */     this.dtxsd = dtxsd;
/*     */   }
/*     */   
/*     */   public String getFxflxpath() {
/* 279 */     return this.fxflxpath;
/*     */   }
/*     */   
/*     */   public void setFxflxpath(String fxflxpath) {
/* 283 */     this.fxflxpath = fxflxpath;
/*     */   }
/*     */   
/*     */   public String getFeildxx1() {
/* 287 */     return this.feildxx1;
/*     */   }
/*     */   
/*     */   public void setFeildxx1(String feildxx1) {
/* 291 */     this.feildxx1 = feildxx1;
/*     */   }
/*     */   
/*     */   public String getFeildxx2() {
/* 295 */     return this.feildxx2;
/*     */   }
/*     */   
/*     */   public void setFeildxx2(String feildxx2) {
/* 299 */     this.feildxx2 = feildxx2;
/*     */   }
/*     */   
/*     */   public String getFeildxx3() {
/* 303 */     return this.feildxx3;
/*     */   }
/*     */   
/*     */   public void setFeildxx3(String feildxx3) {
/* 307 */     this.feildxx3 = feildxx3;
/*     */   }
/*     */   
/*     */   public String getExexstts() {
/* 311 */     return this.exexstts;
/*     */   }
/*     */   
/*     */   public void setExexstts(String exexstts) {
/* 315 */     this.exexstts = exexstts;
/*     */   }
/*     */   
/*     */   public String getFxunsubxbe() {
/* 319 */     return this.fxunsubxbe;
/*     */   }
/*     */   
/*     */   public void setFxunsubxbe(String fxunsubxbe) {
/* 323 */     this.fxunsubxbe = fxunsubxbe;
/*     */   }
/*     */   
/*     */   public String getFxrdxrept() {
/* 327 */     return this.fxrdxrept;
/*     */   }
/*     */   
/*     */   public void setFxrdxrept(String fxrdxrept) {
/* 331 */     this.fxrdxrept = fxrdxrept;
/*     */   }
/*     */   
/*     */   public String getFxunrdxrept() {
/* 335 */     return this.fxunrdxrept;
/*     */   }
/*     */   
/*     */   public void setFxunrdxrept(String fxunrdxrept) {
/* 339 */     this.fxunrdxrept = fxunrdxrept;
/*     */   }
/*     */   
/*     */   public String getPtxfilxin() {
/* 343 */     return this.ptxfilxin;
/*     */   }
/*     */   
/*     */   public void setPtxfilxin(String ptxfilxin) {
/* 347 */     this.ptxfilxin = ptxfilxin;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 351 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 355 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public String getTypxsch() {
/* 359 */     return this.typxsch;
/*     */   }
/*     */   
/*     */   public void setTypxsch(String typxsch) {
/* 363 */     this.typxsch = typxsch;
/*     */   }
/*     */   
/*     */   public Set getPxprmxemlxdtlses() {
/* 367 */     return this.pxprmxemlxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxdtlses(Set pxprmxemlxdtlses) {
/* 371 */     this.pxprmxemlxdtlses = pxprmxemlxdtlses;
/*     */   }
/*     */   
/*     */   public Set getPxprmxemlxshdlrxdtlses() {
/* 375 */     return this.pxprmxemlxshdlrxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxshdlrxdtlses(Set pxprmxemlxshdlrxdtlses) {
/* 379 */     this.pxprmxemlxshdlrxdtlses = pxprmxemlxshdlrxdtlses;
/*     */   }
/*     */   
/*     */   public Set getPxprmximgxdtlses() {
/* 383 */     return this.pxprmximgxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxprmximgxdtlses(Set pxprmximgxdtlses) {
/* 387 */     this.pxprmximgxdtlses = pxprmximgxdtlses;
/*     */   }
/*     */   
/*     */   public Set getPxprmxemlxrunxdtls() {
/* 391 */     return this.pxprmxemlxrunxdtls;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxrunxdtls(Set pxprmxemlxrunxdtls) {
/* 395 */     this.pxprmxemlxrunxdtls = pxprmxemlxrunxdtls;
/*     */   }
/*     */   
/*     */   public String getNewSendDate() {
/* 399 */     return this.newSendDate;
/*     */   }
/*     */   
/*     */   public void setNewSendDate(String newSendDate) {
/* 403 */     this.newSendDate = newSendDate;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmxemlxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */