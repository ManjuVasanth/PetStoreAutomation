package api.test;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.s;

import com.github.javafaker.Faker;

import api.payload.Store;

public class StoreTest {
Faker faker;
Store storePayload;
	public void setUpStoreData() {
		faker = new Faker();
		storePayload = new Store();
		
		/*	int id;
	int petId;
	int quantity;
	String shipDate;
	String status;
	boolean complete;*/
		storePayload.setId(faker.number().numberBetween(1000, 9999));
		storePayload.setPetId(faker.animal().name() + "-" + faker.number().numberBetween(1000, 9999));
		storePayload.setQuantity( faker.number().numberBetween(1, 100));
		 String[] statusOptions = {"Processing", "Shipped", "Delivered"};
		 storePayload.setStatus(faker.options().option(statusOptions));
		 storePayload.setShipDate( faker.date().future(30, TimeUnit.DAYS));
		storePayload.setComplete(faker.bool().bool());
	
		
		
	}
}
