package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {

	public static Response createPet(Pet payload){
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.petPost_url);
		return response;
	}
	public static Response readPet(int petId){
		Response response =given()
		.pathParam("petid", petId)
		.when()
		.get(Routes.petGet_url);
		return response;
	}
	public static Response updatePet(int petId,Pet payload){
		Response response =given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("petid", petId)
		.body(payload)
		.when()
		.put(Routes.petUpdate_url);
		return response;
	}
	public static Response deletePet(int petId){
		Response response =given()
		.pathParam("petid", petId)
		.when()
		.get(Routes.petDelete_url);
		return response;
	}
	
}
