package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet petToAdd) { pets.put(petToAdd.getPetName(), petToAdd);
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void removePet(VirtualPet pet) {
        pets.remove(pet.getPetName(), pet);
    }

    public void feed(int amountToFeed) {
        for (VirtualPet pet : pets.values()) {
            pet.feed(amountToFeed);
        }
    }

    public void giveWaterTo(int amountOfWaterToGive) {
        for (VirtualPet pet : pets.values()) {
            pet.giveWaterTo(amountOfWaterToGive);
        }
    }

    public void playWith(String petName, int amountOfTimeToPlay) {
        VirtualPet playWithAPet = findPet(petName);
        playWithAPet.playWith(amountOfTimeToPlay);
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.updateNeeds();
        }
    }

    public void showPetStatus() {
        String format = "%-10s %15s %15s %20s\n";
        System.out.format(format, "Name", "Food Level", "Water Level", "Boredom Level\n");
        for (VirtualPet pet : pets.values()) {
            String petName = pet.getPetName();
            int foodLevel = pet.getFoodLevel();
            int waterLevel = pet.getWaterLevel();
            int boredomLevel = pet.getBoredomLevel();
            System.out.format(format, petName, foodLevel, waterLevel, boredomLevel);
        }
    }

    public void showPetNameDescription() {
        String format = "%-10s %30s\n";
        System.out.format(format, "Name", "Description\n");
        for (VirtualPet pet : pets.values()) {
            String petName = pet.getPetName();
            String petDescription = pet.getPetDescription();
            System.out.format(format, petName, petDescription);
        }
    }

    public void showFullStatusDetails() {
        String format = "%-10s %50s %15s %15s %20s\n";
        System.out.format(format, "Name", "Description", "Food Level", "Water Level", "Boredom Level\n");
        for (VirtualPet pet : pets.values()) {
            String petName = pet.getPetName();
            String petDescription = pet.getPetDescription();
            int foodLevel = pet.getFoodLevel();
            int waterLevel = pet.getWaterLevel();
            int boredomLevel = pet.getBoredomLevel();
            System.out.format(format, petName, petDescription, foodLevel, waterLevel, boredomLevel);
        }
    }
}

