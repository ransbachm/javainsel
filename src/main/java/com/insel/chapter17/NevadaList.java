package com.insel.chapter17;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class NevadaList {
	public static void main(String [] args) {
		
		List<String> list1 = Arrays.asList("Vicetone", "Nevada", "Cozi Zuehlsdorff", "Monstercat");
		 System.out.println(list1.getClass());
		 // list.clear(); can't change because adapter
		 // therefore convert to real list
		 List<String> list2 = new LinkedList<>(list1);
		 list2.add("Caramelldansen"); 
		 Collections.addAll(list2, "Alles neu");
		 System.out.println(list2);
		 
		 list2 = list2.stream() // reverse every string in list
		 	.map(StringBuilder::new)
		 	.map(StringBuilder::reverse)
		 	.map(StringBuilder::toString)
		 	.collect(Collectors.toList());
		 
		 // use iterator
		 ListIterator<String> iterator = list2.listIterator();
		 iterator.add("##PneumaticTokyo##");
		 iterator.next();
		 iterator.remove();
		 
		 String[] s = list2.toArray(new String[list2.size()]); 
		 
		 /*
		  * Do not confuse the type of an Arrray with the type of it's content
		  * toArray() -> Object[] returns an Object[] this is an array of objects
		  * This array can cointain Strings because they are Objects
		  * The Array is still of type Object
		  * Its not possible to cast that to a String[] because an Object is not a String
		  * Therefore you would have to create a new Array of type String[]
		  * 
		  * This is why there is toArray(T[] a) -> T[]
		  * This method uses Reflection, you can give it an Array of the desired return type
		  * and it will give you an array of the same type as return value
		  * 
		  * If you match the sizes, the method will just use the array you gave it
		  * This is better for performance
		  */
		 
		 System.out.println(Arrays.toString(s));
		 
	}

}
