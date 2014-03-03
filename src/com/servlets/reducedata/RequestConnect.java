package com.servlets.reducedata;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class RequestConnect{
	

	private Cluster cluster=Cluster.builder().addContactPoints("127.0.0.1").build();
	private Session session =cluster.connect();
	public RequestConnect(){
		
	}
	public void checkdb(String s)
	{ 
		System.out.println("cluster created");
		System.out.print(s);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
         String dat = dateFormat.format(date);
		 session.execute("use browser");
		 //uncomment to create a table
		// session.execute("create table browserdata(browser_name text,time timestamp,date text,primary key((browser_name,time),date))");
		 PreparedStatement statement=session.prepare("insert into browserdata(browser_name,time,date) values(?,?,?)");		 
	 	 BoundStatement stat=new BoundStatement(statement);
	 	session.execute(statement.bind(s,date,dat));
			
			 
	}
}

        
    
       
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
	
