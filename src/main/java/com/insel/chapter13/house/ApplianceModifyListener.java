package com.insel.chapter13.house;

public class ApplianceModifyListener implements ApplianceListener  {
	@Override public void modify(ApplianceEvent a) {
		System.out.println("I WAS ****** NOTIFYED!!!" + a.toString());
	}
}
