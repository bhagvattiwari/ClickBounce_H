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
/*     */ public class Pxmtxgrpxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixgrpxm;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxgrpxm;
/*     */   private String rmksxaprvl;
/*     */   private Date toxval;
/*     */   private Date frmxval;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  24 */   private Set pxmtxrlxgrpxlnks = new HashSet(0);
/*     */   
/*     */   private Long ixdpt;
/*     */   
/*     */   public Pxmtxgrpxm() {}
/*     */   
/*     */   public Pxmtxgrpxm(Long ixgrpxm) {
/*  31 */     this.ixgrpxm = ixgrpxm;
/*     */   }
/*     */   public Pxmtxgrpxm(Long ixgrpxm, Pxprdctxm pxprdctxm, String nmxgrpxm, String rmksxaprvl, Date toxval, Date frmxval, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxmtxrlxgrpxlnks) {
/*  34 */     this.ixgrpxm = ixgrpxm;
/*  35 */     this.pxprdctxm = pxprdctxm;
/*  36 */     this.nmxgrpxm = nmxgrpxm;
/*  37 */     this.rmksxaprvl = rmksxaprvl;
/*  38 */     this.toxval = toxval;
/*  39 */     this.frmxval = frmxval;
/*  40 */     this.dxctd = dxctd;
/*  41 */     this.bxctd = bxctd;
/*  42 */     this.dxmfdxlst = dxmfdxlst;
/*  43 */     this.bxmfdxlst = bxmfdxlst;
/*  44 */     this.pxmtxrlxgrpxlnks = pxmtxrlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxgrpxm() {
/*  48 */     return this.ixgrpxm;
/*     */   }
/*     */   
/*     */   public void setIxgrpxm(Long ixgrpxm) {
/*  52 */     this.ixgrpxm = ixgrpxm;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  55 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  59 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getNmxgrpxm() {
/*  62 */     return this.nmxgrpxm;
/*     */   }
/*     */   
/*     */   public void setNmxgrpxm(String nmxgrpxm) {
/*  66 */     this.nmxgrpxm = nmxgrpxm;
/*     */   }
/*     */   public String getRmksxaprvl() {
/*  69 */     return this.rmksxaprvl;
/*     */   }
/*     */   
/*     */   public void setRmksxaprvl(String rmksxaprvl) {
/*  73 */     this.rmksxaprvl = rmksxaprvl;
/*     */   }
/*     */   public Date getToxval() {
/*  76 */     return this.toxval;
/*     */   }
/*     */   
/*     */   public void setToxval(Date toxval) {
/*  80 */     this.toxval = toxval;
/*     */   }
/*     */   public Date getFrmxval() {
/*  83 */     return this.frmxval;
/*     */   }
/*     */   
/*     */   public void setFrmxval(Date frmxval) {
/*  87 */     this.frmxval = frmxval;
/*     */   }
/*     */   public Date getDxctd() {
/*  90 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  94 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  97 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 101 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 104 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 108 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 111 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 115 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Set getPxmtxrlxgrpxlnks() {
/* 119 */     return this.pxmtxrlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxgrpxlnks(Set pxmtxrlxgrpxlnks) {
/* 123 */     this.pxmtxrlxgrpxlnks = pxmtxrlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 127 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 131 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmtxgrpxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */