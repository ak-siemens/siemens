package com.tryit;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
public class camel {
	public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        try {
            camelContext.addRoutes(new SFTP_route());
            camelContext.start();
            Thread.sleep(200000);
            // do other stuff...
        } catch (Exception e) {
            System.out.printf("ex: " + e.getMessage());
        } finally {
            camelContext.stop();
        }
    }
}
