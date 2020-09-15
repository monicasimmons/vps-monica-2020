package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner option = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        int userOption = 0;
        int userChoice = 0;

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        VirtualPet petToAdopt1 = new VirtualPet("Chase", "is on the case! His favorite color is blue.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        VirtualPet petToAdopt2 = new VirtualPet("Marshall", "is fired up! His favorite color is red.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        VirtualPet petToAdopt3 = new VirtualPet("Rocky", "doesn't lose it, he reuses it! His favorite color is green.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        VirtualPet petToAdopt4 = new VirtualPet("Zuma", "is ready to dive in! His favorite color is orange.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        VirtualPet petToAdopt5 = new VirtualPet("Skye", "wants to take to the sky! Her favorite color is pink.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
        VirtualPet petToAdopt6 = new VirtualPet("Rubble", "is on the double! His favorite color is yellow.", (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));

        myVirtualPetShelter.addPet(petToAdopt1);
        myVirtualPetShelter.addPet(petToAdopt2);
        myVirtualPetShelter.addPet(petToAdopt3);
        myVirtualPetShelter.addPet(petToAdopt4);
        myVirtualPetShelter.addPet(petToAdopt5);
        myVirtualPetShelter.addPet(petToAdopt6);

        System.out.println("Thank you for visiting Monica's Virtual Pet Shelter!\n");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Welcome, " + userName + ". What is your reason for visiting today?\n");
        System.out.println("Press 1 if you are volunteering.");
        System.out.println("Press 2 if you want to adopt a pet.");
        System.out.println("Press 3 if you want to admit a pet.");
        System.out.println("Press 4 if you want to exit.\n");
        userOption = option.nextInt();
        option.nextLine();

        while (userOption != 4) {

            if (userOption == 1) {
                System.out.println(" ");
                System.out.println("Thank you for volunteering! The pets are excited that you're here.\n");
                System.out.println("These are the pets we have in the shelter today:\n");
                myVirtualPetShelter.showPetStatus();

                do {
                    System.out.println("");
                    System.out.println("What would you like to do?\n");
                    System.out.println("Press 1 to feed all pets.");
                    System.out.println("Press 2 to give water to all pets.");
                    System.out.println("Press 3 to choose a pet to play with.");
                    System.out.println("Press 4 to exit.");
                    userChoice = choice.nextInt();
                    choice.nextLine();

                    if (userChoice == 1) {
                        System.out.println(" ");
                        System.out.println("Thank you for choosing to feed these hungry pets!\n");
                        System.out.println("How many cups of food do you want to feed each pet?");
                        int amountToFeed = choice.nextInt();
                        choice.nextLine();
                        myVirtualPetShelter.feed(amountToFeed);
                        System.out.println("Here are the pets' updated statuses:\n");
                        myVirtualPetShelter.showPetStatus();

                    } else if (userChoice == 2) {
                        System.out.println("Thank you for choosing to give water to these thirsty pets!\n");
                        System.out.println("How many cups of water do you want to give each pet?");
                        int amountOfWaterToGive = choice.nextInt();
                        choice.nextLine();
                        myVirtualPetShelter.giveWaterTo(amountOfWaterToGive);
                        System.out.println("Here are the pets' updated statuses:\n");
                        myVirtualPetShelter.showPetStatus();

                    } else if (userChoice == 3) {
                        System.out.print("Thank you for choosing to play with a pet!\n");
                        System.out.println("Which pet would you like to play with?");
                        String petToPlayWith = choice.nextLine();
                        System.out.println("How many minutes do you want to play?");
                        int amountOfTimeToPlay = choice.nextInt();
                        choice.nextLine();
                        myVirtualPetShelter.playWith(petToPlayWith, amountOfTimeToPlay);
                        System.out.println("Here are the pets' updated statuses:\n");
                        myVirtualPetShelter.showPetStatus();

                    } else if (userChoice == 4) {
                        System.out.println("Thank you for volunteering today!");
                        System.exit(0);
                    }
                } while (userChoice != 4);

            } else if (userOption == 2) {
                System.out.println(" ");
                System.out.println("Thank you for wanting to adopt a pet! We have many great animals for you to choose from!\n");
                myVirtualPetShelter.showPetNameDescription();
                System.out.println(" ");
                System.out.println("Which pet are you interested in adopting?");
                String adoptedPet = option.nextLine();
                System.out.println(" ");
                System.out.println("You are going to love " + adoptedPet + "!");
                myVirtualPetShelter.removePet(myVirtualPetShelter.findPet(adoptedPet));
                System.out.println("Congratulations! Your adoption is now complete!\n");
                System.out.println("These are the remaining pets in the shelter.\n");
                myVirtualPetShelter.showPetStatus();

            } else if (userOption == 3) {
                System.out.println("Thank you for bringing a pet into our shelter!\n");
                System.out.println("What is this pet's name? If you're not sure, be creative!");
                String newPetName = option.nextLine();
                System.out.println("Please write a description for " + newPetName + ".");
                String newPetDescription = option.nextLine();
                VirtualPet petToAdd = new VirtualPet(newPetName, newPetDescription, (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1), (int) (Math.random() * 99 + 1));
                myVirtualPetShelter.addPet(petToAdd);
                System.out.println("Congratulations! " + newPetName + " has been admitted!\n");
                System.out.println("Here is the status of all of the pets in the shelter:\n");
                myVirtualPetShelter.showFullStatusDetails();
            }
            myVirtualPetShelter.tick();

            System.out.println(" ");
            System.out.println("Press 1 if you want to volunteer.");
            System.out.println("Press 2 if you want to adopt a pet.");
            System.out.println("Press 3 if you want to admit a pet.");
            System.out.println("Press 4 if you want to exit.");
            userOption = option.nextInt();
            option.nextLine();
        }
        System.out.println("Thank you for visiting the shelter today!");
    }

}
