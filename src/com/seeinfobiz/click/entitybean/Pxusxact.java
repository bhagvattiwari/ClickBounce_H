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
/*     */ public class Pxusxact
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixactsxu;
/*     */   private Pxusrxm pxusrxm;
/*     */   private Date dtmxaxs;
/*     */   private String dtmxlgn;
/*     */   private String dtmxlgt;
/*     */   private String adrsxip;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long ixmn;
/*  27 */   private Set pxacnxnms = new HashSet(0);
/*     */   
/*     */   private String timeDiff;
/*     */   
/*  31 */   private String usersName = "";
/*     */ 
/*     */   
/*     */   public Pxusxact() {}
/*     */ 
/*     */   
/*     */   public Pxusxact(Long ixactsxu) {
/*  38 */     this.ixactsxu = ixactsxu;
/*     */   }
/*     */   public Pxusxact(Long ixactsxu, Pxusrxm pxusrxm, Date dtmxaxs, String dtmxlgn, String dtmxlgt, String adrsxip, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long ixmn, Set pxacnxnms) {
/*  41 */     this.ixactsxu = ixactsxu;
/*  42 */     this.pxusrxm = pxusrxm;
/*  43 */     this.dtmxaxs = dtmxaxs;
/*  44 */     this.dtmxlgn = dtmxlgn;
/*  45 */     this.dtmxlgt = dtmxlgt;
/*  46 */     this.adrsxip = adrsxip;
/*  47 */     this.dxctd = dxctd;
/*  48 */     this.bxctd = bxctd;
/*  49 */     this.dxmfdxlst = dxmfdxlst;
/*  50 */     this.bxmfdxlst = bxmfdxlst;
/*  51 */     this.ixmn = ixmn;
/*  52 */     this.pxacnxnms = pxacnxnms;
/*     */   }
/*     */   
/*     */   public Long getIxactsxu() {
/*  56 */     return this.ixactsxu;
/*     */   }
/*     */   
/*     */   public void setIxactsxu(Long ixactsxu) {
/*  60 */     this.ixactsxu = ixactsxu;
/*     */   }
/*     */   public Pxusrxm getPxusrxm() {
/*  63 */     return this.pxusrxm;
/*     */   }
/*     */   
/*     */   public void setPxusrxm(Pxusrxm pxusrxm) {
/*  67 */     this.pxusrxm = pxusrxm;
/*     */   }
/*     */   public Date getDtmxaxs() {
/*  70 */     return this.dtmxaxs;
/*     */   }
/*     */   
/*     */   public void setDtmxaxs(Date dtmxaxs) {
/*  74 */     this.dtmxaxs = dtmxaxs;
/*     */   }
/*     */   public String getDtmxlgn() {
/*  77 */     return this.dtmxlgn;
/*     */   }
/*     */   
/*     */   public void setDtmxlgn(String dtmxlgn) {
/*  81 */     this.dtmxlgn = dtmxlgn;
/*     */   }
/*     */   public String getDtmxlgt() {
/*  84 */     return this.dtmxlgt;
/*     */   }
/*     */   
/*     */   public void setDtmxlgt(String dtmxlgt) {
/*  88 */     this.dtmxlgt = dtmxlgt;
/*     */   }
/*     */   public String getAdrsxip() {
/*  91 */     return this.adrsxip;
/*     */   }
/*     */   
/*     */   public void setAdrsxip(String adrsxip) {
/*  95 */     this.adrsxip = adrsxip;
/*     */   }
/*     */   public Date getDxctd() {
/*  98 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 102 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 105 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 109 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 112 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 116 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 119 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 123 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Long getIxmn() {
/* 126 */     return this.ixmn;
/*     */   }
/*     */   
/*     */   public void setIxmn(Long ixmn) {
/* 130 */     this.ixmn = ixmn;
/*     */   }
/*     */   public Set getPxacnxnms() {
/* 133 */     return this.pxacnxnms;
/*     */   }
/*     */   
/*     */   public void setPxacnxnms(Set pxacnxnms) {
/* 137 */     this.pxacnxnms = pxacnxnms;
/*     */   }
/*     */   
/*     */   public String getTimeDiff() {
/* 141 */     return this.timeDiff;
/*     */   }
/*     */   
/*     */   public void setTimeDiff(String timeDiff) {
/* 145 */     this.timeDiff = timeDiff;
/*     */   }
/*     */   
/*     */   public String getUsersName() {
/* 149 */     return this.usersName;
/*     */   }
/*     */   
/*     */   public void setUsersName(String usersName) {
/* 153 */     this.usersName = usersName;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxact.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */