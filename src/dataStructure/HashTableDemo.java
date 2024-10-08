package dataStructure;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> table = new Hashtable<>(10,0.5f);
		table.put(100,"Marina");
		table.put(123,"Artemio");
		table.put(321,"Chritanna");
		table.put(555,"Andrian");
		table.put(777,"Mic");
		
		for(Integer key : table.keySet()) {
			System.out.println(key.hashCode() + "\t" +key + "\t" + table.get(key));
		}
		
		// Collation
		
		Hashtable<String,String> tableC = new Hashtable<>(10,0.5f);
		tableC.put("100","Marina");
		tableC.put("123","Artemio");
		tableC.put("321","Chritanna");
		tableC.put("555","Andrian");
		tableC.put("777","Mic");
		
		System.out.println("\n");
		
		for(String key : tableC.keySet()) {
			System.out.println(key.hashCode() + "\t" + key + "\t" + tableC.get(key));
		}
	}

}
