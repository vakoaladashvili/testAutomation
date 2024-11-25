package org.example;

public class Length {
    public static void main(String[] args) {

        System.out.println("\nდავალება 3:  შექმენით Length კლასი და ამ კლასში შექმენით String ტიპის\n" +
                "სტრიქონი. თუ არსებული სტრიქონის სიგრძე არის ლუწი დაწერეთ\n" +
                "რომ ლუწია, თუ კენტია დაწერეთ რომ კენტია →\n\nპასუხი:  ");


        // შემოგვაქვს სტრინგ ტიპის მეთდი.
        String s = "gamajoba";

        // ამოწმებს სიგრძე ლუწია თ კენტი
        if (s.length() % 2 == 0) {
            System.out.println("ლუწია!");
        }
        else {
            System.out.println("კენტია!");
        }
    }
}


