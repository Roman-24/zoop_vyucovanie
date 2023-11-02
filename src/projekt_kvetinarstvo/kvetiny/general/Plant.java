package projekt_kvetinarstvo.kvetiny.general;

public abstract class Plant {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public abstract void grow();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
