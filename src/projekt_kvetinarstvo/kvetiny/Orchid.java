package projekt_kvetinarstvo.kvetiny;

import projekt_kvetinarstvo.floriculture.SocialEvent;
import projekt_kvetinarstvo.kvetiny.general.Flower;

import java.util.ArrayList;
import java.util.List;

public class Orchid extends Flower {
    private boolean isEpiphytic;
    private String nativeRegion;
    private int numBlossoms;

    public Orchid(String name, String color, boolean isEpiphytic, String nativeRegion, int numBlossoms) {
        super(name, color);

        this.isEpiphytic = isEpiphytic;
        this.nativeRegion = nativeRegion;
        this.numBlossoms = numBlossoms;

        List<SocialEvent> usaCases = new ArrayList<>();
        usaCases.add(SocialEvent.AwardsCeremony);
        usaCases.add(SocialEvent.Wedding);
        this.setUseCase(usaCases);
    }

    public boolean isEpiphytic() {
        return isEpiphytic;
    }

    public void setEpiphytic(boolean isEpiphytic) {
        this.isEpiphytic = isEpiphytic;
    }

    public String getNativeRegion() {
        return nativeRegion;
    }

    public void setNativeRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public int getNumBlossoms() {
        return numBlossoms;
    }

    public void setNumBlossoms(int numBlossoms) {
        this.numBlossoms = numBlossoms;
    }

}

