package pe.com.ecampos.storemongodb.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	public String name;
	
	public Category() {}
	
	public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category(String name) {
		super(); 
		this.name = name;
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

	 

}
