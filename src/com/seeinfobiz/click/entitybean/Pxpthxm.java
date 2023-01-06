/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxpthxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixpth;
/*    */   private String nmxpth;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxpthxm() {}
/*    */   
/*    */   public Pxpthxm(Long ixpth) {
/* 22 */     this.ixpth = ixpth;
/*    */   }
/*    */   
/*    */   public Pxpthxm(Long ixpth, String nmxpth, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 26 */     this.ixpth = ixpth;
/* 27 */     this.nmxpth = nmxpth;
/* 28 */     this.dxctd = dxctd;
/* 29 */     this.bxctd = bxctd;
/* 30 */     this.dxmfdxlst = dxmfdxlst;
/* 31 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ 
/*    */   
/*    */   public Long getIxpth() {
/* 36 */     return this.ixpth;
/*    */   }
/*    */   
/*    */   public void setIxpth(Long ixpth) {
/* 40 */     this.ixpth = ixpth;
/*    */   }
/*    */   
/*    */   public String getNmxpth() {
/* 44 */     return this.nmxpth;
/*    */   }
/*    */   
/*    */   public void setNmxpth(String nmxpth) {
/* 48 */     this.nmxpth = nmxpth;
/*    */   }
/*    */   
/*    */   public Date getDxctd() {
/* 52 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 56 */     this.dxctd = dxctd;
/*    */   }
/*    */   
/*    */   public String getBxctd() {
/* 60 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 64 */     this.bxctd = bxctd;
/*    */   }
/*    */   
/*    */   public Date getDxmfdxlst() {
/* 68 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 72 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   
/*    */   public String getBxmfdxlst() {
/* 76 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 80 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxpthxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */