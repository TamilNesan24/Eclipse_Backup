package firstmonth;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MApproblem {
	public static void main(String args[])throws ParseException
	{
	ArrayList one=new ArrayList();
	one.add("java 14");
	one.add("ios new");
	one.add("java 13");
	
	ArrayList two=new ArrayList();
	two.add("java 14");
	two.add("ios old");
	two.add("java 11");
	
	ArrayList three=new ArrayList();
	three.add("java 10");
	three.add("ios veryold");
	three.add("java 9");
	
	HashMap<String,ArrayList> map=new HashMap<String,ArrayList>();
	  map.put("2019",one);  
	  map.put("2018",two);  
	  map.put("2017",three); 
	  
	  Scanner in=new Scanner(System.in);
	  String search=in.nextLine();
	  int count=0;
	  
	  for(Map.Entry itr1:map.entrySet())
	  {
	 ArrayList<String> arr=(ArrayList) itr1.getValue();
	  if(itr1.getKey().equals(search)){System.out.println(itr1.getValue());count++;break;}
	  else if(arr.contains(search))
			 {System.out.println(itr1.getKey());count++;}
	 }
	  if(count==0) {System.out.println("The entered input does not exist");}
	}
	  }










//	  for(count=0;count<3;count++)
//	  {
//	  if(one[count].contains(search)) {
//	  hash1=one.toString();break;}
//	  if(three[count].contains(search)) {
//	  hash1=three.toString();break;}
//	  if(two[count].contains(search)) {
//	  hash1=two.toString();
//	  break;}
//	  }
////  System.out.println(hash1+"  "+one);
//	  for(Map.Entry m:map.entrySet())
//	  {    
////		  String name=String.valueOf(m.getValue());
////		  System.out.println(name+"   new");
//		  
//		
//	       if(m.getKey().equals(search)) {
//	    	   System.out.println(m.getValue());break;}
//	    	   if(m.getValue().toString().equals(hash1)) {
//	    		   System.out.println(m.getKey());break;
//    	   }
//	  }
//
//	}}