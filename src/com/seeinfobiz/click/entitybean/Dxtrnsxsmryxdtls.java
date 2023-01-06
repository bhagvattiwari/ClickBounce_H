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
/*     */ public class Dxtrnsxsmryxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixdtlsxsmryxtrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private BigDecimal noxact;
/*     */   private BigDecimal noxacntxsub;
/*     */   private BigDecimal ixprdt;
/*     */   private Date dxopng;
/*     */   private Date dxclsg;
/*     */   private Date dxmtrty;
/*     */   private BigDecimal amtxprncpl;
/*     */   private BigDecimal pdxrtxintr;
/*     */   private BigDecimal blnc;
/*     */   private String fldx1;
/*     */   private String fldx2;
/*     */   private String fldx3;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private String fldx6;
/*     */   private String fldx7;
/*     */   private String fldx8;
/*     */   private String fldx9;
/*     */   private String fldx10;
/*     */   private String fldx11;
/*     */   private String fldx12;
/*     */   private String fldx13;
/*     */   private String fldx14;
/*     */   private String fldx15;
/*     */   private String fldx16;
/*     */   private String fldx17;
/*     */   private String fldx18;
/*     */   private String fldx19;
/*     */   private String fldx20;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Dxtrnsxsmryxdtls() {}
/*     */   
/*     */   public Dxtrnsxsmryxdtls(BigDecimal ixdtlsxsmryxtrns) {
/*  55 */     this.ixdtlsxsmryxtrns = ixdtlsxsmryxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxdtls(BigDecimal ixdtlsxsmryxtrns, Dxtrnsxsmryxm dxtrnsxsmryxm, BigDecimal noxact, BigDecimal noxacntxsub, BigDecimal ixprdt, Date dxopng, Date dxclsg, Date dxmtrty, BigDecimal amtxprncpl, BigDecimal pdxrtxintr, BigDecimal blnc, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  58 */     this.ixdtlsxsmryxtrns = ixdtlsxsmryxtrns;
/*  59 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  60 */     this.noxact = noxact;
/*  61 */     this.noxacntxsub = noxacntxsub;
/*  62 */     this.ixprdt = ixprdt;
/*  63 */     this.dxopng = dxopng;
/*  64 */     this.dxclsg = dxclsg;
/*  65 */     this.dxmtrty = dxmtrty;
/*  66 */     this.amtxprncpl = amtxprncpl;
/*  67 */     this.pdxrtxintr = pdxrtxintr;
/*  68 */     this.blnc = blnc;
/*  69 */     this.fldx1 = fldx1;
/*  70 */     this.fldx2 = fldx2;
/*  71 */     this.fldx3 = fldx3;
/*  72 */     this.fldx4 = fldx4;
/*  73 */     this.fldx5 = fldx5;
/*  74 */     this.fldx6 = fldx6;
/*  75 */     this.fldx7 = fldx7;
/*  76 */     this.fldx8 = fldx8;
/*  77 */     this.fldx9 = fldx9;
/*  78 */     this.fldx10 = fldx10;
/*  79 */     this.fldx11 = fldx11;
/*  80 */     this.fldx12 = fldx12;
/*  81 */     this.fldx13 = fldx13;
/*  82 */     this.fldx14 = fldx14;
/*  83 */     this.fldx15 = fldx15;
/*  84 */     this.fldx16 = fldx16;
/*  85 */     this.fldx17 = fldx17;
/*  86 */     this.fldx18 = fldx18;
/*  87 */     this.fldx19 = fldx19;
/*  88 */     this.fldx20 = fldx20;
/*  89 */     this.dxctd = dxctd;
/*  90 */     this.bxctd = bxctd;
/*  91 */     this.dxmfdxlst = dxmfdxlst;
/*  92 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxdtlsxsmryxtrns() {
/*  96 */     return this.ixdtlsxsmryxtrns;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxsmryxtrns(BigDecimal ixdtlsxsmryxtrns) {
/* 100 */     this.ixdtlsxsmryxtrns = ixdtlsxsmryxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 103 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 107 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public BigDecimal getNoxact() {
/* 110 */     return this.noxact;
/*     */   }
/*     */   
/*     */   public void setNoxact(BigDecimal noxact) {
/* 114 */     this.noxact = noxact;
/*     */   }
/*     */   public BigDecimal getNoxacntxsub() {
/* 117 */     return this.noxacntxsub;
/*     */   }
/*     */   
/*     */   public void setNoxacntxsub(BigDecimal noxacntxsub) {
/* 121 */     this.noxacntxsub = noxacntxsub;
/*     */   }
/*     */   public BigDecimal getIxprdt() {
/* 124 */     return this.ixprdt;
/*     */   }
/*     */   
/*     */   public void setIxprdt(BigDecimal ixprdt) {
/* 128 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   public Date getDxopng() {
/* 131 */     return this.dxopng;
/*     */   }
/*     */   
/*     */   public void setDxopng(Date dxopng) {
/* 135 */     this.dxopng = dxopng;
/*     */   }
/*     */   public Date getDxclsg() {
/* 138 */     return this.dxclsg;
/*     */   }
/*     */   
/*     */   public void setDxclsg(Date dxclsg) {
/* 142 */     this.dxclsg = dxclsg;
/*     */   }
/*     */   public Date getDxmtrty() {
/* 145 */     return this.dxmtrty;
/*     */   }
/*     */   
/*     */   public void setDxmtrty(Date dxmtrty) {
/* 149 */     this.dxmtrty = dxmtrty;
/*     */   }
/*     */   public BigDecimal getAmtxprncpl() {
/* 152 */     return this.amtxprncpl;
/*     */   }
/*     */   
/*     */   public void setAmtxprncpl(BigDecimal amtxprncpl) {
/* 156 */     this.amtxprncpl = amtxprncpl;
/*     */   }
/*     */   public BigDecimal getPdxrtxintr() {
/* 159 */     return this.pdxrtxintr;
/*     */   }
/*     */   
/*     */   public void setPdxrtxintr(BigDecimal pdxrtxintr) {
/* 163 */     this.pdxrtxintr = pdxrtxintr;
/*     */   }
/*     */   public BigDecimal getBlnc() {
/* 166 */     return this.blnc;
/*     */   }
/*     */   
/*     */   public void setBlnc(BigDecimal blnc) {
/* 170 */     this.blnc = blnc;
/*     */   }
/*     */   public String getFldx1() {
/* 173 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 177 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 180 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 184 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 187 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 191 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 194 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 198 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 201 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 205 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 208 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 212 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 215 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 219 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 222 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 226 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 229 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 233 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 236 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 240 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 243 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 247 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 250 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 254 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 257 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 261 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 264 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 268 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 271 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 275 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 278 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 282 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 285 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 289 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 292 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 296 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 299 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 303 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 306 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 310 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 313 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 317 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 320 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 324 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 327 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 331 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 334 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 338 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtrnsxsmryxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */