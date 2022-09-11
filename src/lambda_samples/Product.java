package lambda_samples;

public class Product {
	
	private long id;
	private String name;
	private double price;
	private String color;
	private String size;
	
	public Product(long id, String name, double price, String color, String size) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", size=" + size
				+ "]";
	}

	
	
}
