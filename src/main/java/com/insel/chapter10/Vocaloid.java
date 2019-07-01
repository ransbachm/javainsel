package com.insel.chapter10;

import java.awt.Color;

public class Vocaloid {
	
	int no;
	boolean likesLeek;
	Color color;
	double height;
	char firstLetter;
	long dateThatIFoundInWikiInUnixTime; 
	
	Vocaloid(int no, boolean likesLeek, Color color, double height, char firstLetter, long date) {
		this.no = no;
		this.likesLeek = likesLeek;
		this.color = color;
		this.height = height;
		this.firstLetter = firstLetter;
		this.dateThatIFoundInWikiInUnixTime = date;
	}
	
	
	@Override public int hashCode () {
		
		int prime = 31; //Found no interesting prime number 1337, 39, 2007
		int res = no;
		res *= prime + (likesLeek ? 1231 : 1237);
		res *= prime + color.hashCode();
		res *= prime + (int) (Double.doubleToLongBits(height) ^ (Double.doubleToLongBits(height)>>>32));
		res *= prime + (int) firstLetter;
		res *= prime + (int) dateThatIFoundInWikiInUnixTime ^ (dateThatIFoundInWikiInUnixTime >>> 32);
		return res;
	}
	
	@Override public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(o == this) {
			return true;
		}
		
		if(o.getClass() != this.getClass()) {
			return false;
		}
		
		Vocaloid oV = (Vocaloid) o;
		
		if(oV.no == this.no)
			if(oV.likesLeek == this.likesLeek)
				if(oV.color == this.color)
					if(oV.height == this.height)
						if(oV.firstLetter == this.firstLetter)
							if(oV.dateThatIFoundInWikiInUnixTime == this.dateThatIFoundInWikiInUnixTime)
								return true;
		return false;
	}
	
	public static void main(String [] args) {
		Vocaloid miku = new Vocaloid(01, true, Color.cyan, 1.58, 'M', 1188511200);
		Vocaloid rin = new Vocaloid(02, false, Color.orange, 1.52, 'R', 1190844000);
		Vocaloid len = new Vocaloid(02, false, Color.yellow, 1.56, 'L', 1190844000);
		
		
		
		System.out.printf("Hash Codes:%nMiku %s%nRin %s%nLen %s%n%n", miku.hashCode(), rin.hashCode(), len.hashCode());
		System.out.printf("Miku == Miku : %b%n", miku.equals(miku));
		System.out.printf("Miku == Rin :  %b%n", miku.equals(rin));
		System.out.printf("Rin == Miku :  %b%n", rin.equals(miku));
		System.out.printf("Len == Rin :  %b", len.equals(rin)); //Irgendwie schon...
		
		
	}
	

}
