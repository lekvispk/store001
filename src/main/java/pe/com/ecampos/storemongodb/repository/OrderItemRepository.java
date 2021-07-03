package pe.com.ecampos.storemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.ecampos.storemongodb.model.OrderItem;

public interface OrderItemRepository extends MongoRepository<OrderItem , String>{

}
