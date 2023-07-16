package com.transferfiles;

import org.apache.camel.builder.RouteBuilder;

public class FirstRoute extends RouteBuilder{
	@Override
	public void configure() throws Exception {
		
		from("file:input")
		.log("${body}")
		.to("file:output");
	}
}
