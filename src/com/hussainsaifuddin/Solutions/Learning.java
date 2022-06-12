package com.hussainsaifuddin.Solutions;

// class with an access specifier can be called from anywhere even if the caller does not belong to the package of class with access specifier.
public class Learning {
    public static void main(String[] args) {
    }

    public void show(){
        Human h = new Human();
        h.eat();
    }
}

// class without access specifier can be called from anywhere within the same package.
class Human {
    public void walk(){}
    public void eat(){
        System.out.println("Inside eating method");
    }
}
