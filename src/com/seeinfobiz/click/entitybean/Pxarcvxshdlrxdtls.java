/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxarcvxshdlrxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixmdxshdlrxarcv;
/*     */   private Pxarcvxshdlrxm pxarcvxshdlrxm;
/*     */   private Pxarcvxshdlrxmde pxarcvxshdlrxmde;
/*     */   private BigDecimal ixdtlsxshdlrxarcv;
/*     */   private String mnthxschldrx1;
/*     */   private Date dxschldrx1;
/*     */   private String tmxschldrx1;
/*     */   private String mnthxschldrx2;
/*     */   private Date dxschldrx2;
/*     */   private String tmxschldrx2;
/*     */   private String mnthxschldrx3;
/*     */   private Date dxschldrx3;
/*     */   private String tmxschldrx3;
/*     */   private String mnthxschldrx4;
/*     */   private Date dxschldrx4;
/*     */   private String tmxschldrx4;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxarcvxshdlrxdtls() {}
/*     */   
/*     */   public Pxarcvxshdlrxdtls(BigDecimal ixmdxshdlrxarcv, Pxarcvxshdlrxmde pxarcvxshdlrxmde, BigDecimal ixdtlsxshdlrxarcv) {
/*  40 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/*  41 */     this.pxarcvxshdlrxmde = pxarcvxshdlrxmde;
/*  42 */     this.ixdtlsxshdlrxarcv = ixdtlsxshdlrxarcv;
/*     */   }
/*     */   public Pxarcvxshdlrxdtls(BigDecimal ixmdxshdlrxarcv, Pxarcvxshdlrxm pxarcvxshdlrxm, Pxarcvxshdlrxmde pxarcvxshdlrxmde, BigDecimal ixdtlsxshdlrxarcv, String mnthxschldrx1, Date dxschldrx1, String tmxschldrx1, String mnthxschldrx2, Date dxschldrx2, String tmxschldrx2, String mnthxschldrx3, Date dxschldrx3, String tmxschldrx3, String mnthxschldrx4, Date dxschldrx4, String tmxschldrx4, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  45 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/*  46 */     this.pxarcvxshdlrxm = pxarcvxshdlrxm;
/*  47 */     this.pxarcvxshdlrxmde = pxarcvxshdlrxmde;
/*  48 */     this.ixdtlsxshdlrxarcv = ixdtlsxshdlrxarcv;
/*  49 */     this.mnthxschldrx1 = mnthxschldrx1;
/*  50 */     this.dxschldrx1 = dxschldrx1;
/*  51 */     this.tmxschldrx1 = tmxschldrx1;
/*  52 */     this.mnthxschldrx2 = mnthxschldrx2;
/*  53 */     this.dxschldrx2 = dxschldrx2;
/*  54 */     this.tmxschldrx2 = tmxschldrx2;
/*  55 */     this.mnthxschldrx3 = mnthxschldrx3;
/*  56 */     this.dxschldrx3 = dxschldrx3;
/*  57 */     this.tmxschldrx3 = tmxschldrx3;
/*  58 */     this.mnthxschldrx4 = mnthxschldrx4;
/*  59 */     this.dxschldrx4 = dxschldrx4;
/*  60 */     this.tmxschldrx4 = tmxschldrx4;
/*  61 */     this.dxctd = dxctd;
/*  62 */     this.bxctd = bxctd;
/*  63 */     this.dxmfdxlst = dxmfdxlst;
/*  64 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxmdxshdlrxarcv() {
/*  68 */     return this.ixmdxshdlrxarcv;
/*     */   }
/*     */   
/*     */   public void setIxmdxshdlrxarcv(BigDecimal ixmdxshdlrxarcv) {
/*  72 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/*     */   }
/*     */   public Pxarcvxshdlrxm getPxarcvxshdlrxm() {
/*  75 */     return this.pxarcvxshdlrxm;
/*     */   }
/*     */   
/*     */   public void setPxarcvxshdlrxm(Pxarcvxshdlrxm pxarcvxshdlrxm) {
/*  79 */     this.pxarcvxshdlrxm = pxarcvxshdlrxm;
/*     */   }
/*     */   public Pxarcvxshdlrxmde getPxarcvxshdlrxmde() {
/*  82 */     return this.pxarcvxshdlrxmde;
/*     */   }
/*     */   
/*     */   public void setPxarcvxshdlrxmde(Pxarcvxshdlrxmde pxarcvxshdlrxmde) {
/*  86 */     this.pxarcvxshdlrxmde = pxarcvxshdlrxmde;
/*     */   }
/*     */   public BigDecimal getIxdtlsxshdlrxarcv() {
/*  89 */     return this.ixdtlsxshdlrxarcv;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxshdlrxarcv(BigDecimal ixdtlsxshdlrxarcv) {
/*  93 */     this.ixdtlsxshdlrxarcv = ixdtlsxshdlrxarcv;
/*     */   }
/*     */   public String getMnthxschldrx1() {
/*  96 */     return this.mnthxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx1(String mnthxschldrx1) {
/* 100 */     this.mnthxschldrx1 = mnthxschldrx1;
/*     */   }
/*     */   public Date getDxschldrx1() {
/* 103 */     return this.dxschldrx1;
/*     */   }
/*     */   
/*     */   public void setDxschldrx1(Date dxschldrx1) {
/* 107 */     this.dxschldrx1 = dxschldrx1;
/*     */   }
/*     */   public String getTmxschldrx1() {
/* 110 */     return this.tmxschldrx1;
/*     */   }
/*     */   
/*     */   public void setTmxschldrx1(String tmxschldrx1) {
/* 114 */     this.tmxschldrx1 = tmxschldrx1;
/*     */   }
/*     */   public String getMnthxschldrx2() {
/* 117 */     return this.mnthxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx2(String mnthxschldrx2) {
/* 121 */     this.mnthxschldrx2 = mnthxschldrx2;
/*     */   }
/*     */   public Date getDxschldrx2() {
/* 124 */     return this.dxschldrx2;
/*     */   }
/*     */   
/*     */   public void setDxschldrx2(Date dxschldrx2) {
/* 128 */     this.dxschldrx2 = dxschldrx2;
/*     */   }
/*     */   public String getTmxschldrx2() {
/* 131 */     return this.tmxschldrx2;
/*     */   }
/*     */   
/*     */   public void setTmxschldrx2(String tmxschldrx2) {
/* 135 */     this.tmxschldrx2 = tmxschldrx2;
/*     */   }
/*     */   public String getMnthxschldrx3() {
/* 138 */     return this.mnthxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx3(String mnthxschldrx3) {
/* 142 */     this.mnthxschldrx3 = mnthxschldrx3;
/*     */   }
/*     */   public Date getDxschldrx3() {
/* 145 */     return this.dxschldrx3;
/*     */   }
/*     */   
/*     */   public void setDxschldrx3(Date dxschldrx3) {
/* 149 */     this.dxschldrx3 = dxschldrx3;
/*     */   }
/*     */   public String getTmxschldrx3() {
/* 152 */     return this.tmxschldrx3;
/*     */   }
/*     */   
/*     */   public void setTmxschldrx3(String tmxschldrx3) {
/* 156 */     this.tmxschldrx3 = tmxschldrx3;
/*     */   }
/*     */   public String getMnthxschldrx4() {
/* 159 */     return this.mnthxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx4(String mnthxschldrx4) {
/* 163 */     this.mnthxschldrx4 = mnthxschldrx4;
/*     */   }
/*     */   public Date getDxschldrx4() {
/* 166 */     return this.dxschldrx4;
/*     */   }
/*     */   
/*     */   public void setDxschldrx4(Date dxschldrx4) {
/* 170 */     this.dxschldrx4 = dxschldrx4;
/*     */   }
/*     */   public String getTmxschldrx4() {
/* 173 */     return this.tmxschldrx4;
/*     */   }
/*     */   
/*     */   public void setTmxschldrx4(String tmxschldrx4) {
/* 177 */     this.tmxschldrx4 = tmxschldrx4;
/*     */   }
/*     */   public Date getDxctd() {
/* 180 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 184 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 187 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 191 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 194 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 198 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 201 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 205 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxarcvxshdlrxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */