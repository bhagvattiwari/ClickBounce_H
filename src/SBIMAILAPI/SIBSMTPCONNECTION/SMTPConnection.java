/*     */ package SBIMAILAPI.SIBSMTPCONNECTION;
/*     */ 
/*     */ import com.sun.mail.pop3.POP3Store;
/*     */ import java.util.Properties;
/*     */ import javax.mail.MessagingException;
/*     */ import javax.mail.Session;
/*     */ import javax.mail.Store;
/*     */ 
/*     */ public class SMTPConnection
/*     */ {
/*  11 */   private Session session = null;
/*  12 */   private Properties props = new Properties();
/*     */   
/*     */   String mailServer;
/*     */   
/*     */   String hostServer;
/*     */   String user;
/*     */   String password;
/*     */   String hostStr;
/*     */   String portStr;
/*     */   
/*     */   SMTPConnection() {}
/*     */   
/*     */   public SMTPConnection(String mailServer, String hostServer, String hostStr, String user, String password, String port) {
/*  25 */     this.mailServer = mailServer;
/*  26 */     this.hostServer = hostServer;
/*  27 */     this.user = user;
/*  28 */     this.password = password;
/*  29 */     this.hostStr = hostStr;
/*  30 */     this.portStr = port;
/*     */   }
/*     */   
/*     */   public Store getConectionStore(String accessToken) {
/*  34 */     POP3Store store = null;
/*     */     
/*     */     try {
/*  37 */       System.out.println("hostStr==> " + this.hostStr);
/*  38 */       System.out.println("portStr==> " + this.portStr);
/*  39 */       System.out.println("user==> " + this.user);
/*     */       
/*  41 */       System.out.println("accessToken==> " + accessToken);
/*     */ 
/*     */       
/*  44 */       store = (POP3Store)getSession().getStore("pop3s");
/*  45 */       store.connect(this.hostStr, Integer.parseInt(this.portStr), this.user, accessToken);
/*     */     }
/*  47 */     catch (MessagingException ex) {
/*  48 */       ex.printStackTrace();
/*  49 */       store = null;
/*     */     } 
/*  51 */     return (Store)store;
/*     */   }
/*     */   
/*     */   private Session getSession() {
/*  55 */     this.props = getProperty();
/*  56 */     this.session = Session.getInstance(this.props);
/*  57 */     return this.session;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Properties getProperty() {
/*  67 */     this.props.put("mail.pop3s.disabletop", "true");
/*  68 */     this.props.put("mail.pop3s.forgettopheaders", "true");
/*  69 */     this.props.put("mail.pop3s.sasl.enable", "true");
/*  70 */     this.props.put("mail.pop3s.sasl.mechanisms", "XOAUTH2");
/*  71 */     this.props.put("mail.pop3s.sasl.enable", String.valueOf(true));
/*  72 */     this.props.put("mail.pop3s.auth.mechanisms", "XOAUTH2");
/*  73 */     this.props.put("mail.pop3s.ssl.enable", "true");
/*  74 */     this.props.put("mail.pop3s.auth.login.disable", "true");
/*  75 */     this.props.put("mail.pop3s.auth.plain.disable", "true");
/*  76 */     this.props.put("mail.pop3s.auth.digest-md5.disable", "true");
/*  77 */     this.props.put("mail.pop3s.auth.ntlm.disable", "true");
/*  78 */     this.props.put("mail.pop3s.auth.xoauth2.disable", "false");
/*  79 */     this.props.put("mail.pop3s.auth.xoauth2.two.line.authentication.format", "true");
/*     */     
/*  81 */     return this.props;
/*     */   }
/*     */   
/*     */   public String getHostServer() {
/*  85 */     return this.hostServer;
/*     */   }
/*     */   
/*     */   public void setHostServer(String hostServer) {
/*  89 */     this.hostServer = hostServer;
/*     */   }
/*     */   
/*     */   public String getMailServer() {
/*  93 */     return this.mailServer;
/*     */   }
/*     */   
/*     */   public void setMailServer(String mailServer) {
/*  97 */     this.mailServer = mailServer;
/*     */   }
/*     */   
/*     */   public String getPassword() {
/* 101 */     return this.password;
/*     */   }
/*     */   
/*     */   public void setPassword(String password) {
/* 105 */     this.password = password;
/*     */   }
/*     */   
/*     */   public Properties getProps() {
/* 109 */     return this.props;
/*     */   }
/*     */   
/*     */   public void setProps(Properties props) {
/* 113 */     this.props = props;
/*     */   }
/*     */   
/*     */   public String getUser() {
/* 117 */     return this.user;
/*     */   }
/*     */   
/*     */   public void setUser(String user) {
/* 121 */     this.user = user;
/*     */   }
/*     */   
/*     */   public String getHostStr() {
/* 125 */     return this.hostStr;
/*     */   }
/*     */   
/*     */   public void setHostStr(String hostStr) {
/* 129 */     this.hostStr = hostStr;
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 133 */     String accessToken = "eyJ0eXAiOiJKV1QiLCJub25jZSI6IlBPWXhETWFPZWh6cEFjWld6U3JBXzdLQ29RT3lYR2dvZDhTdTVqcm9mbTAiLCJhbGciOiJSUzI1NiIsIng1dCI6ImpTMVhvMU9XRGpfNTJ2YndHTmd2UU8yVnpNYyIsImtpZCI6ImpTMVhvMU9XRGpfNTJ2YndHTmd2UU8yVnpNYyJ9.eyJhdWQiOiJodHRwczovL291dGxvb2sub2ZmaWNlLmNvbSIsImlzcyI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2U2YmU1NGVhLTcwNjItNGMxNy04ZmU4LTkzNjE5MDYzYmU1NC8iLCJpYXQiOjE2NTUyNzgzNDgsIm5iZiI6MTY1NTI3ODM0OCwiZXhwIjoxNjU1MjgyNDczLCJhY2N0IjowLCJhY3IiOiIxIiwiYWlvIjoiRTJaZ1lIQ3J2N09KTFRaMWJhajNQRkczOXo3YXgzdmtSTnBmRzdFc0NGWGNNZm50MzJVQSIsImFtciI6WyJwd2QiXSwiYXBwX2Rpc3BsYXluYW1lIjoiQ2xpY2tQU1MiLCJhcHBpZCI6ImEwMGUyZGIwLWRhNzQtNGM0NC04OTU4LTA0OGNkMDk0NjBlNyIsImFwcGlkYWNyIjoiMSIsImVuZnBvbGlkcyI6W10sImZhbWlseV9uYW1lIjoiY2FyZHMiLCJnaXZlbl9uYW1lIjoiRGFpbHltYWlsc3RhdGVtZW50cyIsImlwYWRkciI6IjI3LjYyLjE5My4xMSIsIm5hbWUiOiJEYWlseSBtYWlsIHN0YXRlbWVudHMgY2FyZHMiLCJvaWQiOiIxYTU3YzkxMC1hNDBiLTRiNTEtOGU0Zi0zNDYwODViNDEzYWYiLCJwdWlkIjoiMTAwMzIwMDFGMTA2NEU5OSIsInJoIjoiMC5BWEFBNmxTLTVtSndGMHlQNkpOaGtHTy1WQUlBQUFBQUFQRVB6Z0FBQUFBQUFBQndBTDAuIiwic2NwIjoiSU1BUC5BY2Nlc3NBc1VzZXIuQWxsIE1haWwuUmVhZCBQT1AuQWNjZXNzQXNVc2VyLkFsbCBTTVRQLlNlbmQgVXNlci5SZWFkIiwic2lkIjoiZmQzYTZkMzQtYzVhMC00YjVmLWE3ZDYtOWY1YTNkZjRlZWQyIiwic3ViIjoieFpNSWtWY2NsZUtaR202bXBIREk4RXJTZ2FDU2JqUU9idlg3MFhtb1ZsdyIsInRpZCI6ImU2YmU1NGVhLTcwNjItNGMxNy04ZmU4LTkzNjE5MDYzYmU1NCIsInVuaXF1ZV9uYW1lIjoiRGFpbHlFbWFpbFN0YXRlbWVudHMuY2FyZHNAaGRmY2Jhbmt1YXQub25taWNyb3NvZnQuY29tIiwidXBuIjoiRGFpbHlFbWFpbFN0YXRlbWVudHMuY2FyZHNAaGRmY2Jhbmt1YXQub25taWNyb3NvZnQuY29tIiwidXRpIjoiVjlMMGtaOHdmMGF6UWI5clVudGJBQSIsInZlciI6IjEuMCIsIndpZHMiOlsiYjc5ZmJmNGQtM2VmOS00Njg5LTgxNDMtNzZiMTk0ZTg1NTA5Il19.HwBqXm3W_Yd3F_ZlYs0X_4nFjK7bj9zurrSe-B81HGz-B-X_jUqyCSE3ek5yLHG__Owgitvum13Hy6CgmtT0n8gj1kgeUtdX1tQJ6_FqWA6hanKtiGwGsIzZ_355_-EbKorFVomnQaK5ikZE1REneJQuqUlpPwt9_QNKekEMswvQMlNcBabDzxI0ZXioNvQT1owB4BRgqxjk5jxp4vnoiVxz-NjcGMpj9mD1vhBA4wcYw90uCA-3_mPbF7OedwEaeC4mWlhmJib8hHkUeFX8tdr_GqpOZvdXzHwZkTs9cX4dItJa-twFU2xf2vawzvfQhClhUdxSbNvV_NfSfqi9pA";
/* 134 */     SMTPConnection SMTPcON = new SMTPConnection("pop3s", "outlook.office365.com", "outlook.office365.com", "DailyEmailStatements.cards@hdfcbankuat.onmicrosoft.com", "", "995");
/* 135 */     Store st = SMTPcON.getConectionStore(accessToken);
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SBIMAILAPI\SIBSMTPCONNECTION\SMTPConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */