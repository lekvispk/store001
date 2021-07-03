package pe.com.ecampos.storemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.ecampos.storemongodb.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
