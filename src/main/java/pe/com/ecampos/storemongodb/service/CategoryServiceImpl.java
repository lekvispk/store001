package pe.com.ecampos.storemongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.ecampos.storemongodb.model.Category;
import pe.com.ecampos.storemongodb.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findByName(String name) {
		return categoryRepository.findByName(name);
	}

}
