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
/*     */ 
/*     */ 
/*     */ public class Pxprmxemlxlgxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprmxlgxdtls;
/*     */   private Pxprmxemlxlg pxprmxemlxlg;
/*     */   private String crn;
/*     */   private Long noxacnt;
/*     */   private String ixem;
/*     */   private String ixemxalt;
/*     */   private String fxsntxem;
/*     */   private String fxbncdxem;
/*     */   private String catxbou;
/*     */   private String fxredxrept;
/*     */   private String fxunredxrept;
/*     */   private String fxsbxrbe;
/*     */   private String fxunsbxrbe;
/*     */   private String fldx1;
/*     */   private String fldx2;
/*     */   private String fldx3;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fxdlvxrept;
/*     */   private String fxundlvxrept;
/*     */   
/*     */   public Pxprmxemlxlgxdtls() {}
/*     */   
/*     */   public Pxprmxemlxlgxdtls(Long ixprmxlgxdtls) {
/*  44 */     this.ixprmxlgxdtls = ixprmxlgxdtls;
/*     */   }
/*     */   public Pxprmxemlxlgxdtls(Long ixprmxlgxdtls, Pxprmxemlxlg pxprmxemlxlg, String crn, Long noxacnt, String ixem, String ixemxalt, String fxsntxem, String fxbncdxem, String catxbou, String fxredxrept, String fxunredxrept, String fxsbxrbe, String fxunsbxrbe, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fxdlvxrept, String fxundlvxrept) {
/*  47 */     this.fxundlvxrept = fxundlvxrept;
/*  48 */     this.fxdlvxrept = fxdlvxrept;
/*  49 */     this.ixprmxlgxdtls = ixprmxlgxdtls;
/*  50 */     this.pxprmxemlxlg = pxprmxemlxlg;
/*  51 */     this.crn = crn;
/*  52 */     this.noxacnt = noxacnt;
/*  53 */     this.ixem = ixem;
/*  54 */     this.ixemxalt = ixemxalt;
/*  55 */     this.fxsntxem = fxsntxem;
/*  56 */     this.fxbncdxem = fxbncdxem;
/*  57 */     this.catxbou = catxbou;
/*  58 */     this.fxredxrept = fxredxrept;
/*  59 */     this.fxunredxrept = fxunredxrept;
/*  60 */     this.fxsbxrbe = fxsbxrbe;
/*  61 */     this.fxunsbxrbe = fxunsbxrbe;
/*  62 */     this.fldx1 = fldx1;
/*  63 */     this.fldx2 = fldx2;
/*  64 */     this.fldx3 = fldx3;
/*  65 */     this.fldx4 = fldx4;
/*  66 */     this.fldx5 = fldx5;
/*  67 */     this.dxctd = dxctd;
/*  68 */     this.bxctd = bxctd;
/*  69 */     this.dxmfdxlst = dxmfdxlst;
/*  70 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxprmxlgxdtls() {
/*  74 */     return this.ixprmxlgxdtls;
/*     */   }
/*     */   
/*     */   public void setIxprmxlgxdtls(Long ixprmxlgxdtls) {
/*  78 */     this.ixprmxlgxdtls = ixprmxlgxdtls;
/*     */   }
/*     */   public Pxprmxemlxlg getPxprmxemlxlg() {
/*  81 */     return this.pxprmxemlxlg;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxlg(Pxprmxemlxlg pxprmxemlxlg) {
/*  85 */     this.pxprmxemlxlg = pxprmxemlxlg;
/*     */   }
/*     */   public String getCrn() {
/*  88 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/*  92 */     this.crn = crn;
/*     */   }
/*     */   public Long getNoxacnt() {
/*  95 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(Long noxacnt) {
/*  99 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public String getIxem() {
/* 102 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 106 */     this.ixem = ixem;
/*     */   }
/*     */   public String getIxemxalt() {
/* 109 */     return this.ixemxalt;
/*     */   }
/*     */   
/*     */   public void setIxemxalt(String ixemxalt) {
/* 113 */     this.ixemxalt = ixemxalt;
/*     */   }
/*     */   public String getFxsntxem() {
/* 116 */     return this.fxsntxem;
/*     */   }
/*     */   
/*     */   public void setFxsntxem(String fxsntxem) {
/* 120 */     this.fxsntxem = fxsntxem;
/*     */   }
/*     */   public String getFxbncdxem() {
/* 123 */     return this.fxbncdxem;
/*     */   }
/*     */   
/*     */   public void setFxbncdxem(String fxbncdxem) {
/* 127 */     this.fxbncdxem = fxbncdxem;
/*     */   }
/*     */   public String getCatxbou() {
/* 130 */     return this.catxbou;
/*     */   }
/*     */   
/*     */   public void setCatxbou(String catxbou) {
/* 134 */     this.catxbou = catxbou;
/*     */   }
/*     */   public String getFxredxrept() {
/* 137 */     return this.fxredxrept;
/*     */   }
/*     */   
/*     */   public void setFxredxrept(String fxredxrept) {
/* 141 */     this.fxredxrept = fxredxrept;
/*     */   }
/*     */   public String getFxunredxrept() {
/* 144 */     return this.fxunredxrept;
/*     */   }
/*     */   
/*     */   public void setFxunredxrept(String fxunredxrept) {
/* 148 */     this.fxunredxrept = fxunredxrept;
/*     */   }
/*     */   public String getFxsbxrbe() {
/* 151 */     return this.fxsbxrbe;
/*     */   }
/*     */   
/*     */   public void setFxsbxrbe(String fxsbxrbe) {
/* 155 */     this.fxsbxrbe = fxsbxrbe;
/*     */   }
/*     */   public String getFxunsbxrbe() {
/* 158 */     return this.fxunsbxrbe;
/*     */   }
/*     */   
/*     */   public void setFxunsbxrbe(String fxunsbxrbe) {
/* 162 */     this.fxunsbxrbe = fxunsbxrbe;
/*     */   }
/*     */   public String getFldx1() {
/* 165 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 169 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 172 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 176 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 179 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 183 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 186 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 190 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 193 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 197 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public Date getDxctd() {
/* 200 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 204 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 207 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 211 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 214 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 218 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 221 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 225 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getFxdlvxrept() {
/* 229 */     return this.fxdlvxrept;
/*     */   }
/*     */   
/*     */   public void setFxdlvxrept(String fxdlvxrept) {
/* 233 */     this.fxdlvxrept = fxdlvxrept;
/*     */   }
/*     */   
/*     */   public String getFxundlvxrept() {
/* 237 */     return this.fxundlvxrept;
/*     */   }
/*     */   
/*     */   public void setFxundlvxrept(String fxundlvxrept) {
/* 241 */     this.fxundlvxrept = fxundlvxrept;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmxemlxlgxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */