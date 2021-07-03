package pe.com.ecampos.storemongodb.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderItems")
public class OrderItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String orderId;
	private String productId;
	private String product;
	private Integer quantity;
	private Double unitPRice;
	private Double cost;
	private Integer status;
	
	public OrderItem() {}
	
	public OrderItem(String id,  String orderId, String productId, String product, Integer quantity, Double unitPRice, Double cost,
			Integer status) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.product = product;
		this.quantity = quantity;
		this.unitPRice = unitPRice;
		this.cost = cost;
		this.status = status;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPRice() {
		return unitPRice;
	}
	public void setUnitPRice(Double unitPRice) {
		this.unitPRice = unitPRice;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}