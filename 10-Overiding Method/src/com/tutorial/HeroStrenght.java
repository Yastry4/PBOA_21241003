package com.tutorial;

//sub class
class HeroStrengeth extends Hero {
    double defencePower;

    //method overidding
    void display(){
        System.out.println("Hero Strangeth");
        System.out.println("Nama Hero : " + this.Name);
        System.out.println("Defence Power : " + this.defencePower);

    }
}
