/*     */ package com.seeinfobiz.click.entitybean;
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
/*     */ public class LkpSchedularView
/*     */ {
/*     */   private long scdr_id;
/*     */   private String scdr_name;
/*     */   private String scdr_time;
/*     */   private String scdr_status;
/*     */   private String scdr_mode;
/*     */   private String scdr_type;
/*     */   private String scdr_month1;
/*     */   private String scdr_month2;
/*     */   private String scdr_month3;
/*     */   private String scdr_month4;
/*     */   private String scdr_day1;
/*     */   private String scdr_day2;
/*     */   private String scdr_day3;
/*     */   private String scdr_day4;
/*     */   private String scdr_weekday;
/*     */   private String scdr_daily;
/*  31 */   private long scdr_ruleid = 0L;
/*  32 */   private long scdr_prodid = 0L;
/*     */ 
/*     */   
/*     */   private String scdr_prsmode;
/*     */ 
/*     */ 
/*     */   
/*     */   LkpSchedularView() {}
/*     */ 
/*     */   
/*     */   LkpSchedularView(long scdr_id, String scdr_name, String scdr_time, String scdr_status, String scdr_mode, String scdr_type, String scdr_month1, String scdr_month2, String scdr_month3, String scdr_month4, String scdr_day1, String scdr_day2, String scdr_day3, String scdr_day4, String scdr_weekday, String scdr_daily, long scdr_ruleid, long scdr_prodid, String scdr_prsmode) {
/*  43 */     this.scdr_id = scdr_id;
/*  44 */     this.scdr_name = scdr_name;
/*  45 */     this.scdr_time = scdr_time;
/*  46 */     this.scdr_status = scdr_status;
/*  47 */     this.scdr_mode = scdr_mode;
/*  48 */     this.scdr_type = scdr_type;
/*  49 */     this.scdr_month1 = scdr_month1;
/*  50 */     this.scdr_month2 = scdr_month2;
/*  51 */     this.scdr_month3 = scdr_month3;
/*  52 */     this.scdr_month4 = scdr_month4;
/*  53 */     this.scdr_day1 = scdr_day1;
/*  54 */     this.scdr_day2 = scdr_day2;
/*  55 */     this.scdr_day3 = scdr_day3;
/*  56 */     this.scdr_day4 = scdr_day4;
/*  57 */     this.scdr_weekday = scdr_weekday;
/*  58 */     this.scdr_daily = scdr_daily;
/*  59 */     this.scdr_ruleid = scdr_ruleid;
/*  60 */     this.scdr_prodid = scdr_prodid;
/*  61 */     this.scdr_prsmode = scdr_prsmode;
/*     */   }
/*     */   
/*     */   public String getScdr_daily() {
/*  65 */     return this.scdr_daily;
/*     */   }
/*     */   
/*     */   public void setScdr_daily(String scdr_daily) {
/*  69 */     this.scdr_daily = scdr_daily;
/*     */   }
/*     */   
/*     */   public String getScdr_day1() {
/*  73 */     return this.scdr_day1;
/*     */   }
/*     */   
/*     */   public void setScdr_day1(String scdr_day1) {
/*  77 */     this.scdr_day1 = scdr_day1;
/*     */   }
/*     */   
/*     */   public String getScdr_day2() {
/*  81 */     return this.scdr_day2;
/*     */   }
/*     */   
/*     */   public void setScdr_day2(String scdr_day2) {
/*  85 */     this.scdr_day2 = scdr_day2;
/*     */   }
/*     */   
/*     */   public String getScdr_day3() {
/*  89 */     return this.scdr_day3;
/*     */   }
/*     */   
/*     */   public void setScdr_day3(String scdr_day3) {
/*  93 */     this.scdr_day3 = scdr_day3;
/*     */   }
/*     */   
/*     */   public String getScdr_day4() {
/*  97 */     return this.scdr_day4;
/*     */   }
/*     */   
/*     */   public void setScdr_day4(String scdr_day4) {
/* 101 */     this.scdr_day4 = scdr_day4;
/*     */   }
/*     */   
/*     */   public long getScdr_id() {
/* 105 */     return this.scdr_id;
/*     */   }
/*     */   
/*     */   public void setScdr_id(long scdr_id) {
/* 109 */     this.scdr_id = scdr_id;
/*     */   }
/*     */   
/*     */   public String getScdr_mode() {
/* 113 */     return this.scdr_mode;
/*     */   }
/*     */   
/*     */   public void setScdr_mode(String scdr_mode) {
/* 117 */     this.scdr_mode = scdr_mode;
/*     */   }
/*     */   
/*     */   public String getScdr_month1() {
/* 121 */     return this.scdr_month1;
/*     */   }
/*     */   
/*     */   public void setScdr_month1(String scdr_month1) {
/* 125 */     this.scdr_month1 = scdr_month1;
/*     */   }
/*     */   
/*     */   public String getScdr_month2() {
/* 129 */     return this.scdr_month2;
/*     */   }
/*     */   
/*     */   public void setScdr_month2(String scdr_month2) {
/* 133 */     this.scdr_month2 = scdr_month2;
/*     */   }
/*     */   
/*     */   public String getScdr_month3() {
/* 137 */     return this.scdr_month3;
/*     */   }
/*     */   
/*     */   public void setScdr_month3(String scdr_month3) {
/* 141 */     this.scdr_month3 = scdr_month3;
/*     */   }
/*     */   
/*     */   public String getScdr_month4() {
/* 145 */     return this.scdr_month4;
/*     */   }
/*     */   
/*     */   public void setScdr_month4(String scdr_month4) {
/* 149 */     this.scdr_month4 = scdr_month4;
/*     */   }
/*     */   
/*     */   public String getScdr_name() {
/* 153 */     return this.scdr_name;
/*     */   }
/*     */   
/*     */   public void setScdr_name(String scdr_name) {
/* 157 */     this.scdr_name = scdr_name;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getScdr_prsmode() {
/* 163 */     return this.scdr_prsmode;
/*     */   }
/*     */   
/*     */   public void setScdr_prsmode(String scdr_prsmode) {
/* 167 */     this.scdr_prsmode = scdr_prsmode;
/*     */   }
/*     */   
/*     */   public long getScdr_prodid() {
/* 171 */     return this.scdr_prodid;
/*     */   }
/*     */   
/*     */   public void setScdr_prodid(long scdr_prodid) {
/* 175 */     this.scdr_prodid = scdr_prodid;
/*     */   }
/*     */   
/*     */   public long getScdr_ruleid() {
/* 179 */     return this.scdr_ruleid;
/*     */   }
/*     */   
/*     */   public void setScdr_ruleid(long scdr_ruleid) {
/* 183 */     this.scdr_ruleid = scdr_ruleid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getScdr_status() {
/* 188 */     return this.scdr_status;
/*     */   }
/*     */   
/*     */   public void setScdr_status(String scdr_status) {
/* 192 */     this.scdr_status = scdr_status;
/*     */   }
/*     */   
/*     */   public String getScdr_time() {
/* 196 */     return this.scdr_time;
/*     */   }
/*     */   
/*     */   public void setScdr_time(String scdr_time) {
/* 200 */     this.scdr_time = scdr_time;
/*     */   }
/*     */   
/*     */   public String getScdr_type() {
/* 204 */     return this.scdr_type;
/*     */   }
/*     */   
/*     */   public void setScdr_type(String scdr_type) {
/* 208 */     this.scdr_type = scdr_type;
/*     */   }
/*     */   
/*     */   public String getScdr_weekday() {
/* 212 */     return this.scdr_weekday;
/*     */   }
/*     */   
/*     */   public void setScdr_weekday(String scdr_weekday) {
/* 216 */     this.scdr_weekday = scdr_weekday;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\LkpSchedularView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */