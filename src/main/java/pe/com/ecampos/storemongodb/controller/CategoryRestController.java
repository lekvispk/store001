package pe.com.ecampos.storemongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ecampos.storemongodb.dto.CategoryDTO;
import pe.com.ecampos.storemongodb.model.Category;
import pe.com.ecampos.storemongodb.service.CategoryService;

@CrossOrigin("https://vast-gorge-47704.herokuapp.com")
@RestController
@RequestMapping("/categories")
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "/")
	public List<CategoryDTO> getAllStudents() {
		
		List<Category> lista = categoryService.findAll(); 
		List<CategoryDTO> lResult = new ArrayList<CategoryDTO>();
		
		if( lista!=null) {
			 lResult = new ArrayList<CategoryDTO>();
			 for( Category cat : lista ) {
				 lResult.add( new CategoryDTO( cat.getId() , cat.getName() ) );
			 }
		}
		
		return lResult;
		//return ObjectMapperUtils.mapAll(categoryService.findAll(), CategoryDTO.class);
	}

}