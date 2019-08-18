package com.insel.chapter14;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class SpaceStation {
	private PropertyChangeSupport change = new PropertyChangeSupport(this);
	private VetoableChangeSupport vetos = new VetoableChangeSupport(this);
	private String name = "";

	public void setName(String name) throws PropertyVetoException {
		String oldName = this.name;
		vetos.fireVetoableChange("name", oldName, name);
		this.name = name;
		change.firePropertyChange("name", oldName, name);
	}

	public String getName() {
		return name;
	}

	public void addPropertyChangeListener(PropertyChangeListener l) {
		change.addPropertyChangeListener(l);
	}

	public void removePropertyChangeListner(PropertyChangeListener l) {
		change.removePropertyChangeListener(l);
	}
	
	public void addVetoableChangeListener(VetoableChangeListener l) {
		vetos.addVetoableChangeListener(l);
	}
	
	public void removeVetoableChangeListner(VetoableChangeListener l) {
		vetos.removeVetoableChangeListener(l);
	}

	public static void main(String[] args) throws PropertyVetoException {
		SpaceStation s = new SpaceStation();
		PropertyChangeListener l1 = (PropertyChangeEvent e) 
				-> System.out.printf("Change detected! : [%s] '%s' -> '%s'%n",
				e.getPropertyName(), e.getOldValue(), e.getNewValue());
		s.addPropertyChangeListener(l1);
		VetoableChangeListener vl1 = (PropertyChangeEvent e) 
				-> {
					if(((String) e.getNewValue()).contains("Russia")) {
						throw new PropertyVetoException("Oh, these Russians...", e);
					};
				};
		s.addVetoableChangeListener(vl1);
		s.setName("Something");//TODO CATCH
		s.setName("Nothing");
		try{
			s.setName("Russia");
		} catch(PropertyVetoException e) {
			System.out.println("The russians tried!");
		}
		s.setName("ISS");
	}

}
