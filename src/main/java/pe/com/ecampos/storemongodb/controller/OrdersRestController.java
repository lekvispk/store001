package pe.com.ecampos.storemongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ecampos.storemongodb.dto.OrderDTO;
import pe.com.ecampos.storemongodb.model.Order;
import pe.com.ecampos.storemongodb.service.OrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("/orders")
public class OrdersRestController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/")
	public List<OrderDTO> getAll() {
		
		List<Order> lista = orderService.findAll(); 
		List<OrderDTO> lResult = new ArrayList<OrderDTO>();
		
		if( lista!=null) {
			 lResult = new ArrayList<OrderDTO>();
			 for( Order cat : lista ) {
				 lResult.add( new OrderDTO( cat ) );
			 }
		}
		
		return lResult;
		//return ObjectMapperUtils.mapAll(categoryService.findAll(), CategoryDTO.class);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderDTO> getProductById(@PathVariable("id") String id) {
		Order prod = orderService.findById(id);
		OrderDTO pres = new OrderDTO(prod);
		return ResponseEntity.accepted().body(pres);
	}
	
	@PostMapping("/")
	public ResponseEntity<OrderDTO> saveProducto( @RequestBody Order order ) { 
		orderService.update( order ); 
		return ResponseEntity.accepted().body( new OrderDTO() );
	}

	@PutMapping("/{id}")
	public ResponseEntity<OrderDTO> updateProducto( @RequestBody Order order ) { 
		orderService.update( order ); 
		return ResponseEntity.accepted().body( new OrderDTO() );
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<OrderDTO> deleteOrder(@PathVariable("id") String id) { 
		Order ord = orderService.findById(id);
		//ord.setStatus(0);
		orderService.update(ord); 
		return ResponseEntity.accepted().body( new OrderDTO() );
	}

}