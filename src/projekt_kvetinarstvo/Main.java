package projekt_kvetinarstvo;

import projekt_kvetinarstvo.floriculture.Storage;

public class Main {

    public static void main(String[] args) {
        Storage flowerStorage = new Storage();
        flowerStorage.initializeFlowerStorage();
        flowerStorage.printStorage();
    }
}
