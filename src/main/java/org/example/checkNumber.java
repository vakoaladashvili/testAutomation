package org.example;

public class checkNumber {
    public static void checkNumber(int number) {

        //დავალება 4-ის პასუხი იხილეთ main კლასში;

        if (number > 0) {
            System.out.println("პოზიტიური");
        } else if (number < 0) {
            System.out.println("ნეგატიური");
        } else {
            System.out.println("ნული");
        }

    }
}