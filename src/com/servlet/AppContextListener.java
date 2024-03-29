package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class AppContextListener implements ServletContextListener  {

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		
ServletContext ctx = servletContextEvent.getServletContext();
    	
    	String url = ctx.getInitParameter("DBURL");
    	String u = ctx.getInitParameter("DBUSER");
    	String p = ctx.getInitParameter("DBPWD");
    	
    	//create database connection from init parameters and set it to context
    	//DBConnectionManager dbManager = new DBConnectionManager(url, u, p);
    	//ctx.setAttribute("DBManager", dbManager);
    	System.out.println("Database connection initialized for Application.");
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		ServletContext ctx = servletContextEvent.getServletContext();
    	//DBConnectionManager dbManager = (DBConnectionManager) ctx.getAttribute("DBManager");
    	//dbManager.closeConnection();
    	System.out.println("Database connection closed for Application.");
    	
		
	}

}
