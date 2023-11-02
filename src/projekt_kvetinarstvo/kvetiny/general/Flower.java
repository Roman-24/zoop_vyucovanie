package projekt_kvetinarstvo.kvetiny.general;

import projekt_kvetinarstvo.floriculture.SocialEvent;

import java.util.ArrayList;
import java.util.List;

public class Flower extends Plant {

    private String color;

    // set empty list as default
    private List<SocialEvent> useCase = new ArrayList<>();

    public Flower(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void grow() {
        System.out.println(getName() + " is growing.");
    }

    public void bloom() {
        System.out.println(getName() + " is blooming with " + color + " flowers.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<SocialEvent> getUseCase() {
        return useCase;
    }

    public void setUseCase(List<SocialEvent> useCase) {
        this.useCase = useCase;
    }

}
