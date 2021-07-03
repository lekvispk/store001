package pe.com.ecampos.storemongodb.dto;

import pe.com.ecampos.storemongodb.model.Order;

public class OrderDTO {
	
	private String id;
	private String orderNumber;
	private String status;
	private String date;
	private String customer;
	
	private String cityTax;
	private String countryTax;
	private String stateTax;
	private String federalTax; 
	private String totalTaxes;
	
	private String totalAmount;

	public OrderDTO() {}
	
	
	public OrderDTO(String id, String orderNumber, String status, String date, String customer, String cityTax,
			String countryTax, String stateTax, String federalTax, String totalTaxes, String totalAmount) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.status = status;
		this.date = date;
		this.customer = customer;
		this.cityTax = cityTax;
		this.countryTax = countryTax;
		this.stateTax = stateTax;
		this.federalTax = federalTax;
		this.totalTaxes = totalTaxes;
		this.totalAmount = totalAmount;
	}
	
	public OrderDTO( Order order ) {
		super();
		this.id = order.getId();
		this.orderNumber = order.getOrderNumber();
		this.status = order.getStatus();
		this.date = order.getDate();
		this.customer = order.getCustomer();
		this.cityTax = order.getCityTax();
		this.countryTax = order.getCountryTax();
		this.stateTax = order.getStateTax();
		this.federalTax = order.getFederalTax();
		this.totalTaxes = order.getTotalTaxes();
		this.totalAmount = order.getTotalAmount();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCityTax() {
		return cityTax;
	}

	public void setCityTax(String cityTax) {
		this.cityTax = cityTax;
	}

	public String getCountryTax() {
		return countryTax;
	}

	public void setCountryTax(String countryTax) {
		this.countryTax = countryTax;
	}

	public String getStateTax() {
		return stateTax;
	}

	public void setStateTax(String stateTax) {
		this.stateTax = stateTax;
	}

	public String getFederalTax() {
		return federalTax;
	}

	public void setFederalTax(String federalTax) {
		this.federalTax = federalTax;
	}

	public String getTotalTaxes() {
		return totalTaxes;
	}

	public void setTotalTaxes(String totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
