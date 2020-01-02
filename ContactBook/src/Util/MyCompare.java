package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Helper.Contact;;

public class MyCompare implements Comparator
{
	
           public int compare(Object obj1,Object obj2) 
           { 
           	Map.Entry<Integer, Contact> o1=(Entry<Integer,Contact>) obj1;
               Map.Entry<Integer, Contact> o2=(Entry<Integer, Contact>) obj2;
               int num=(o1.getValue().getName().compareTo(o2.getValue().getName()));
               if(num==0)
               return 1;
               else
            	   return num;
           } 
       }
	


