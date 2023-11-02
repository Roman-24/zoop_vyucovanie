package projekt_kvetinarstvo.kvetiny;

import projekt_kvetinarstvo.floriculture.SocialEvent;
import projekt_kvetinarstvo.kvetiny.general.Flower;

import java.util.ArrayList;
import java.util.List;

public class Hortensia extends Flower {
    private int numberOfPetals;

    public Hortensia(String name, String color, int numberOfPetals) {
        super(name, color);
        this.numberOfPetals = numberOfPetals;
        List<SocialEvent> usaCases = new ArrayList<>();
        usaCases.add(SocialEvent.Wedding);
        this.setUseCase(usaCases);
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

}

