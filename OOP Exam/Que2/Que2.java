import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


class Inventory {
	public static void main (String... args) {
	
	ArrayList<Item> list = new ArrayList<Item>();
	Item i1 = new Item(1,"");
	Item i2 = new Item(2,"");
	Item i3 = new Item(3,"");
}

class Item implements Comparable(Item){

	private Int itemId;
	private String itemName;
	
	public Item(Int itemId, String itemName) {
	this.itemId = itemId;
	this.itemName = itemName;
	}
	
	public Int getItemId() {
		return this.itemId;
	}
	
	public String getItemName() {
	return this.itemName;
	
	}

}