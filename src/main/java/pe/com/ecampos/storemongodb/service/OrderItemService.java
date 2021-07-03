package pe.com.ecampos.storemongodb.service;

import java.util.List;

import pe.com.ecampos.storemongodb.model.OrderItem;

public interface OrderItemService {

	public List<OrderItem> findAll(); 
	public OrderItem findById(String id);
	public List<OrderItem> findByOrderId(String orderId);
	public void save( OrderItem prod );
	public void update( OrderItem prod );
	public void delete( OrderItem prod );
	
}
