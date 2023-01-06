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
/*     */ public class Dxtrnsxccxsmry
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixsmryxcctrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private String typxcrd;
/*     */   private BigDecimal lmtxcrdtxtot;
/*     */   private BigDecimal lmtxcrdtxavl;
/*     */   private BigDecimal lmtxcshxtot;
/*     */   private BigDecimal lmtxcshxavl;
/*     */   private Date dxdxpyt;
/*     */   private BigDecimal dxpytxmn;
/*     */   private BigDecimal dxpytxttl;
/*     */   private BigDecimal otstngxttl;
/*     */   private BigDecimal dxamtxprvs;
/*     */   private BigDecimal mdxpyt;
/*     */   private BigDecimal chrgsxothrxprchs;
/*     */   private BigDecimal blxopxpntxrwd;
/*     */   private BigDecimal blxclxpntxrwd;
/*     */   private BigDecimal erndxrwd;
/*     */   private BigDecimal rdmdxrwd;
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
/*     */   public Dxtrnsxccxsmry() {}
/*     */   
/*     */   public Dxtrnsxccxsmry(BigDecimal ixsmryxcctrns) {
/*  62 */     this.ixsmryxcctrns = ixsmryxcctrns;
/*     */   }
/*     */   public Dxtrnsxccxsmry(BigDecimal ixsmryxcctrns, Dxtrnsxsmryxm dxtrnsxsmryxm, String typxcrd, BigDecimal lmtxcrdtxtot, BigDecimal lmtxcrdtxavl, BigDecimal lmtxcshxtot, BigDecimal lmtxcshxavl, Date dxdxpyt, BigDecimal dxpytxmn, BigDecimal dxpytxttl, BigDecimal otstngxttl, BigDecimal dxamtxprvs, BigDecimal mdxpyt, BigDecimal chrgsxothrxprchs, BigDecimal blxopxpntxrwd, BigDecimal blxclxpntxrwd, BigDecimal erndxrwd, BigDecimal rdmdxrwd, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  65 */     this.ixsmryxcctrns = ixsmryxcctrns;
/*  66 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  67 */     this.typxcrd = typxcrd;
/*  68 */     this.lmtxcrdtxtot = lmtxcrdtxtot;
/*  69 */     this.lmtxcrdtxavl = lmtxcrdtxavl;
/*  70 */     this.lmtxcshxtot = lmtxcshxtot;
/*  71 */     this.lmtxcshxavl = lmtxcshxavl;
/*  72 */     this.dxdxpyt = dxdxpyt;
/*  73 */     this.dxpytxmn = dxpytxmn;
/*  74 */     this.dxpytxttl = dxpytxttl;
/*  75 */     this.otstngxttl = otstngxttl;
/*  76 */     this.dxamtxprvs = dxamtxprvs;
/*  77 */     this.mdxpyt = mdxpyt;
/*  78 */     this.chrgsxothrxprchs = chrgsxothrxprchs;
/*  79 */     this.blxopxpntxrwd = blxopxpntxrwd;
/*  80 */     this.blxclxpntxrwd = blxclxpntxrwd;
/*  81 */     this.erndxrwd = erndxrwd;
/*  82 */     this.rdmdxrwd = rdmdxrwd;
/*  83 */     this.fldx1 = fldx1;
/*  84 */     this.fldx2 = fldx2;
/*  85 */     this.fldx3 = fldx3;
/*  86 */     this.fldx4 = fldx4;
/*  87 */     this.fldx5 = fldx5;
/*  88 */     this.fldx6 = fldx6;
/*  89 */     this.fldx7 = fldx7;
/*  90 */     this.fldx8 = fldx8;
/*  91 */     this.fldx9 = fldx9;
/*  92 */     this.fldx10 = fldx10;
/*  93 */     this.fldx11 = fldx11;
/*  94 */     this.fldx12 = fldx12;
/*  95 */     this.fldx13 = fldx13;
/*  96 */     this.fldx14 = fldx14;
/*  97 */     this.fldx15 = fldx15;
/*  98 */     this.fldx16 = fldx16;
/*  99 */     this.fldx17 = fldx17;
/* 100 */     this.fldx18 = fldx18;
/* 101 */     this.fldx19 = fldx19;
/* 102 */     this.fldx20 = fldx20;
/* 103 */     this.dxctd = dxctd;
/* 104 */     this.bxctd = bxctd;
/* 105 */     this.dxmfdxlst = dxmfdxlst;
/* 106 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxsmryxcctrns() {
/* 110 */     return this.ixsmryxcctrns;
/*     */   }
/*     */   
/*     */   public void setIxsmryxcctrns(BigDecimal ixsmryxcctrns) {
/* 114 */     this.ixsmryxcctrns = ixsmryxcctrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 117 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 121 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public String getTypxcrd() {
/* 124 */     return this.typxcrd;
/*     */   }
/*     */   
/*     */   public void setTypxcrd(String typxcrd) {
/* 128 */     this.typxcrd = typxcrd;
/*     */   }
/*     */   public BigDecimal getLmtxcrdtxtot() {
/* 131 */     return this.lmtxcrdtxtot;
/*     */   }
/*     */   
/*     */   public void setLmtxcrdtxtot(BigDecimal lmtxcrdtxtot) {
/* 135 */     this.lmtxcrdtxtot = lmtxcrdtxtot;
/*     */   }
/*     */   public BigDecimal getLmtxcrdtxavl() {
/* 138 */     return this.lmtxcrdtxavl;
/*     */   }
/*     */   
/*     */   public void setLmtxcrdtxavl(BigDecimal lmtxcrdtxavl) {
/* 142 */     this.lmtxcrdtxavl = lmtxcrdtxavl;
/*     */   }
/*     */   public BigDecimal getLmtxcshxtot() {
/* 145 */     return this.lmtxcshxtot;
/*     */   }
/*     */   
/*     */   public void setLmtxcshxtot(BigDecimal lmtxcshxtot) {
/* 149 */     this.lmtxcshxtot = lmtxcshxtot;
/*     */   }
/*     */   public BigDecimal getLmtxcshxavl() {
/* 152 */     return this.lmtxcshxavl;
/*     */   }
/*     */   
/*     */   public void setLmtxcshxavl(BigDecimal lmtxcshxavl) {
/* 156 */     this.lmtxcshxavl = lmtxcshxavl;
/*     */   }
/*     */   public Date getDxdxpyt() {
/* 159 */     return this.dxdxpyt;
/*     */   }
/*     */   
/*     */   public void setDxdxpyt(Date dxdxpyt) {
/* 163 */     this.dxdxpyt = dxdxpyt;
/*     */   }
/*     */   public BigDecimal getDxpytxmn() {
/* 166 */     return this.dxpytxmn;
/*     */   }
/*     */   
/*     */   public void setDxpytxmn(BigDecimal dxpytxmn) {
/* 170 */     this.dxpytxmn = dxpytxmn;
/*     */   }
/*     */   public BigDecimal getDxpytxttl() {
/* 173 */     return this.dxpytxttl;
/*     */   }
/*     */   
/*     */   public void setDxpytxttl(BigDecimal dxpytxttl) {
/* 177 */     this.dxpytxttl = dxpytxttl;
/*     */   }
/*     */   public BigDecimal getOtstngxttl() {
/* 180 */     return this.otstngxttl;
/*     */   }
/*     */   
/*     */   public void setOtstngxttl(BigDecimal otstngxttl) {
/* 184 */     this.otstngxttl = otstngxttl;
/*     */   }
/*     */   public BigDecimal getDxamtxprvs() {
/* 187 */     return this.dxamtxprvs;
/*     */   }
/*     */   
/*     */   public void setDxamtxprvs(BigDecimal dxamtxprvs) {
/* 191 */     this.dxamtxprvs = dxamtxprvs;
/*     */   }
/*     */   public BigDecimal getMdxpyt() {
/* 194 */     return this.mdxpyt;
/*     */   }
/*     */   
/*     */   public void setMdxpyt(BigDecimal mdxpyt) {
/* 198 */     this.mdxpyt = mdxpyt;
/*     */   }
/*     */   public BigDecimal getChrgsxothrxprchs() {
/* 201 */     return this.chrgsxothrxprchs;
/*     */   }
/*     */   
/*     */   public void setChrgsxothrxprchs(BigDecimal chrgsxothrxprchs) {
/* 205 */     this.chrgsxothrxprchs = chrgsxothrxprchs;
/*     */   }
/*     */   public BigDecimal getBlxopxpntxrwd() {
/* 208 */     return this.blxopxpntxrwd;
/*     */   }
/*     */   
/*     */   public void setBlxopxpntxrwd(BigDecimal blxopxpntxrwd) {
/* 212 */     this.blxopxpntxrwd = blxopxpntxrwd;
/*     */   }
/*     */   public BigDecimal getBlxclxpntxrwd() {
/* 215 */     return this.blxclxpntxrwd;
/*     */   }
/*     */   
/*     */   public void setBlxclxpntxrwd(BigDecimal blxclxpntxrwd) {
/* 219 */     this.blxclxpntxrwd = blxclxpntxrwd;
/*     */   }
/*     */   public BigDecimal getErndxrwd() {
/* 222 */     return this.erndxrwd;
/*     */   }
/*     */   
/*     */   public void setErndxrwd(BigDecimal erndxrwd) {
/* 226 */     this.erndxrwd = erndxrwd;
/*     */   }
/*     */   public BigDecimal getRdmdxrwd() {
/* 229 */     return this.rdmdxrwd;
/*     */   }
/*     */   
/*     */   public void setRdmdxrwd(BigDecimal rdmdxrwd) {
/* 233 */     this.rdmdxrwd = rdmdxrwd;
/*     */   }
/*     */   public String getFldx1() {
/* 236 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 240 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 243 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 247 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 250 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 254 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 257 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 261 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 264 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 268 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 271 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 275 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 278 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 282 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 285 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 289 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 292 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 296 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 299 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 303 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 306 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 310 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 313 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 317 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 320 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 324 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 327 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 331 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 334 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 338 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 341 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 345 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 348 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 352 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 355 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 359 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 362 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 366 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 369 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 373 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 376 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 380 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 383 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 387 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 390 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 394 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 397 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 401 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtrnsxccxsmry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */