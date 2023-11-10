package in.com.mapinterface;

import java.util.Hashtable;

public class HashTable_Example {

	public static void main(String[] args) {
		Hashtable table=new Hashtable();
   table.put(1, 1001);
   table.put(2, 2002);
   table.put(3, 3003);
   table.put(5, 5005);
   table.put(4, 4004);
   System.out.println(table);
   System.out.println("Entry Set"+table.entrySet());
	}

}
