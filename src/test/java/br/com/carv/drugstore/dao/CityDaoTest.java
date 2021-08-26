package br.com.carv.drugstore.dao;

import org.junit.Test;

import br.com.carv.drugstore.domain.*;

public class CityDaoTest {

	@Test
	public void save() {
	
		StateDao stateDao = new StateDao(); 
		State state = stateDao.findById(1L);
		
		City city = new City(); 
		city.setNameCity("Ourinhos");
		city.setState(state);
		
		CityDao cityDao = new CityDao();
		cityDao.save(city);
		
	}
}
