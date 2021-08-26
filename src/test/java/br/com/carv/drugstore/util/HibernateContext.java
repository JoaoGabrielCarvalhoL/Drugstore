package br.com.carv.drugstore.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateContext implements ServletContextListener
{
	
	@Override
	public void contextInitialized(ServletContextEvent event)
	{
		HibernateUtil.getSessionFactory().openSession();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event)
	{
		HibernateUtil.getSessionFactory().close();
	}
}