/**
 * 
 */
package com.springframework.PetClinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.PetClinic.Model.Owner;
import com.springframework.PetClinic.Model.Pet;
import com.springframework.PetClinic.Model.PetType;
import com.springframework.PetClinic.Model.Speciality;
import com.springframework.PetClinic.Model.Vet;
import com.springframework.PetClinic.Model.Visit;
import com.springframework.PetClinic.services.OwnerService;
import com.springframework.PetClinic.services.PetTypeService;
import com.springframework.PetClinic.services.SpecialityService;
import com.springframework.PetClinic.services.VetService;
import com.springframework.PetClinic.services.VisitService;

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
	private final VisitService visitService;


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
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		radiology = specialityService.save(radiology);
		
		Speciality denistry = new Speciality();
		denistry.setDescription("Dentistry");
		denistry = specialityService.save(denistry);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		surgery = specialityService.save(surgery);
		
		Speciality anesthesia = new Speciality();
		anesthesia.setDescription("Surgery");
		anesthesia = specialityService.save(anesthesia);
		
		Speciality animalWelfare = new Speciality();
		animalWelfare.setDescription("Surgery");
		animalWelfare = specialityService.save(animalWelfare);
		
		Speciality internalMedicine = new Speciality();
		internalMedicine.setDescription("Surgery");
		internalMedicine = specialityService.save(internalMedicine);
		
		
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
		madhuspet.setOwner(owner1);
		owner1.getPets().add(madhuspet);
		
		ownerService.save(owner1);
		System.out.println("Owner Saved....");
		
		
		Visit dogVisit = new Visit();
		dogVisit.setPet(madhuspet);
		dogVisit.setDate(LocalDate.now());
		dogVisit.setDescription("Sneezy puppy");
		
		visitService.save(dogVisit);
		System.out.println("Visit saved for owner");
		
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
		surekhaspet.setOwner(owner2);
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
		
		
		vet1.getSpecialties().add(internalMedicine);
		vet1.getSpecialties().add(anesthesia);
		vet1.getSpecialties().add(radiology);

		vetService.save(vet1);
		System.out.println("Vet Saved ...");
		
		Vet vet2 = new Vet();
//		vet2.setId(2L);
		vet2.setFirstName("Katherine");
		vet2.setLastName("Perkowski");
		
		vet2.getSpecialties().add(internalMedicine);
		vet2.getSpecialties().add(animalWelfare);
		vet2.getSpecialties().add(denistry);
		
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

	/**
	 * @param ownerService
	 * @param vetService
	 * @param petTypeService
	 * @param specialityService
	 * @param visitService
	 */
	@Autowired
	public DataLoad(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialityService, VisitService visitService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}

}
