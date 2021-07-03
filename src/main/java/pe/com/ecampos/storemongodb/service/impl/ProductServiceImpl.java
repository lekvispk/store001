package pe.com.ecampos.storemongodb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import pe.com.ecampos.storemongodb.model.Product;
import pe.com.ecampos.storemongodb.repository.ProductRepository;
import pe.com.ecampos.storemongodb.service.ProductService;
@Service

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(String id) { 
		Optional<Product> ordTmp = productRepository.findById(id); 
		if( ordTmp.isPresent() ) {
			return ordTmp.get();
		}
		return null; 
	}

	@Override
	public Product findByName(String name) { 
		Product ord = new Product();
		ord.setName(name); 
		Optional<Product> actual =  productRepository.findOne(Example.of( ord )); 
		if( actual.isPresent() ) {
			return actual.get();
		} 
		return null; 
	}

	@Override
	public void save(Product prod) {
		productRepository.save(prod);
	}

	@Override
	public void update(Product prod) {
		productRepository.save(prod);
	}

	@Override
	public void delete(Product prod) {
		productRepository.delete(prod);
	}
}
