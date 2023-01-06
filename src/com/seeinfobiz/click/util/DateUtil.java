/*     */ package com.seeinfobiz.click.util;
/*     */ 
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ public class DateUtil
/*     */ {
/*     */   public static Date getSysDate() {
/*  23 */     Date date = new Date();
/*  24 */     return date;
/*     */   }
/*     */   
/*     */   public static Date getDate(String strDate) {
/*  28 */     Date date = new Date();
/*  29 */     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
/*     */     try {
/*  31 */       date = format.parse(strDate);
/*  32 */     } catch (ParseException ex) {}
/*     */ 
/*     */ 
/*     */     
/*  36 */     return date;
/*     */   }
/*     */   public static Date getDate(String strDate, String dtformat) {
/*  39 */     Date date = new Date();
/*  40 */     SimpleDateFormat format = new SimpleDateFormat(dtformat);
/*     */     try {
/*  42 */       date = format.parse(strDate);
/*  43 */     } catch (ParseException ex) {
/*  44 */       ex.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/*  48 */     return date;
/*     */   }
/*     */   public static Date getRollBackDate(String strDate) {
/*  51 */     Date date = new Date();
/*  52 */     SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
/*     */     try {
/*  54 */       date = format.parse(strDate);
/*  55 */     } catch (ParseException ex) {}
/*     */ 
/*     */ 
/*     */     
/*  59 */     return date;
/*     */   }
/*     */   
/*     */   public static Date getDateDDMMMYYYY(String strDate) {
/*  63 */     Date date = new Date();
/*  64 */     SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
/*     */     try {
/*  66 */       date = format.parse(strDate);
/*  67 */     } catch (ParseException ex) {}
/*     */ 
/*     */ 
/*     */     
/*  71 */     return date;
/*     */   }
/*     */   
/*     */   public static String getStrDate(Date date) {
/*  75 */     String dateString = "";
/*     */     
/*  77 */     SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
/*  78 */     dateString = dFormat.format(date);
/*     */     
/*  80 */     return dateString;
/*     */   }
/*     */   
/*     */   public static String getStrDate(Date date, String format) {
/*  84 */     String dateString = "";
/*  85 */     SimpleDateFormat dFormat = new SimpleDateFormat(format);
/*  86 */     dateString = dFormat.format(new Date());
/*  87 */     return dateString;
/*     */   }
/*     */   public static void main(String[] a) {
/*  90 */     String dateString = "";
/*  91 */     SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm-a");
/*  92 */     dateString = dFormat.format(new Date());
/*  93 */     System.out.println(dateString);
/*     */   }
/*     */   public static String getStrDateProc(Date date) {
/*  96 */     String dateString = "";
/*     */     
/*  98 */     SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
/*  99 */     dateString = dFormat.format(date);
/*     */     
/* 101 */     return dateString;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getStringDate(Date date) {
/* 106 */     String dateString = "";
/*     */     
/* 108 */     SimpleDateFormat dFormat = new SimpleDateFormat("ddMMyyyy");
/* 109 */     dateString = dFormat.format(date);
/*     */     
/* 111 */     return dateString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getNoOfDays(Date sysdate, Date passwordExpiryDt) {
/* 121 */     Calendar cal1 = Calendar.getInstance();
/* 122 */     Calendar cal2 = Calendar.getInstance();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     cal1.setTime(sysdate);
/*     */     
/* 134 */     cal2.setTime(passwordExpiryDt);
/*     */     
/* 136 */     long milis1 = cal1.getTimeInMillis();
/* 137 */     long milis2 = cal2.getTimeInMillis();
/*     */ 
/*     */     
/* 140 */     long diff = milis2 - milis1;
/*     */ 
/*     */     
/* 143 */     long diffSeconds = diff / 1000L;
/*     */ 
/*     */     
/* 146 */     long diffMinutes = diff / 60000L;
/*     */ 
/*     */     
/* 149 */     long diffHours = diff / 3600000L;
/*     */ 
/*     */     
/* 152 */     long diffDays = diff / 86400000L;
/*     */ 
/*     */ 
/*     */     
/* 156 */     return diffDays;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getNoOfDiffDays(Date sydaDate1, Date passwordExpiryDt) {
/* 166 */     Calendar cal1 = Calendar.getInstance();
/* 167 */     Calendar cal2 = Calendar.getInstance();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     cal1.setTime(sydaDate1);
/*     */     
/* 179 */     cal2.setTime(passwordExpiryDt);
/*     */     
/* 181 */     long milis1 = cal1.getTimeInMillis();
/* 182 */     long milis2 = cal2.getTimeInMillis();
/*     */ 
/*     */     
/* 185 */     long diff = milis2 - milis1;
/*     */ 
/*     */     
/* 188 */     long diffSeconds = diff / 1000L;
/*     */ 
/*     */     
/* 191 */     long diffMinutes = diff / 60000L;
/*     */ 
/*     */     
/* 194 */     long diffHours = diff / 3600000L;
/*     */ 
/*     */     
/* 197 */     long diffDays = diff / 86400000L;
/*     */ 
/*     */ 
/*     */     
/* 201 */     return diffDays;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getTimeDiff(String logInTm, String logOutTm) {
/* 207 */     Date d1 = getDate(logInTm);
/* 208 */     Date d2 = getDate(logOutTm);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     Calendar cal1 = Calendar.getInstance();
/* 228 */     Calendar cal2 = Calendar.getInstance();
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
/* 240 */     cal1.set(d1.getYear(), d1.getMonth(), d1.getDate());
/*     */     
/* 242 */     cal2.set(d2.getYear(), d2.getMonth(), d2.getDate());
/*     */ 
/*     */     
/* 245 */     long milis1 = cal1.getTimeInMillis();
/* 246 */     long milis2 = cal2.getTimeInMillis();
/*     */ 
/*     */     
/* 249 */     long diff = milis2 - milis2;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     long diffSeconds = diff / 1000L;
/*     */ 
/*     */     
/* 257 */     long diffMinutes = diff / 60000L;
/*     */ 
/*     */     
/* 260 */     long diffHours = diff / 3600000L;
/*     */ 
/*     */     
/* 263 */     long diffDays = diff / 86400000L;
/*     */ 
/*     */ 
/*     */     
/* 267 */     return diffMinutes;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String dateConversion(String date) {
/* 272 */     String dateForm = "";
/* 273 */     String[] temp = date.split("[-]");
/* 274 */     String mmonth = mon(temp[0].trim());
/* 275 */     if (mmonth.length() != 3) {
/* 276 */       mmonth = mon(temp[1].trim());
/*     */     }
/* 278 */     String curmonth = "";
/*     */     
/* 280 */     if (mmonth.equalsIgnoreCase("JAN")) {
/* 281 */       curmonth = "01";
/*     */     }
/* 283 */     else if (mmonth.equalsIgnoreCase("FEB")) {
/* 284 */       curmonth = "02";
/*     */     }
/* 286 */     else if (mmonth.equalsIgnoreCase("MAR")) {
/*     */       
/* 288 */       curmonth = "03";
/* 289 */     } else if (mmonth.equalsIgnoreCase("APR")) {
/* 290 */       curmonth = "04";
/*     */     }
/* 292 */     else if (mmonth.equalsIgnoreCase("MAY")) {
/* 293 */       curmonth = "05";
/*     */     }
/* 295 */     else if (mmonth.equalsIgnoreCase("JUN")) {
/* 296 */       curmonth = "06";
/*     */     }
/* 298 */     else if (mmonth.equalsIgnoreCase("JUL")) {
/* 299 */       curmonth = "07";
/*     */     }
/* 301 */     else if (mmonth.equalsIgnoreCase("AUG")) {
/* 302 */       curmonth = "08";
/*     */     }
/* 304 */     else if (mmonth.equalsIgnoreCase("SEP")) {
/* 305 */       curmonth = "09";
/*     */     }
/* 307 */     else if (mmonth.equalsIgnoreCase("OCT")) {
/* 308 */       curmonth = "10";
/*     */     }
/* 310 */     else if (mmonth.equalsIgnoreCase("NOV")) {
/* 311 */       curmonth = "11";
/*     */     }
/* 313 */     else if (mmonth.equalsIgnoreCase("DEC")) {
/* 314 */       curmonth = "12";
/*     */     } 
/*     */ 
/*     */     
/* 318 */     return curmonth;
/*     */   }
/*     */   
/*     */   public static String getCurrentDate(String date) {
/* 322 */     String day = date.substring(8, 10);
/* 323 */     String month = date.substring(4, 7);
/* 324 */     String year = date.substring(23, 27);
/* 325 */     String time = date.substring(14, 23);
/*     */ 
/*     */ 
/*     */     
/* 329 */     date = day + "-" + month + "-" + year;
/* 330 */     return date;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Date getAddedDate(Date createdDate, String days) {
/* 335 */     SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
/* 336 */     String newDate = getStrDate(createdDate);
/*     */     
/* 338 */     Calendar cal1 = Calendar.getInstance();
/*     */     
/* 340 */     cal1.setTime(createdDate);
/*     */     
/* 342 */     cal1.add(5, Integer.parseInt(days));
/*     */ 
/*     */     
/* 345 */     String dateFormat = dateformat.format(cal1.getTime());
/* 346 */     Date d1 = getDate(dateFormat);
/*     */     
/* 348 */     return d1;
/*     */   }
/*     */   
/*     */   public static String getFormattedStrDate(Date date) {
/* 352 */     String dateString = "";
/*     */     
/* 354 */     SimpleDateFormat dFormat = new SimpleDateFormat("dd-MMM-yyyy");
/* 355 */     dateString = dFormat.format(date);
/*     */     
/* 357 */     return dateString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String mon(String mmonth) {
/* 363 */     String curmonth = "";
/* 364 */     if (mmonth.equalsIgnoreCase("JAN")) {
/* 365 */       curmonth = "01";
/*     */     }
/* 367 */     else if (mmonth.equalsIgnoreCase("FEB")) {
/* 368 */       curmonth = "02";
/*     */     }
/* 370 */     else if (mmonth.equalsIgnoreCase("MAR")) {
/*     */       
/* 372 */       curmonth = "03";
/* 373 */     } else if (mmonth.equalsIgnoreCase("APR")) {
/* 374 */       curmonth = "04";
/*     */     }
/* 376 */     else if (mmonth.equalsIgnoreCase("MAY")) {
/* 377 */       curmonth = "05";
/*     */     }
/* 379 */     else if (mmonth.equalsIgnoreCase("JUN")) {
/* 380 */       curmonth = "06";
/*     */     }
/* 382 */     else if (mmonth.equalsIgnoreCase("JUL")) {
/* 383 */       curmonth = "07";
/*     */     }
/* 385 */     else if (mmonth.equalsIgnoreCase("AUG")) {
/* 386 */       curmonth = "08";
/*     */     }
/* 388 */     else if (mmonth.equalsIgnoreCase("SEP")) {
/* 389 */       curmonth = "09";
/*     */     }
/* 391 */     else if (mmonth.equalsIgnoreCase("OCT")) {
/* 392 */       curmonth = "10";
/*     */     }
/* 394 */     else if (mmonth.equalsIgnoreCase("NOV")) {
/* 395 */       curmonth = "11";
/*     */     }
/* 397 */     else if (mmonth.equalsIgnoreCase("DEC")) {
/* 398 */       curmonth = "12";
/*     */     } 
/*     */ 
/*     */     
/* 402 */     return curmonth;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getDDMMYYY(String datetime) {
/* 408 */     String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
/* 409 */     String year = "";
/* 410 */     if (datetime.indexOf("IST") > 0) {
/* 411 */       year = datetime.substring(24);
/*     */     } else {
/* 413 */       year = datetime.substring(30);
/*     */     } 
/* 415 */     String month = datetime.substring(4, 7);
/* 416 */     String day = datetime.substring(8, 10);
/* 417 */     String time = datetime.substring(11, 19);
/*     */     
/* 419 */     int c = 0;
/* 420 */     String monNo = "";
/* 421 */     for (String mon : months) {
/* 422 */       c++;
/* 423 */       if (mon.equalsIgnoreCase(month)) {
/* 424 */         if (c > 9) {
/* 425 */           monNo = "" + c;
/*     */         } else {
/* 427 */           monNo = "0" + c;
/*     */         } 
/*     */       }
/*     */     } 
/* 431 */     String ddmmyyyy = day + "-" + monNo + "-" + year + " " + time;
/* 432 */     return ddmmyyyy;
/*     */   }
/*     */   
/*     */   public String CompareFromToDate(Date dateFrom, Date dateTo, Date now) {
/* 436 */     String retStr = "ok";
/* 437 */     if (dateFrom.after(dateTo)) {
/* 438 */       retStr = "Start Date cannot be greater than End Date";
/*     */     }
/* 440 */     if (dateFrom.after(now)) {
/* 441 */       retStr = "Selected date cannot be greater than current date";
/*     */     }
/* 443 */     return retStr;
/*     */   }
/*     */   
/*     */   public String CompareDate(Date date1, Date date2) {
/* 447 */     String retStr = "ok";
/* 448 */     if (date1.after(date2)) {
/* 449 */       retStr = "Selected date cannot be greater than current date";
/*     */     }
/* 451 */     return retStr;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\DateUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */