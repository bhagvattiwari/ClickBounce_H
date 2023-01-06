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
/*     */ public class Pxshdlrxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixmxshdlr;
/*     */   private Date dxshdlrxcur;
/*     */   private Date dxshdlrxnxt;
/*     */   private String typxshdlr;
/*     */   private String mdexshdlr;
/*     */   private String ixprdt;
/*     */   private String dltdxflg;
/*     */   private String stts;
/*  24 */   private Set pxshdlrxarcvs = new HashSet(0);
/*     */   
/*     */   private Date dxctd;
/*     */   
/*     */   private String bxctd;
/*     */   
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private long nxcycxle;
/*     */   private String nmxschxm;
/*     */   private String flgxlgoxw;
/*     */   private String flgxlgoxwo;
/*     */   private String flgxbpxfp;
/*     */   private String flgxlgoxeml;
/*     */   private String nmxschxprxm;
/*     */   private String flgxrecsv;
/*     */   
/*     */   public Pxshdlrxm() {}
/*     */   
/*     */   public Pxshdlrxm(Long ixmxshdlr) {
/*  44 */     this.ixmxshdlr = ixmxshdlr;
/*     */   }
/*     */   
/*     */   public Pxshdlrxm(Long ixmxshdlr, Date dxshdlrxcur, Date dxshdlrxnxt, String typxshdlr, String mdexshdlr, String ixprdt, String dltdxflg, String stts, Set pxshdlrxarcvs, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, long nxcycxle, String nmxschxm, String flgxlgoxw, String flgxlgoxwo, String flgxbpxfp, String flgxlgoxeml, String nmxschxprxm, String flgxrecsv) {
/*  48 */     this.ixmxshdlr = ixmxshdlr;
/*  49 */     this.dxshdlrxcur = dxshdlrxcur;
/*  50 */     this.dxshdlrxnxt = dxshdlrxnxt;
/*  51 */     this.typxshdlr = typxshdlr;
/*  52 */     this.mdexshdlr = mdexshdlr;
/*  53 */     this.ixprdt = ixprdt;
/*  54 */     this.dltdxflg = dltdxflg;
/*  55 */     this.stts = stts;
/*  56 */     this.pxshdlrxarcvs = pxshdlrxarcvs;
/*  57 */     this.dxctd = dxctd;
/*  58 */     this.bxctd = bxctd;
/*  59 */     this.dxmfdxlst = dxmfdxlst;
/*  60 */     this.bxmfdxlst = bxmfdxlst;
/*  61 */     this.nxcycxle = nxcycxle;
/*  62 */     this.nmxschxm = nmxschxm;
/*  63 */     this.flgxlgoxw = flgxlgoxw;
/*  64 */     this.flgxbpxfp = flgxbpxfp;
/*  65 */     this.flgxlgoxwo = flgxlgoxwo;
/*  66 */     this.flgxlgoxeml = flgxlgoxeml;
/*  67 */     this.nmxschxprxm = nmxschxprxm;
/*  68 */     this.flgxrecsv = flgxrecsv;
/*     */   }
/*     */   
/*     */   public Long getIxmxshdlr() {
/*  72 */     return this.ixmxshdlr;
/*     */   }
/*     */   
/*     */   public void setIxmxshdlr(Long ixmxshdlr) {
/*  76 */     this.ixmxshdlr = ixmxshdlr;
/*     */   }
/*     */   public Date getDxshdlrxcur() {
/*  79 */     return this.dxshdlrxcur;
/*     */   }
/*     */   
/*     */   public void setDxshdlrxcur(Date dxshdlrxcur) {
/*  83 */     this.dxshdlrxcur = dxshdlrxcur;
/*     */   }
/*     */   public Date getDxshdlrxnxt() {
/*  86 */     return this.dxshdlrxnxt;
/*     */   }
/*     */   
/*     */   public void setDxshdlrxnxt(Date dxshdlrxnxt) {
/*  90 */     this.dxshdlrxnxt = dxshdlrxnxt;
/*     */   }
/*     */   public String getTypxshdlr() {
/*  93 */     return this.typxshdlr;
/*     */   }
/*     */   
/*     */   public void setTypxshdlr(String typxshdlr) {
/*  97 */     this.typxshdlr = typxshdlr;
/*     */   }
/*     */   public String getMdexshdlr() {
/* 100 */     return this.mdexshdlr;
/*     */   }
/*     */   
/*     */   public void setMdexshdlr(String mdexshdlr) {
/* 104 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */   public String getIxprdt() {
/* 107 */     return this.ixprdt;
/*     */   }
/*     */   
/*     */   public void setIxprdt(String ixprdt) {
/* 111 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   public String getDltdxflg() {
/* 114 */     return this.dltdxflg;
/*     */   }
/*     */   
/*     */   public void setDltdxflg(String dltdxflg) {
/* 118 */     this.dltdxflg = dltdxflg;
/*     */   }
/*     */   public String getStts() {
/* 121 */     return this.stts;
/*     */   }
/*     */   
/*     */   public void setStts(String stts) {
/* 125 */     this.stts = stts;
/*     */   }
/*     */   public Set getPxshdlrxarcvs() {
/* 128 */     return this.pxshdlrxarcvs;
/*     */   }
/*     */   
/*     */   public void setPxshdlrxarcvs(Set pxshdlrxarcvs) {
/* 132 */     this.pxshdlrxarcvs = pxshdlrxarcvs;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 136 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 140 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 144 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 148 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 152 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 156 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 160 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 164 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public long getNxcycxle() {
/* 168 */     return this.nxcycxle;
/*     */   }
/*     */   
/*     */   public void setNxcycxle(long nxcycxle) {
/* 172 */     this.nxcycxle = nxcycxle;
/*     */   }
/*     */   
/*     */   public String getNmxschxm() {
/* 176 */     return this.nmxschxm;
/*     */   }
/*     */   
/*     */   public void setNmxschxm(String nmxschxm) {
/* 180 */     this.nmxschxm = nmxschxm;
/*     */   }
/*     */   
/*     */   public String getFlgxbpxfp() {
/* 184 */     return this.flgxbpxfp;
/*     */   }
/*     */   
/*     */   public void setFlgxbpxfp(String flgxbpxfp) {
/* 188 */     this.flgxbpxfp = flgxbpxfp;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxw() {
/* 192 */     return this.flgxlgoxw;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxw(String flgxlgoxw) {
/* 196 */     this.flgxlgoxw = flgxlgoxw;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxwo() {
/* 200 */     return this.flgxlgoxwo;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxwo(String flgxlgoxwo) {
/* 204 */     this.flgxlgoxwo = flgxlgoxwo;
/*     */   }
/*     */   
/*     */   public String getFlgxlgoxeml() {
/* 208 */     return this.flgxlgoxeml;
/*     */   }
/*     */   
/*     */   public void setFlgxlgoxeml(String flgxlgoxeml) {
/* 212 */     this.flgxlgoxeml = flgxlgoxeml;
/*     */   }
/*     */   
/*     */   public String getNmxschxprxm() {
/* 216 */     return this.nmxschxprxm;
/*     */   }
/*     */   
/*     */   public void setNmxschxprxm(String nmxschxprxm) {
/* 220 */     this.nmxschxprxm = nmxschxprxm;
/*     */   }
/*     */   
/*     */   public String getFlgxrecsv() {
/* 224 */     return this.flgxrecsv;
/*     */   }
/*     */   
/*     */   public void setFlgxrecsv(String flgxrecsv) {
/* 228 */     this.flgxrecsv = flgxrecsv;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxshdlrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */