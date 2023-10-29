package payload;

import java.util.ArrayList;
import java.util.List;

import pojos.Category;
import pojos.Pet;
import pojos.Tag;

public class AddPetPayload {

	public Pet addPetPayload() {

		Pet pet = new Pet();
		pet.setId(1);
		pet.setName("Jonty");
		pet.setStatus("available");
		List<String> photoList = new ArrayList<String>();
		photoList.add("img1");
		photoList.add("img2");
		pet.setPhotoUrls(photoList);

		Category category = new Category();
		category.setId(4);
		category.setName("sayak");

		Tag tag = new Tag();
		tag.setId(4);
		tag.setName("someTagName");

		List<Tag> tagList = new ArrayList<Tag>();
		tagList.add(tag);
		pet.setTags(tagList);
		
		return pet;
	}
}
