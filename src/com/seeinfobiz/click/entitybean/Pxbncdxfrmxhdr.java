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
/*    */ public class Pxbncdxfrmxhdr
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixhdr;
/*    */   private String nmxfrmxhdr;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxbncdxfrmxhdr() {}
/*    */   
/*    */   public Pxbncdxfrmxhdr(Long ixhdr) {
/* 26 */     this.ixhdr = ixhdr;
/*    */   }
/*    */   public Pxbncdxfrmxhdr(Long ixhdr, String nmxfrmxhdr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 29 */     this.ixhdr = ixhdr;
/* 30 */     this.nmxfrmxhdr = nmxfrmxhdr;
/* 31 */     this.dxctd = dxctd;
/* 32 */     this.bxctd = bxctd;
/* 33 */     this.dxmfdxlst = dxmfdxlst;
/* 34 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxhdr() {
/* 38 */     return this.ixhdr;
/*    */   }
/*    */   
/*    */   public void setIxhdr(Long ixhdr) {
/* 42 */     this.ixhdr = ixhdr;
/*    */   }
/*    */   public String getNmxfrmxhdr() {
/* 45 */     return this.nmxfrmxhdr;
/*    */   }
/*    */   
/*    */   public void setNmxfrmxhdr(String nmxfrmxhdr) {
/* 49 */     this.nmxfrmxhdr = nmxfrmxhdr;
/*    */   }
/*    */   public Date getDxctd() {
/* 52 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 56 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 59 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 63 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 66 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 70 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 73 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 77 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxfrmxhdr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */