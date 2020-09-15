package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet petToAdopt1;
    VirtualPet petToAdopt2;
    VirtualPet petToAdopt3;
    VirtualPet petToAdopt4;
    VirtualPet petToAdopt5;
    VirtualPet petToAdopt6;

    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        petToAdopt1 = new VirtualPet("Chase", "is on the case! His favorite color is blue.", 40, 30, 60);
        petToAdopt2 = new VirtualPet("Marshall", "is fired up! His favorite color is red.", 30, 60, 20);
        petToAdopt3 = new VirtualPet("Rocky", "doesn't lose it, he reuses it! His favorite color is green.", 50, 20, 70);
        petToAdopt4 = new VirtualPet("Zuma", "is ready to dive in! His favorite color is orange.", 20, 40, 30);
        petToAdopt5 = new VirtualPet("Skye", "wants to take to the sky! Her favorite color is pink.",60, 70, 50);
        petToAdopt6 = new VirtualPet("Rubble", "is on the double! His favorite color is yellow.",70, 50, 40);
    }

    @Test
    public void shouldBeAbleToAddAPet() {
        underTest.addPet(petToAdopt1);
        VirtualPet retrievedPet = underTest.findPet("Chase");
        assertEquals(retrievedPet, petToAdopt1);
    }

    @Test
    public void shouldBeAbleToAddTwoPets() {
        underTest.addPet(petToAdopt1);
        underTest.addPet(petToAdopt2);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(petToAdopt1, petToAdopt2));
    }

    @Test
    public void shouldBeAbleToAddThreePets() {
        underTest.addPet(petToAdopt1);
        underTest.addPet(petToAdopt2);
        underTest.addPet(petToAdopt3);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(petToAdopt1, petToAdopt2, petToAdopt3));
    }

    @Test
    public void shouldBeAbleToAddFourPets() {
        underTest.addPet(petToAdopt1);
        underTest.addPet(petToAdopt2);
        underTest.addPet(petToAdopt3);
        underTest.addPet(petToAdopt4);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(petToAdopt1, petToAdopt2, petToAdopt3, petToAdopt4));
    }

    @Test
    public void shouldBeAbleToAddFivePets() {
        underTest.addPet(petToAdopt1);
        underTest.addPet(petToAdopt2);
        underTest.addPet(petToAdopt3);
        underTest.addPet(petToAdopt4);
        underTest.addPet(petToAdopt5);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(petToAdopt1, petToAdopt2, petToAdopt3, petToAdopt4, petToAdopt5));
    }

    @Test
    public void shouldBeAbleToAddSixPets() {
        underTest.addPet(petToAdopt1);
        underTest.addPet(petToAdopt2);
        underTest.addPet(petToAdopt3);
        underTest.addPet(petToAdopt4);
        underTest.addPet(petToAdopt5);
        underTest.addPet(petToAdopt6);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets, containsInAnyOrder(petToAdopt1, petToAdopt2, petToAdopt3, petToAdopt4, petToAdopt5, petToAdopt6));
    }

    @Test
    public void shouldBeAbleToRemoveAPet() {
        underTest.addPet(petToAdopt1);
        underTest.removePet(petToAdopt1);
        VirtualPet retrievedPet = underTest.findPet("Chase");
        assertEquals(retrievedPet, null);
    }

    @Test
    public void feedShouldIncreaseFoodLevelBy10() {
        underTest.addPet(petToAdopt1);
        underTest.feed(10);
        assertEquals(petToAdopt1.getFoodLevel(), 50);
    }


    @Test
    public void giveWaterToShouldIncreaseWaterLevelBy10() {
        underTest.addPet(petToAdopt1);
        underTest.giveWaterTo(10);
        assertEquals(petToAdopt1.getWaterLevel(), 40);
    }

    @Test
    public void playWithShouldDecreaseBoredomLevelBy10() {
        underTest.addPet(petToAdopt1);
        underTest.playWith(petToAdopt1.getPetName(), 10);
        assertEquals(petToAdopt1.getBoredomLevel(), 50);
    }

    @Test
    public void tickShouldDecreaseFoodLevelBy1() {
        underTest.addPet(petToAdopt1);
        underTest.tick();
        assertEquals(petToAdopt1.getFoodLevel(), 39);
    }

    @Test
    public void tickShouldDecreaseWaterLevelBy1() {
        underTest.addPet(petToAdopt1);
        underTest.tick();
        assertEquals(petToAdopt1.getWaterLevel(), 29);
    }
    @Test
    public void tickShouldIncreaseBoredomLevelBy1() {
        underTest.addPet(petToAdopt1);
        underTest.tick();
        assertEquals(petToAdopt1.getBoredomLevel(), 61);
    }
}
