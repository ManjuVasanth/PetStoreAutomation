package api.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import com.github.javafaker.Faker;

import api.payload.Pet;

public class PetTest {
	
	Faker faker;
	Pet petPayload;
	public void setUpPetData() {
		 int id;
		 int categoryId;
		 String categoryName;
		 String name;
		String photoUrls;
		List<Tag> tags;
		 String status;
		 petPayload.setId(faker.number().numberBetween(1, 1000));
		 petPayload.setCategoryId(faker.number().numberBetween(1, 100));
		 petPayload.setCategoryName(faker.animal().name());
		 petPayload.setName(faker.animal().name());
		 petPayload.setPhotoUrls(faker.internet().url());
		 petPayload.setStatus(faker.options().option("available", "pending", "sold"));
		  tags = new ArrayList<>();
	        int numTags = faker.number().numberBetween(1, 5);
	        for (int i = 0; i < numTags; i++) {
	            int tagId = faker.number().numberBetween(1, 100);
	            String tagName = faker.animal().name();
	            petPayload.setTags(faker.number().numberBetween(1, 100)+faker.animal().name());
	        }
	}
	
	 
	 
}
