package org.example;

// ეს არის აბსტრაქტული კლასი სახელად VowelChecker
abstract class VowelChecker {
    // ეს არის აბსტრაქტული მეთოდი, რომელიც სრულდება შვილთა კლასებში.
    //ეს მეთოდი პასუხისმგებელია ხმოვნების პოვნაზე სტრიქონში და მათ დათვლაზე.
    public abstract void findVowels(String text);
}

// ეს არის შვილი კლასი, რომელიც უზრუნველყოფს findVowels მეთოდის შესრულებას.
class VowelCheckerImpl extends VowelChecker {
    public void findVowels(String text) {

        String vowels = "AEIOUaeiou"; // ეს მეთოდი იღებს სტრიქონს და ითვლის ხმოვნებს.
        int vowelCount = 0; // ეს არის ცვლადი, რომელიც ითვლის შეყვანილ ტექსტში ხმოვნების როადენობას.

        for (int i = 0; i < text.length(); i++) { // ამოწმებს თითოეულ სიმბოლოს სტრინგში და გადადის.
            char character = text.charAt(i);  //არჩეული სიმბოლო სტრიქონიდან
            if (vowels.indexOf(character) != -1) {  // თუ ეს სიმბოლო არის ხმოვანი, შევადაროთ "ხმოვნებს" სტრიქონში.
                vowelCount++;
            }
        }

        // დაბეჭდავს შედეგს, რომელიც არის ხმოვნების რაოდენობა ამ სტრიქონში.
        System.out.println("ამ სტრიქონში არის  " + vowelCount + " ხმოვანი.");
    }
}
