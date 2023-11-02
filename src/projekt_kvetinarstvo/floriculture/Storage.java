package projekt_kvetinarstvo.floriculture;

import projekt_kvetinarstvo.kvetiny.Gerbera;
import projekt_kvetinarstvo.kvetiny.Hortensia;
import projekt_kvetinarstvo.kvetiny.Orchid;
import projekt_kvetinarstvo.kvetiny.Rose;
import projekt_kvetinarstvo.kvetiny.general.Flower;

import java.util.*;

public class Storage {
    private Map<SocialEvent, List<Flower>> flowerStorage;

    public Storage() {
        flowerStorage = new HashMap<>();
        // Initialize the map with empty list of flowers for each social event
        for (SocialEvent event : SocialEvent.values()) {
            flowerStorage.put(event, new ArrayList<>());
        }
    }

    public void initializeFlowerStorage() {
        Random random = new Random();

        for (SocialEvent event : SocialEvent.values()) {
            List<Flower> flowerList = flowerStorage.get(event);

            // Generate a random number of flowers (between 0 and 5) for each event
            int numFlowers = random.nextInt(5); // Random number between 0 and 10
            for (int i = 0; i < numFlowers; i++) {
                Flower flower = createRandomFlower(event);
                flowerList.add(flower);
            }
        }
    }

    public void printStorage() {
        for (SocialEvent event : flowerStorage.keySet()) {
            List<Flower> flowerList = flowerStorage.get(event);
            System.out.println("EVENT: " + event);
            System.out.println();

            // Access and print the stored flowers
            for (Flower flower : flowerList) {
                if (flower instanceof Rose) {
                    Rose rose = (Rose) flower;
                    System.out.println("Flower Name: " + flower.getClass().getName());
                    System.out.println("Color: " + flower.getColor());
                    System.out.println("Has Fragrance: " + rose.hasFragrance());
                    System.out.println("Number of Thorns: " + rose.getNumberOfThorns());
                } else if (flower instanceof Gerbera) {
                    Gerbera gerbera = (Gerbera) flower;
                    System.out.println("Flower Name: " + flower.getClass().getName());
                    System.out.println("Color: " + flower.getColor());
                    System.out.println("Has Unique Petals: " + gerbera.hasUniquePetals());
                } else if (flower instanceof Hortensia) {
                    Hortensia hortensia = (Hortensia) flower;
                    System.out.println("Flower Name: " + flower.getClass().getName());
                    System.out.println("Color: " + flower.getColor());
                    System.out.println("Number of Petals: " + hortensia.getNumberOfPetals());
                } else if (flower instanceof Orchid) {
                    Orchid orchid = (Orchid) flower;
                    System.out.println("Flower Name: " + flower.getClass().getName());
                    System.out.println("Color: " + flower.getColor());
                    System.out.println("Is Epiphytic: " + orchid.isEpiphytic());
                    System.out.println("Native Region: " + orchid.getNativeRegion());
                    System.out.println("Number of Blossoms: " + orchid.getNumBlossoms());
                }
                System.out.println(); // Separate flower details
            }
            System.out.println("---------------------");
        }
    }

    public Map<SocialEvent, List<Flower>> getFlowerStorage() {
        return flowerStorage;
    }

    private Flower createRandomFlower(SocialEvent event) {
        Random random = new Random();

        // Generate random values for flower properties
        String name = "RandomFlower";
        String color = getRandomColor();
        boolean hasFragrance = random.nextBoolean();
        int numberOfThorns = random.nextInt(11); // Random number between 0 and 10

        // Create the appropriate flower type based on the event
        if (event == SocialEvent.BirthdayParty) {
            return new Gerbera(name, color, random.nextBoolean());
        } else if (event == SocialEvent.AnniversaryCelebration) {
            return new Rose(name, color, hasFragrance, numberOfThorns);
        } else if (event == SocialEvent.AwardsCeremony) {
            return new Orchid(name, color, random.nextBoolean(), "RandomRegion", random.nextInt(100));
        } else if (event == SocialEvent.Wedding) {
            boolean chooseResult = random.nextBoolean();
            if (chooseResult) {
                return new Hortensia(name, color, random.nextInt(100));
            } else {
                return new Rose(name, color, hasFragrance, numberOfThorns);
            }
        }

        return null; // Return null if the event doesn't match any specific flower type
    }

    private String getRandomColor() {
        String[] colors = {"Red", "Blue", "Yellow", "White", "Purple", "Orange", "Pink"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

}

