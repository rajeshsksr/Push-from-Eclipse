package apiTesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaBuiltinClass {
	/*
	 * This is to retrieve a request
	 */
	public void getMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		System.out.println("Status code is :"+connection.getResponseCode());
		System.out.println("Status msg is :"+connection.getResponseMessage());
		
		InputStream ips=connection.getInputStream();
		InputStreamReader ipr=new InputStreamReader(ips);
		BufferedReader bfr=new BufferedReader(ipr);
		
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=bfr.readLine())!=null) {
			sb.append(line);
		}
		System.out.println(sb);
	}
	/*
	 * This is to create a new request
	 */
	public void postMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String inputjson="{\"employee_name\":\"hello\",\"employee_salary\":\"123k\",\"employee_age\":\"23\"}";
		byte[]jsondata= inputjson.getBytes();
		
		OutputStream ops= connection.getOutputStream();
		ops.write(jsondata);		
		
		System.out.println("Status code is :"+connection.getResponseCode());
		System.out.println("Status msg is :"+connection.getResponseMessage());
		
		InputStream ips=connection.getInputStream();
		InputStreamReader ipr=new InputStreamReader(ips);
		BufferedReader bfr=new BufferedReader(ipr);
		
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=bfr.readLine())!=null) {
			sb.append(line);
		}
		System.out.println(sb);
	}
	/*
	 * This is to update a request
	 */
	public void putMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/update/3625");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String inputjson="{\"employee_name\":\"hello java\",\"employee_salary\":\"100k\",\"employee_age\":\"30\"}";
		byte[]jsondata= inputjson.getBytes();
		
		OutputStream ops= connection.getOutputStream();
		ops.write(jsondata);		
		
		System.out.println("Status code is :"+connection.getResponseCode());
		System.out.println("Status msg is :"+connection.getResponseMessage());
		
		InputStream ips=connection.getInputStream();
		InputStreamReader ipr=new InputStreamReader(ips);
		BufferedReader bfr=new BufferedReader(ipr);
		
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=bfr.readLine())!=null) {
			sb.append(line);
		}
		System.out.println(sb);
	}
	/*
	 * This is to delete a request
	 */
	public void deleteMethod() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/delete/1");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		
	//	OutputStream ops= connection.getOutputStream();
	//	ops.write(jsondata);		
		
		System.out.println("Status code is :"+connection.getResponseCode());
		System.out.println("Status msg is :"+connection.getResponseMessage());
		
		InputStream ips=connection.getInputStream();
		InputStreamReader ipr=new InputStreamReader(ips);
		BufferedReader bfr=new BufferedReader(ipr);
		
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=bfr.readLine())!=null) {
			sb.append(line);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) throws IOException {
		JavaBuiltinClass javabuiltin=new JavaBuiltinClass();
	//	javabuiltin.getMethod();
		javabuiltin.postMethod();
	//	javabuiltin.putMethod();
	//	javabuiltin.deleteMethod();
	}

}
