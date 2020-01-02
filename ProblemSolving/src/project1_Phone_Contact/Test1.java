package project1_Phone_Contact;

import java.text.ParseException;
import java.util.*;

public class Test1 
{
	public static void main(String arg[]) throws ParseException
	{
	LinkedHashSet s=new LinkedHashSet();
		s.add(1);
		s.add(5);
		s.add(4);
		Collection le;
//		le.
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(1);
		ll.add(1);

		ArrayList al=new ArrayList();
		al.add(2);
		al.addAll(ll);
		System.out.println(al);
		LinkedHashMap m=new LinkedHashMap();
//	Iterator itr=s.iterator(2);
//		m.remove(itr.next());
//		m.put(itr.next(),"tamil");
//		m.put(itr.next(),"nesaN");
//		m.put(itr.next(),"Michael");
		
//		Collections.sort(s);
//		System.out.println(m);
		Set tree=new TreeSet();
	tree.add(s);
		tree.add(1);
		tree.add(2);
		tree.addAll(s);
		HashSet hs=new HashSet();
		hs.add(tree);
		hs.add(2);

//		tree.
//		tree.removeAll(s);
		System.out.println(tree);
		System.out.println(hs);

		int x1=5;
		Integer x2=5;
		Integer x3=new Integer(5);
		Integer x4= new Integer(5);
		System.out.println(x1==x2);
		System.out.println(x2==x3);
		System.out.println(x3==x4);
		System.out.println(x4==x1);

		
		
		
	}

}
