package cvicenie02;

import java.util.Random;

public class RandomCharacter {

  public static void main(String[] args) {
    // Create a Random object
    Random random = new Random();

    // Generate a random character between 'a' and 'z' (inclusive)
    char randomChar = (char) (random.nextInt(26) + 'a');
    System.out.println("Random Character: " + randomChar);

    // Generate a random character between 'A' and 'Z' (inclusive)
    char randomUpperCaseChar = (char) (random.nextInt(26) + 'A');
    System.out.println("Random Uppercase Character: " + randomUpperCaseChar);

    // Generate a random character between '0' and '9' (inclusive)
    char randomDigitChar = (char) (random.nextInt(10) + '0');
    System.out.println("Random Digit Character: " + randomDigitChar);

    // Generate a random character from a custom set of characters
    String customCharacterSet = "!@#$%^&*()";
    char randomCustomChar = customCharacterSet.charAt(random.nextInt(customCharacterSet.length()));
    System.out.println("Random Custom Character: " + randomCustomChar);
  }
}

