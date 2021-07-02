package pe.com.ecampos.storemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.ecampos.storemongodb.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

	public Category findByName(String name);
	//public List<Category> findByName(String name);

}
