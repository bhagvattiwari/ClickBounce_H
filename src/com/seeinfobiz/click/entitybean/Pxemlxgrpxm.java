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
/*     */ public class Pxemlxgrpxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixgrpxem;
/*     */   private String nmxgrpxem;
/*     */   private Date frmxval;
/*     */   private String flxdflt;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Date toxval;
/*  23 */   private Set<Pxemlxgrpxlnk> pxemlxgrpxlnks = new HashSet<Pxemlxgrpxlnk>(0);
/*     */ 
/*     */   
/*     */   public Pxemlxgrpxm() {}
/*     */   
/*     */   public Pxemlxgrpxm(Long ixgrpxem) {
/*  29 */     this.ixgrpxem = ixgrpxem;
/*     */   }
/*     */   public Pxemlxgrpxm(Long ixgrpxem, String nmxgrpxem, Date frmxval, String flxdflt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Date toxval, Set<Pxemlxgrpxlnk> pxemlxgrpxlnks) {
/*  32 */     this.ixgrpxem = ixgrpxem;
/*  33 */     this.nmxgrpxem = nmxgrpxem;
/*  34 */     this.frmxval = frmxval;
/*  35 */     this.flxdflt = flxdflt;
/*  36 */     this.dxctd = dxctd;
/*  37 */     this.bxctd = bxctd;
/*  38 */     this.dxmfdxlst = dxmfdxlst;
/*  39 */     this.bxmfdxlst = bxmfdxlst;
/*  40 */     this.toxval = toxval;
/*  41 */     this.pxemlxgrpxlnks = pxemlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxgrpxem() {
/*  45 */     return this.ixgrpxem;
/*     */   }
/*     */   
/*     */   public void setIxgrpxem(Long ixgrpxem) {
/*  49 */     this.ixgrpxem = ixgrpxem;
/*     */   }
/*     */   public String getNmxgrpxem() {
/*  52 */     return this.nmxgrpxem;
/*     */   }
/*     */   
/*     */   public void setNmxgrpxem(String nmxgrpxem) {
/*  56 */     this.nmxgrpxem = nmxgrpxem;
/*     */   }
/*     */   public Date getFrmxval() {
/*  59 */     return this.frmxval;
/*     */   }
/*     */   
/*     */   public void setFrmxval(Date frmxval) {
/*  63 */     this.frmxval = frmxval;
/*     */   }
/*     */   public String getFlxdflt() {
/*  66 */     return this.flxdflt;
/*     */   }
/*     */   
/*     */   public void setFlxdflt(String flxdflt) {
/*  70 */     this.flxdflt = flxdflt;
/*     */   }
/*     */   public Date getDxctd() {
/*  73 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  77 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  80 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  84 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  87 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  91 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  94 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  98 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Date getToxval() {
/* 101 */     return this.toxval;
/*     */   }
/*     */   
/*     */   public void setToxval(Date toxval) {
/* 105 */     this.toxval = toxval;
/*     */   }
/*     */   public Set<Pxemlxgrpxlnk> getPxemlxgrpxlnks() {
/* 108 */     return this.pxemlxgrpxlnks;
/*     */   }
/*     */   
/*     */   public void setPxemlxgrpxlnks(Set<Pxemlxgrpxlnk> pxemlxgrpxlnks) {
/* 112 */     this.pxemlxgrpxlnks = pxemlxgrpxlnks;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlxgrpxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */