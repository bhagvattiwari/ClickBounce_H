/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import SIBMAILAPI.SIBMailHelper.Main;
/*     */ import com.seeinfobiz.click.entitybean.Dxcstmrxdtls;
/*     */ import com.seeinfobiz.click.entitybean.Dxcstmrxm;
/*     */ import com.seeinfobiz.click.entitybean.Dxprdtnxdtlsxm;
/*     */ import com.seeinfobiz.click.entitybean.Pcxprmxprdtx;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxerlbxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxfrmxhdr;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxlstxrd;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxmlxcng;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxsbjct;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxtra;
/*     */ import com.seeinfobiz.click.entitybean.Pxemlxcng;
/*     */ import com.seeinfobiz.click.entitybean.Pxemxsrvxcnfg;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxprmxemlxm;
/*     */ import com.seeinfobiz.click.util.PropertiesFileRead;
/*     */ import com.sun.mail.smtp.SMTPMessage;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import java.util.Set;
/*     */ import java.util.Vector;
/*     */ import javax.activation.DataHandler;
/*     */ import javax.activation.FileDataSource;
/*     */ import javax.mail.Address;
/*     */ import javax.mail.BodyPart;
/*     */ import javax.mail.Flags;
/*     */ import javax.mail.Folder;
/*     */ import javax.mail.Message;
/*     */ import javax.mail.MessagingException;
/*     */ import javax.mail.Multipart;
/*     */ import javax.mail.Session;
/*     */ import javax.mail.Store;
/*     */ import javax.mail.Transport;
/*     */ import javax.mail.internet.InternetAddress;
/*     */ import javax.mail.internet.MimeBodyPart;
/*     */ import javax.mail.internet.MimeMessage;
/*     */ import javax.mail.internet.MimeMultipart;
/*     */ 
/*     */ public class BounceTrapReptReSndManager
/*     */ {
/*  53 */   private BounceTrapReptReSendDAOImpl bnTrapDAO = new BounceTrapReptReSendDAOImpl();
/*     */ 
/*     */   
/*     */   public BounceTrapReptReSendDAOImpl getBnTrapDAO() {
/*  57 */     return this.bnTrapDAO;
/*     */   }
/*  59 */   String frmAddr = "";
/*  60 */   String emailSub = "";
/*  61 */   String bounceEmailId = "";
/*  62 */   String emlBodySrc = "";
/*  63 */   String emlBody = "";
/*     */   long emlAttachFlag;
/*  65 */   String emlAttachFileName = "";
/*  66 */   String emlAttachFileLoc = "";
/*  67 */   List noMailIDList = null;
/*     */ 
/*     */   
///*     */   public void getScheduledPromotionalData(Pxprmxemlxm obj, String val) throws MessagingException, Exception {
///*  71 */     String bounceMailId = obj.getIxbncdxem();
///*  72 */     String hostStr = "";
///*  73 */     String serverPort = "";
///*  74 */     String userPass = "";
///*  75 */     long bounceId = 0L;
///*     */ 
///*     */     
///*  78 */     List<Object> prdList = this.bnTrapDAO.getProduct(obj.getIxprm().longValue(), "PromotionalEmail");
///*  79 */     if (prdList.size() > 0) {
///*  80 */       Pcxprmxprdtx cxprmObj = (Pcxprmxprdtx)prdList.get(0);
///*     */     
///*     */     }
///*     */     else {
///*     */       
///*  85 */       getBouncePromoProdcutDetails(hostStr, serverPort, userPass, obj, bounceMailId, val);
///*     */     } 
///*     */   }
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
/*     */   public String getScheduledBounceData(Long id, Long procesId, String val, String billCycleDate, String archflag) throws MessagingException, Exception {
/* 111 */     String result = scheduleBounceTrap(String.valueOf(id), null, val, procesId, billCycleDate, archflag);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
///*     */   
///*     */   public void getBouncePromoProdcutDetails(String hostStr, String serverPort, String userPass, Pxprmxemlxm obj, String bounceMailId, String val) throws Exception {
///* 130 */     List<Object> bounceObjList = this.bnTrapDAO.getBounceEmailConfiguration(bounceMailId);
///* 131 */     Pxbncdxmlxcng bnObject = null;
///* 132 */     for (Object bnObj : bounceObjList) {
///* 133 */       bnObject = (Pxbncdxmlxcng)bnObj;
///*     */       
///* 135 */       hostStr = bnObject.getHstxrcvrxbncd();
///* 136 */       serverPort = String.valueOf(bnObject.getPrtxrcvrxbncd());
///* 137 */       userPass = bnObject.getPsdxbncd();
///*     */     } 
///*     */     
///* 140 */     List selectedCRNList = null;
///* 141 */     Map<Object, Object> custEmailDtls = new HashMap<Object, Object>();
///* 142 */     Dxcstmrxm csutMstObj = new Dxcstmrxm();
///*     */     
///* 144 */     if (obj.getFeildxx2().equalsIgnoreCase("ADHOCMail")) {
///* 145 */       if (obj.getQlfrxcrt().equalsIgnoreCase("SE")) {
///* 146 */         selectedCRNList = getCRNListInFile(obj.getPtxfilxin());
///*     */         
///* 148 */         readInbox(bounceMailId, hostStr, serverPort, userPass, "", custEmailDtls, "", null, null, null, obj.getBxctd(), 0L, bnObject.getIxcfgxmlxbncd().longValue(), val, obj, selectedCRNList, "");
///*     */       }
///*     */     
///*     */     }
///*     */     else {
///*     */       
///* 154 */       List<Object> objLst = this.bnTrapDAO.display(csutMstObj);
///* 155 */       String emlId = "";
///* 156 */       for (Object obj1 : objLst) {
///* 157 */         Dxcstmrxm custObj = (Dxcstmrxm)obj1;
///* 158 */         Set<Dxcstmrxdtls> custDtls = custObj.getDxcstmrxdtlses();
///* 159 */         Iterator<Dxcstmrxdtls> itr = custDtls.iterator();
///* 160 */         if (itr.hasNext()) {
///* 161 */           emlId = ((Dxcstmrxdtls)itr.next()).getIxem();
///*     */         }
///*     */         
///* 164 */         custEmailDtls.put(custObj.getCrn(), emlId);
///*     */       } 
///*     */       
///* 167 */       readInbox(bounceMailId, hostStr, serverPort, userPass, "", custEmailDtls, "", null, null, null, obj.getBxctd(), 0L, bnObject.getIxcfgxmlxbncd().longValue(), val, obj, selectedCRNList, "");
///*     */     } 
///*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBnTrapDAO(BounceTrapReptReSendDAOImpl bnTrapDAO) {
/* 177 */     this.bnTrapDAO = bnTrapDAO;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<Object> getlist(Pxprdctxm prdObj) {
/* 182 */     List<Object> objList = this.bnTrapDAO.display(prdObj);
/* 183 */     return objList;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> showData(String productId, Date billCycleDate, String createdBy, String bnCategory, boolean isDelBounce) throws MessagingException, Exception {
/* 189 */     String bnEmailId = "";
/* 190 */     String serverTyp = "";
/* 191 */     String hostStr = "";
/* 192 */     String usrNm = "";
/* 193 */     String userPass = "";
/* 194 */     String serverPort = "";
/* 195 */     String custAccNo = "";
/* 196 */     String custEmailId = "";
/* 197 */     String reSentFlag = "";
/* 198 */     Date bnStmtDate = null;
/* 199 */     Date bnEmailDate = null;
/* 200 */     Date processDt = null;
/* 201 */     long bounceMServerId = 0L;
/*     */     
/* 203 */     long processId = 0L;
/* 204 */     Map<Object, Object> custEmailDtls = new HashMap<Object, Object>();
/*     */     
/* 206 */     Pxbncdxtra bnTrapObj = new Pxbncdxtra();
/* 207 */     List<Object> bnTrapObjLst = null;
/*     */     
/* 209 */     bnTrapObjLst = this.bnTrapDAO.display(bnTrapObj, billCycleDate, productId, bnCategory);
/*     */ 
/*     */     
/* 212 */     if (bnTrapObjLst.size() > 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     if (isDelBounce) {
/* 219 */       delInbox(bnEmailId, hostStr, serverPort, userPass);
/*     */     }
/* 221 */     return bnTrapObjLst;
/*     */   }
/*     */ 
/*     */   
/*     */   public String scheduleBounceTrap(String productId, Date billCycleDate, String val, Long processId, String billDate, String archflag) {
/* 226 */     Pxbncdxtra bnTrapObj = new Pxbncdxtra();
/* 227 */     List<Object> bnTrapObjLst = null;
/*     */     
/* 229 */     String bnEmailId = "";
/* 230 */     String serverTyp = "";
/* 231 */     String createdBy = "Rajesh";
/* 232 */     String hostStr = "";
/* 233 */     String usrNm = "";
/* 234 */     String userPass = "";
/* 235 */     String serverPort = "";
/* 236 */     String custAccNo = "";
/* 237 */     String custEmailId = "";
/* 238 */     String reSentFlag = "";
/* 239 */     Date bnStmtDate = null;
/* 240 */     Date bnEmailDate = null;
/* 241 */     Date processDt = null;
/* 242 */     long bounceMServerId = 0L;
/*     */ 
/*     */     
/* 245 */     String crnNo = "";
/* 246 */     Map<Object, Object> custEmailDtls = new HashMap<Object, Object>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 252 */     List<Object> prdEmlList = this.bnTrapDAO.display(productId);
/*     */     
/* 254 */     for (int i = 0; i < prdEmlList.size(); i++) {
/* 255 */       Pxprdctxm prdMstObj = (Pxprdctxm)prdEmlList.get(i);
/* 256 */       Pxbncdxmlxcng emlConfigObj = prdMstObj.getPxbncdxmlxcng();
/* 257 */       bounceMServerId = emlConfigObj.getIxcfgxmlxbncd().longValue();
/* 258 */       bnEmailId = emlConfigObj.getIxmlxsndrxbncd();
/* 259 */       hostStr = emlConfigObj.getHstxrcvrxbncd();
/* 260 */       serverPort = String.valueOf(emlConfigObj.getPrtxrcvrxbncd());
/* 261 */       userPass = emlConfigObj.getPsdxbncd();
/*     */     } 
/*     */ 
/*     */     
/* 265 */     System.out.println("prdEmlList==>" + prdEmlList);
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
/* 286 */     String[] args = new String[7];
/* 287 */     args[0] = productId;
/* 288 */     args[1] = String.valueOf(processId);
/* 289 */     args[2] = hostStr;
/* 290 */     args[3] = serverPort;
/* 291 */     args[4] = bnEmailId;
/* 292 */     args[5] = userPass;
/* 293 */     args[6] = archflag;
/* 294 */     String result = "";
/*     */     try {
/* 296 */       Main m = new Main();
/* 297 */       result = m.mainMethod(args);
/*     */ 
/*     */     
/*     */     }
/* 301 */     catch (Exception ex) {
/* 302 */       System.out.println("Exception in scheduleBounceTrap " + ex.getMessage());
/* 303 */       ex.printStackTrace();
/*     */     } 
/*     */     
/* 306 */     return result;
/*     */   }
/*     */   
/*     */   public List<Object> showData(Pxbncdxtra bnObj) {
/* 310 */     List<Object> bnTrapObjLst = null;
/*     */     
/* 312 */     bnTrapObjLst = this.bnTrapDAO.display(bnObj);
/* 313 */     return bnTrapObjLst;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
///*     */   
///*     */   private void readInbox(String bnEmailId, String hostStr, String serverPort, String userPass, String prdiD, Map custEmailDtls, String reSentFlag, Date stmtDt, Date prcessDt, Date bnEmlDt, String createdBy, long processId, long bounceServerId, String val, Pxprmxemlxm prmObj, List selectedList, String crnNo) {
///* 322 */     String receivehost = "";
///* 323 */     String trackerid = bnEmailId.trim();
///* 324 */     String password = "";
///* 325 */     String lastMsgId = "";
///* 326 */     String msgid = "";
///* 327 */     String bounce_id = "";
///* 328 */     String finalmsg = "";
///* 329 */     boolean inboxErr = false;
///*     */     
///* 331 */     int isdelete = 11;
///* 332 */     int totalmsg = 0;
///* 333 */     int mailconfigid = 0;
///* 334 */     boolean iscurrent = false;
///* 335 */     Date lastBounceDate = new Date();
///* 336 */     Date bounce_date = new Date();
///* 337 */     Date max_date = new Date();
///*     */     
///* 339 */     Vector mailconfig = new Vector();
///* 340 */     Vector finalrec = new Vector();
///* 341 */     Pxbncdxfrmxhdr bnHeaderObj = new Pxbncdxfrmxhdr();
///* 342 */     Vector dbfrmHeaders = new Vector(this.bnTrapDAO.display(bnHeaderObj));
///*     */     
///* 344 */     Pxbncdxsbjct bnSubObj = new Pxbncdxsbjct();
///* 345 */     Vector dbSublines = new Vector(this.bnTrapDAO.display(bnSubObj));
///*     */ 
///*     */     
///* 348 */     Pxbncdxerlbxm errorLibObj = new Pxbncdxerlbxm();
///* 349 */     Vector errlib = new Vector(this.bnTrapDAO.display(errorLibObj));
///*     */ 
///*     */     
///* 352 */     dbfrmHeaders.removeElement(dbfrmHeaders.lastElement());
///* 353 */     dbSublines.removeElement(dbSublines.lastElement());
///*     */     
///* 355 */     Pxbncdxlstxrd bnLstReadObj = new Pxbncdxlstxrd();
///*     */     
///* 357 */     BounceMailReadClass bounceMailRead = new BounceMailReadClass();
///*     */     
///* 359 */     Vector lastRead = new Vector(this.bnTrapDAO.display(bnLstReadObj, bounceServerId));
///*     */ 
///*     */ 
///*     */     
///*     */     try {
///* 364 */       Properties props = new Properties();
///* 365 */       props.put("mail.pop3.host", hostStr);
///* 366 */       props.put("mail.user", trackerid);
///* 367 */       props.setProperty("mail.passwd", userPass);
///* 368 */       Session session = Session.getInstance(props, null);
///*     */ 
///*     */       
///* 371 */       Store store = BounceMailReadClass.getSMTPConnection(props, session);
///*     */       
///* 373 */       inboxErr = false;
///* 374 */       Folder folder = null;
///* 375 */       Message[] msg = null;
///* 376 */       MimeMessage mimeMsg = null;
///* 377 */       if (store != null) {
///*     */         
///* 379 */         msg = BounceMailReadClass.getMailMessages(store, folder, msg);
///*     */         
///* 381 */         if (msg.length > 0) {
///*     */           
///* 383 */           finalrec = bounceMailRead.readAllMessages(msg, mimeMsg, dbfrmHeaders, dbSublines, errlib, bounce_date, msgid, lastBounceDate, iscurrent, max_date, bounce_id, finalmsg, trackerid, mailconfigid, finalrec);
///*     */           
///* 385 */           boolean isAddDetails = false;
///*     */ 
///*     */           
///* 388 */           bounceMailRead.updateBounceDB(finalrec, val, prmObj, selectedList, custEmailDtls, createdBy, processId, stmtDt, prcessDt, prdiD, crnNo);
///*     */ 
///*     */           
///* 391 */           isAddDetails = false;
///* 392 */           SimpleDateFormat sdf2 = null;
///*     */           
///* 394 */           if (finalrec.size() > 0);
///*     */         } 
///*     */       } 
///*     */ 
///*     */ 
///*     */       
///* 400 */       store.close();
///*     */     }
///* 402 */     catch (Exception e) {
///* 403 */       e.printStackTrace();
///* 404 */       inboxErr = true;
///*     */     } 
///*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList getCRNListInFile(String path) throws Exception {
/* 416 */     String getdata = "";
/*     */     
/* 418 */     ArrayList<String> getcrnList = new ArrayList();
/* 419 */     String readLine = "";
/*     */     
/*     */     try {
/* 422 */       BufferedReader buffRead = new BufferedReader(new FileReader(path));
/* 423 */       while ((readLine = buffRead.readLine()) != null) {
/* 424 */         String[] value = readLine.split(",");
/* 425 */         for (int i = 0; i < value.length; i++) {
/* 426 */           String crnValue = value[i];
/* 427 */           getcrnList.add(crnValue);
/*     */         }
/*     */       
/*     */       }
/*     */     
/* 432 */     } catch (Exception ex) {}
/*     */ 
/*     */     
/* 435 */     return getcrnList;
/*     */   }
/*     */ 
/*     */   
/*     */   String getEmailID(String finalmsg, String msgid, String trackid) {
/* 440 */     String tempbounceid = "";
/* 441 */     String bounceid = "";
/*     */ 
/*     */     
/* 444 */     if (finalmsg.contains("#infosee#")) {
/* 445 */       bounceid = finalmsg.substring(finalmsg.indexOf("#infosee#") + 10, finalmsg.indexOf("#endinfosee#")).trim();
/*     */     }
/*     */     else {
/*     */       
/* 449 */       int p = 0, n = 0;
/*     */ 
/*     */       
/* 452 */       while (p != -1) {
/* 453 */         p = finalmsg.indexOf('@', p + 1);
/*     */ 
/*     */         
/* 456 */         if (tempbounceid.equals("") || tempbounceid.contains("localhost") || tempbounceid.equals(msgid) || tempbounceid.equals(trackid)) {
/* 457 */           tempbounceid = trackBounceID(p, finalmsg);
/*     */           
/*     */           continue;
/*     */         } 
/* 461 */         bounceid = tempbounceid.trim();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 468 */     return bounceid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String trackBounceID(int p, String finalmsg) {
/* 474 */     String bounceid = "";
/* 475 */     StringBuffer left = new StringBuffer();
/* 476 */     StringBuffer right = new StringBuffer();
/*     */ 
/*     */     
/* 479 */     int a = p - 1;
/* 480 */     for (; a >= 0 && 
/* 481 */       finalmsg.charAt(a) != ' ' && finalmsg.charAt(a) != '\n' && finalmsg.charAt(a) != '<'; a--)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 486 */       left.append(finalmsg.charAt(a));
/*     */     }
/*     */ 
/*     */     
/* 490 */     a = p + 1;
/* 491 */     for (; a <= finalmsg.length() && 
/* 492 */       finalmsg.charAt(a) != ' ' && finalmsg.charAt(a) != '\n' && finalmsg.charAt(a) != '>'; a++)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 497 */       right.append(finalmsg.charAt(a));
/*     */     }
/*     */ 
/*     */     
/* 501 */     bounceid = left.reverse() + "@" + right;
/*     */ 
/*     */     
/* 504 */     return bounceid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void delInbox(String bnEmailId, String hostStr, String serverPort, String userPass) throws MessagingException, Exception {
/* 511 */     int isdelete = 1;
/* 512 */     int totalmsg = 0;
/* 513 */     boolean iscurrent = true;
/* 514 */     boolean inboxErr = false;
/* 515 */     Date max_date = new Date();
/* 516 */     Vector mailconfig = new Vector();
/* 517 */     Vector finalrec = new Vector();
/* 518 */     Pxbncdxfrmxhdr bnHeaderObj = new Pxbncdxfrmxhdr();
/* 519 */     Vector dbfrmHeaders = new Vector(this.bnTrapDAO.display(bnHeaderObj));
/*     */     
/* 521 */     Pxbncdxsbjct bnSubObj = new Pxbncdxsbjct();
/* 522 */     Vector dbSublines = new Vector(this.bnTrapDAO.display(bnSubObj));
/*     */ 
/*     */     
/* 525 */     Pxbncdxerlbxm errorLibObj = new Pxbncdxerlbxm();
/* 526 */     Vector errlib = new Vector(this.bnTrapDAO.display(errorLibObj));
/*     */ 
/*     */ 
/*     */     
/* 530 */     dbfrmHeaders.removeElement(dbfrmHeaders.lastElement());
/*     */     
/* 532 */     dbSublines.removeElement(dbSublines.lastElement());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 539 */     SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
/* 540 */     SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
/* 541 */     SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
/*     */ 
/*     */     
/* 544 */     Properties props = new Properties();
/*     */     
/* 546 */     props.put("mail.pop3.host", hostStr);
/* 547 */     props.put("mail.user", bnEmailId.trim());
/* 548 */     props.setProperty("mail.passwd", userPass);
/* 549 */     Session session = Session.getInstance(props, null);
/*     */     
/* 551 */     Store store = session.getStore("pop3");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 558 */       store.connect(props.getProperty("mail.host"), props.getProperty("mail.user"), props.getProperty("mail.passwd"));
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 563 */     catch (MessagingException ex) {
/* 564 */       ex.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/* 568 */     Folder folder = store.getFolder("INBOX");
/* 569 */     folder.open(2);
/* 570 */     totalmsg = folder.getMessageCount();
/* 571 */     Message[] msg = folder.getMessages();
/*     */ 
/*     */ 
/*     */     
/* 575 */     for (int j = 0; j < msg.length; j++) {
/* 576 */       if (isdelete == 1) {
/* 577 */         msg[j].setFlag(Flags.Flag.DELETED, true);
/* 578 */         iscurrent = false;
/*     */       } 
/*     */     } 
/*     */     
/* 582 */     folder.close(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void delete(String delMailId) {
/* 587 */     this.bnTrapDAO.deleteAll(delMailId);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reSendMAIL(String productId, Date billCycleDate, String bounceCategory, boolean delBounceMail, String selecetedCRN, Map prodcutMap, Map bnTrapCustResndMap) {
/* 594 */     long processID = 0L;
/*     */     
/* 596 */     String emailId = "";
/* 597 */     String altEmailId = "";
/*     */     
/* 599 */     String stmtNm = "";
/* 600 */     String stmtLoc = "";
/*     */     
/* 602 */     long tempEmailRuleId = 0L;
/* 603 */     int sentCount = 1;
/* 604 */     int missedCount = 1;
/* 605 */     String serverTyp = "";
/* 606 */     String hostStr = "";
/* 607 */     String usrNm = "";
/* 608 */     String userPass = "";
/* 609 */     String serverPort = "";
/* 610 */     String serverPass = "";
/* 611 */     String server_name = "";
/* 612 */     String smtp_username = "";
/* 613 */     String smtp_password = "";
/* 614 */     String smtp_host = "";
/* 615 */     long smtp_port = 0L;
/*     */     
/* 617 */     Set prdSET = prodcutMap.keySet();
/* 618 */     Iterator<Long> itr = prdSET.iterator();
/* 619 */     String prdNm = "";
/* 620 */     while (itr.hasNext()) {
/* 621 */       Long prdId = itr.next();
/* 622 */       if (prdId.longValue() == Long.parseLong(productId)) {
/* 623 */         prdNm = (String)prodcutMap.get(prdId);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 628 */     List<Object[]> processiD = this.bnTrapDAO.getMaxProcessID(billCycleDate, productId);
/* 629 */     int t = 0;
/* 630 */     for (; t < processiD.size(); t++) {
/* 631 */       Object[] obj = processiD.get(t);
/* 632 */       processID = Long.parseLong(obj[0].toString());
/*     */     } 
/* 634 */     PropertiesFileRead propRead = new PropertiesFileRead();
/* 635 */     Properties prop = propRead.readPropertyFile();
/* 636 */     String logPath = prop.getProperty("CLCK_PSS_FOLDER_PATH") + "/" + prdNm + "/" + "ReSendEmail/sentLog/";
/*     */ 
/*     */     
/* 639 */     File logFilepath = new File(logPath);
/* 640 */     if (!logFilepath.exists()) {
/* 641 */       logFilepath.mkdirs();
/*     */     }
/* 643 */     List<Object> prdEmlList = this.bnTrapDAO.display(productId);
/* 644 */     for (int i = 0; i < prdEmlList.size(); i++) {
/* 645 */       Pxprdctxm prdMstObj = (Pxprdctxm)prdEmlList.get(i);
/* 646 */       Pxemxsrvxcnfg emlConfigObj = prdMstObj.getPxemxsrvxcnfg();
/* 647 */       server_name = emlConfigObj.getTypxsrxem();
/* 648 */       smtp_username = emlConfigObj.getNmuxsrxem();
/* 649 */       smtp_password = emlConfigObj.getWdxpsrxem();
/* 650 */       smtp_host = emlConfigObj.getHstxsrxem();
/* 651 */       smtp_port = emlConfigObj.getPrtxsrxem().longValue();
/*     */     } 
/* 653 */     List<Dxprdtnxdtlsxm> emilProductionData = this.bnTrapDAO.getTotalEmilProductionDataDetails(billCycleDate, processID, selecetedCRN);
/* 654 */     for (Dxprdtnxdtlsxm dxprdtnxdtlsxm : emilProductionData) {
/* 655 */       int resendCount = 0;
/*     */       try {
/* 657 */         Date stmtDt = dxprdtnxdtlsxm.getDxctd();
/* 658 */         emailId = dxprdtnxdtlsxm.getIxem();
/* 659 */         altEmailId = dxprdtnxdtlsxm.getIxemxalt();
/* 660 */         long crnNo = dxprdtnxdtlsxm.getNoxacnt().longValue();
/* 661 */         stmtNm = dxprdtnxdtlsxm.getNmxstmt();
/* 662 */         stmtLoc = dxprdtnxdtlsxm.getLctnxstmt();
/* 663 */         long emailRuleId = dxprdtnxdtlsxm.getIxcfgxem().longValue();
/* 664 */         if (emailRuleId != tempEmailRuleId) {
/* 665 */           emailConfigurationDetails(emailRuleId);
/*     */         }
/*     */         
/* 668 */         Set bounceTrapSET = bnTrapCustResndMap.keySet();
/* 669 */         Iterator<String> itr1 = bounceTrapSET.iterator();
/* 670 */         String sentCont = "";
/* 671 */         while (itr1.hasNext()) {
/* 672 */           String crnStr = itr1.next();
/* 673 */           Long crnNumber = Long.valueOf(Long.parseLong(crnStr));
/* 674 */           if (crnNumber.longValue() == crnNo) {
/* 675 */             sentCont = String.valueOf(bnTrapCustResndMap.get(crnStr));
/*     */             break;
/*     */           } 
/*     */         } 
/* 679 */         resendCount = Integer.parseInt(sentCont);
/* 680 */         tempEmailRuleId = emailRuleId;
/*     */         
/* 682 */         if (this.emlAttachFileLoc == null) {
/* 683 */           this.emlAttachFileLoc = "";
/*     */         }
/*     */ 
/*     */         
/* 687 */         Properties mailProperty = new Properties();
/* 688 */         mailProperty.setProperty("mail.transport.protocol", server_name);
/* 689 */         mailProperty.setProperty("mail.smtp.host", smtp_host);
/* 690 */         mailProperty.setProperty("mail.smtp.port", String.valueOf(smtp_port));
/* 691 */         mailProperty.setProperty("mail.smtp.starttls.enable", "true");
/* 692 */         Session session = Session.getInstance(mailProperty);
/*     */         
/* 694 */         SMTPMessage msg = new SMTPMessage(session);
/* 695 */         if (!emailId.trim().equalsIgnoreCase("") || emailId.trim() != null || !emailId.trim().equalsIgnoreCase(null)) {
/* 696 */           msg.setSubject(this.emailSub);
/* 697 */           msg.setFrom((Address)new InternetAddress(this.frmAddr));
/* 698 */           msg.setRecipients(Message.RecipientType.TO, (Address[])InternetAddress.parse(emailId, false));
/* 699 */           if (altEmailId == null || !altEmailId.trim().equalsIgnoreCase("")) {
/* 700 */             altEmailId = "";
/*     */           } else {
/* 702 */             msg.setRecipients(Message.RecipientType.CC, (Address[])InternetAddress.parse(altEmailId, false));
/*     */           } 
/*     */           
/* 705 */           this.emlBody = "hiiiiiiiiiiiiiiii";
/* 706 */           msg.setEnvelopeFrom(this.bounceEmailId);
/* 707 */           MimeBodyPart mbp1 = new MimeBodyPart();
/* 708 */           MimeBodyPart mbp2 = new MimeBodyPart();
/* 709 */           MimeBodyPart mbp3 = new MimeBodyPart();
/* 710 */           if (this.emlBodySrc.equalsIgnoreCase("S")) {
/* 711 */             mbp1.setContent(this.emlBody, "text/plain");
/* 712 */           } else if (this.emlBodySrc.equalsIgnoreCase("F")) {
/* 713 */             StringBuffer message = new StringBuffer();
/* 714 */             BufferedReader br = new BufferedReader(new FileReader(this.emlBody));
/* 715 */             String line = br.readLine();
/* 716 */             while (line != null) {
/* 717 */               line = br.readLine();
/* 718 */               message.append(line);
/*     */             } 
/* 720 */             this.emlBody = message.toString();
/* 721 */             mbp1.setContent(this.emlBody, "text/html");
/*     */           } 
/*     */           
/* 724 */           FileDataSource fds2 = new FileDataSource(stmtLoc + "\\" + stmtNm);
/* 725 */           mbp2.setDataHandler(new DataHandler(fds2));
/* 726 */           mbp2.setFileName(fds2.getName());
/* 727 */           MimeMultipart mimeMultipart = new MimeMultipart();
/* 728 */           mimeMultipart.addBodyPart((BodyPart)mbp1);
/* 729 */           mimeMultipart.addBodyPart((BodyPart)mbp2);
/* 730 */           if (this.emlAttachFlag == 1L) {
/* 731 */             FileDataSource fds3 = new FileDataSource(this.emlAttachFileLoc);
/* 732 */             mbp3.setDataHandler(new DataHandler(fds3));
/* 733 */             mbp3.setFileName(this.emlAttachFileName);
/* 734 */             mimeMultipart.addBodyPart((BodyPart)mbp3);
/*     */           } 
/* 736 */           msg.setContent((Multipart)mimeMultipart);
/*     */           try {
/* 738 */             Transport.send((Message)msg);
/* 739 */             this.bnTrapDAO.updateSentFlag(crnNo, processID, "Y");
/* 740 */             this.bnTrapDAO.updatCountLogs(processID, sentCount++, "S");
/*     */           
/*     */           }
/* 743 */           catch (MessagingException e) {
/* 744 */             this.bnTrapDAO.updateSentFlag(crnNo, processID, "N");
/* 745 */             this.bnTrapDAO.updatCountLogs(processID, missedCount++, "N");
/* 746 */             if (!altEmailId.trim().equalsIgnoreCase("") || altEmailId.trim() != null || !altEmailId.trim().equalsIgnoreCase(null));
/*     */             
/* 748 */             if (e.toString().contains("AddressException") || e.toString().contains("Invalid Addresses") || e.toString().contains("Connection reset by peer: socket write error"));
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 753 */           this.bnTrapDAO.updateReSentCount(crnNo, processID, "N", ++resendCount);
/*     */         
/*     */         }
/*     */       
/*     */       }
/* 758 */       catch (IOException iOException) {
/*     */       
/* 760 */       } catch (NumberFormatException numberFormatException) {
/*     */       
/* 762 */       } catch (Exception ex) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String emailConfigurationDetails(long emailRuleId) {
/* 770 */     List<Pxemlxcng> emailConfigDetails = this.bnTrapDAO.getEmailConfigurationDetails(emailRuleId);
/*     */     
/* 772 */     for (Pxemlxcng pxemlxcng : emailConfigDetails) {
/* 773 */       this.frmAddr = pxemlxcng.getAdsxfrmxem();
/* 774 */       this.emailSub = pxemlxcng.getSbxem();
/* 775 */       this.bounceEmailId = pxemlxcng.getIxbncdxem();
/* 776 */       this.emlBodySrc = pxemlxcng.getSrcxbdyxem();
/* 777 */       this.emlBody = pxemlxcng.getBdyxem();
/* 778 */       if (pxemlxcng.getFxatchxem() != null) {
/* 779 */         this.emlAttachFlag = pxemlxcng.getFxatchxem().longValue();
/* 780 */         this.emlAttachFileName = pxemlxcng.getNm1xflxatchxem();
/* 781 */         this.emlAttachFileLoc = pxemlxcng.getLc1xflxatchxem();
/*     */       } 
/*     */     } 
/* 784 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\BounceTrapReptReSndManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */