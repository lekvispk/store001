package pe.com.ecampos.storemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.ecampos.storemongodb.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
