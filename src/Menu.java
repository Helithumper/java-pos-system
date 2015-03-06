import java.util.ArrayList;

public class Menu {
	
	//Fields
	private String menuTitle;
	//ArrayList for Menu Items
	private ArrayList<Item> menu = new ArrayList<Item>();
	
	//Constructors
	public Menu() {}
	
	public Menu(String t) {
		menuTitle = t;
		populateMenu();
	}
	
	//Methods
	public void populateMenu() {
		menu.add(new Item("Naked Dog","Hot Dogs",1.44));
		menu.add(new Item("Chili Dog","Hot Dogs",2.09));
		menu.add(new Item("Heavy Dog","Hot Dogs",2.74));
		menu.add(new Item("Cheese Dog","Hot Dogs",1.83));
		menu.add(new Item("Slaw Dog","Hot Dogs",1.83));
	}
		
	
	//AMS
	public String getMenuTitle() {return menuTitle;}
	public void setMenuTitle(String menuTitle) {this.menuTitle = menuTitle;}
	public ArrayList<Item> getMenu() {return menu;}
	public void setMenu(ArrayList<Item> menu) {this.menu = menu;}
	
	//toString()
	public String toString() {
		int itemCount = 0;
		String result = "";
		for(Item m:menu){
			result += "#" + (itemCount+1) + " " + menu.get(itemCount) + "\n";
			itemCount++;
		}
		return result;
	}
	
}
