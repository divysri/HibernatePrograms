package com.transgene.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static StandardServiceRegistry standardServiceRegistry ;
	private static SessionFactory sessionFactory;
	
	
	static
	{
		try
		{
			standardServiceRegistry=new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metaDataSources=new MetadataSources(standardServiceRegistry);
			Metadata metadata = metaDataSources.getMetadataBuilder().build();
			sessionFactory=metadata.getSessionFactoryBuilder().build();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static void getCloseSessionFactory()
	{
		if(sessionFactory!=null)
		{
			sessionFactory.close();
		}
	}
	
}
