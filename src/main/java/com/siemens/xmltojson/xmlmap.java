package com.siemens.xmltojson;
import org.json.JSONObject;
import org.json.XML;
import org.json.simple.JSONArray;

import com.xmldoc.xmlDocobj;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;

public class xmlmap {
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	static xmlDocobj s=new xmlDocobj();
	
    public static String TEST_XML_STRING =s.finstring();
        
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
	            JSONArray jsoncontent = new JSONArray();
	            jsoncontent.add(xmlJSONObj);
	         
	             
	            //Write JSON file
	            try (FileWriter file = new FileWriter("output/sample.json")) {
	                //We can write any JSONArray or JSONObject instance to the file
	                file.write(jsoncontent.toJSONString()); 
	                file.flush();
	     
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            

//	            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
//	            System.out.println(jsonPrettyPrintString);
	            
	            
	        } catch (JSONException je) {
	            System.out.println(je.toString());
	       }

	}

}
