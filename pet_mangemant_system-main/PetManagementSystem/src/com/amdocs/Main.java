
package com.amdocs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		System.out.println(JDBCConnection.getConnection());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		petData pd = new petData();
		Pet pet = new Pet();
		Boolean f= true;
//		int minPrice;
		while(f) {
			System.out.println("1. Add a Pet");
			System.out.println("2. Display all pets");
			System.out.println("3. Update a Pet");
			System.out.println("4. Delete a Pet");
			System.out.println("5. Search a Pet By Id");
//			System.out.println("6. Find by Price");
			System.out.println("6. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				
//				System.out.print("Enter Pet ID: ");
//				pet.setPetId(sc.nextInt());		
				
			    System.out.print("Enter Pet Category: ");
			    pet.setPetCat(br.readLine());
			    
			    System.out.print("Enter Pet Type: ");
			    pet.setPetType(br.readLine());
			    
			    System.out.print("Enter Pet Color: ");
			    pet.setPetColor(br.readLine());
			    
			    System.out.print("Enter Pet age: ");
			    pet.setPetAge(sc.nextInt());
			    
			    System.out.print("Enter pet price: ");
			    pet.setPetPrice(sc.nextDouble());
			    
			    System.out.print("Enter pet Vaccination: ");
			    pet.setPetVac(sc.nextBoolean());
			    
			    System.out.print("Enter pet Food habit: ");
			    pet.setPetFh(br.readLine());
			    
			    pd.insertPet(pet);
			    break;
			case 2:

				List<Pet> allPets = pd.getAllPets();

				for (Pet pets : allPets) {
				    System.out.println("Pet ID: " + pets.getPetId());
				    System.out.println("Pet Category: " + pets.getPetCat());
				    System.out.println("Pet Type: " + pets.getPetType());
				    System.out.println("Pet Color: " + pets.getPetColor());
				    System.out.println("Pet Age: " + pets.getPetAge());
				    System.out.println("Pet Price: " + pets.getPetPrice());
				    System.out.println("Pet Vaccination: " + pets.getPetVac());
				    System.out.println("Pet Food Habit: " + pets.getPetFh());
				   
				    System.out.println("--------------------------");
				}
				break;
			case 3:
  				System.out.print("Enter Pet ID that you want to update: ");
  				pet.setPetId(sc.nextInt());
  				
  				System.out.print("Enter Pet Category : ");
  				pet.setPetCat(br.readLine());
  				
  				System.out.print("Enter Pet Type : ");
  				pet.setPetType(br.readLine());
  				
  				System.out.print("Enter Pet Color :");
  				pet.setPetColor(br.readLine());
  				
  				System.out.print("Enter Pet Age: ");
  				pet.setPetAge(sc.nextInt());
  				
  				System.out.print("Enter Pet Price: ");
  				pet.setPetPrice(sc.nextDouble());
  				
  				System.out.print("Enter Pet Vaccination: ");
  				pet.setPetVac(sc.nextBoolean());
  				
  				System.out.print("Enter Pet Food habit: ");
  				pet.setPetFh(br.readLine());
  				
  				
  				pd.updatePet(pet);
  				break;
  				
			case 4:
				System.out.print("Enter Pet ID that you want to Delete: ");
				pd.deletePet(sc.nextInt());
  				
  				break;
			case 5:
				System.out.print("Enter Pet ID which you want to search: ");
				List<Pet> petDet = pd.search(sc.nextInt());

				for (Pet pets : petDet) {
				    System.out.println("Pet ID: " + pets.getPetId());
				    System.out.println("Pet Category: " + pets.getPetCat());
				    System.out.println("Pet Type: " + pets.getPetType());
				    System.out.println("Pet Color: " + pets.getPetColor());
				    System.out.println("Pet Age: " + pets.getPetAge());
				    System.out.println("Pet Price: " + pets.getPetPrice());
				    System.out.println("Pet Vaccination: " + pets.getPetVac());
				    System.out.println("Pet Foor Habit: " + pets.getPetFh());
				   
				    System.out.println("--------------------------");
				}
				break;
			case 6:
				f=false;
				break;
				
//			case 7:
//				System.out.println("Enter minimum Price");
//				int minprice = sc.nextInt();
//				break;
			    
			}
			
			
		}
		sc.close();
	}
}
