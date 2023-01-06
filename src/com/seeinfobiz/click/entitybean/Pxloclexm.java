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
/*     */ public class Pxloclexm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixlcl;
/*     */   private String nmxlcl;
/*     */   private String rmxlcl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  21 */   private Set<Pxusxlocxlnk> pxusxlocxlnks = new HashSet<Pxusxlocxlnk>(0);
/*  22 */   private Set<Pxeshdlrxprsxm> pxeshdlrxprsxms = new HashSet<Pxeshdlrxprsxm>(0);
/*     */ 
/*     */   
/*     */   public Pxloclexm() {}
/*     */ 
/*     */   
/*     */   public Pxloclexm(Long ixlcl) {
/*  29 */     this.ixlcl = ixlcl;
/*     */   }
/*     */   public Pxloclexm(Long ixlcl, String nmxlcl, String rmxlcl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxusxlocxlnk> pxusxlocxlnks, Set<Pxeshdlrxprsxm> pxeshdlrxprsxms) {
/*  32 */     this.ixlcl = ixlcl;
/*  33 */     this.nmxlcl = nmxlcl;
/*  34 */     this.rmxlcl = rmxlcl;
/*  35 */     this.dxctd = dxctd;
/*  36 */     this.bxctd = bxctd;
/*  37 */     this.dxmfdxlst = dxmfdxlst;
/*  38 */     this.bxmfdxlst = bxmfdxlst;
/*  39 */     this.pxusxlocxlnks = pxusxlocxlnks;
/*  40 */     this.pxeshdlrxprsxms = pxeshdlrxprsxms;
/*     */   }
/*     */   
/*     */   public Long getIxlcl() {
/*  44 */     return this.ixlcl;
/*     */   }
/*     */   
/*     */   public void setIxlcl(Long ixlcl) {
/*  48 */     this.ixlcl = ixlcl;
/*     */   }
/*     */   public String getNmxlcl() {
/*  51 */     return this.nmxlcl;
/*     */   }
/*     */   
/*     */   public void setNmxlcl(String nmxlcl) {
/*  55 */     this.nmxlcl = nmxlcl;
/*     */   }
/*     */   public String getRmxlcl() {
/*  58 */     return this.rmxlcl;
/*     */   }
/*     */   
/*     */   public void setRmxlcl(String rmxlcl) {
/*  62 */     this.rmxlcl = rmxlcl;
/*     */   }
/*     */   public Date getDxctd() {
/*  65 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  69 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  72 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  76 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  79 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  83 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  86 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  90 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Pxusxlocxlnk> getPxusxlocxlnks() {
/*  93 */     return this.pxusxlocxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxlocxlnks(Set<Pxusxlocxlnk> pxusxlocxlnks) {
/*  97 */     this.pxusxlocxlnks = pxusxlocxlnks;
/*     */   }
/*     */   public Set<Pxeshdlrxprsxm> getPxeshdlrxprsxms() {
/* 100 */     return this.pxeshdlrxprsxms;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprsxms(Set<Pxeshdlrxprsxm> pxeshdlrxprsxms) {
/* 104 */     this.pxeshdlrxprsxms = pxeshdlrxprsxms;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxloclexm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */