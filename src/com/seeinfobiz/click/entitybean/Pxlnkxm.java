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
/*    */ public class Pxlnkxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixlnx;
/*    */   private String lblxlnk;
/*    */   private String urlxlcl;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxlnkxm() {}
/*    */   
/*    */   public Pxlnkxm(Long ixlnx) {
/* 27 */     this.ixlnx = ixlnx;
/*    */   }
/*    */   public Pxlnkxm(Long ixlnx, String lblxlnk, String urlxlcl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.ixlnx = ixlnx;
/* 31 */     this.lblxlnk = lblxlnk;
/* 32 */     this.urlxlcl = urlxlcl;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ 
/*    */   
/*    */   public Long getIxlnx() {
/* 41 */     return this.ixlnx;
/*    */   }
/*    */   
/*    */   public void setIxlnx(Long ixlnx) {
/* 45 */     this.ixlnx = ixlnx;
/*    */   }
/*    */   
/*    */   public String getLblxlnk() {
/* 49 */     return this.lblxlnk;
/*    */   }
/*    */   
/*    */   public void setLblxlnk(String lblxlnk) {
/* 53 */     this.lblxlnk = lblxlnk;
/*    */   }
/*    */   
/*    */   public String getUrlxlcl() {
/* 57 */     return this.urlxlcl;
/*    */   }
/*    */   
/*    */   public void setUrlxlcl(String urlxlcl) {
/* 61 */     this.urlxlcl = urlxlcl;
/*    */   }
/*    */ 
/*    */   
/*    */   public Date getDxctd() {
/* 66 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 70 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 73 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 77 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 80 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 84 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 87 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 91 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxlnkxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */