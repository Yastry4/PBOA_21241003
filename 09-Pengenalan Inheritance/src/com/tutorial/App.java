package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi atau penciptaan objek
        Hero hero1 = new Hero();
        hero1.Name = "Iron Man";
        hero1.display();  

        HeroStrengeth hero2 = new HeroStrengeth();
        hero2.Name = "Spiderman";
        hero2.display();

        HeroIntell hero3 = new HeroIntell();
        hero3.Name = "Doraemon";
        hero3.display();
    }
}
