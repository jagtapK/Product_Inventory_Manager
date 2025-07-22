package ProductInventory.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private double price;
	private int quantity;
	
	private String manufacturer;
	@OneToOne(cascade = CascadeType.ALL)
	private ProductDetails productDe ;
	
	public ProductDetails getProductDe() {
		return productDe;
	}

	public void setProductDe(ProductDetails productDe) {
		this.productDe = productDe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", manufacturer=" + manufacturer + ", productDe=" + productDe + "]";
	}
	
	
}
