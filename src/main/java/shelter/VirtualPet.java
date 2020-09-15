package shelter;

public class VirtualPet {
    private String petName;
    private String petDescription;
    private int foodLevel;
    private int waterLevel;
    private int boredomLevel;

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }


    public VirtualPet(String petName, String petDescription, int foodLevel, int waterLevel, int boredomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.foodLevel = foodLevel;
        this.waterLevel = waterLevel;
        this.boredomLevel = boredomLevel;
    }

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
    }

    public void feed(int amountToFeed) {
        foodLevel += amountToFeed;
        waterLevel -= (amountToFeed * .50);
        boredomLevel -= (amountToFeed * .50);
    }

    public void giveWaterTo(int amountOfWaterToGive) {
        waterLevel += amountOfWaterToGive;
        foodLevel -= (amountOfWaterToGive * .20);
        boredomLevel -= (amountOfWaterToGive * .20);
    }

    public void playWith(int amountOfTimeToPlay) {
        boredomLevel -= amountOfTimeToPlay;
        foodLevel -= (amountOfTimeToPlay * .40);
        waterLevel -= (amountOfTimeToPlay * .40);
    }

    public void updateNeeds() {
        foodLevel -= 1;
        waterLevel -= 1;
        boredomLevel += 1;
    }
}

