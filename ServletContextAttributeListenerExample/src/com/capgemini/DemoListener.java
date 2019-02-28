package com.capgemini;

import javax.servlet.*;  
import java.sql.*;  
  
public class DemoListener implements ServletContextListener{  
public void contextInitialized(ServletContextEvent event) {  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
          
//storing connection object as an attribute in ServletContext  
ServletContext ctx=event.getServletContext();  
ctx.setAttribute("mycon", con);  
          
}catch(Exception e){e.printStackTrace();}  
}  
  
public void contextDestroyed(ServletContextEvent arg0) {}  
}  