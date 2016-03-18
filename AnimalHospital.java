import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnimalHospital {
	
	private ArrayList<Pet> pets;
	
	public AnimalHospital(String inputFile){
		//Scanner sc = new Scanner(System.in);
		pets = new ArrayList<Pet>();
		/** 
		 * first line: string: CAT/ DOG/ BIRD
		 * pet's name
		 * owner's name
		 * owner's email
		 * pet's color
		 * pet gender: "male" "female" "spayed" "neutered"
		 * hair length if cat; size if dog; (nothing for bird)
		 * END
		 */
	}
	
	public void categorize(ArrayList<String> petList){
		for(int i = 0; i < petList.size(); i++){
			ArrayList<String> onePet = new ArrayList<String>(Arrays.asList(petList.get(i).split("\n")));
		//}
		//for(String s: onePet){
			Pet tempPet;
			String type = onePet.get(0);
			switch(type){
			case "DOG":
				tempPet = new Dog();
				
			case "CAT":
				tempPet = new Cat();
				
			case "BIRD":
				tempPet = new Bird();
			}
			tempPet.setName(onePet.get(1));
			tempPet.setOwnerName(onePet.get(2));
			tempPet.setOwnerEmail(onePet.get(3));
			tempPet.setColor(onePet.get(4));
			tempPet.setGender(onePet.get(5));
			tempPet.setWeight(Integer.toString(onePet.get(6)));
		}
	}
	
	public ArrayList<String> parseStr(String whole){
		ArrayList<String> petList = new ArrayList<String>(Arrays.asList(whole.split("\n\n")));
		return petList;
	}
	
	public static String readFile(){
		String contents = "";
		try{
			FileInputStream infile = new FileInputStream("petData.txt");
			DataInputStream inputFile = new DataInputStream(infile);
			contents = inputFile.readUTF();
			inputFile.close();
		}
		catch(Exception FileNotFound){
			System.out.println("File not found.");
		}
		return contents;
		
	}
	public void printPetInfoByName(String name){
		for(Pet p: pets){
			if(p.getName() == name)
				p.printInfo();
		}
		
	}
	public void printPetInfoByOwner(String name){
		for(Pet p: pets){
			if(p.getOwnerName() == name)
				p.printInfo();
		}
	}
	public void printPetsBoarding(int month, int day, int year){
		
	}
}
