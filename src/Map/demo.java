package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {
   
	public static void main(String[]args) {
		
		Map m = new HashMap();
		m.put(1,"java");
		m.put(2,"Selenium");
		m.put(3,"SQL");
		
		System.out.println(m);
		
		Set keys = m.keySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			int key =(int)itr.next();
			System.out.println(key);
			
			String value = (String)m.get(key);
			System.out.println(value);
		}
	}
}
