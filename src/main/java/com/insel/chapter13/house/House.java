package com.insel.chapter13.house;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.EventListenerList;

public class House {
	private EventListenerList listeners = new EventListenerList();
	private List<Appliance> appliances = new ArrayList<>();
	public static void main(String [] args) {
		
		House h = new House();
		Appliance radio = new Radio();
		Appliance tv = new TV();
		
		h.addEventListener(null, new ApplianceModifyListener());
		
		h.add(radio);
		h.add(tv);
		
	}
	public void add(Appliance a) {
		appliances.add(a);
		notifyListeners(new ApplianceEvent(this, a));
	}
	protected synchronized void notifyListeners(ApplianceEvent a) {
		for(ApplianceListener l : listeners.getListeners(ApplianceListener.class)) {
			l.modify(a);
		}
	}
	
	public void addEventListener(Object Source, ApplianceListener listener) {
		listeners.add(ApplianceListener.class, listener);
	}
	
	

}
