package com.insel.chapter13.house;

import java.util.EventObject;

@SuppressWarnings("serial")
public class ApplianceEvent extends EventObject {

	public ApplianceEvent(Object source, Appliance a) {
		super(source);
		//TODO deal with a
	}

}
