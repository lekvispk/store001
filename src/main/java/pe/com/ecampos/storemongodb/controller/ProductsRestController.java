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

import pe.com.ecampos.storemongodb.dto.ProductDTO;
import pe.com.ecampos.storemongodb.model.Product;
import pe.com.ecampos.storemongodb.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductsRestController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/")
	public List<ProductDTO> getAllStudents() {

		List<Product> lista = productService.findAll();
		List<ProductDTO> lResult = new ArrayList<ProductDTO>();

		if (lista != null) {
			lResult = new ArrayList<ProductDTO>();
			for (Product prod : lista) {
				lResult.add(new ProductDTO(prod));
			}
		}

		return lResult;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") String id) {
		Product prod = productService.findById(id);
		ProductDTO pres = new ProductDTO(prod);
		return ResponseEntity.accepted().body(pres);
	}
	
	@PostMapping("/")
	public ResponseEntity<ProductDTO> saveProducto( @RequestBody Product product ) {
	 
		productService.update( product );
		
		return ResponseEntity.accepted().body( new ProductDTO() );
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProductDTO> updateProducto( @RequestBody Product product ) {
	 
		productService.update( product );
		
		return ResponseEntity.accepted().body( new ProductDTO() );
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ProductDTO> deleteProducto(@PathVariable("id") String id) {
		
		Product prod = productService.findById(id);
		prod.setStatus(0);
		productService.update(prod);
		
		return ResponseEntity.accepted().body( new ProductDTO() );
	}

}