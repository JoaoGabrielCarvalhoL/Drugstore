package br.com.carv.drugstore.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.carv.drugstore.domain.State;

public class StateDaoTest {
	
	@Test
	@Ignore
	public void save() {
		
		State state = new State();
		state.setNameState("São Paulo");
		state.setAcronymsState("SP");
		
		StateDao stateDao = new StateDao();
		stateDao.save(state);
	}
	
	@Test
	@Ignore
	public void toList() {
		StateDao stateDao = new StateDao();
		List<State> states = stateDao.toList();
		
		for (State state : states) {
			System.out.println("State:" + state.getNameState() + " - Acronym:" + state.getAcronymsState());
		}
		
	}
	
	@Test
	@Ignore
	public void findById() {
		
		Long id = 15L;
		
		StateDao stateDao = new StateDao(); 
		State state = stateDao.findById(id);
		
		if (state != null) {
			System.out.println("State: " + state.getNameState() + " Acronym: " + state.getAcronymsState());
		}else {
			System.out.println("No records found");
		}
	
	}
	
	@Test
	@Ignore
	public void delete() {
		Long id = 2L;
		
		StateDao stateDao = new StateDao(); 
		State state = stateDao.findById(id);
		
		if(state != null) {
			System.out.println("State: " + state.getNameState() + " Acronym: " + state.getAcronymsState()); 
			stateDao.deleteEntity(state);
			System.out.println("Successfully deleted state");
		}else {
			System.out.println("No records found");
		}
		
	}
	
	@Test
	@Ignore
	public void update() {
		Long id = 1L; 
		StateDao stateDao = new StateDao(); 
		State state = stateDao.findById(id); 
		
		if (state != null) {
			System.out.println("State: " + state.getNameState() + " Acronym: " + state.getAcronymsState());
			state.setNameState("São Paulo");
			state.setAcronymsState("SP");
			stateDao.updateEntity(state);
			System.out.println("State update: ");
			System.out.println("State: " + state.getNameState() + " Acronym: " + state.getAcronymsState());
		}else {
			System.out.println("No records found");
		}
		
	}
	
}
