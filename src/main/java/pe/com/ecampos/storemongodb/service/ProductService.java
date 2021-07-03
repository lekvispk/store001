package pe.com.ecampos.storemongodb.service;

import java.util.List;

import pe.com.ecampos.storemongodb.model.Product;

public interface ProductService {

	public List<Product> findAll(); 
	public Product findById(String id);
	public Product findByName(String name);
	public void save( Product prod );
	public void update( Product prod );
	public void delete( Product prod );
	
}
