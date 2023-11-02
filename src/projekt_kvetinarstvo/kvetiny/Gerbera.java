package projekt_kvetinarstvo.kvetiny;

import projekt_kvetinarstvo.floriculture.SocialEvent;
import projekt_kvetinarstvo.kvetiny.general.Flower;

import java.util.ArrayList;
import java.util.List;

public class Gerbera extends Flower {
    private boolean hasUniquePetals;

    public Gerbera(String name, String color, boolean hasUniquePetals) {
        super(name, color);
        this.hasUniquePetals = hasUniquePetals;
        List<SocialEvent> usaCases = new ArrayList<>();
        usaCases.add(SocialEvent.BirthdayParty);
        this.setUseCase(usaCases);
    }

    public boolean hasUniquePetals() {
        return hasUniquePetals;
    }

    public void setUniquePetals(boolean hasUniquePetals) {
        this.hasUniquePetals = hasUniquePetals;
    }

}

