package pe.com.ecampos.storemongodb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import pe.com.ecampos.storemongodb.model.Order;
import pe.com.ecampos.storemongodb.repository.OrderRepository;
import pe.com.ecampos.storemongodb.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(String id) {
		Optional<Order> ordTmp = orderRepository.findById(id); 
		if( ordTmp.isPresent() ) {
			return ordTmp.get();
		}
		return null; 
	}

	@Override
	public Order findByOrderNumber(String orderNumber) { 
		Order ord = new Order();
		ord.setOrderNumber(orderNumber); 
		Optional<Order> actual =  orderRepository.findOne(Example.of( ord )); 
		if( actual.isPresent() ) {
			return actual.get();
		} 
		return null; 
	}

	@Override
	public void save(Order ord) {
		orderRepository.save(ord);
	}

	@Override
	public void update(Order ord) {
		orderRepository.save(ord);
	}

	@Override
	public void delete(Order ord) {
		orderRepository.delete(ord);
	}
}
