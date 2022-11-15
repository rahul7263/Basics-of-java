package Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;


public class Demo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
       //<> it's genric function , when use this<> we don't need to specifi what type of data we have added
	   List<Object> li = new ArrayList<>();
	  
	   // Set li = new HashSet();
		 
		li.add(2);
		li.add(3);
		li.add(2);
		li.add(1);
		li.add(4);
//		li.add("java");
//		li.add("Selenium");
		
		for(Object x:li) {
			
			System.out.println(x);
		}
		
		Set s = new HashSet(li);// remvoes duplicate but changes order of insertion
		System.out.println(s);
		
		Set s1 = new LinkedHashSet(li);//remove duplicates but without changing insertion order
		System.out.println(s1);
		
		Set s2 = new TreeSet(li);// sort element but removes the duplicates
		System.out.println(s2);
		
		//Collections.sort( li);
		System.out.println(li); // allow duplicates with sorting
		
//		Iterator itr = li.iterator();
//		
//		while(itr.hasNext()) {
//		  	
//		     int a = (int)itr.next();
//			System.out.println(a);
//			
//			Object o = itr.next();
//			if(o instanceof String) {
//				String str = (String)o;
//				System.out.println(str);
//			}
//			else if(o instanceof Integer) {
//				int b = (int)o;
//				System.out.println(b);
//						}
			
//		}
		
		
	}

}
