/*     */ package SIBMAILAPI.SIBMailHelper;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Dxprdtnxdtlsxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxtra;
/*     */ import com.seeinfobiz.click.entitybean.Pxrdxrcpt;
/*     */ import com.seeinfobiz.click.impl.BounceTrapReptReSendDAOImpl;
/*     */ import com.seeinfobiz.click.util.DateUtil;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import java.util.regex.Pattern;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EmailStatus
/*     */ {
/*  48 */   private BounceTrapReptReSendDAOImpl bnTrapDAO = new BounceTrapReptReSendDAOImpl();
/*  49 */   String sender = "";
/*  50 */   String recipient = "";
/*  51 */   String action = "";
/*  52 */   String date = "";
/*  53 */   String readDateTime = "";
/*  54 */   String status = "";
/*  55 */   String subject = "1";
/*  56 */   String finalRecord = "";
/*  57 */   String targetDirectory = "";
/*  58 */   String cardNumber = "";
/*  59 */   String filePath = "";
/*  60 */   String reason = "";
/*  61 */   String statementName = "";
/*  62 */   int reasonId = 0;
/*  63 */   String procesID = "";
/*  64 */   String prdctID = "";
/*  65 */   String bounceCatg = "";
/*  66 */   String processType = "";
/*  67 */   ReadAndDeliveryReceiptInfo requiredInfo = new ReadAndDeliveryReceiptInfo();
/*     */ 
/*     */   
/*     */   public boolean EmailStatusDetails(List paramList, String paramString1, String paramString2, HashMap paramHashMap, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
/*  71 */     boolean bool = false;
/*     */     try {
/*  73 */       this.prdctID = paramString4;
/*  74 */       bool = prepareMapList(paramList, paramString1, paramString2, paramHashMap, paramString5, paramString6, paramString7);
/*  75 */     } catch (Exception exception) {
/*  76 */       Logger.getLogger(EmailStatus.class.getName()).log(Level.SEVERE, (String)null, exception);
/*     */     } 
/*  78 */     return bool;
/*     */   }
/*     */   
/*     */   private boolean prepareMapList(List paramList, String paramString1, String paramString2, HashMap paramHashMap, String paramString3, String paramString4, String paramString5) throws IOException {
/*  82 */     System.out.println("*************************************" + paramString3 + "************************************************");
/*  83 */     boolean bool = false;
/*     */     try {
/*  85 */       Iterator<ReadAndDeliveryReceiptInfo> iterator = paramList.iterator();
/*  86 */       List list = null;
/*  87 */       Dxprdtnxdtlsxm dxprdtnxdtlsxm = null;
/*  88 */       String str1 = null;
/*  89 */       String str2 = null;
/*  90 */       ReadAndDeliveryReceiptInfo readAndDeliveryReceiptInfo = null;
/*     */       
/*  92 */       HashMap<Object, Object> hashMap = new HashMap<>();
/*  93 */       while (iterator.hasNext()) {
/*     */         try {
/*  95 */           String str = "";
/*  96 */           readAndDeliveryReceiptInfo = iterator.next();
/*     */           
/*  98 */           if (readAndDeliveryReceiptInfo.getRecipient() != null) {
/*  99 */             bool = true;
/*     */ 
/*     */             
/* 102 */             if (paramString3.equalsIgnoreCase("RR")) {
/* 103 */               System.out.println("Reading read report....................................................................");
/* 104 */               this.recipient = ((readAndDeliveryReceiptInfo.getRecipient() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getRecipient().equals("")) ? readAndDeliveryReceiptInfo.getRecipient().trim() : readAndDeliveryReceiptInfo.getRecipient();
/* 105 */               this.subject = ((readAndDeliveryReceiptInfo.getSubject() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getSubject().equals("")) ? readAndDeliveryReceiptInfo.getSubject().trim() : readAndDeliveryReceiptInfo.getSubject();
/* 106 */               this.status = "Email is Read";
/* 107 */               this.readDateTime = paramString4;
/*     */               break;
/*     */             } 
/*     */             try {
/* 111 */               System.out.println("Reading bounce report....................................................................");
/* 112 */               this.recipient = ((readAndDeliveryReceiptInfo.getRecipient() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getRecipient().equals("")) ? readAndDeliveryReceiptInfo.getRecipient().trim() : readAndDeliveryReceiptInfo.getRecipient();
/* 113 */               this.date = ((readAndDeliveryReceiptInfo.getDate() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getDate().equals("")) ? readAndDeliveryReceiptInfo.getDate().trim() : readAndDeliveryReceiptInfo.getDate();
/* 114 */               this.status = ((readAndDeliveryReceiptInfo.getStatus() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getStatus().equals("")) ? readAndDeliveryReceiptInfo.getStatus().trim() : readAndDeliveryReceiptInfo.getStatus();
/* 115 */               this.subject = ((readAndDeliveryReceiptInfo.getSubject() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getSubject().equals("")) ? readAndDeliveryReceiptInfo.getSubject().trim() : readAndDeliveryReceiptInfo.getSubject();
/* 116 */               str = this.status.replace(".", "");
/* 117 */               this.reasonId = Integer.parseInt(str.substring(1, 3));
/* 118 */               this.statementName = ((readAndDeliveryReceiptInfo.getStatementName() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getStatementName().equals("")) ? readAndDeliveryReceiptInfo.getStatementName().trim() : readAndDeliveryReceiptInfo.getStatementName();
/* 119 */               this.cardNumber = this.statementName;
/* 120 */               this.procesID = ((readAndDeliveryReceiptInfo.getEmailProcessId() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getEmailProcessId().equals("")) ? readAndDeliveryReceiptInfo.getEmailProcessId().trim() : readAndDeliveryReceiptInfo.getEmailProcessId();
/* 121 */               if (readAndDeliveryReceiptInfo.getProcesstype() == null) {
/* 122 */                 this.processType = "N";
/* 123 */               } else if (readAndDeliveryReceiptInfo.getProcesstype().equals("")) {
/* 124 */                 this.processType = "N";
/*     */               } else {
/* 126 */                 this.processType = readAndDeliveryReceiptInfo.getProcesstype().trim();
/*     */               } 
/*     */               
/* 129 */               this.action = ((readAndDeliveryReceiptInfo.getAction() == null) ? ("" != null) : !readAndDeliveryReceiptInfo.getAction().equals("")) ? readAndDeliveryReceiptInfo.getAction().trim() : readAndDeliveryReceiptInfo.getAction();
/*     */             }
/* 131 */             catch (Exception exception) {
/* 132 */               exception.printStackTrace();
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 137 */           if (str.contains("200") || str.contains("500") || str.contains("400") || str.contains("501")) {
/* 138 */             this.reason = str.contains("400") ? "Temporary local problem - please try later" : ((str.contains("500") || str.contains("501")) ? "Mailbox unavailable or access denied" : "N/A");
/* 139 */             this.bounceCatg = str.contains("400") ? "S" : ((str.contains("500") || str.contains("501")) ? "H" : "N/A");
/* 140 */             this.reasonId = 999;
/*     */           } else {
/*     */             
/* 143 */             switch (this.reasonId) {
/*     */               case 999:
/*     */                 break;
/*     */               
/*     */               case 10:
/* 148 */                 this.reason = "Other address status";
/* 149 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 11:
/* 153 */                 this.reason = "Bad destination mailbox address";
/* 154 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 12:
/* 158 */                 this.reason = "Bad destination system address";
/* 159 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 13:
/* 163 */                 this.reason = "Bad destination mailbox address syntax";
/* 164 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 14:
/* 168 */                 this.reason = "Destination mailbox address ambiguous";
/* 169 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 15:
/* 173 */                 this.reason = "Destination mailbox address not valid";
/* 174 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 16:
/* 178 */                 this.reason = "Mailbox has moved";
/* 179 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 17:
/* 183 */                 this.reason = "Bad sender's mailbox address syntax";
/* 184 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 18:
/* 188 */                 this.reason = "Bad sender's system address";
/* 189 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 20:
/* 193 */                 this.reason = "Other or undefined mailbox status";
/* 194 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 21:
/* 198 */                 this.reason = "Mailbox disabled, not accepting messages";
/* 199 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 22:
/* 203 */                 this.reason = "Mailbox full";
/* 204 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 23:
/* 208 */                 this.reason = "Message length exceeds administrative limit";
/* 209 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 24:
/* 213 */                 this.reason = "Mailing list expansion problem";
/* 214 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 30:
/* 218 */                 this.reason = "Other or undefined mail system status or identified HIGH risk in service";
/* 219 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 31:
/* 223 */                 this.reason = "Mail system full";
/* 224 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 32:
/* 228 */                 this.reason = "System not accepting network messages";
/* 229 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 33:
/* 233 */                 this.reason = "System not capable of selected features";
/* 234 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 34:
/* 238 */                 this.reason = "Message too big for system";
/* 239 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 40:
/* 243 */                 this.reason = "Other or undefined network or routing status";
/* 244 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 41:
/* 248 */                 this.reason = "No answer from host";
/* 249 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 42:
/* 253 */                 this.reason = "Bad connection";
/* 254 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 43:
/* 258 */                 this.reason = "Routing server failure";
/* 259 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 44:
/* 263 */                 this.reason = "Unable to route or no mail hosts for domain";
/* 264 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 45:
/* 268 */                 this.reason = "Network congestion";
/* 269 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 46:
/* 273 */                 this.reason = "Routing loop detected";
/* 274 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 47:
/* 278 */                 this.reason = "Delivery time expired";
/* 279 */                 this.bounceCatg = "S";
/*     */                 break;
/*     */               
/*     */               case 50:
/* 283 */                 this.reason = "Other or undefined protocol status or no such recipient";
/* 284 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 51:
/* 288 */                 this.reason = "Invalid command";
/* 289 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 52:
/* 293 */                 this.reason = "Syntax error";
/* 294 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 53:
/* 298 */                 this.reason = "Too many recipients";
/* 299 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 54:
/* 303 */                 this.reason = "Invalid command arguments";
/* 304 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 55:
/* 308 */                 this.reason = "Wrong protocol version";
/* 309 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 60:
/* 313 */                 this.reason = "Other or undefined media error";
/* 314 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 61:
/* 318 */                 this.reason = "Media not supported";
/* 319 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 62:
/* 323 */                 this.reason = "Conversion required and prohibited";
/* 324 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 63:
/* 328 */                 this.reason = "Conversion required but not supported";
/* 329 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 64:
/* 333 */                 this.reason = "Conversion with loss performed";
/* 334 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 65:
/* 338 */                 this.reason = "Conversion failed";
/* 339 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 70:
/* 343 */                 this.reason = "Other or undefined security status";
/* 344 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 71:
/* 348 */                 this.reason = "Delivery not authorized, message refused";
/* 349 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 72:
/* 353 */                 this.reason = "Mailing list expansion prohibited";
/* 354 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 73:
/* 358 */                 this.reason = "security conversion required but not possible";
/* 359 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 74:
/* 363 */                 this.reason = "Security features not supported";
/* 364 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 75:
/* 368 */                 this.reason = "Cryptographic failure";
/* 369 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 76:
/* 373 */                 this.reason = "Cryptographic algorithm not supported";
/* 374 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               case 77:
/* 378 */                 this.reason = "Message integrity failure";
/* 379 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */               
/*     */               default:
/* 383 */                 this.reason = "New code found; adding in library " + str;
/* 384 */                 this.bounceCatg = "H";
/*     */                 break;
/*     */             } 
/*     */           
/*     */           } 
/* 389 */           this.reasonId = 0;
/*     */         }
/* 391 */         catch (Exception exception) {
/* 392 */           exception.printStackTrace();
/*     */         } 
/*     */       } 
/* 395 */       if (bool)
/*     */       {
/* 397 */         if (!this.procesID.equals(""))
/*     */         {
/* 399 */           if (hashMap.containsKey(this.subject)) {
/* 400 */             if (this.cardNumber != null && !this.cardNumber.equals("")) {
/* 401 */               ((List<String>)hashMap.get(this.subject)).add(this.cardNumber);
/*     */             }
/* 403 */             ((List<String>)hashMap.get(this.subject)).add(this.recipient);
/* 404 */             if (this.action.equalsIgnoreCase("relayed")) {
/* 405 */               this.action = "Delivered";
/* 406 */             } else if (this.action.equalsIgnoreCase("expanded")) {
/* 407 */               this.action = "Delivered";
/* 408 */             } else if (this.action.equalsIgnoreCase("failed")) {
/* 409 */               this.action = "Failed";
/*     */             } 
/*     */             
/* 412 */             ((List<String>)hashMap.get(this.subject)).add(this.action);
/* 413 */             ((List<String>)hashMap.get(this.subject)).add(this.date);
/* 414 */             ((List<String>)hashMap.get(this.subject)).add(this.reason);
/* 415 */             ((List<String>)hashMap.get(this.subject)).add(this.procesID);
/* 416 */             ((List<String>)hashMap.get(this.subject)).add(this.subject);
/*     */           
/*     */           }
/*     */           else {
/*     */             
/* 421 */             ArrayList<String> arrayList = new ArrayList();
/* 422 */             if (this.cardNumber != null && !this.cardNumber.equals("")) {
/* 423 */               arrayList.add(this.cardNumber);
/*     */             } else {
/* 425 */               arrayList.add("XXXXXXXXXXXXXXXXXXX");
/*     */             } 
/* 427 */             arrayList.add(this.recipient);
/* 428 */             if (this.action.equalsIgnoreCase("relayed")) {
/* 429 */               this.action = "Delivered";
/* 430 */             } else if (this.action.equalsIgnoreCase("expanded")) {
/* 431 */               this.action = "Delivered";
/* 432 */             } else if (this.action.equalsIgnoreCase("failed")) {
/* 433 */               this.action = "Failed";
/*     */             } 
/* 435 */             arrayList.add(this.action);
/* 436 */             arrayList.add(this.date);
/* 437 */             arrayList.add(this.reason);
/* 438 */             arrayList.add(this.procesID);
/* 439 */             arrayList.add(this.subject);
/* 440 */             hashMap.put(this.subject, arrayList);
/*     */           } 
/* 442 */           System.out.println("Process is >> " + this.procesID);
/*     */ 
/*     */           
/* 445 */           System.out.println("processType==>" + this.processType);
/* 446 */           this.finalRecord = finalStrToWrite(hashMap);
/* 447 */           if (this.processType.equals("RM")) {
/* 448 */             storeInDatabase(this.finalRecord, this.processType);
/*     */           } else {
/* 450 */             list = this.bnTrapDAO.getEmailRecords(Long.parseLong(this.procesID), this.cardNumber, paramString5);
/* 451 */             System.out.println("totRecList==> " + list);
/* 452 */             for (Object dxprdtnxdtlsxm1 : list) {
/*     */               try {
/* 454 */                 dxprdtnxdtlsxm = (Dxprdtnxdtlsxm) dxprdtnxdtlsxm1;
/* 455 */                 this.cardNumber = dxprdtnxdtlsxm.getCrn();
/* 456 */                 str1 = this.bnTrapDAO.getName(Long.parseLong(this.procesID), this.cardNumber, paramString5);
/* 457 */                 str2 = this.bnTrapDAO.getRegioncode(Long.parseLong(this.procesID), Long.parseLong(str1.split("ixcst")[1]), paramString5);
/* 458 */                 str1 = str1.split("ixcst")[0];
/* 459 */                 this.statementName = dxprdtnxdtlsxm.getACNTXTYP() + "|:|" + dxprdtnxdtlsxm.getIxem() + "|:|" + dxprdtnxdtlsxm.getDxprcs() + "|:|" + dxprdtnxdtlsxm.getCxfile() + "|:|" + dxprdtnxdtlsxm.getNoxacnt() + "|:|" + dxprdtnxdtlsxm.getFlxchnlxdlvy() + "|:|" + str1 + "|:|" + str2 + "|:|";
/* 460 */               } catch (Exception exception) {
/* 461 */                 exception.printStackTrace();
/* 462 */                 System.out.println("Exception in putting value on map " + exception.getMessage());
/*     */               } finally {
/* 464 */                 str2 = null;
/* 465 */                 str1 = null;
/*     */               } 
/*     */             } 
/*     */             
/* 469 */             this.finalRecord += this.statementName;
/* 470 */             System.out.println("Final record 1=====" + this.finalRecord);
/* 471 */             if (!this.subject.equals("") && !this.finalRecord.contains("XXXXXXXXXXXXXXXXXXX")) {
/* 472 */               storeInDatabase(this.finalRecord, "N");
/*     */             } else {
/* 474 */               System.out.println("Subject is blank or card no is not exist");
/*     */             
/*     */             }
/*     */           
/*     */           }
/*     */         
/*     */         }
/*     */         else
/*     */         {
/* 483 */           fileWrite(this.filePath, "There is no attachment here");
/* 484 */           bool = false;
/*     */         }
/*     */       
/*     */       }
/* 488 */     } catch (Exception exception) {
/* 489 */       exception.printStackTrace();
/*     */     } 
/* 491 */     return bool;
/*     */   }
/*     */   
/*     */   private void fileWrite(String paramString1, String paramString2) throws IOException {
/* 495 */     FileWrite fileWrite = new FileWrite();
/*     */     try {
/* 497 */       fileWrite.writeFile(paramString1, paramString2);
/*     */     }
/* 499 */     catch (IOException iOException) {
/* 500 */       String str = paramString2;
/* 501 */       errorMessageWrite(paramString1, str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void errorMessageWrite(String paramString1, String paramString2) throws IOException {
/* 506 */     String str = paramString1.substring(0, paramString1.lastIndexOf("/") + 1);
/* 507 */     paramString1 = str + "Error.txt";
/* 508 */     FileWrite fileWrite = new FileWrite();
/* 509 */     fileWrite.writeFile(paramString1, paramString2);
/*     */   }
/*     */   
/*     */   private String finalStrToWrite(Map paramMap) {
/* 513 */     Set set = paramMap.keySet();
/* 514 */     for (Object object : set) {
/* 515 */       List<String> list = (List)paramMap.get(object);
/* 516 */       for (byte b = 0; b < list.size(); b++) {
/* 517 */         this.finalRecord += (String)list.get(b) + "|:|";
/*     */       }
/*     */     } 
/* 520 */     return this.finalRecord;
/*     */   }
/*     */   
/*     */   public String filteredSubject(String paramString) {
/* 524 */     Pattern pattern = Pattern.compile("[:,;,\\,?,/,*,<,>,|]");
/* 525 */     String[] arrayOfString = pattern.split(paramString);
/* 526 */     String str = "";
/* 527 */     for (byte b = 0; b < arrayOfString.length; b++) {
/* 528 */       str = str + arrayOfString[b];
/*     */     }
/* 530 */     return paramString = str;
/*     */   }
/*     */   
/*     */   public void storeInDatabase(String paramString1, String paramString2) {
/* 534 */     System.out.println("Updating the table of bounce receipt..................");
/*     */     try {
/* 536 */       String str = paramString1.replace("|:|", "#");
/* 537 */       Pxbncdxtra pxbncdxtra = new Pxbncdxtra();
/* 538 */       if (!paramString1.equals("")) {
/*     */         
/* 540 */         String[] arrayOfString = str.split("#");
/* 541 */         if (!arrayOfString[0].equalsIgnoreCase("XXXXXXXXXXXXXXXXXXX"))
/*     */         {
/* 543 */           if (paramString2.equalsIgnoreCase("RM")) {
/* 544 */             this.bnTrapDAO.updateReSentDtls(arrayOfString, this.bounceCatg);
/*     */           } else {
/*     */             try {
/* 547 */               pxbncdxtra.setCatxbou(this.bounceCatg);
/* 548 */               pxbncdxtra.setCrn((arrayOfString[0] != null) ? arrayOfString[0].trim() : arrayOfString[0]);
/* 549 */               pxbncdxtra.setDtxst(new Date());
/* 550 */               pxbncdxtra.setDxctd(new Date());
/* 551 */               pxbncdxtra.setDxmfdxlst(new Date());
/* 552 */               pxbncdxtra.setAcntxtyp(arrayOfString[7]);
/* 553 */               pxbncdxtra.setIxem(arrayOfString[8]);
/* 554 */               pxbncdxtra.setCxfile(arrayOfString[10]);
/* 555 */               pxbncdxtra.setNoxacnt(arrayOfString[11]);
/* 556 */               pxbncdxtra.setFlxdelevry(arrayOfString[12]);
/* 557 */               pxbncdxtra.setLogo(arrayOfString[7]);
/* 558 */               pxbncdxtra.setNmxfst(arrayOfString[13]);
/* 559 */               pxbncdxtra.setCdexreg(arrayOfString[14]);
/* 560 */               pxbncdxtra.setIxemxbncd((arrayOfString[1] != null) ? arrayOfString[1].trim() : arrayOfString[1]);
/* 561 */               pxbncdxtra.setSttsxbncd((arrayOfString[2] != null) ? arrayOfString[2].trim() : arrayOfString[2]);
/* 562 */               pxbncdxtra.setDtxarrvl((arrayOfString[3] != null) ? arrayOfString[3].trim() : arrayOfString[3]);
/* 563 */               pxbncdxtra.setRexo((arrayOfString[4] != null) ? arrayOfString[4].trim() : arrayOfString[4]);
/* 564 */               pxbncdxtra.setIxprcs((arrayOfString[5] != null) ? new Long(arrayOfString[5].trim()) : new Long(arrayOfString[5]));
/* 565 */               String str1 = arrayOfString[9];
/* 566 */               pxbncdxtra.setDtxprcs((str1 != null) ? DateUtil.getDate(str1, "yyyy-MM-dd") : null);
/* 567 */               this.bnTrapDAO.add(pxbncdxtra, this.prdctID);
/* 568 */             } catch (Exception exception) {
/* 569 */               exception.printStackTrace();
/*     */             }
/*     */           
/*     */           } 
/*     */         }
/*     */       } 
/* 575 */     } catch (Exception exception) {
/* 576 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void storeInReadReciptTable(String paramString) {
/* 581 */     System.out.println("Updating the table of read receipt..................");
/*     */     try {
/* 583 */       String str = paramString.replace("|:|", "#");
/* 584 */       Pxrdxrcpt pxrdxrcpt = new Pxrdxrcpt();
/* 585 */       System.out.println("step 1");
/* 586 */       if (!paramString.equals("")) {
/* 587 */         System.out.println("step 2");
/* 588 */         String[] arrayOfString = str.split("#");
/* 589 */         System.out.println("step 3");
/* 590 */         if (arrayOfString[0].equalsIgnoreCase("XXXXXXXXXXXXXXXXXXX")) {
/* 591 */           System.out.println("step 4");
/* 592 */           pxrdxrcpt.setIxem((arrayOfString[1] != null) ? arrayOfString[1].trim() : arrayOfString[1]);
/* 593 */           pxrdxrcpt.setExrdxdt((arrayOfString[1] != null) ? arrayOfString[3].trim() : arrayOfString[3]);
/* 594 */           System.out.println("step 5");
/* 595 */           System.out.println(" values " + arrayOfString[1]);
/* 596 */           System.out.println(" values " + arrayOfString[3]);
/* 597 */           this.bnTrapDAO.add(pxrdxrcpt, this.prdctID);
/*     */         }
/*     */       
/*     */       } 
/* 601 */     } catch (Exception exception) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SIBMAILAPI\SIBMailHelper\EmailStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */