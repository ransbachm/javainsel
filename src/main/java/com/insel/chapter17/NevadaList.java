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
		 
		 //use iterator
		 ListIterator<String> iterator = list2.listIterator();
		 iterator.add("##PneumaticTokyo##");
		 iterator.next();
		 iterator.remove();
		 
		 String[] s = list2.toArray(new String[list2.size()]);
		 
		 System.out.println(Arrays.toString(s));
		 
	}

}
