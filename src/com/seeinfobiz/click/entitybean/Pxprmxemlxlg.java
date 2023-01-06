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
/*     */ public class Pxprmxemlxlg
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprmxlg;
/*     */   private Long ixprm;
/*     */   private Date dxsnt;
/*     */   private String ttlxcst;
/*     */   private Long ttlxeml;
/*     */   private Long ttlxbncd;
/*     */   private Long ttlxfald;
/*     */   private Long ttlxredxrept;
/*     */   private Long ttlxunred;
/*     */   private Long ttlxsbxrbe;
/*     */   private Long ttlxunsbxrbe;
/*     */   private String fldx1;
/*     */   private String fldx2;
/*     */   private String fldx3;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String ttlxdlv;
/*     */   private String ttlxundlv;
/*  38 */   private Set pxprmxemlxlgxdtlses = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxprmxemlxlg() {}
/*     */ 
/*     */   
/*     */   public Pxprmxemlxlg(Long ixprmxlg) {
/*  45 */     this.ixprmxlg = ixprmxlg;
/*     */   }
/*     */   public Pxprmxemlxlg(Long ixprmxlg, Long ixprm, Date dxsnt, String ttlxcst, Long ttlxeml, Long ttlxbncd, Long ttlxfald, Long ttlxredxrept, Long ttlxunred, Long ttlxsbxrbe, Long ttlxunsbxrbe, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxprmxemlxlgxdtlses, String ttlxundlv, String ttlxdlv) {
/*  48 */     this.ttlxdlv = ttlxdlv;
/*  49 */     this.ttlxundlv = ttlxundlv;
/*  50 */     this.ixprmxlg = ixprmxlg;
/*  51 */     this.ixprm = ixprm;
/*  52 */     this.dxsnt = dxsnt;
/*  53 */     this.ttlxcst = ttlxcst;
/*  54 */     this.ttlxeml = ttlxeml;
/*  55 */     this.ttlxbncd = ttlxbncd;
/*  56 */     this.ttlxfald = ttlxfald;
/*  57 */     this.ttlxredxrept = ttlxredxrept;
/*  58 */     this.ttlxunred = ttlxunred;
/*  59 */     this.ttlxsbxrbe = ttlxsbxrbe;
/*  60 */     this.ttlxunsbxrbe = ttlxunsbxrbe;
/*  61 */     this.fldx1 = fldx1;
/*  62 */     this.fldx2 = fldx2;
/*  63 */     this.fldx3 = fldx3;
/*  64 */     this.fldx4 = fldx4;
/*  65 */     this.fldx5 = fldx5;
/*  66 */     this.dxctd = dxctd;
/*  67 */     this.bxctd = bxctd;
/*  68 */     this.dxmfdxlst = dxmfdxlst;
/*  69 */     this.bxmfdxlst = bxmfdxlst;
/*  70 */     this.pxprmxemlxlgxdtlses = pxprmxemlxlgxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxprmxlg() {
/*  74 */     return this.ixprmxlg;
/*     */   }
/*     */   
/*     */   public void setIxprmxlg(Long ixprmxlg) {
/*  78 */     this.ixprmxlg = ixprmxlg;
/*     */   }
/*     */   public Long getIxprm() {
/*  81 */     return this.ixprm;
/*     */   }
/*     */   
/*     */   public void setIxprm(Long ixprm) {
/*  85 */     this.ixprm = ixprm;
/*     */   }
/*     */   public Date getDxsnt() {
/*  88 */     return this.dxsnt;
/*     */   }
/*     */   
/*     */   public void setDxsnt(Date dxsnt) {
/*  92 */     this.dxsnt = dxsnt;
/*     */   }
/*     */   public String getTtlxcst() {
/*  95 */     return this.ttlxcst;
/*     */   }
/*     */   
/*     */   public void setTtlxcst(String ttlxcst) {
/*  99 */     this.ttlxcst = ttlxcst;
/*     */   }
/*     */   public Long getTtlxeml() {
/* 102 */     return this.ttlxeml;
/*     */   }
/*     */   
/*     */   public void setTtlxeml(Long ttlxeml) {
/* 106 */     this.ttlxeml = ttlxeml;
/*     */   }
/*     */   public Long getTtlxbncd() {
/* 109 */     return this.ttlxbncd;
/*     */   }
/*     */   
/*     */   public void setTtlxbncd(Long ttlxbncd) {
/* 113 */     this.ttlxbncd = ttlxbncd;
/*     */   }
/*     */   public Long getTtlxfald() {
/* 116 */     return this.ttlxfald;
/*     */   }
/*     */   
/*     */   public void setTtlxfald(Long ttlxfald) {
/* 120 */     this.ttlxfald = ttlxfald;
/*     */   }
/*     */   public Long getTtlxredxrept() {
/* 123 */     return this.ttlxredxrept;
/*     */   }
/*     */   
/*     */   public void setTtlxredxrept(Long ttlxredxrept) {
/* 127 */     this.ttlxredxrept = ttlxredxrept;
/*     */   }
/*     */   public Long getTtlxunred() {
/* 130 */     return this.ttlxunred;
/*     */   }
/*     */   
/*     */   public void setTtlxunred(Long ttlxunred) {
/* 134 */     this.ttlxunred = ttlxunred;
/*     */   }
/*     */   public Long getTtlxsbxrbe() {
/* 137 */     return this.ttlxsbxrbe;
/*     */   }
/*     */   
/*     */   public void setTtlxsbxrbe(Long ttlxsbxrbe) {
/* 141 */     this.ttlxsbxrbe = ttlxsbxrbe;
/*     */   }
/*     */   public Long getTtlxunsbxrbe() {
/* 144 */     return this.ttlxunsbxrbe;
/*     */   }
/*     */   
/*     */   public void setTtlxunsbxrbe(Long ttlxunsbxrbe) {
/* 148 */     this.ttlxunsbxrbe = ttlxunsbxrbe;
/*     */   }
/*     */   public String getFldx1() {
/* 151 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 155 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 158 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 162 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 165 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 169 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 172 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 176 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 179 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 183 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public Date getDxctd() {
/* 186 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 190 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 193 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 197 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 200 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 204 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 207 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 211 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set getPxprmxemlxlgxdtlses() {
/* 214 */     return this.pxprmxemlxlgxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxlgxdtlses(Set pxprmxemlxlgxdtlses) {
/* 218 */     this.pxprmxemlxlgxdtlses = pxprmxemlxlgxdtlses;
/*     */   }
/*     */   
/*     */   public String getTtlxdlv() {
/* 222 */     return this.ttlxdlv;
/*     */   }
/*     */   
/*     */   public void setTtlxdlv(String ttlxdlv) {
/* 226 */     this.ttlxdlv = ttlxdlv;
/*     */   }
/*     */   
/*     */   public String getTtlxundlv() {
/* 230 */     return this.ttlxundlv;
/*     */   }
/*     */   
/*     */   public void setTtlxundlv(String ttlxundlv) {
/* 234 */     this.ttlxundlv = ttlxundlv;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmxemlxlg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */