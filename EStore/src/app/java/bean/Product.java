package app.java.bean;

public class Product {

	private int id;
	private String name;
	private String category;
	private double marketprice;
	private double estoreprice;
	private int pnum;
	private String imgurl;
	private String description;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getMarketprice() {
		return marketprice;
	}
	public void setMarketprice(double marketprice) {
		this.marketprice = marketprice;
	}
	public double getEstoreprice() {
		return estoreprice;
	}
	public void setEstoreprice(double estoreprice) {
		this.estoreprice = estoreprice;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category="
				+ category + ", marketprice=" + marketprice + ", estoreprice="
				+ estoreprice + ", pnum=" + pnum + ", imgurl=" + imgurl
				+ ", description=" + description + "]";
	}
}
