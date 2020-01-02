package Main;

import java.time.*;
import java.util.*;

public class help 
{

	public static void main(String arg[])
	{
		
		
////		Date d= new Date();
////		System.out.print(d);
////		d.getTimezoneOffset();
//		 ZoneId zoneid1 = ZoneId.of("America/New_York");  
//		    ZoneId zoneid2 = ZoneId.systemDefault();  
//		    LocalDateTime id2 = LocalDateTime.now(zoneid2);  
////		    System.out.println(id2.getHour()); 
//		    
//		    LocalDateTime localDateTime = LocalDateTime.now();
//		    
//		    Date date = Date.from( localDateTime.atZone( ZoneId.of("America/New_York")).toInstant());
//		     
//		    System.out.println(date.getTime());
//		    
//		    Date date2 = Date.from(id2.atZone(zoneid2).toInstant());
//		     
//		    System.out.println(date2.getTime());
		
		ArrayList list=new ArrayList();
		list.add(0, 10);
		list.add(1, 130);
		list.add(1, 120);		
		System.out.println(list);
		HashMap<Object,Object> map1=new HashMap<Object,Object>();
		map1.put("key", 1);
		map1.put("name", "tamil");

		System.out.println(map1.entrySet());
	}
}
