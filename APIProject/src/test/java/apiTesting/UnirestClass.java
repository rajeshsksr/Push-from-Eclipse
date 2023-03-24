package apiTesting;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestClass {
	/*
	 *This is to retrieve data
	 */
	public void getMethod() throws UnirestException {
		HttpResponse<JsonNode> jnres= Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Status code :"+jnres.getStatus());
		System.out.println("Status msg :"+jnres.getStatusText());
		System.out.println("Response body :"+jnres.getBody());
	}
	/*
	 * This is to create a new request
	 */
	public void postMethod() throws UnirestException {
		HttpResponse<JsonNode> jnres= Unirest.post("https://dummy.restapiexample.com/api/v1/create")
				.body("{\"name\":\"hello\",\"salary\":\"10k\",\"age\":\"23\"}").asJson();
		System.out.println("Status code :"+jnres.getStatus());
		System.out.println("Status msg :"+jnres.getStatusText());
		System.out.println("Response body :"+jnres.getBody());
	}
	/*
	 * This is to update a request
	 */
	public void putMethod() throws UnirestException {
		HttpResponse<JsonNode> jnres= Unirest.put("https://dummy.restapiexample.com/api/v1/update/9536")
				.body("{\"name\":\"hello\",\"salary\":\"15k\",\"age\":\"35\"}").asJson();
		System.out.println("Status code :"+jnres.getStatus());
		System.out.println("Status msg :"+jnres.getStatusText());
		System.out.println("Response body :"+jnres.getBody());
	}
	/*
	 * This is to delete a request
	 */
	public void deleteMethod() throws UnirestException {
		HttpResponse<JsonNode> jnres= Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/3").asJson();
		System.out.println("Status code :"+jnres.getStatus());
		System.out.println("Status msg :"+jnres.getStatusText());
		System.out.println("Response body :"+jnres.getBody());
	}
	public static void main(String[] args) throws UnirestException {
		UnirestClass uniclass=new UnirestClass();
		//	uniclass.getMethod();
		//	uniclass.postMethod();
			uniclass.putMethod();
		//	uniclass.deleteMethod();
	}

}
