package com.insel.chapter10;

import java.util.Comparator;

public class VocaloidComparator implements Comparator<Vocaloid>  {
	
	@Override public boolean equals(Object o) {
		if(o==null) {
			return false;
		}
		if(o==this) {
			return true;
		}
		if(this.getClass() == o.getClass())
			return true;
		
		return false;
	}
	
	@Override public int compare(Vocaloid v1, Vocaloid v2) {
		return Double.compare(v1.height, v2.height);
		
	}

}
