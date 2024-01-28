package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Store;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPoints {
public static Response createStore(Store payload) {
		
		Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.storePost_url);
		return response;
	}
	public static Response readStore(int orderId) {
		
		Response response = given()
		.pathParam("orderId", "orderid")
		.when()
		.get(Routes.storeGet_url);
		return response;
	}
public static Response updateStore(int orderid,Store payload) {
		
		Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("orderId", "orderid")
		.body(payload)
		.when()
		.put(Routes.storeUpdate_url);
		return response;
	}
public static Response deleteStore(int orderid) {
	
	Response response = given()
	.pathParam("orderId", "orderid")
	.when()
	.delete(Routes.storeDelete_url);
	return response;
}
}
