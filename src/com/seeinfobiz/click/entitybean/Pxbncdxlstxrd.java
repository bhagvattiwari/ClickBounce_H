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
/*    */ public class Pxbncdxlstxrd
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixrdxlst;
/*    */   private Pxbncdxmlxcng pxbncdxmlxcng;
/*    */   private String dxrdxlst;
/*    */   private String ixmsg;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxbncdxlstxrd() {}
/*    */   
/*    */   public Pxbncdxlstxrd(Long ixrdxlst) {
/* 28 */     this.ixrdxlst = ixrdxlst;
/*    */   }
/*    */   public Pxbncdxlstxrd(Long ixrdxlst, Pxbncdxmlxcng pxbncdxmlxcng, String dxrdxlst, String ixmsg, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 31 */     this.ixrdxlst = ixrdxlst;
/* 32 */     this.pxbncdxmlxcng = pxbncdxmlxcng;
/* 33 */     this.dxrdxlst = dxrdxlst;
/* 34 */     this.ixmsg = ixmsg;
/* 35 */     this.dxctd = dxctd;
/* 36 */     this.bxctd = bxctd;
/* 37 */     this.dxmfdxlst = dxmfdxlst;
/* 38 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxrdxlst() {
/* 42 */     return this.ixrdxlst;
/*    */   }
/*    */   
/*    */   public void setIxrdxlst(Long ixrdxlst) {
/* 46 */     this.ixrdxlst = ixrdxlst;
/*    */   }
/*    */   public Pxbncdxmlxcng getPxbncdxmlxcng() {
/* 49 */     return this.pxbncdxmlxcng;
/*    */   }
/*    */   
/*    */   public void setPxbncdxmlxcng(Pxbncdxmlxcng pxbncdxmlxcng) {
/* 53 */     this.pxbncdxmlxcng = pxbncdxmlxcng;
/*    */   }
/*    */   
/*    */   public String getDxrdxlst() {
/* 57 */     return this.dxrdxlst;
/*    */   }
/*    */   
/*    */   public void setDxrdxlst(String dxrdxlst) {
/* 61 */     this.dxrdxlst = dxrdxlst;
/*    */   }
/*    */   
/*    */   public String getIxmsg() {
/* 65 */     return this.ixmsg;
/*    */   }
/*    */   
/*    */   public void setIxmsg(String ixmsg) {
/* 69 */     this.ixmsg = ixmsg;
/*    */   }
/*    */   public Date getDxctd() {
/* 72 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 76 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 79 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 83 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 86 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 90 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 93 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 97 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxlstxrd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */