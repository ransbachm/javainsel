package com.insel.chapter11;

enum Coin {
	e500(50000), e200(20000), e100(10000), e50(5000), e20(2000), e10(1000), e5(500), e2(200), e1(100),
	c50(50), c20(20), c10(10), c5(5), c2(2), c1(1);
	
	public final int value;
	
	Coin(int value) {
		this.value = value;
	}
	
	int getValue() {
		return value;
	}

}
