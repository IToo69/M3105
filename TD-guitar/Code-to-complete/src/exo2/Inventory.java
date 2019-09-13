package exo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
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

	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> searchGuitars = new ArrayList<>();
		for (Guitar guitar : guitars) {
			boolean filterBack = false;
			boolean filterTop = false;
			boolean filterModel = false;
			boolean filterType = false;
			boolean filterBuilder = false;

			filterBack = !isFilter(searchGuitar.getBackWood())
					|| Objects.equals(guitar.getBackWood(), searchGuitar.getBackWood());

			filterTop = !isFilter(searchGuitar.getTopWood())
					|| Objects.equals(guitar.getTopWood(), searchGuitar.getTopWood());

			filterModel = !isFilter(searchGuitar.getModel())
					|| Objects.equals(guitar.getModel(), searchGuitar.getModel());

			filterType = !isFilter(searchGuitar.getType()) || Objects.equals(guitar.getType(), searchGuitar.getType());

			filterBuilder = !isFilter(searchGuitar.getBuilder())
					|| Objects.equals(guitar.getBuilder(), searchGuitar.getBuilder());

			if (filterBack && filterTop && filterModel && filterType && filterBuilder) {
				searchGuitars.add(guitar);
			}

		}
		return searchGuitars;
	}

	private boolean isFilter(Object value) {
		return Objects.nonNull(value) && !"".equals(value.toString());
	}

}
