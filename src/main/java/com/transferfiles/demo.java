package com.transferfiles;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
public class demo {
   public static void main(String[] args) {
	   CamelContext context=new DefaultCamelContext();
	   FirstRoute route=new FirstRoute();
	   try{
		   context.addRoutes(route);
		   context.start();
		   Thread.sleep(5*60*1000);
		   context.stop();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
}
