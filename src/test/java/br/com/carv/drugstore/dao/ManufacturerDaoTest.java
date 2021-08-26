package br.com.carv.drugstore.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.carv.drugstore.domain.Manufacturer;

public class ManufacturerDaoTest {

	@Test
	@Ignore
	public void save() {
		
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setDescription("Test");
		
		ManufacturerDao manufacturerDao = new ManufacturerDao();
		manufacturerDao.save(manufacturer);
	}
	
	@Test
	@Ignore
	public void toList() {
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		List<Manufacturer> manufactures = manufacturerDao.toList(); 
		
		for (Manufacturer obj : manufactures) {
			System.out.println("Id: " + obj.getId() + " Description: " + obj.getDescription());
		}
		
	}
	
	@Test
	@Ignore
	public void findById() {
		Long id = 5L; 
		
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		Manufacturer manufacturer = new Manufacturer(); 
		
		manufacturer = manufacturerDao.findById(id); 
		
		if(manufacturer != null) {
			System.out.println("Id: " + manufacturer.getId() + " Description: " + manufacturer.getDescription()); 
		}else {
			System.out.println("No records found");
		}
	}
	
	@Test
	@Ignore
	public void delete() {
		
		Long id = 1L; 
		
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		Manufacturer manufacturer = new Manufacturer(); 
		
		manufacturer = manufacturerDao.findById(id); 
		
		if (manufacturer != null) {
			System.out.println("Manufacturer to be deleted: "); 
			System.out.println("Id: " + manufacturer.getId() + " Description: " + manufacturer.getDescription()); 
			manufacturerDao.deleteEntity(manufacturer);
			System.out.println("Successfully deleted manufacturer");
		}else {
			System.out.println("No records found");
		}
	}
	
	
	@Test
	@Ignore
	public void update() {
		Long id = 10L; 
		
		ManufacturerDao manufacturerDao = new ManufacturerDao(); 
		Manufacturer manufacturer = new Manufacturer();
		manufacturer = manufacturerDao.findById(id); 
		
		if(manufacturer != null) {
			System.out.println("Manufacturer to be update: ");
			System.out.println("Id: " + manufacturer.getId() + " Description: " + manufacturer.getDescription()); 
			manufacturer.setDescription("Test two");
			manufacturerDao.updateEntity(manufacturer);
			System.out.println("Successfully update manufacturer");
			
		}
		else {
			System.out.println("No records found");
		}
	}
	
}
