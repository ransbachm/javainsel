package com.insel.chapter10;

import java.awt.Color;
import java.util.Arrays;

public class Vocaloid implements Cloneable {
	
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
	Vocaloid(Vocaloid oV) {
		this.no = oV.no;
		this.likesLeek = oV.likesLeek;
		this.color = oV.color;
		this.height = oV.height;
		this.firstLetter = oV.firstLetter;
		this.dateThatIFoundInWikiInUnixTime = oV.dateThatIFoundInWikiInUnixTime;
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
				if(oV.color.equals(this.color))
					if(oV.height == this.height)
						if(oV.firstLetter == this.firstLetter)
							if(oV.dateThatIFoundInWikiInUnixTime == this.dateThatIFoundInWikiInUnixTime)
								return true;
		return false;
	}
	
	@Override public String toString() {
		return ("Vocaloid: [no:"+no+"]["+firstLetter+"]["+height+"]");
	}
	
		@Override public Vocaloid clone() {
			try {
				return (Vocaloid) super.clone();
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}
		
	public static void main(String [] args) {
		Vocaloid miku = new Vocaloid(01, true, Color.cyan, 1.58, 'M', 1188511200);
		Vocaloid rin = new Vocaloid(02, false, Color.orange, 1.52, 'R', 1190844000);
		Vocaloid len = new Vocaloid(02, false, Color.yellow, 1.56, 'L', 1190844000);
		
		Vocaloid rin2 = new Vocaloid(rin);
		Vocaloid miku2 = miku.clone();
		
		
		System.out.printf("Hash Codes:%nMiku %s%nRin %s%nLen %s%n%n", miku.hashCode(), rin.hashCode(), len.hashCode());
		System.out.printf("Miku == Miku : %b%n", miku.equals(miku));
		System.out.printf("Miku == Rin : %b%n", miku.equals(rin));
		System.out.printf("Rin == Miku : %b%n", rin.equals(miku));
		System.out.printf("Len == Rin : %b%n", len.equals(rin)); //Irgendwie schon...
		System.out.printf("Rin2 == Rin : %b%n", rin2.equals(rin));
		System.out.printf("Miku2 == Rin2 : %b%n%n", miku2.equals(rin2));
		
		Vocaloid[] lineup = {rin, len, miku, miku, len, rin};
		Arrays.sort(lineup, new VocaloidComparator());
		System.out.println(Arrays.toString(lineup));
	}
	

}
