package my_pack;
import javax.persistence.*;
//Instead of using HBM hibernate mapping we use annotation here
@Entity
@Table(name="book")
public class Book 
{
	@Id
	private int bid;
	@Column
	private int price;
	@Column
	private String title;
	//generate getters and setters
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

	
}
