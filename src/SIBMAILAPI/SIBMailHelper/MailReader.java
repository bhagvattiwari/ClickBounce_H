/*     */ package SIBMAILAPI.SIBMailHelper;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.mail.Address;
/*     */ import javax.mail.BodyPart;
/*     */ import javax.mail.Folder;
/*     */ import javax.mail.Message;
/*     */ import javax.mail.MessagingException;
/*     */ import javax.mail.Multipart;
/*     */ import javax.mail.Store;
/*     */ import javax.mail.internet.MimeMessage;
/*     */ 
/*     */ 
/*     */ public class MailReader
/*     */ {
/*  30 */   static Folder folder = null;
/*     */ 
/*     */   
/*     */   public static Message[] getAllMessages(Store paramStore, String paramString) {
/*  34 */     Message[] arrayOfMessage = null;
/*     */     try {
/*  36 */       folder = paramStore.getFolder(paramString);
/*  37 */       setFolder(folder);
/*  38 */       folder.open(2);
/*  39 */       arrayOfMessage = folder.getMessages();
/*  40 */     } catch (MessagingException messagingException) {
/*  41 */       Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, (String)null, (Throwable)messagingException);
/*     */     } 
/*     */     
/*  44 */     return arrayOfMessage;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Multipart getAllMAtachment(Message paramMessage) throws IOException {
/*  49 */     Multipart multipart = null;
/*     */     try {
/*  51 */       multipart = (Multipart)paramMessage.getContent();
/*  52 */     } catch (MessagingException messagingException) {
/*  53 */       Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, (String)null, (Throwable)messagingException);
/*     */     } 
/*  55 */     return multipart;
/*     */   }
/*     */   
/*     */   public static Address[] getAddress(Message paramMessage) throws IOException, MessagingException {
/*  59 */     return paramMessage.getFrom();
/*     */   }
/*     */ 
/*     */   
/*     */   public static Folder getFolder() {
/*  64 */     return folder;
/*     */   }
/*     */   
/*     */   public static void setFolder(Folder paramFolder) {
/*  68 */     paramFolder = paramFolder;
/*     */   }
/*     */ 
/*     */   
/*     */   public void readDeliveryReportAttachment(Message paramMessage, String paramString1, String paramString2, HashMap paramHashMap, String paramString3, String paramString4, String paramString5) {
/*  73 */     String str1 = "";
/*  74 */     String str2 = "";
/*  75 */     String str3 = null;
/*  76 */     ArrayList<ReadAndDeliveryReceiptInfo> arrayList = new ArrayList();
/*  77 */     String[] arrayOfString = null;
/*  78 */     String str4 = "";
/*  79 */     BufferedReader bufferedReader = null;
/*  80 */     InputStream inputStream = null;
/*  81 */     BodyPart bodyPart = null;
/*  82 */     String str5 = "";
/*     */     try {
/*     */       try {
/*  85 */         str2 = paramMessage.getSubject();
/*  86 */       } catch (Exception exception) {
/*  87 */         System.out.println("Exception in getting subject " + new Date() + " " + exception.getMessage());
/*  88 */         exception.printStackTrace();
/*     */       } 
/*     */       
/*  91 */       System.out.println("date******** " + paramMessage.getSentDate());
/*  92 */       str3 = getStrDate(paramMessage.getSentDate());
/*     */       
/*     */       try {
/*  95 */         for (Address address : paramMessage.getFrom()) {
/*  96 */           str1 = address.toString();
/*     */         }
/*  98 */       } catch (Exception exception) {
/*     */         
/* 100 */         System.out.println("Exception in getting email id " + exception.getMessage());
/*     */       } 
/*     */       
/* 103 */       Pattern pattern = Pattern.compile("[:,;]");
/* 104 */       ReadAndDeliveryReceiptInfo readAndDeliveryReceiptInfo = new ReadAndDeliveryReceiptInfo();
/* 105 */       Multipart multipart = (Multipart)paramMessage.getContent();
/* 106 */       for (byte b = 0; b < multipart.getCount(); b++) {
/* 107 */         bodyPart = multipart.getBodyPart(b);
/* 108 */         inputStream = bodyPart.getInputStream();
/* 109 */         bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
/*     */         
/* 111 */         str5 = readAttachFile(bufferedReader, arrayOfString, pattern, readAndDeliveryReceiptInfo, str1, str2, str5);
/*     */         
/* 113 */         arrayList.add(readAndDeliveryReceiptInfo);
/*     */       } 
/*     */       
/* 116 */       EmailStatus emailStatus = new EmailStatus();
/*     */       
/* 118 */       emailStatus.EmailStatusDetails(arrayList, paramString1, paramString2, paramHashMap, "", paramString4, str5, str3, paramString5);
/* 119 */     } catch (Exception exception) {
/* 120 */       System.out.println("Exception in >> " + new Date() + " " + exception.getMessage());
/* 121 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private String setDeliveryRecptInfo(String paramString, String[] paramArrayOfString, Pattern paramPattern, ReadAndDeliveryReceiptInfo paramReadAndDeliveryReceiptInfo) {
/* 127 */     if (paramString.contains("Subject:")) {
/* 128 */       paramString = paramString.replace("Subject: ", "");
/* 129 */     } else if (!paramString.contains("Date:")) {
/* 130 */       if (paramString.contains("Action:") || paramString.contains("Status:")) {
/* 131 */         paramPattern = Pattern.compile("[:]");
/* 132 */         paramArrayOfString = paramPattern.split(paramString);
/* 133 */         paramString = paramArrayOfString[paramArrayOfString.length - 1];
/*     */       } else {
/* 135 */         paramPattern = Pattern.compile("[:,;]");
/* 136 */         paramArrayOfString = paramPattern.split(paramString);
/* 137 */         paramString = paramArrayOfString[paramArrayOfString.length - 1];
/*     */       } 
/* 139 */     } else if (paramString.contains("Diagnostic-Code:")) {
/* 140 */       paramPattern = Pattern.compile("[:,;<>]");
/* 141 */       paramArrayOfString = paramPattern.split(paramString);
/* 142 */       paramString = paramArrayOfString[paramArrayOfString.length - 1];
/*     */     } else {
/* 144 */       paramString = paramString.replace("Date: ", "");
/*     */     } 
/* 146 */     return paramString;
/*     */   }
/*     */   
/*     */   private String readAttachFile(BufferedReader paramBufferedReader, String[] paramArrayOfString, Pattern paramPattern, ReadAndDeliveryReceiptInfo paramReadAndDeliveryReceiptInfo, String paramString1, String paramString2, String paramString3) throws IOException {
/* 150 */     System.out.println("Email Message Body \n ");
/* 151 */     String str = "";
/*     */     
/* 153 */     while (paramBufferedReader.ready()) {
/*     */ 
/*     */       
/* 156 */       str = paramBufferedReader.readLine();
/* 157 */       if (str.contains("From:")) {
/* 158 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/*     */         
/* 160 */         paramReadAndDeliveryReceiptInfo.setSender(str);
/* 161 */         System.out.println("from email id " + str);
/*     */       } 
/* 163 */       if (str.contains("Date:")) {
/* 164 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/*     */         
/* 166 */         paramReadAndDeliveryReceiptInfo.setDate(str);
/*     */       } 
/* 168 */       if (str.contains("Final-Recipient:")) {
/* 169 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 170 */         paramReadAndDeliveryReceiptInfo.setRecipient(str);
/* 171 */       }  if (str.contains("Action:")) {
/* 172 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 173 */         System.out.println(" Action readline -- " + str);
/* 174 */         paramReadAndDeliveryReceiptInfo.setAction(str);
/* 175 */       }  if (str.contains("Status:")) {
/* 176 */         if (str.contains("X-Spam-Status:"))
/*     */           continue; 
/* 178 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/*     */         
/* 180 */         paramReadAndDeliveryReceiptInfo.setStatus(str);
/*     */       } 
/* 182 */       if (str.contains("Subject:")) {
/* 183 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 184 */         paramReadAndDeliveryReceiptInfo.setSubject(str);
/*     */       } 
/* 186 */       if (str.contains("Diagnostic-Code:")) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 191 */       if (str.contains("rejected:")) {
/* 192 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/*     */         
/* 194 */         paramReadAndDeliveryReceiptInfo.setReason(str);
/* 195 */       }  if (str.contains("UniqueStatementName:")) {
/*     */         
/* 197 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 198 */         paramReadAndDeliveryReceiptInfo.setStatementName(str);
/*     */       } 
/* 200 */       if (str.contains("UniqueProcessType:")) {
/*     */         
/* 202 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 203 */         paramReadAndDeliveryReceiptInfo.setProcesstype(str);
/*     */       } 
/*     */       
/* 206 */       if (str.contains("UniqueProcessID:")) {
/*     */         
/* 208 */         str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 209 */         paramReadAndDeliveryReceiptInfo.setEmailProcessId(str);
/* 210 */       }  if (!str.toLowerCase().contains("return receipt"))
/*     */         continue; 
/* 212 */       str = setDeliveryRecptInfo(str, paramArrayOfString, paramPattern, paramReadAndDeliveryReceiptInfo);
/* 213 */       paramReadAndDeliveryReceiptInfo.setReadBounceFlag("RR");
/* 214 */       paramReadAndDeliveryReceiptInfo.setSender(paramString1);
/* 215 */       paramReadAndDeliveryReceiptInfo.setRecipient(paramString1);
/* 216 */       paramReadAndDeliveryReceiptInfo.setSubject(paramString2);
/* 217 */       paramString3 = "RR";
/*     */     } 
/*     */     
/* 220 */     return paramString3;
/*     */   }
/*     */   
/*     */   public void readMailMessage(Message paramMessage, String paramString1, String paramString2) throws MessagingException, IOException {
/* 224 */     MimeMessage mimeMessage = null;
/* 225 */     ReadAndDeliveryReceiptInfo readAndDeliveryReceiptInfo = new ReadAndDeliveryReceiptInfo();
/* 226 */     ArrayList<ReadAndDeliveryReceiptInfo> arrayList = new ArrayList();
/* 227 */     Pattern pattern = Pattern.compile("[<, ]");
/* 228 */     Address[] arrayOfAddress = paramMessage.getFrom();
/* 229 */     mimeMessage = (MimeMessage)paramMessage;
/* 230 */     String str1 = arrayOfAddress[0].toString().toLowerCase();
/* 231 */     String str2 = paramMessage.getSubject().toLowerCase();
/* 232 */     String str3 = String.valueOf(paramMessage.getSentDate());
/* 233 */     readAndDeliveryReceiptInfo.setSubject(str2.replaceAll(":", ""));
/* 234 */     String[] arrayOfString = pattern.split(str1);
/* 235 */     int i = arrayOfString.length;
/* 236 */     arrayOfString[i - 1] = arrayOfString[i - 1].substring(0, arrayOfString[i - 1].length() - 1);
/* 237 */     System.out.println("Sender is " + arrayOfString[i - 1]);
/* 238 */     readAndDeliveryReceiptInfo.setSender(arrayOfString[i - 1]);
/* 239 */     readAndDeliveryReceiptInfo.setDate(str3);
/* 240 */     arrayList.add(readAndDeliveryReceiptInfo);
/* 241 */     readReceiptemailStatus(arrayList, paramString1, paramString2);
/*     */   }
/*     */ 
/*     */   
/*     */   private void readReceiptemailStatus(List paramList, String paramString1, String paramString2) throws IOException {
/* 246 */     String str1 = "";
/* 247 */     String str2 = "";
/* 248 */     String str3 = "";
/* 249 */     String str4 = "";
/* 250 */     String str5 = "";
/* 251 */     Iterator<ReadAndDeliveryReceiptInfo> iterator = paramList.iterator();
/* 252 */     HashMap<Object, Object> hashMap = null;
/* 253 */     ReadAndDeliveryReceiptInfo readAndDeliveryReceiptInfo = null;
/* 254 */     hashMap = new HashMap<>();
/* 255 */     while (iterator.hasNext()) {
/* 256 */       readAndDeliveryReceiptInfo = iterator.next();
/* 257 */       str2 = readAndDeliveryReceiptInfo.getSubject();
/* 258 */       str1 = readAndDeliveryReceiptInfo.getSender();
/* 259 */       str5 = readAndDeliveryReceiptInfo.getDate();
/*     */     } 
/*     */     
/* 262 */     if (hashMap.containsKey(str2)) {
/* 263 */       ((List<String>)hashMap.get(str2)).add(str1);
/* 264 */       ((List<String>)hashMap.get(str2)).add(str2);
/* 265 */       ((List<String>)hashMap.get(str2)).add(str5);
/*     */     } else {
/* 267 */       ArrayList<String> arrayList = new ArrayList();
/* 268 */       arrayList.add(str1);
/* 269 */       arrayList.add(str2);
/* 270 */       arrayList.add(str5);
/* 271 */       hashMap.put(str2, arrayList);
/*     */     } 
/*     */     
/* 274 */     Set set = hashMap.keySet();
/* 275 */     Iterator<Object> iterator1 = set.iterator();
/* 276 */     while (iterator1.hasNext()) {
/* 277 */       Object object = iterator1.next();
/* 278 */       List<String> list = (List)hashMap.get(object);
/* 279 */       for (byte b = 0; b < list.size(); b++) {
/* 280 */         str3 = str3 + (String)list.get(b) + "|";
/*     */       }
/*     */     } 
/* 283 */     if (!str2.equals("")) {
/* 284 */       String str = paramString1;
/* 285 */       EmailStatus emailStatus = new EmailStatus();
/* 286 */       str2 = emailStatus.filteredSubject(str2);
/* 287 */       str4 = str + paramString2 + ".txt";
/* 288 */       File file = new File(str);
/* 289 */       if (!file.exists()) {
/* 290 */         file.mkdirs();
/*     */       }
/*     */       
/* 293 */       FileWrite fileWrite = new FileWrite();
/*     */       try {
/* 295 */         fileWrite.writeFile(str4, str3);
/* 296 */       } catch (Exception exception) {
/* 297 */         String str6 = str3;
/* 298 */         emailStatus.errorMessageWrite(str4, str6);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void closeConnection() throws MessagingException {
/* 304 */     folder.close(true);
/*     */   }
/*     */   
/*     */   public static String getStrDate(Date paramDate) {
/* 308 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm-a");
/*     */     
/* 310 */     System.out.println("datae  value " + simpleDateFormat.format(paramDate));
/* 311 */     return simpleDateFormat.format(paramDate);
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SIBMAILAPI\SIBMailHelper\MailReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */