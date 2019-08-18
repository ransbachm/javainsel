package com.insel.chapter10;

public enum Rating {
	SS, S, A, B, C, D, F;
	
	static int[] limits = {100, 98, 95, 85, 75, 60};
	
	public static Rating getRating(int score) {
		//Check if score is valid (0<=score<=100)
		if(score<0 || score > 100) {
			throw new IndexOutOfBoundsException("Score to high or low " + score);
		}
		//Find according score
		for(int i=0; i < Rating.limits.length; i++) {
			if(score>=limits[i]) {
				return Rating.values()[i];
			} 
		}
		return F;
	}
	
	public String getColor() {
		switch(this) {
		case SS: return "Gold";
		case S: return "Gold";
		case A: return "Green";
		case B: return "Blue";
		case C: return "Purple";
		case F: return "Red";
		default: return null;
		}
	}
	
	
	public static void main(String [] args) {
		System.out.println(Rating.A); // toString()
		System.out.println(Rating.F.name()); //name()
		System.out.println(Rating.valueOf("C").name()); //valueOf(String) + name()
		System.out.println(Enum.valueOf(Rating.class, "SS")); // valueOf(Class, String) + toString()
		
		System.out.println("\nAll values:");
		for(Rating r: Rating.values()) {
			System.out.printf("[%s|%s] ", r.name(), r.ordinal());
		}
		Rating st1 = Rating.getRating(50);
		Rating nd2 = Rating.getRating(79);
		
		System.out.println("\n\nScore: " + st1 + " " + st1.getColor());
		System.out.println("Score: " + nd2 + " " + nd2.getColor());
	}
}
