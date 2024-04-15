package api.endpoints;

public class Routes {
	// https://petstore.swagger.io/v2/user
	// maintain only  main urls
		public static String base_url = "https://petstore.swagger.io/v2";
		
		
		//user module
		public static String post_url = base_url+"/user";
		public static String get_url= base_url+"/user/{username}";
		public static String update_url= base_url+"/user/{username}";
		public static String delete_url= base_url+"/user/{username}";
	
		// Store module
		public static String storePost_url= base_url+"/store";
		public static String storeGet_url= base_url+"/user/{storename}";
		public static String storeUpdate_url= base_url+"/user/{storename}";
		public static String storeDelete_url= base_url+"/user/{storename}";

	// pet module
		//https://petstore.swagger.io/v2/pet
		//https://petstore.swagger.io/v2/pet/23
		//https://petstore.swagger.io/v2/pet/23
		public static String petPost_url = base_url + "/pet";
		public static String petGet_url = base_url + "/pet/{petId)";
		public static String petUpdate_url = base_url+"/pet";
		public static String petDelete_url = base_url + "/pet/{petId)";
}


