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
/*     */ public class Pxregxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrg;
/*     */   private String dsxrg;
/*     */   private String nmxrg;
/*     */   private String rm;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  24 */   private Set<Pxusxregxlnk> pxusxregxlnks = new HashSet<Pxusxregxlnk>(0);
/*     */ 
/*     */   
/*     */   public Pxregxm() {}
/*     */ 
/*     */   
/*     */   public Pxregxm(Long ixrg) {
/*  31 */     this.ixrg = ixrg;
/*     */   }
/*     */   public Pxregxm(Long ixrg, String dsxrg, String nmxrg, String rm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxusxregxlnk> pxusxregxlnks) {
/*  34 */     this.ixrg = ixrg;
/*  35 */     this.dsxrg = dsxrg;
/*  36 */     this.nmxrg = nmxrg;
/*  37 */     this.rm = rm;
/*  38 */     this.dxctd = dxctd;
/*  39 */     this.bxctd = bxctd;
/*  40 */     this.dxmfdxlst = dxmfdxlst;
/*  41 */     this.bxmfdxlst = bxmfdxlst;
/*  42 */     this.pxusxregxlnks = pxusxregxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxrg() {
/*  46 */     return this.ixrg;
/*     */   }
/*     */   
/*     */   public void setIxrg(Long ixrg) {
/*  50 */     this.ixrg = ixrg;
/*     */   }
/*     */   public String getDsxrg() {
/*  53 */     return this.dsxrg;
/*     */   }
/*     */   
/*     */   public void setDsxrg(String dsxrg) {
/*  57 */     this.dsxrg = dsxrg;
/*     */   }
/*     */   public String getNmxrg() {
/*  60 */     return this.nmxrg;
/*     */   }
/*     */   
/*     */   public void setNmxrg(String nmxrg) {
/*  64 */     this.nmxrg = nmxrg;
/*     */   }
/*     */   public String getRm() {
/*  67 */     return this.rm;
/*     */   }
/*     */   
/*     */   public void setRm(String rm) {
/*  71 */     this.rm = rm;
/*     */   }
/*     */   public Date getDxctd() {
/*  74 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  78 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  81 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  85 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  88 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  92 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  95 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  99 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Pxusxregxlnk> getPxusxregxlnks() {
/* 102 */     return this.pxusxregxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxregxlnks(Set<Pxusxregxlnk> pxusxregxlnks) {
/* 106 */     this.pxusxregxlnks = pxusxregxlnks;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxregxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */