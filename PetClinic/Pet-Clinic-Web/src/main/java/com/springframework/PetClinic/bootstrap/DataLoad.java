/**
 * 
 */
package com.springframework.PetClinic.bootstrap;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.Model.Pet;
import com.springframework.PetClinic.Model.PetType;
import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.services.OwnerService;
import com.springframework.PetClinic.services.PetService;
import com.springframework.PetClinic.services.PetTypeService;
import com.springframework.PetClinic.services.VetService;
import com.springframework.PetClinic.services.map.OwnerServiceMap;
import com.springframework.PetClinic.services.map.PetServiceMap;
import com.springframework.PetClinic.services.map.VetServiceMap;

/**
 * @author Madhu
 *
 */
@Component
public class DataLoad implements CommandLineRunner {

	private final OwnerService ownerService;
	//private final PetService petService;
	private final VetService vetService;
	private final PetTypeService petTypeService;


	/**
	 * @param ownerService
	 * @param vetService
	 * @param petTypeService
	 */
	public DataLoad(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}


	@Override
	public void run(String... args) throws Exception {

		
		PetType dog = new PetType();
		dog.setName("Dog");
		dog = petTypeService.save(dog);
		System.out.println("Dog Pet Type Created...");
		
		PetType cat = new PetType();
		cat.setName("Cat");
		cat = petTypeService.save(cat);
		System.out.println("Cat Pet Type Created...");
		
		
		Owner owner1 = new Owner();
//		owner1.setId(1L);
		owner1.setFirstName("Madhu");
		owner1.setLastName("Ram");
		owner1.setAddress("2350 Club Meridian Dr");
		owner1.setCity("Okemos");
		owner1.setTelephone("517-507-9422");
		
		Pet madhuspet = new Pet();
		madhuspet.setPetType(dog);
		madhuspet.setName("Brownie");
		madhuspet.setBirthDate(LocalDate.now());
		owner1.getPets().add(madhuspet);
		
		ownerService.save(owner1);
		System.out.println("Owner Saved....");
		
		Owner owner2 = new Owner();
//		owner2.setId(2L);
		owner2.setFirstName("Surekha");
		owner2.setLastName("Veera");
		owner2.setAddress("2350 Club Meridian Dr");
		owner2.setCity("Okemos");
		owner2.setTelephone("517-455-9202");
		
		Pet surekhaspet = new Pet();
		surekhaspet.setPetType(cat);
		surekhaspet.setName("Lucky");
		surekhaspet.setBirthDate(LocalDate.now());
		owner2.getPets().add(surekhaspet);
		
		ownerService.save(owner2);
		
		System.out.println("Owner Saved....");
		
		Vet vet1 = new Vet();
//		vet1.setId(1L);
		vet1.setFirstName("John");
		vet1.setLastName("Doolittle");
		vetService.save(vet1);
		System.out.println("Vet Saved ...");
		
		Vet vet2 = new Vet();
//		vet2.setId(2L);
		vet2.setFirstName("Pet");
		vet2.setLastName("Doctor");
		vetService.save(vet2);
		System.out.println("Vet Saved....");
		
		for(Vet v : vetService.findAll()) {
			System.out.println(v.getFirstName());
		}

	}

}
