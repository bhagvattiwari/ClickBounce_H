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
/*     */ public class Pxusrxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixu;
/*     */   private Pxdeptxm pxdeptxm;
/*     */   private String nmxu;
/*     */   private String ixem;
/*     */   private String noxct;
/*     */   private String woxpa;
/*     */   private String sttsxu;
/*     */   private Date dxxryxwoxpa;
/*     */   private Date txlaxlo;
/*     */   private Long fxlgnxfst;
/*     */   private Long ixdpt;
/*     */   private String nmxlg;
/*     */   private String rmxcrnt;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  32 */   private Set pxusxrlxlnks = new HashSet(0);
/*  33 */   private Set pxusxacts = new HashSet(0);
/*  34 */   private Set pxusxprdctxlnks = new HashSet(0);
/*  35 */   private Set pxusxpsdxdtlses = new HashSet(0);
/*  36 */   private Set pxusrxtmpxrgtxms = new HashSet(0);
/*  37 */   private Set pxusxregxlnks = new HashSet(0);
/*  38 */   private Set pxusxlocxlnks = new HashSet(0);
/*  39 */   private String roleName = "";
/*  40 */   private String localeName = "";
/*     */ 
/*     */ 
/*     */   
/*     */   public Pxusrxm() {}
/*     */ 
/*     */   
/*     */   public Pxusrxm(Long ixu) {
/*  48 */     this.ixu = ixu;
/*     */   }
/*     */   public Pxusrxm(Long ixu, Long ixdpt, Pxdeptxm pxdeptxm, String nmxu, String ixem, String noxct, String woxpa, String sttsxu, Date dxxryxwoxpa, Date txlaxlo, Long fxlgnxfst, String nmxlg, String rmxcrnt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set pxusxrlxlnks, Set pxusxacts, Set pxusxprdctxlnks, Set pxusxpsdxdtlses, Set pxusrxtmpxrgtxms, Set pxusxregxlnks, Set pxusxlocxlnks) {
/*  51 */     this.ixu = ixu;
/*  52 */     this.pxdeptxm = pxdeptxm;
/*  53 */     this.nmxu = nmxu;
/*  54 */     this.ixem = ixem;
/*  55 */     this.noxct = noxct;
/*  56 */     this.woxpa = woxpa;
/*  57 */     this.sttsxu = sttsxu;
/*  58 */     this.dxxryxwoxpa = dxxryxwoxpa;
/*  59 */     this.txlaxlo = txlaxlo;
/*  60 */     this.fxlgnxfst = fxlgnxfst;
/*  61 */     this.nmxlg = nmxlg;
/*  62 */     this.rmxcrnt = rmxcrnt;
/*  63 */     this.dxctd = dxctd;
/*  64 */     this.bxctd = bxctd;
/*  65 */     this.dxmfdxlst = dxmfdxlst;
/*  66 */     this.bxmfdxlst = bxmfdxlst;
/*  67 */     this.pxusxrlxlnks = pxusxrlxlnks;
/*  68 */     this.pxusxacts = pxusxacts;
/*  69 */     this.pxusxprdctxlnks = pxusxprdctxlnks;
/*  70 */     this.pxusxpsdxdtlses = pxusxpsdxdtlses;
/*  71 */     this.pxusrxtmpxrgtxms = pxusrxtmpxrgtxms;
/*  72 */     this.pxusxregxlnks = pxusxregxlnks;
/*  73 */     this.pxusxlocxlnks = pxusxlocxlnks;
/*  74 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public Long getIxu() {
/*  78 */     return this.ixu;
/*     */   }
/*     */   
/*     */   public void setIxu(Long ixu) {
/*  82 */     this.ixu = ixu;
/*     */   }
/*     */   public Pxdeptxm getPxdeptxm() {
/*  85 */     return this.pxdeptxm;
/*     */   }
/*     */   
/*     */   public void setPxdeptxm(Pxdeptxm pxdeptxm) {
/*  89 */     this.pxdeptxm = pxdeptxm;
/*     */   }
/*     */   public String getNmxu() {
/*  92 */     return this.nmxu;
/*     */   }
/*     */   
/*     */   public void setNmxu(String nmxu) {
/*  96 */     this.nmxu = nmxu;
/*     */   }
/*     */   public String getIxem() {
/*  99 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 103 */     this.ixem = ixem;
/*     */   }
/*     */   public String getNoxct() {
/* 106 */     return this.noxct;
/*     */   }
/*     */   
/*     */   public void setNoxct(String noxct) {
/* 110 */     this.noxct = noxct;
/*     */   }
/*     */   public String getWoxpa() {
/* 113 */     return this.woxpa;
/*     */   }
/*     */   
/*     */   public void setWoxpa(String woxpa) {
/* 117 */     this.woxpa = woxpa;
/*     */   }
/*     */   public String getSttsxu() {
/* 120 */     return this.sttsxu;
/*     */   }
/*     */   
/*     */   public void setSttsxu(String sttsxu) {
/* 124 */     this.sttsxu = sttsxu;
/*     */   }
/*     */   public Date getDxxryxwoxpa() {
/* 127 */     return this.dxxryxwoxpa;
/*     */   }
/*     */   
/*     */   public void setDxxryxwoxpa(Date dxxryxwoxpa) {
/* 131 */     this.dxxryxwoxpa = dxxryxwoxpa;
/*     */   }
/*     */   public Date getTxlaxlo() {
/* 134 */     return this.txlaxlo;
/*     */   }
/*     */   
/*     */   public void setTxlaxlo(Date txlaxlo) {
/* 138 */     this.txlaxlo = txlaxlo;
/*     */   }
/*     */   public Long getFxlgnxfst() {
/* 141 */     return this.fxlgnxfst;
/*     */   }
/*     */   
/*     */   public void setFxlgnxfst(Long fxlgnxfst) {
/* 145 */     this.fxlgnxfst = fxlgnxfst;
/*     */   }
/*     */   public String getNmxlg() {
/* 148 */     return this.nmxlg;
/*     */   }
/*     */   
/*     */   public void setNmxlg(String nmxlg) {
/* 152 */     this.nmxlg = nmxlg;
/*     */   }
/*     */   public String getRmxcrnt() {
/* 155 */     return this.rmxcrnt;
/*     */   }
/*     */   
/*     */   public void setRmxcrnt(String rmxcrnt) {
/* 159 */     this.rmxcrnt = rmxcrnt;
/*     */   }
/*     */   public Date getDxctd() {
/* 162 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 166 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 169 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 173 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 176 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 180 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 183 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 187 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set getPxusxrlxlnks() {
/* 190 */     return this.pxusxrlxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxrlxlnks(Set pxusxrlxlnks) {
/* 194 */     this.pxusxrlxlnks = pxusxrlxlnks;
/*     */   }
/*     */   public Set getPxusxacts() {
/* 197 */     return this.pxusxacts;
/*     */   }
/*     */   
/*     */   public void setPxusxacts(Set pxusxacts) {
/* 201 */     this.pxusxacts = pxusxacts;
/*     */   }
/*     */   public Set getPxusxprdctxlnks() {
/* 204 */     return this.pxusxprdctxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxprdctxlnks(Set pxusxprdctxlnks) {
/* 208 */     this.pxusxprdctxlnks = pxusxprdctxlnks;
/*     */   }
/*     */   public Set getPxusxpsdxdtlses() {
/* 211 */     return this.pxusxpsdxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxusxpsdxdtlses(Set pxusxpsdxdtlses) {
/* 215 */     this.pxusxpsdxdtlses = pxusxpsdxdtlses;
/*     */   }
/*     */   public Set getPxusrxtmpxrgtxms() {
/* 218 */     return this.pxusrxtmpxrgtxms;
/*     */   }
/*     */   
/*     */   public void setPxusrxtmpxrgtxms(Set pxusrxtmpxrgtxms) {
/* 222 */     this.pxusrxtmpxrgtxms = pxusrxtmpxrgtxms;
/*     */   }
/*     */   public Set getPxusxregxlnks() {
/* 225 */     return this.pxusxregxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxregxlnks(Set pxusxregxlnks) {
/* 229 */     this.pxusxregxlnks = pxusxregxlnks;
/*     */   }
/*     */   public Set getPxusxlocxlnks() {
/* 232 */     return this.pxusxlocxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxlocxlnks(Set pxusxlocxlnks) {
/* 236 */     this.pxusxlocxlnks = pxusxlocxlnks;
/*     */   }
/*     */   
/*     */   public String getLocaleName() {
/* 240 */     return this.localeName;
/*     */   }
/*     */   
/*     */   public void setLocaleName(String localeName) {
/* 244 */     this.localeName = localeName;
/*     */   }
/*     */   
/*     */   public String getRoleName() {
/* 248 */     return this.roleName;
/*     */   }
/*     */   
/*     */   public void setRoleName(String roleName) {
/* 252 */     this.roleName = roleName;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 256 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 260 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */