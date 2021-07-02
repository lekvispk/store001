package pe.com.ecampos.storemongodb.service;

import java.util.List;

import pe.com.ecampos.storemongodb.model.Category;

public interface CategoryService {

	List<Category> findAll();

	Category findByName(String name);
    
}
