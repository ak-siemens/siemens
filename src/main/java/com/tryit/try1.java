package com.tryit;

import org.apache.camel.builder.RouteBuilder;

// needs camel main
public class try1 {

	@SuppressWarnings("deprecation")
	public class SFTP_route extends RouteBuilder {
	    @Override
	    public void configure() throws Exception {
	        try {
	            from("file:c:/temp/input/")
	                    .to("sftp://sftpuser@192.168.10.54/?password=dev&passiveMode=true");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
