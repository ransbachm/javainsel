package com.insel.chapter12.lambdaChaos;

public interface Feedable {
	@SuppressWarnings("serial")
	class CatDoesNotLikeYourFoodException extends Exception {};
	
	public void run() throws CatDoesNotLikeYourFoodException; 
	
	public static Runnable asUncheckedRunnable(Feedable fa) {
		//in non example context just return it
		Runnable r = () -> {
			try {
				//The object has access even after this method is finnished #1
				System.out.println("Second in (object)  " + fa);
				fa.run();
			} catch (CatDoesNotLikeYourFoodException e) {
				throw new RuntimeException(e);
			}
		};
		System.out.println("First (static)");
		return r;
		
	}
}
