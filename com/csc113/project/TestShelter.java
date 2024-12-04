package com.csc113.project;

public class TestShelter {
//    public static void phase1() {
//        Scanner input = new Scanner(System.in);
//        Shelter s = new Shelter("Pets");
//        int option = 0;
//        Pet p = null; // name, age, gender
//        System.out.println("Welcome To " + s.getName() + " Shelter, May I know What you need ? (Enter The Number Of Option)");
//        System.out.println("------------------------------");
//        System.out.println("1. Add Pet \n2. Search Pet \n3. Adopt Pet \n4. Shelter Info \n0. Exit Shelter");
//        System.out.println("------------------------------");
//        System.out.println("Type your command.");
//        System.out.print(">: ");
//        option = input.nextInt();
//        while(option != 0) {
//            if(option == 1) {
//                System.out.println("--------------------------- Add Pet ---------------------------");
//                System.out.println("Choose The Type Of Pet: \n1. Cat \n2. Parrot \n3. Dog");
//                int PetType = input.nextInt();
//                if (PetType == 1) {
//                    System.out.println("Enter the Cat's Name, Age, Gender, Color And Trait(Personality)");
//                    String PetName = input.next();
//                    int PetAge = input.nextInt();
//                    String PetGender = input.next();
//                    String PetColor = input.next();
//                    String PetTrait = input.next();
//
//                    p = new Cat(PetName, PetAge, PetGender, PetColor, PetTrait);
//                }
//                else if (PetType == 2) {
//                    System.out.println("Enter the Parrot's Name, Age, Gender, TalkingAbility(true OR false) and Species");
//                    String PetName = input.next();
//                    int PetAge = input.nextInt();
//                    String PetGender = input.next();
//                    boolean PetTalkingAbility = input.nextBoolean();
//                    String PetSpecies = input.next();
//
//                    p = new Parrot(PetName, PetAge, PetGender, PetTalkingAbility, PetSpecies);
//                } else if (PetType == 3) {
//                    System.out.println("Enter the Dog's Name, Age, Gender, Size and Breed");
//                    String PetName = input.next();
//                    int PetAge = input.nextInt();
//                    String PetGender = input.next();
//                    String PetSize = input.next();
//                    String PetBreed = input.next();
//
//                    p = new Dog(PetName, PetAge, PetGender, PetSize, PetBreed);
//                }
//                if(p == null)
//                    System.out.println("No Pet is added. Try Again");
//                else {
//                    boolean add = s.addPet(p);
//                    if(add)
//                        System.out.println("Pet has been Added");
//                    else
//                        System.out.println("Sorry, There is Already Pet With same name. Try Again!");
//                    System.out.println("Type your command.");
//                    System.out.print(">: ");
//                    option = input.nextInt();
//                }
//            }
//            else if(option == 2) {
//                System.out.println("--------------------------- Search Pet ---------------------------");
//                System.out.println("Enter Pet's Name");
//                String PetName = input.next();
//                int petIndex = s.searchPet(PetName);
//                if(petIndex == -1)
//                    System.out.println("Pet Not Found.");
//                else {
//                    s.getPet(petIndex).displayInfo();;
//                    System.out.println("Type your command.");
//                    System.out.print(">: ");
//                    option = input.nextInt();
//                }
//            }
//            else if(option == 3) {
//                System.out.println("--------------------------- Adopt Pet ---------------------------");
//                if(s.getPetscount() == 0) {
//                    System.out.println("There is no Pets to adopt.");
//                    System.out.println("Type your command.");
//                    System.out.print(">: ");
//                    option = input.nextInt();
//                }
//                System.out.println("List Of Pets: ");
//                for(int i = 0; i < s.getPetscount(); i++) {
//                    System.out.println((i+1) + ". PetName: " + s.getPets()[i].getName());
//                }
//                System.out.println("Enter Number to Adopt Pet");
//                int PetIndex = input.nextInt() - 1;
//                if(PetIndex > s.getPetscount() || PetIndex < 0)
//                    System.out.println("Pet Not Found. Try Again!");
//                else {
//                    s.adoptPet(s.getPet(PetIndex));
//                    System.out.println("Pet has been Adopted !");
//                    System.out.println("Type your command.");
//                    System.out.print(">: ");
//                    option = input.nextInt();
//                }
//            }
//            else if(option == 4) {
//                System.out.println("--------------------------- " + s.getName() + " Shelter Information ---------------------------");
//                s.displayInfo();
//                System.out.println("Type your command.");
//                System.out.print(">: ");
//                option = input.nextInt();
//            }
//            else {
//                System.out.println("ERROR: incorrect command.");
//                System.out.print(">: ");
//                option = input.nextInt();
//            }
//        }
//        System.out.println("Goodbye.");
//    }

    
    public static void main(String[] args) {
		ShelterGUI s = new ShelterGUI();
		
	}
}
