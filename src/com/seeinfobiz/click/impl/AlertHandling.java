/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.Ostermiller.util.ExcelCSVPrinter;
/*     */ import com.seeinfobiz.click.util.PropertiesFileRead;
/*     */ import com.sun.mail.smtp.SMTPMessage;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.math.BigDecimal;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;
/*     */ import javax.activation.DataHandler;
/*     */ import javax.activation.FileDataSource;
/*     */ import javax.mail.Address;
/*     */ import javax.mail.Authenticator;
/*     */ import javax.mail.BodyPart;
/*     */ import javax.mail.Message;
/*     */ import javax.mail.MessagingException;
/*     */ import javax.mail.Multipart;
/*     */ import javax.mail.PasswordAuthentication;
/*     */ import javax.mail.Session;
/*     */ import javax.mail.Transport;
/*     */ import javax.mail.internet.InternetAddress;
/*     */ import javax.mail.internet.MimeBodyPart;
/*     */ import javax.mail.internet.MimeMultipart;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AlertHandling
/*     */ {
/*  44 */   ResultSet rs1 = null; ResultSet rs2 = null; ResultSet rs3 = null; ResultSet rs4 = null; ResultSet rs5 = null;
/*  45 */   AlertHandlingExtension alertHandlingExtension = new AlertHandlingExtension();
/*  46 */   DataBaseConnection dataBaseConnection = new DataBaseConnection();
/*     */   Connection con;
/*  48 */   Statement stmt1 = null; Statement stmt2 = null; Statement stmt3 = null; Statement stmt4 = null; Statement stmt5 = null;
/*     */   long processId;
/*  50 */   PropertiesFileRead propFileRead = null;
/*  51 */   Properties prop = null;
/*     */   
/*     */   public AlertHandling() throws Exception {
/*  54 */     this.propFileRead = new PropertiesFileRead();
/*  55 */     this.prop = this.propFileRead.readPropertyFile();
/*  56 */     this.con = this.dataBaseConnection.getjdbcConnection(this.prop);
/*  57 */     this.stmt1 = this.con.createStatement();
/*  58 */     this.stmt2 = this.con.createStatement();
/*  59 */     this.stmt3 = this.con.createStatement();
/*  60 */     this.stmt4 = this.con.createStatement();
/*  61 */     this.stmt5 = this.con.createStatement();
/*     */   }
/*     */   
/*     */   private class PasswordAuth extends Authenticator { private PasswordAuth() {}
/*     */     
/*     */     public PasswordAuthentication getPasswordAuthentication() {
/*  67 */       PropertiesFileRead propRead = new PropertiesFileRead();
/*  68 */       Properties prop = propRead.readPropertyFile();
/*     */       
/*  70 */       return new PasswordAuthentication(prop.getProperty("USERNAME"), prop.getProperty("PASSWORDPM"));
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void alertEventsHandeler(long processID, String alertType) throws SQLException {
/*  79 */     String serverPort = "";
/*  80 */     String serverPass = "";
/*  81 */     String server_name = "";
/*  82 */     String smtp_username = "";
/*  83 */     String smtp_password = "";
/*  84 */     String smtp_host = "";
/*  85 */     this.processId = processID;
/*     */     
/*  87 */     long smtp_port = 0L;
/*     */     
/*  89 */     this.rs1 = this.alertHandlingExtension.getAlertEvents(this.con, this.stmt1);
/*  90 */     while (this.rs1.next()) {
/*  91 */       String alertCriteria = this.rs1.getString(3);
/*  92 */       this.rs2 = this.alertHandlingExtension.getAlrtEvntDtlsList(this.con, this.stmt2);
/*  93 */       String emlSubj = "";
/*  94 */       String emailAttachment = "";
/*  95 */       String emailBody = "";
/*  96 */       while (this.rs2.next()) {
/*  97 */         String alrtType = this.rs2.getString(3);
/*     */ 
/*     */         
/* 100 */         if (alrtType.equalsIgnoreCase("Email") == true) {
/*     */           
/* 102 */           long emlServerId = Long.parseLong(this.rs2.getString(4));
/*     */           
/* 104 */           emlSubj = this.rs2.getString(8);
/* 105 */           emailAttachment = this.rs2.getString(9);
/* 106 */           emailBody = this.rs2.getString(10);
/*     */ 
/*     */ 
/*     */           
/* 110 */           this.rs3 = this.alertHandlingExtension.getEmailConfig(this.con, this.stmt3, Long.valueOf(emlServerId));
/*     */           
/* 112 */           while (this.rs3.next()) {
/* 113 */             server_name = this.rs3.getString(3);
/* 114 */             smtp_username = this.rs3.getString(5);
/* 115 */             smtp_password = this.rs3.getString(6);
/* 116 */             smtp_host = this.rs3.getString(4);
/* 117 */             smtp_port = this.rs3.getLong(7);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 122 */         if (alertType.equals("StatementGeneration")) {
/* 123 */           if (alertCriteria.equalsIgnoreCase("Statement_Generation") == true && alrtType.equalsIgnoreCase("Email") == true) {
/* 124 */             sendAlertEventEmail(emlSubj, emailBody, BigDecimal.ZERO, emailBody, emailBody, emailBody, null, "SG", "emailBody");
/*     */           }
/*     */           
/* 127 */           if (alertCriteria.equalsIgnoreCase("Statement_Generation") == true && alrtType.equalsIgnoreCase("SMS") == true)
/* 128 */             sendAlertEventSMS("SG");  continue;
/*     */         } 
/* 130 */         if (alertType.equals("BounceEmail"))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 137 */           if (alertCriteria.equalsIgnoreCase("On_Bounce_Email") == true && alrtType.equalsIgnoreCase("SMS") == true) {
/* 138 */             sendAlertEventSMS("BE");
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     this.rs1.close();
/* 145 */     this.rs2.close();
/* 146 */     this.rs3.close();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendAlertEventSMS(String sgbeFlag) throws SQLException {
/* 155 */     PropertiesFileRead propFlRead = new PropertiesFileRead();
/* 156 */     Properties prop = propFlRead.readPropertyFile();
/* 157 */     String CRN = "";
/* 158 */     String sgen = prop.getProperty("ALERT_ON_SMS");
/* 159 */     String sbounce = prop.getProperty("ALERT_ON_EMAIL_BOUNCE");
/* 160 */     File f = null;
/* 161 */     File f1 = null;
/* 162 */     FileOutputStream outputStream = null;
/*     */     try {
/* 164 */       if (sgbeFlag.equals("SG")) {
/* 165 */         f = new File(sgen);
/* 166 */         if (!f.exists()) {
/* 167 */           f.mkdirs();
/*     */         }
/* 169 */         f = new File(sgen + prop.getProperty("ALERT_ON_SMS_FILE"));
/* 170 */         f.createNewFile();
/*     */       } 
/*     */       
/* 173 */       if (sgbeFlag.equals("BE")) {
/* 174 */         f = new File(sbounce);
/* 175 */         if (!f.exists()) {
/* 176 */           f.mkdirs();
/*     */         }
/* 178 */         f = new File(sbounce + prop.getProperty("ALERT_ON_EMAIL_BOUNCE_FILE"));
/* 179 */         f.createNewFile();
/*     */       } 
/*     */       
/* 182 */       outputStream = new FileOutputStream(f);
/* 183 */     } catch (FileNotFoundException fe) {
/* 184 */       fe.printStackTrace();
/* 185 */     } catch (IOException fe) {
/* 186 */       fe.printStackTrace();
/*     */     } 
/* 188 */     this.rs4 = this.alertHandlingExtension.getAlrtEmailList(sgbeFlag, this.stmt4, this.processId);
/* 189 */     while (this.rs4.next()) {
/* 190 */       if (sgbeFlag.equals("SG")) {
/* 191 */         CRN = this.rs4.getString(2);
/*     */       }
/* 193 */       if (sgbeFlag.equals("BE")) {
/* 194 */         CRN = this.rs4.getString(3);
/*     */       }
/* 196 */       this.rs5 = this.alertHandlingExtension.getCustomerByCRN(CRN, this.stmt5);
/* 197 */       while (this.rs5.next()) {
/* 198 */         String emailId = this.rs5.getString(11);
/* 199 */         String mobileNum = this.rs5.getString(15);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 205 */         ExcelCSVPrinter ecsvp = new ExcelCSVPrinter(outputStream);
/* 206 */         ecsvp.changeDelimiter('|');
/* 207 */         String[] BSEarray = new String[20];
/* 208 */         BSEarray[0] = CRN;
/* 209 */         BSEarray[1] = mobileNum;
/* 210 */         BSEarray[2] = emailId;
/*     */         
/* 212 */         if (sgbeFlag.equals("SG")) {
/* 213 */           BSEarray[3] = prop.getProperty("SG_SMS_MESSAGAE");
/*     */         }
/* 215 */         if (sgbeFlag.equals("BE")) {
/* 216 */           BSEarray[3] = prop.getProperty("BE_SMS_MESSAGAE");
/*     */         }
/*     */         try {
/* 219 */           ecsvp.writeln(new String[] { BSEarray[0], BSEarray[1], BSEarray[2], BSEarray[3] });
/* 220 */         } catch (Exception e) {
/* 221 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*     */     try {
/* 227 */       this.rs4.close();
/* 228 */       this.rs5.close();
/* 229 */     } catch (Exception e) {
/* 230 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendAlertEventEmail(String emailSubject, String emaiBody, BigDecimal emailFlagAttachment, String qualCriteria, String queryParam, String inpFilePath, Date sentDate, String sgbeFlag, String emlFileLoc) throws SQLException {
/* 241 */     String processID = "1";
/*     */     
/* 243 */     String emailId = "";
/* 244 */     String altEmailId = "";
/*     */     
/* 246 */     String stmtNm = "";
/* 247 */     String stmtLoc = "";
/*     */     
/* 249 */     long tempEmailRuleId = 0L;
/* 250 */     int sentCount = 1;
/* 251 */     int missedCount = 1;
/* 252 */     String serverTyp = "";
/* 253 */     String hostStr = "";
/* 254 */     String usrNm = "";
/* 255 */     String userPass = "";
/* 256 */     String serverPort = "";
/* 257 */     String serverPass = "";
/* 258 */     String server_name = "";
/* 259 */     String smtp_username = "";
/* 260 */     String smtp_password = "";
/* 261 */     String smtp_host = "";
/* 262 */     long smtp_port = 0L;
/* 263 */     PropertiesFileRead propFlRead = new PropertiesFileRead();
/* 264 */     Properties prop = propFlRead.readPropertyFile();
/*     */     
/* 266 */     String logPath = prop.getProperty("ALERT_ON_EMAIL");
/* 267 */     File logFilepath = new File(logPath);
/* 268 */     if (!logFilepath.exists()) {
/* 269 */       logFilepath.mkdirs();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     String CRN = "";
/* 278 */     this.rs4 = this.alertHandlingExtension.getAlrtEmailList(sgbeFlag, this.stmt4, this.processId);
/* 279 */     while (this.rs4.next()) {
/* 280 */       if (sgbeFlag.equals("SG")) {
/* 281 */         CRN = this.rs4.getString(2);
/*     */       }
/* 283 */       if (sgbeFlag.equals("BE")) {
/* 284 */         CRN = this.rs4.getString(3);
/*     */       }
/* 286 */       this.rs5 = this.alertHandlingExtension.getCustomerByCRN(CRN, this.stmt5);
/*     */       try {
/* 288 */         while (this.rs5.next()) {
/* 289 */           emailId = this.rs5.getString(11);
/*     */         }
/* 291 */         Session session = null;
/*     */ 
/*     */         
/* 294 */         server_name = prop.getProperty("SERVER_NAME");
/* 295 */         smtp_username = prop.getProperty("USERNAME");
/* 296 */         smtp_password = prop.getProperty("PASSWORDPM");
/* 297 */         smtp_host = prop.getProperty("SERVER_HOST");
/* 298 */         smtp_port = Long.parseLong(prop.getProperty("SERVER_PORT"));
/*     */ 
/*     */         
/* 301 */         Properties mailProperty = new Properties();
/* 302 */         String isAuthenticate = prop.getProperty("ISAUTHENTICATEREQUIRED");
/*     */ 
/*     */         
/* 305 */         if (isAuthenticate.equalsIgnoreCase("Yes")) {
/* 306 */           mailProperty.setProperty("mail.smtp.host", smtp_host);
/* 307 */           mailProperty.put("mail.smtp.auth", "true");
/* 308 */           Authenticator auth = new PasswordAuth();
/* 309 */           session = Session.getInstance(mailProperty, auth);
/* 310 */           session.setDebug(false);
/*     */         } else {
/* 312 */           mailProperty.setProperty("mail.transport.protocol", server_name);
/* 313 */           mailProperty.setProperty("mail.smtp.host", smtp_host);
/* 314 */           mailProperty.setProperty("mail.smtp.port", String.valueOf(smtp_port));
/* 315 */           mailProperty.setProperty("mail.smtp.starttls.enable", "true");
/* 316 */           session = Session.getInstance(mailProperty);
/*     */         } 
/*     */         
/* 319 */         SMTPMessage msg = new SMTPMessage(session);
/*     */         
/* 321 */         if (!emailId.trim().equalsIgnoreCase("") || emailId.trim() != null || !emailId.trim().equalsIgnoreCase(null)) {
/* 322 */           msg.setSubject(emailSubject);
/* 323 */           msg.setFrom((Address)new InternetAddress(prop.getProperty("ALERT_FROM_EMLID")));
/* 324 */           msg.setRecipients(Message.RecipientType.TO, (Address[])InternetAddress.parse(emailId, false));
/*     */ 
/*     */           
/* 327 */           if (altEmailId == null || !altEmailId.trim().equalsIgnoreCase("")) {
/* 328 */             altEmailId = "";
/*     */           } else {
/* 330 */             msg.setRecipients(Message.RecipientType.CC, (Address[])InternetAddress.parse(altEmailId, false));
/*     */           } 
/* 332 */           String emlBody = "";
/* 333 */           if (sgbeFlag.equals("SG")) {
/* 334 */             emlBody = emaiBody;
/*     */           }
/* 336 */           if (sgbeFlag.equals("BE")) {
/* 337 */             emlBody = prop.getProperty("ALERT_EMLBDY");
/*     */           }
/*     */ 
/*     */           
/* 341 */           msg.setEnvelopeFrom(prop.getProperty("ALERT_BOUNCE_EMLID"));
/* 342 */           MimeBodyPart mbp1 = new MimeBodyPart();
/* 343 */           MimeBodyPart mbp2 = new MimeBodyPart();
/* 344 */           MimeBodyPart mbp3 = new MimeBodyPart();
/* 345 */           String emlBodySrc = "S";
/*     */ 
/*     */           
/* 348 */           if (emlBodySrc.equalsIgnoreCase("S")) {
/* 349 */             mbp1.setContent(emlBody, "text/html; charset=utf-8");
/*     */           }
/* 351 */           else if (emlBodySrc.equalsIgnoreCase("F")) {
/*     */             
/* 353 */             StringBuffer message = new StringBuffer();
/* 354 */             BufferedReader br = new BufferedReader(new FileReader(emlBody));
/* 355 */             String line = br.readLine();
/*     */ 
/*     */             
/* 358 */             while (line != null) {
/* 359 */               line = br.readLine();
/* 360 */               message.append(line);
/*     */             } 
/*     */             
/* 363 */             emlBody = message.toString();
/* 364 */             mbp1.setContent(emlBody, "text/html; charset=utf-8");
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 369 */           MimeMultipart mimeMultipart = new MimeMultipart();
/* 370 */           mimeMultipart.addBodyPart((BodyPart)mbp1);
/*     */           
/* 372 */           if (Integer.parseInt(emailFlagAttachment.toPlainString()) == 1) {
/*     */             
/* 374 */             FileDataSource fds3 = new FileDataSource(emlFileLoc);
/* 375 */             mbp3.setDataHandler(new DataHandler(fds3));
/* 376 */             mbp3.setFileName("Test");
/* 377 */             mimeMultipart.addBodyPart((BodyPart)mbp3);
/*     */           } 
/*     */ 
/*     */           
/* 381 */           msg.setContent((Multipart)mimeMultipart);
/*     */ 
/*     */           
/*     */           try {
/* 385 */             Transport.send((Message)msg);
/*     */           
/*     */           }
/* 388 */           catch (MessagingException e) {
/*     */             
/* 390 */             if (!altEmailId.trim().equalsIgnoreCase("") || altEmailId.trim() != null || !altEmailId.trim().equalsIgnoreCase(null));
/*     */             
/* 392 */             if (e.toString().contains("AddressException") || e.toString().contains("Invalid Addresses") || e.toString().contains("Connection reset by peer: socket write error"));
/*     */           }
/*     */         
/*     */         }
/*     */       
/* 397 */       } catch (Exception ex) {
/* 398 */         ex.printStackTrace();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 403 */     this.rs4.close();
/* 404 */     this.rs5.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\AlertHandling.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */