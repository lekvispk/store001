package pe.com.ecampos.storemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import pe.com.ecampos.storemongodb.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

	public Category findByName(@Param("name") String name);
	
}
