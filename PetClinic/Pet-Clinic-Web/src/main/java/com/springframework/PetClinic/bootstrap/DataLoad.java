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
import com.springframework.PetClinic.Model.Speciality;
import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.services.OwnerService;
import com.springframework.PetClinic.services.PetService;
import com.springframework.PetClinic.services.PetTypeService;
import com.springframework.PetClinic.services.SpecialityService;
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
	private final SpecialityService specialityService;


	/**
	 * @param ownerService
	 * @param vetService
	 * @param petTypeService
	 * @param specialityService
	 */
	public DataLoad(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialityService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if(count == 0)
			loadData();
	}

	/**
	 * 
	 */
	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		dog = petTypeService.save(dog);
		System.out.println("Dog Pet Type Created...");
		
		PetType cat = new PetType();
		cat.setName("Cat");
		cat = petTypeService.save(cat);
		System.out.println("Cat Pet Type Created...");
		
		PetType parakket = new PetType();
		parakket.setName("Parekeet");
		parakket = petTypeService.save(parakket);
		System.out.println("Parekeet Pet Type Created...");
		
		Speciality speciality1 = new Speciality();
		speciality1.setDescription("Radiology");
		speciality1 = specialityService.save(speciality1);
		
		Speciality speciality2 = new Speciality();
		speciality2.setDescription("Dentistry");
		speciality2 = specialityService.save(speciality2);
		
		Speciality speciality3 = new Speciality();
		speciality3.setDescription("Surgery");
		speciality3 = specialityService.save(speciality3);
		
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
		surekhaspet.setPetType(parakket);
		surekhaspet.setName("Lucky");
		surekhaspet.setBirthDate(LocalDate.now());
		owner2.getPets().add(surekhaspet);
		
		ownerService.save(owner2);
		
		System.out.println("Owner Saved....");
		
 		Owner owner3 = new Owner();
		owner3.setFirstName("Mahesh");
		owner3.setLastName("Shan");
		owner3.setAddress("2350 Club Meridian Dr");
		owner3.setCity("Okemos");
		owner3.setTelephone("517-507-9422");
		
		Pet maheshsPet = new Pet();

		maheshsPet.setPetType(parakket);
		maheshsPet.setName("Brownie");
		maheshsPet.setBirthDate(LocalDate.now());
		owner3.getPets().add(maheshsPet);
		
		ownerService.save(owner3);
		System.out.println("Owner Saved....");
		
		Vet vet1 = new Vet();
//		vet1.setId(1L);
		vet1.setFirstName("John");
		vet1.setLastName("Doolittle");
		
		
		Speciality johnsSpeciality1 = new Speciality();
		johnsSpeciality1.setDescription("Animal Welfare");
		
		Speciality johnsSpeciality2 = new Speciality();
		johnsSpeciality2.setDescription("Anesthesia");
		
		vet1.getSpecialties().add(johnsSpeciality1);
		vet1.getSpecialties().add(johnsSpeciality2);
		vet1.getSpecialties().add(speciality1);

		vetService.save(vet1);
		System.out.println("Vet Saved ...");
		
		Vet vet2 = new Vet();
//		vet2.setId(2L);
		vet2.setFirstName("Katherine");
		vet2.setLastName("Perkowski");
		
		Speciality katesSpeciality1 = new Speciality();
		katesSpeciality1.setDescription("Animal Welfare");
		
		Speciality katesSpeciality2 = new Speciality();
		katesSpeciality2.setDescription("Internal Medicine");
		
		vet2.getSpecialties().add(katesSpeciality1);
		vet2.getSpecialties().add(katesSpeciality2);
		vet2.getSpecialties().add(speciality2);
		
		vetService.save(vet2);
		System.out.println("Vet Saved....");
		
		ownerService.findAll().forEach(owner -> {
			System.out.println(owner.getFirstName() +" "+owner.getLastName());
			owner.getPets().forEach(pet ->{
				System.out.println("\t" + pet.getName() + " " + pet.getPetType().getName());
			});
		});
		
		for(Vet v : vetService.findAll()) {
			System.out.println(v.getFirstName());
			v.getSpecialties().forEach(s -> {
				System.out.println("------->"+ s.getDescription());
			});
		}
	}

}
