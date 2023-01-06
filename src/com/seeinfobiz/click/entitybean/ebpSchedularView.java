/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebpSchedularView
/*     */   implements Serializable
/*     */ {
/*     */   private String ebp_schedular_id;
/*     */   private String product_id;
/*     */   private String product_name;
/*     */   private String processType;
/*     */   private String status;
/*     */   private String processMode;
/*     */   private String process_date;
/*     */   private String process_month;
/*     */   private String sch_time;
/*     */   
/*     */   public ebpSchedularView() {}
/*     */   
/*     */   public ebpSchedularView(String ebp_schedular_id) {
/*  32 */     this.ebp_schedular_id = ebp_schedular_id;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ebpSchedularView(String ebp_schedular_id, String product_id, String product_name, String processType, String status, String processMode, String process_date, String process_month, String sch_time) {
/*  38 */     this.ebp_schedular_id = ebp_schedular_id;
/*  39 */     this.product_id = product_id;
/*  40 */     this.product_name = product_name;
/*  41 */     this.status = status;
/*  42 */     this.processMode = processMode;
/*  43 */     this.process_date = process_date;
/*  44 */     this.process_month = process_month;
/*  45 */     this.sch_time = sch_time;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getebp_schedular_id() {
/*  50 */     return this.ebp_schedular_id;
/*     */   }
/*     */   
/*     */   public void setebp_schedular_id(String ebp_schedular_id) {
/*  54 */     this.ebp_schedular_id = ebp_schedular_id;
/*     */   }
/*     */   
/*     */   public String getProcessMode() {
/*  58 */     return this.processMode;
/*     */   }
/*     */   
/*     */   public void setProcessMode(String processMode) {
/*  62 */     this.processMode = processMode;
/*     */   }
/*     */   
/*     */   public String getProcessType() {
/*  66 */     return this.processType;
/*     */   }
/*     */   
/*     */   public void setProcessType(String processType) {
/*  70 */     this.processType = processType;
/*     */   }
/*     */   
/*     */   public String getProcess_date() {
/*  74 */     return this.process_date;
/*     */   }
/*     */   
/*     */   public void setProcess_date(String process_date) {
/*  78 */     this.process_date = process_date;
/*     */   }
/*     */   
/*     */   public String getProcess_month() {
/*  82 */     return this.process_month;
/*     */   }
/*     */   
/*     */   public void setProcess_month(String process_month) {
/*  86 */     this.process_month = process_month;
/*     */   }
/*     */   
/*     */   public String getProduct_id() {
/*  90 */     return this.product_id;
/*     */   }
/*     */   
/*     */   public void setProduct_id(String product_id) {
/*  94 */     this.product_id = product_id;
/*     */   }
/*     */   
/*     */   public String getProduct_name() {
/*  98 */     return this.product_name;
/*     */   }
/*     */   
/*     */   public void setProduct_name(String product_name) {
/* 102 */     this.product_name = product_name;
/*     */   }
/*     */   
/*     */   public String getStatus() {
/* 106 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(String status) {
/* 110 */     this.status = status;
/*     */   }
/*     */   
/*     */   public String getSch_time() {
/* 114 */     return this.sch_time;
/*     */   }
/*     */   
/*     */   public void setSch_time(String sch_time) {
/* 118 */     this.sch_time = sch_time;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\ebpSchedularView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */