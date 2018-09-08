package util;

import java.util.Comparator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

public class Comparador implements Comparator{

	public int compare(Object o1, Object o2) {
		if (o1 instanceof EClass && o2 instanceof EClass) {
			EClass item1 = (EClass) o1;
			EClass item2 = (EClass) o2;
			return item1.getName().compareTo(item2.getName());
		}
		if (o1 instanceof EAttribute && o2 instanceof EAttribute) {
			EAttribute item1 = (EAttribute) o1;
			EAttribute item2 = (EAttribute) o2;
			return item1.getName().compareTo(item2.getName());
		}
		return 0;
	}
	
}
