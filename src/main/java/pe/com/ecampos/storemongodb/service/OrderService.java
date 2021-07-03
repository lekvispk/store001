package pe.com.ecampos.storemongodb.service;

import java.util.List;

import pe.com.ecampos.storemongodb.model.Order;

public interface OrderService {

	public List<Order> findAll(); 
	public Order findById(String id);
	public Order findByOrderNumber(String orderNumber);
	public void save( Order prod );
	public void update( Order prod );
	public void delete( Order prod );
	
}
