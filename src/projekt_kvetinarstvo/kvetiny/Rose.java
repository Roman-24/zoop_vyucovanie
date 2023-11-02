package projekt_kvetinarstvo.kvetiny;

import projekt_kvetinarstvo.floriculture.SocialEvent;
import projekt_kvetinarstvo.kvetiny.general.Flower;

import java.util.ArrayList;
import java.util.List;

public class Rose extends Flower {
    private boolean hasFragrance;
    private int numberOfThorns;

    public Rose(String name, String color, boolean hasFragrance, int numberOfThorns) {
        super(name, color);

        this.hasFragrance = hasFragrance;
        this.numberOfThorns = numberOfThorns;

        List<SocialEvent> usaCases = new ArrayList<>();
        usaCases.add(SocialEvent.AnniversaryCelebration);
        usaCases.add(SocialEvent.Wedding);
        this.setUseCase(usaCases);
    }

    public boolean hasFragrance() {
        return hasFragrance;
    }

    public void setFragrance(boolean hasFragrance) {
        this.hasFragrance = hasFragrance;
    }

    public int getNumberOfThorns() {
        return numberOfThorns;
    }

    public void setNumberOfThorns(int numberOfThorns) {
        this.numberOfThorns = numberOfThorns;
    }

}

