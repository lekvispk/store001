package pe.com.ecampos.storemongodb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import pe.com.ecampos.storemongodb.model.OrderItem;
import pe.com.ecampos.storemongodb.repository.OrderItemRepository;
import pe.com.ecampos.storemongodb.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> findAll() {
		return orderItemRepository.findAll();
	}

	@Override
	public OrderItem findById(String id) {
		Optional<OrderItem> ordTmp = orderItemRepository.findById(id); 
		if( ordTmp.isPresent() ) {
			return ordTmp.get();
		}
		return null; 
	}

	@Override
	public List<OrderItem> findByOrderId(String orderId) {
		OrderItem ord = new OrderItem();
		ord.setOrderId(orderId);
		List<OrderItem> actual = orderItemRepository.findAll(Example.of( ord ));
		return actual; 
	}

	@Override
	public void save(OrderItem ordItem) {
		orderItemRepository.delete(ordItem);
	}

	@Override
	public void update(OrderItem ordItem) {
		orderItemRepository.delete(ordItem);
	}

	@Override
	public void delete(OrderItem ordItem) {
		orderItemRepository.delete(ordItem);
	}
	
}
