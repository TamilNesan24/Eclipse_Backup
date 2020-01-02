package project1_Phone_Contact;

import java.util.*;

public class Test 
{
public static void main(String arg[])
{
	IdentityHashMap m=new IdentityHashMap();
	LinkedHashMap lm= new LinkedHashMap();
//	lm.
	lm.put(12, "no");
	Set set3=lm.keySet();
	Iterator itr=set3.iterator();
	
	ArrayList al=(ArrayList) lm.values();
	al.get(0);
	System.out.println(al);
	ArrayList set=new ArrayList();
//	set.add("string");
	set.add(12);
	set.add(1);
	set.add(1263);
	ArrayList set1=new ArrayList();
//	set.add("string");
	set1.add(12);
	set1.add(2122);
	Collections.copy(set, set1);
	System.out.println(set);
	char a[]= {'a','d','c'};
	StringBuffer sb=new StringBuffer();
	TreeSet d=new TreeSet(set);
	System.out.println(d);
	Object ob=new Object();
	Object ob1=new Object();
	
	System.out.println(ob1.equals(ob));
	
	
	/*TreeSet n=new TreeSet(d);
	ArrayList d1=new ArrayList(n);
	ArrayList<HashMap> d1=new ArrayList();
	d.add(1);
	d.add(2);
	d.add(1);
	Integer i=new Integer(0);
	Integer k=new Integer(0);	
	m.put(i, "tamil");
	m.put(2,"ne");
	m.put(k,"nesan");
	System.out.println(m);
	
	TreeMap<Long,Object,String> map2=new TreeMap<Long,Object,String>();
	Scanner in =new Scanner(System.in);
	Long d12=in.nextLong();
	map2.put(d12,"tamil");
//	map2.put(21,"rithwik");
//	map2.put(10,"me");
	System.out.println(map2.firstKey());
	int k1=0;
	switch(k1)
	{
	case 0:
		System.out.println("nobreak");
	default:System.out.println("default");
	}*/
	
	}
}
