/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Cxprprtysxm
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal ixpptxid;
/*    */   private String nmxprmxppty;
/*    */   private String vlxprmxppty;
/*    */   private String pptyxdspxnm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Cxprprtysxm() {}
/*    */   
/*    */   public Cxprprtysxm(BigDecimal ixpptxid) {
/* 28 */     this.ixpptxid = ixpptxid;
/*    */   }
/*    */   public Cxprprtysxm(BigDecimal ixpptxid, String nmxprmxppty, String vlxprmxppty, String pptyxdspxnm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 31 */     this.ixpptxid = ixpptxid;
/* 32 */     this.nmxprmxppty = nmxprmxppty;
/* 33 */     this.vlxprmxppty = vlxprmxppty;
/* 34 */     this.pptyxdspxnm = pptyxdspxnm;
/* 35 */     this.dxctd = dxctd;
/* 36 */     this.bxctd = bxctd;
/* 37 */     this.dxmfdxlst = dxmfdxlst;
/* 38 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public BigDecimal getIxpptxid() {
/* 42 */     return this.ixpptxid;
/*    */   }
/*    */   
/*    */   public void setIxpptxid(BigDecimal ixpptxid) {
/* 46 */     this.ixpptxid = ixpptxid;
/*    */   }
/*    */   public String getNmxprmxppty() {
/* 49 */     return this.nmxprmxppty;
/*    */   }
/*    */   
/*    */   public void setNmxprmxppty(String nmxprmxppty) {
/* 53 */     this.nmxprmxppty = nmxprmxppty;
/*    */   }
/*    */   public String getVlxprmxppty() {
/* 56 */     return this.vlxprmxppty;
/*    */   }
/*    */   
/*    */   public void setVlxprmxppty(String vlxprmxppty) {
/* 60 */     this.vlxprmxppty = vlxprmxppty;
/*    */   }
/*    */   public String getPptyxdspxnm() {
/* 63 */     return this.pptyxdspxnm;
/*    */   }
/*    */   
/*    */   public void setPptyxdspxnm(String pptyxdspxnm) {
/* 67 */     this.pptyxdspxnm = pptyxdspxnm;
/*    */   }
/*    */   public Date getDxctd() {
/* 70 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 74 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 77 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 81 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 84 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 88 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 91 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 95 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxprprtysxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */