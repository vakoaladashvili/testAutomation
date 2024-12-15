package org.example;

public class Main {
    public static void main(String[] args) {

        // დავალება 1: VowelChecker - ეძებს ხმოვნებს სტრინგში
        System.out.println("=== დავალება 1: Vowel Checker ===");
        // ქმნის ობიექტს შვილი კლასისთვის
        VowelChecker vowelChecker = new VowelCheckerImpl();

        // findVowels მეთოდის ტესტირება სხვადასხვა სტრიქონებით
        vowelChecker.findVowels("Hello"); // დაპრინტავს რომ ამ სტრინგში არის 2 ხმოვანი.
        vowelChecker.findVowels("I love testing"); // დაპრინტავს რომ ამ სტრინგში არის 5 ხმოვანი..

        System.out.println();

        // აქ ვქმნით scanner ობიექტს და ვთხოვთ რომ წაიკითხოს მომხმარებლის მიერ შეყვანილი
        // სტრინგი ხმოვნების დასათვლელად და ასევე ვაწვდით ინფორმაციას, რომ გასვლის შემთხვევაში
        // შეუძლიათ აკრიფონ "EXIT".
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("(*) შეიყვანეთ სტრიქონი ხმოვანთა დასათვლელად, გასვლის შემთხვევაში გთხოვთ აკრიფეთ „EXIT“!:");
        System.out.println("(*) დავალება 2-ზე და 3-ზე გადასასვლელად გთხოვთ აკრიფეთ „EXIT“!:");

        //ეს იწყებს უსასრულო ლუპს, მანამ სანამ მომხმარებელი არ შეიყვანს "EXIT-ს"
        //ასევე მომხმარებელს სთხოვს შეიყვანოს სტრიქონი, რომ დათვალოს ხმოვნები.
        //თუ მომხმარებელი აკრიფავს ""EXIT-ს, ლუპი წყდება და პროგრამაც სრულდება.
        while (true) {
            String userInput = scanner.nextLine(); //ეს კონსოლიდან კითხულობს იუზერის ინფუთს.

            if (userInput.equalsIgnoreCase("exit")) {   //ამოწმებს იუზერმა თუ შეიყვანა "EXIT"
                System.out.println("დავალება 1 შესრულებულია გილოცავ. ქვევით გაიხსნა დავალება 2 და დავალება 3."); //დამშვიდობების წერილი
                System.out.println();
                break; //წყვეტს ლუპს, როცა კონსოლში ვწერთ "exიt-ს"

            }

            vowelChecker.findVowels(userInput); //იძახებს findVowels მეთოდს, რომ დაითვალოს ხმოვნები იუზერის ინფუთში.
        }

        scanner.close(); //ვხურავთ სკანერის ობიექტს, რომ განვათავისუფლოთ სისტემა ზედმეტი დატვირთვისგან.

        // დავალება 2: SymbolReplacer
        System.out.println("=== დავალება 2: Symbol Replacer ===");

        //SymbolReplacer კლასის ობიექტის შექმნა
        SymbolReplacer replacer = new SymbolReplacer();

        // replaceSymbolA მეთოდი ანაცვლებს 'a'-ს 'z'-ით
        String result1 = replacer.replaceSymbolA("Lela");
        System.out.println(result1); //მოსალოდნელი შედეგია 'Lelz'

        //replaceSymbolB მეთოდი ანაცვლებს 'b'-ს 'w'-თი.
        String result2 = replacer.replaceSymbolB("Gabelaia");
        System.out.println(result2); //მოსალოდნელი შედეგია 'Gawelaia'

        System.out.println();

        // დავალება 3: Array Sorting (Bubble Sort)
        System.out.println("=== დავალება 3: Array Sorting ===");

        // ეს არის int ტიპის მასივი რომელიც დალაგდება ზრდადობით.
        int[] arr = {3, -7, 7, -11, 5, 369, 22, 1, -145};

        // დაპრინტავს თავდაპირველ მასივს.
        System.out.println("ჩემს მიერ შექმნილი მასივი: ");
        printArray(arr);

        // დაალაგებს მასივს Bubble Sort-ის გამოყენებით.
        bubbleSort(arr);

        // პრინტავს ზრდადობით დალაგებულ მასივს.
        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    //ეს არის Bubble Sort-ის მეთოდი
    public static void bubbleSort(int[] arr) {
        //ეს ციკლი აკონტროლებს,თუ რამდენჯერ უნდა გავიაროთ მთლიანი მასივი.
        //ყოველი გავლის შემდეგ, ყველაზე დიდი ელემენტი ჯდება თავის პოზიციაზე.
        //(arr.length - 1) ეს გამოვიყენე რადგან ყოველი გავლის შემდეგ ხდება ბოლო ელემენტის დალაგება.
        for (int i = 0; i < arr.length - 1; i++) {
            //ამას ეწოდება Inner loop-ი, როდესაც ციკლი ადარებს ელემენტებს ერთმანეთს და საჭიროების შემთხვევაში უცვლის პოზიციას.
            //და უკვე როდესაც მასივი დალაგდა და ბოლოში გავიდა ის წყვეტს ელემენტების შედარებას ერთმანეთთან.
            for (int j = 0; j < arr.length - i - 1; j++) {
                // ეს ადარებს ელემენტებს ერთმანეთს, თუ მიმდინარე ელემენტი arr[j] მეტია მომდევნო ელემენტზე arr[j + 1])
                //შეცვალე ისინი უფრო დიდი ელემენტის მარჯვნივ გადასატანად.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ეს კი არის დამხმარე მეთოდი, რომ დაპრინტოს მასივი.
    public static void printArray(int[] arr) {
        //ეს ხელს უწყობს მასივის წაკითხვად ფორმატში ჩვენებას.
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



