package exo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Inventory {
	
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		guitars.add(new Guitar(serialNumber, price, guitarSpec));
	}

	public Guitar getGuitar(String serialNumber) {
		Iterator<Guitar> iterator = guitars.iterator();
		Guitar guitarFound = null;
		while (Objects.isNull(guitarFound) && iterator.hasNext()) {
			Guitar currentGuitar = iterator.next();
			if (currentGuitar.getSerialNumber().equals(serialNumber)) {
				guitarFound = currentGuitar;
			}
		}
		return guitarFound;
	}

	public List<Guitar> search(GuitarSpec searchGuitar) {
		
		List<Guitar> searchGuitars = new ArrayList<>();
		for (Guitar guitar : guitars) {
			GuitarSpec spec = guitar.getGuitarSpec();
			if(spec.matches(searchGuitar)){
				searchGuitars.add(guitar);
			}
		}
		return searchGuitars;
	}

	private boolean isFilter(Object value) {
		return Objects.nonNull(value) && !"".equals(value.toString());
	}

	public void addInstrument(Guitar guitar) {
		// TODO Auto-generated method stub
		
	}
	
}
