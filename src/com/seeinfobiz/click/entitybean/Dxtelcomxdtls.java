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
/*     */ public class Dxtelcomxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixdtlsxtelxm;
/*     */   private Dxtelomxsmry dxtelomxsmry;
/*     */   private BigDecimal noxacnt;
/*     */   private Date dxcalxitmzd;
/*     */   private String noxitmzd;
/*     */   private String drtnxitmzd;
/*     */   private String chrgsxitmzd;
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
/*     */   public Dxtelcomxdtls() {}
/*     */   
/*     */   public Dxtelcomxdtls(BigDecimal ixdtlsxtelxm) {
/*  51 */     this.ixdtlsxtelxm = ixdtlsxtelxm;
/*     */   }
/*     */   public Dxtelcomxdtls(BigDecimal ixdtlsxtelxm, Dxtelomxsmry dxtelomxsmry, BigDecimal noxacnt, Date dxcalxitmzd, String noxitmzd, String drtnxitmzd, String chrgsxitmzd, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  54 */     this.ixdtlsxtelxm = ixdtlsxtelxm;
/*  55 */     this.dxtelomxsmry = dxtelomxsmry;
/*  56 */     this.noxacnt = noxacnt;
/*  57 */     this.dxcalxitmzd = dxcalxitmzd;
/*  58 */     this.noxitmzd = noxitmzd;
/*  59 */     this.drtnxitmzd = drtnxitmzd;
/*  60 */     this.chrgsxitmzd = chrgsxitmzd;
/*  61 */     this.fldx1 = fldx1;
/*  62 */     this.fldx2 = fldx2;
/*  63 */     this.fldx3 = fldx3;
/*  64 */     this.fldx4 = fldx4;
/*  65 */     this.fldx5 = fldx5;
/*  66 */     this.fldx6 = fldx6;
/*  67 */     this.fldx7 = fldx7;
/*  68 */     this.fldx8 = fldx8;
/*  69 */     this.fldx9 = fldx9;
/*  70 */     this.fldx10 = fldx10;
/*  71 */     this.fldx11 = fldx11;
/*  72 */     this.fldx12 = fldx12;
/*  73 */     this.fldx13 = fldx13;
/*  74 */     this.fldx14 = fldx14;
/*  75 */     this.fldx15 = fldx15;
/*  76 */     this.fldx16 = fldx16;
/*  77 */     this.fldx17 = fldx17;
/*  78 */     this.fldx18 = fldx18;
/*  79 */     this.fldx19 = fldx19;
/*  80 */     this.fldx20 = fldx20;
/*  81 */     this.dxctd = dxctd;
/*  82 */     this.bxctd = bxctd;
/*  83 */     this.dxmfdxlst = dxmfdxlst;
/*  84 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxdtlsxtelxm() {
/*  88 */     return this.ixdtlsxtelxm;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxtelxm(BigDecimal ixdtlsxtelxm) {
/*  92 */     this.ixdtlsxtelxm = ixdtlsxtelxm;
/*     */   }
/*     */   public Dxtelomxsmry getDxtelomxsmry() {
/*  95 */     return this.dxtelomxsmry;
/*     */   }
/*     */   
/*     */   public void setDxtelomxsmry(Dxtelomxsmry dxtelomxsmry) {
/*  99 */     this.dxtelomxsmry = dxtelomxsmry;
/*     */   }
/*     */   public BigDecimal getNoxacnt() {
/* 102 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(BigDecimal noxacnt) {
/* 106 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public Date getDxcalxitmzd() {
/* 109 */     return this.dxcalxitmzd;
/*     */   }
/*     */   
/*     */   public void setDxcalxitmzd(Date dxcalxitmzd) {
/* 113 */     this.dxcalxitmzd = dxcalxitmzd;
/*     */   }
/*     */   public String getNoxitmzd() {
/* 116 */     return this.noxitmzd;
/*     */   }
/*     */   
/*     */   public void setNoxitmzd(String noxitmzd) {
/* 120 */     this.noxitmzd = noxitmzd;
/*     */   }
/*     */   public String getDrtnxitmzd() {
/* 123 */     return this.drtnxitmzd;
/*     */   }
/*     */   
/*     */   public void setDrtnxitmzd(String drtnxitmzd) {
/* 127 */     this.drtnxitmzd = drtnxitmzd;
/*     */   }
/*     */   public String getChrgsxitmzd() {
/* 130 */     return this.chrgsxitmzd;
/*     */   }
/*     */   
/*     */   public void setChrgsxitmzd(String chrgsxitmzd) {
/* 134 */     this.chrgsxitmzd = chrgsxitmzd;
/*     */   }
/*     */   public String getFldx1() {
/* 137 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 141 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 144 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 148 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 151 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 155 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 158 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 162 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 165 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 169 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 172 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 176 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 179 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 183 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 186 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 190 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 193 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 197 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 200 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 204 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 207 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 211 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 214 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 218 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 221 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 225 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 228 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 232 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 235 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 239 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 242 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 246 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 249 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 253 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 256 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 260 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 263 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 267 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 270 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 274 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 277 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 281 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 284 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 288 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 291 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 295 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 298 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 302 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtelcomxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */