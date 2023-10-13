package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List c=new ArrayList();
  c.add(101);
  c.add(102);
  c.add(103);
  System.out.println(c);
  
  System.out.println(c.isEmpty());
  //c.clear();
  System.out.println(c);
  Iterator it=c.iterator();
  System.out.println(it.hasNext());
 for (Object object : c) {
	System.out.println(object);
}
//  while(it.hasNext()) {
//System.out.println(it.next());
//  }
  
  
	}

}
