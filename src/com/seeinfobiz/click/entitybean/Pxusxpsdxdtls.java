/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxusxpsdxdtls
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixwdxpo;
/*    */   private Pxusrxm pxusrxm;
/*    */   private String wdxps;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   private Long ixcyc;
/*    */   
/*    */   public Pxusxpsdxdtls() {}
/*    */   
/*    */   public Pxusxpsdxdtls(Long ixwdxpo) {
/* 28 */     this.ixwdxpo = ixwdxpo;
/*    */   }
/*    */   public Pxusxpsdxdtls(Long ixwdxpo, Pxusrxm pxusrxm, String wdxps, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long ixcyc) {
/* 31 */     this.ixwdxpo = ixwdxpo;
/* 32 */     this.pxusrxm = pxusrxm;
/* 33 */     this.wdxps = wdxps;
/* 34 */     this.dxctd = dxctd;
/* 35 */     this.bxctd = bxctd;
/* 36 */     this.dxmfdxlst = dxmfdxlst;
/* 37 */     this.bxmfdxlst = bxmfdxlst;
/* 38 */     this.ixcyc = ixcyc;
/*    */   }
/*    */   
/*    */   public Long getIxwdxpo() {
/* 42 */     return this.ixwdxpo;
/*    */   }
/*    */   
/*    */   public void setIxwdxpo(Long ixwdxpo) {
/* 46 */     this.ixwdxpo = ixwdxpo;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 49 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 53 */     this.pxusrxm = pxusrxm;
/*    */   }
/*    */   public String getWdxps() {
/* 56 */     return this.wdxps;
/*    */   }
/*    */   
/*    */   public void setWdxps(String wdxps) {
/* 60 */     this.wdxps = wdxps;
/*    */   }
/*    */   public Date getDxctd() {
/* 63 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 67 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 70 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 74 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 77 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 81 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 84 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 88 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   public Long getIxcyc() {
/* 91 */     return this.ixcyc;
/*    */   }
/*    */   
/*    */   public void setIxcyc(Long ixcyc) {
/* 95 */     this.ixcyc = ixcyc;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxpsdxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */