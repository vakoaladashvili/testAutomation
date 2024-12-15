package org.example;

//ეს კლასი იმპლემენტაციას უკეთებს ორივე ინტერფეისს 'ReplaceA, ReplaceB'.
//ესეიგი პასუხისმგებელი არის კონკრეტული სიმბოლოების ჩანაცვლებაზე 'a' -> 'z' და 'b' -> 'w'.
class SymbolReplacer implements ReplaceA, ReplaceB {

    // იმპლემენტაციას უკეთებს replaceSymbolA მეთოდს რომ შეცვალოს 'a' სიმბოლო  'z' სიმბოლოთი.
    @Override
    public String replaceSymbolA(String text) { // replace მეთოდი შეცვლის ყველა 'a' სიმბოლოს 'z'-ით სტრიქონში
        return text.replace("a", "z"); // ყველა 'a' იცვლება 'z'-ით
    }

    // იმპლემენტაციას უკეთებს replaceSymbolA მეთოდს რომ შეცვალოს 'b' სიმბოლო  'w' სიმბოლოთი.
    @Override
    public String replaceSymbolB(String text) {  // replace მეთოდი შეცვლის ყველა 'b' სიმბოლოს 'w'-ით სტრიქონში
        return text.replace("b", "w"); // ყველა 'b' იცვლება 'w'-ით
    }
}
