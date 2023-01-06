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
/*    */ public class Pxemlimgdtls
/*    */   implements Serializable
/*    */ {
/*    */   private Long prmximgxdtlsid;
/*    */   private Pxemlxcng pxemlxcng;
/*    */   private String imgxurl;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxemlimgdtls() {}
/*    */   
/*    */   public Pxemlimgdtls(Long prmximgxdtlsid) {
/* 27 */     this.prmximgxdtlsid = prmximgxdtlsid;
/*    */   }
/*    */   public Pxemlimgdtls(Long prmximgxdtlsid, Pxemlxcng pxemlxcng, String imgxurl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.prmximgxdtlsid = prmximgxdtlsid;
/* 31 */     this.pxemlxcng = pxemlxcng;
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
/*    */   public Pxemlxcng getPxemlxcng() {
/* 47 */     return this.pxemlxcng;
/*    */   }
/*    */   
/*    */   public void setPxemlxcng(Pxemlxcng pxemlxcng) {
/* 51 */     this.pxemlxcng = pxemlxcng;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlimgdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */