
public class Item {
	
	//Instance Fields
	private double price;
	private String name,size,category;
	
	//Simple Constructor
	public Item() {}
	
	//Handles Items w/ Cat, Name, Price
	public Item(String c,String n,Double p){
		category = c;
		name = n;
		price = p;
	}
	
	//Handle Drinks with Sizes
	public Item(String c,String n,String s,Double p){
		category = c;
		name = n;
		size = s;
		price = p;
	}
	
	//Price AM
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	//Name AM
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	//Size AM
	public String getSize() {return size;}
	public void setSize(String size) {this.size = size;}
	//Category AM
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	
	//toString
	public String toString() {
		if(size != null){
			return "(" + getSize() + ")" + getName() + "\t" + getCategory() + "\t" + "$" + getPrice();}
		else {return getName() + "\t" + getCategory() + "\t" + "$" + getPrice();}
	}//End of toString()
	
	
}//End of class
