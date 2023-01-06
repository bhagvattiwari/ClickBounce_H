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
/*     */ public class Pxrdxdrxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrxdx;
/*     */   private String nmshdlrxtyp;
/*     */   private String nmxemlshdlrxtyp;
/*     */   private String tmxschldrxwk;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  23 */   private Set pxrdxdrxshdlrxdtlses = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxrdxdrxm() {}
/*     */ 
/*     */   
/*     */   public Pxrdxdrxm(Long ixrxdx) {
/*  30 */     this.ixrxdx = ixrxdx;
/*     */   }
/*     */   public Pxrdxdrxm(Long ixrxdx, String nmshdlrxtyp, String nmxemlshdlrxtyp, String tmxschldrxwk, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxrdxdrxshdlrxdtlses) {
/*  33 */     this.ixrxdx = ixrxdx;
/*  34 */     this.nmshdlrxtyp = nmshdlrxtyp;
/*  35 */     this.nmxemlshdlrxtyp = nmxemlshdlrxtyp;
/*  36 */     this.tmxschldrxwk = tmxschldrxwk;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*  41 */     this.pxrdxdrxshdlrxdtlses = pxrdxdrxshdlrxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxrxdx() {
/*  45 */     return this.ixrxdx;
/*     */   }
/*     */   
/*     */   public void setIxrxdx(Long ixrxdx) {
/*  49 */     this.ixrxdx = ixrxdx;
/*     */   }
/*     */   public String getNmshdlrxtyp() {
/*  52 */     return this.nmshdlrxtyp;
/*     */   }
/*     */   
/*     */   public void setNmshdlrxtyp(String nmshdlrxtyp) {
/*  56 */     this.nmshdlrxtyp = nmshdlrxtyp;
/*     */   }
/*     */   public String getNmxemlshdlrxtyp() {
/*  59 */     return this.nmxemlshdlrxtyp;
/*     */   }
/*     */   
/*     */   public void setNmxemlshdlrxtyp(String nmxemlshdlrxtyp) {
/*  63 */     this.nmxemlshdlrxtyp = nmxemlshdlrxtyp;
/*     */   }
/*     */   public String getTmxschldrxwk() {
/*  66 */     return this.tmxschldrxwk;
/*     */   }
/*     */   
/*     */   public void setTmxschldrxwk(String tmxschldrxwk) {
/*  70 */     this.tmxschldrxwk = tmxschldrxwk;
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
/*     */   public Set getPxrdxdrxshdlrxdtlses() {
/* 101 */     return this.pxrdxdrxshdlrxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxrdxdrxshdlrxdtlses(Set pxrdxdrxshdlrxdtlses) {
/* 105 */     this.pxrdxdrxshdlrxdtlses = pxrdxdrxshdlrxdtlses;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxrdxdrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */