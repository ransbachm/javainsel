package com.insel.chapter12.lambdaChaos;

public class GenericCat implements Feedable {

	@Override
	public void run() throws CatDoesNotLikeYourFoodException {
		throw new CatDoesNotLikeYourFoodException();
	}
	
	public static void main(String [] args) {
		/* GenericCat new GenericCat() //cant compile -> unhandled exception
		 * GenericCat.run() 
		 * */
		
		Runnable cat = Feedable.asUncheckedRunnable(new GenericCat());
		cat.run();
	}

}
