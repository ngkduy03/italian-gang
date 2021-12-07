package gang.pizza;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private int pId;

	private String name;

	@Column(length = 400)
	private String img;
	private String description;
	private Integer price;

	public Pizza() {
	}

	public Pizza(int id, String name, String img, String description, int price) {
		this.pId = id;
		this.name = name;
		this.img = img;
		this.description = description;
		this.price = price;

	}

	public void setId(int id) {
		this.pId = id;
	}

	public int getId() {
		return this.pId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImg() {
		return this.img;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
