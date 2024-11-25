package org.example;

//Main კლასსი შექმენით void -იანი მეთოდი სახელად hasTeen,
//რომელიც პარამეტრად მიიღებს სამ ცალ int ტიპის ცვლადს.
//მეთოდმა დაბეჭდოს “True” თუ რომელიმე პარამეტრი მაინც იქნება
//მინიმუმ 13 და მაქსიმუმ 19. მეთოდმა დაბეჭდოს “False” თუ
//არც ერთი პარამეტრი არ იქნება 13 - 19 დიაპაზონში →

public class hasTeen {
    public static void hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
