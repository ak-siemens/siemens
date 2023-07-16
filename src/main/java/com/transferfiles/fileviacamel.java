package com.transferfiles;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
public class fileviacamel {
	 //camel ftp and jsch dependicies
    public static void main(String[] args) {
    	final String destinationFolder = "sftp://root@192.168.225.167:/root/?password=root";
        final String sourceFolder = "file:output";
    	final CamelContext camelContext = new DefaultCamelContext();
        try {
       	 camelContext.addRoutes(new RouteBuilder() {
//              @Override
              public void configure()throws Exception {
                  from(sourceFolder).to(destinationFolder);
              }
          });
       	 
       	 camelContext.start();
            Thread.sleep(5*60*1000);
            camelContext.stop();
        }
        catch(Exception e) {
       	 e.printStackTrace();
        }
    }
     
     

 }

