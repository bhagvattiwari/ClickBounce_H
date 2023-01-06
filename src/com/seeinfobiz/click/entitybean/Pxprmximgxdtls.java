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
/*    */ public class Pxprmximgxdtls
/*    */   implements Serializable
/*    */ {
/*    */   private Long prmximgxdtlsid;
/*    */   private Pxprmxemlxm pxprmxemlxm;
/*    */   private String imgxurl;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxprmximgxdtls() {}
/*    */   
/*    */   public Pxprmximgxdtls(Long prmximgxdtlsid) {
/* 27 */     this.prmximgxdtlsid = prmximgxdtlsid;
/*    */   }
/*    */   public Pxprmximgxdtls(Long prmximgxdtlsid, Pxprmxemlxm pxprmxemlxm, String imgxurl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.prmximgxdtlsid = prmximgxdtlsid;
/* 31 */     this.pxprmxemlxm = pxprmxemlxm;
/* 32 */     this.imgxurl = imgxurl;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getPrmximgxdtlsid() {
/* 40 */     return this.prmximgxdtlsid;
/*    */   }
/*    */   
/*    */   public void setPrmximgxdtlsid(Long prmximgxdtlsid) {
/* 44 */     this.prmximgxdtlsid = prmximgxdtlsid;
/*    */   }
/*    */   public Pxprmxemlxm getPxprmxemlxm() {
/* 47 */     return this.pxprmxemlxm;
/*    */   }
/*    */   
/*    */   public void setPxprmxemlxm(Pxprmxemlxm pxprmxemlxm) {
/* 51 */     this.pxprmxemlxm = pxprmxemlxm;
/*    */   }
/*    */   public String getImgxurl() {
/* 54 */     return this.imgxurl;
/*    */   }
/*    */   
/*    */   public void setImgxurl(String imgxurl) {
/* 58 */     this.imgxurl = imgxurl;
/*    */   }
/*    */   public Date getDxctd() {
/* 61 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 65 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 68 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 72 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 75 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 79 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 82 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 86 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmximgxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */