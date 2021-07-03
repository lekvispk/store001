package pe.com.ecampos.storemongodb.dto;

import pe.com.ecampos.storemongodb.model.Product;

public class ProductDTO {

	private String id;
	private String name;
	private String category;
	private Double unitPrice;
	private String active;
	private Integer status;
	
	public ProductDTO() {}
	
	public ProductDTO(String id, String name, String category, Double unitPrice, String active) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.active = active;
	}

	public ProductDTO(Product prod) {
		this.id = prod.getId();
		this.name = prod.getName();
		this.category = prod.getCategory();
		this.unitPrice = prod.getUnitPrice();
		this.active = prod.getActive();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
