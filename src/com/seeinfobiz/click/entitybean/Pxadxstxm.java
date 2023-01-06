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
/*     */ public class Pxadxstxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixst;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxst;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Date dxst;
/*     */   private Date dxed;
/*     */   private String dscxevt;
/*     */   private String tmpxdsgn;
/*     */   private Byte sltsxm;
/*     */   private String dscxst;
/*     */   private String stts;
/*     */   private String rmsxmkrs;
/*     */   private String rmsxaprvl;
/*     */   private String rmksxchkrs;
/*     */   private String flxdflt;
/*     */   private String dsgnxmlloc;
/*     */   private String dsgnxmlxnm;
/*     */   private Long ixdpt;
/*     */   
/*     */   public Pxadxstxm() {}
/*     */   
/*     */   public Pxadxstxm(Long ixst) {
/*  39 */     this.ixst = ixst;
/*     */   }
/*     */   public Pxadxstxm(Long ixst, Pxprdctxm pxprdctxm, String nmxst, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Date dxst, Date dxed, String dscxevt, String tmpxdsgn, Byte sltsxm, String dscxst, String stts, String rmsxmkrs, String rmsxaprvl, String rmksxchkrs, String flxdflt, String dsgnxmlloc, String dsgnxmlxnm, Long ixdpt) {
/*  42 */     this.ixst = ixst;
/*  43 */     this.pxprdctxm = pxprdctxm;
/*  44 */     this.nmxst = nmxst;
/*  45 */     this.dxctd = dxctd;
/*  46 */     this.bxctd = bxctd;
/*  47 */     this.dxmfdxlst = dxmfdxlst;
/*  48 */     this.bxmfdxlst = bxmfdxlst;
/*  49 */     this.dxst = dxst;
/*  50 */     this.dxed = dxed;
/*  51 */     this.dscxevt = dscxevt;
/*  52 */     this.tmpxdsgn = tmpxdsgn;
/*  53 */     this.sltsxm = sltsxm;
/*  54 */     this.dscxst = dscxst;
/*  55 */     this.stts = stts;
/*  56 */     this.rmsxmkrs = rmsxmkrs;
/*  57 */     this.rmsxaprvl = rmsxaprvl;
/*  58 */     this.rmksxchkrs = rmksxchkrs;
/*  59 */     this.flxdflt = flxdflt;
/*  60 */     this.dsgnxmlloc = dsgnxmlloc;
/*  61 */     this.dsgnxmlxnm = dsgnxmlxnm;
/*  62 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public Long getIxst() {
/*  66 */     return this.ixst;
/*     */   }
/*     */   
/*     */   public void setIxst(Long ixst) {
/*  70 */     this.ixst = ixst;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  73 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  77 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getNmxst() {
/*  80 */     return this.nmxst;
/*     */   }
/*     */   
/*     */   public void setNmxst(String nmxst) {
/*  84 */     this.nmxst = nmxst;
/*     */   }
/*     */   public Date getDxctd() {
/*  87 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  91 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  94 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  98 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 101 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 105 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 108 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 112 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Date getDxst() {
/* 115 */     return this.dxst;
/*     */   }
/*     */   
/*     */   public void setDxst(Date dxst) {
/* 119 */     this.dxst = dxst;
/*     */   }
/*     */   public Date getDxed() {
/* 122 */     return this.dxed;
/*     */   }
/*     */   
/*     */   public void setDxed(Date dxed) {
/* 126 */     this.dxed = dxed;
/*     */   }
/*     */   public String getDscxevt() {
/* 129 */     return this.dscxevt;
/*     */   }
/*     */   
/*     */   public void setDscxevt(String dscxevt) {
/* 133 */     this.dscxevt = dscxevt;
/*     */   }
/*     */   public String getTmpxdsgn() {
/* 136 */     return this.tmpxdsgn;
/*     */   }
/*     */   
/*     */   public void setTmpxdsgn(String tmpxdsgn) {
/* 140 */     this.tmpxdsgn = tmpxdsgn;
/*     */   }
/*     */   public Byte getSltsxm() {
/* 143 */     return this.sltsxm;
/*     */   }
/*     */   
/*     */   public void setSltsxm(Byte sltsxm) {
/* 147 */     this.sltsxm = sltsxm;
/*     */   }
/*     */   public String getDscxst() {
/* 150 */     return this.dscxst;
/*     */   }
/*     */   
/*     */   public void setDscxst(String dscxst) {
/* 154 */     this.dscxst = dscxst;
/*     */   }
/*     */   public String getStts() {
/* 157 */     return this.stts;
/*     */   }
/*     */   
/*     */   public void setStts(String stts) {
/* 161 */     this.stts = stts;
/*     */   }
/*     */   public String getRmsxmkrs() {
/* 164 */     return this.rmsxmkrs;
/*     */   }
/*     */   
/*     */   public void setRmsxmkrs(String rmsxmkrs) {
/* 168 */     this.rmsxmkrs = rmsxmkrs;
/*     */   }
/*     */   public String getRmsxaprvl() {
/* 171 */     return this.rmsxaprvl;
/*     */   }
/*     */   
/*     */   public void setRmsxaprvl(String rmsxaprvl) {
/* 175 */     this.rmsxaprvl = rmsxaprvl;
/*     */   }
/*     */   public String getRmksxchkrs() {
/* 178 */     return this.rmksxchkrs;
/*     */   }
/*     */   
/*     */   public void setRmksxchkrs(String rmksxchkrs) {
/* 182 */     this.rmksxchkrs = rmksxchkrs;
/*     */   }
/*     */   public String getFlxdflt() {
/* 185 */     return this.flxdflt;
/*     */   }
/*     */   
/*     */   public void setFlxdflt(String flxdflt) {
/* 189 */     this.flxdflt = flxdflt;
/*     */   }
/*     */   
/*     */   public String getdsgnxmlloc() {
/* 193 */     return this.dsgnxmlloc;
/*     */   }
/*     */   
/*     */   public void setdsgnxmlloc(String dsgnxmlloc) {
/* 197 */     this.dsgnxmlloc = dsgnxmlloc;
/*     */   }
/*     */   
/*     */   public String getDsgnxmlloc() {
/* 201 */     return this.dsgnxmlloc;
/*     */   }
/*     */   
/*     */   public void setDsgnxmlloc(String dsgnxmlloc) {
/* 205 */     this.dsgnxmlloc = dsgnxmlloc;
/*     */   }
/*     */   
/*     */   public String getDsgnxmlxnm() {
/* 209 */     return this.dsgnxmlxnm;
/*     */   }
/*     */   
/*     */   public void setDsgnxmlxnm(String dsgnxmlxnm) {
/* 213 */     this.dsgnxmlxnm = dsgnxmlxnm;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 217 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 221 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxadxstxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */