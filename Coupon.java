package masters.services;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Coupon implements Serializable {

	private int id;
	private String title;
	
	public Coupon()
	{
		
	}
	
	public Coupon(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
