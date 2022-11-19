package bun;

import bun.Burger;

public class BurgerMain {


    public static void main(String[] args){
        Burger regularBurger = new Burger(":bun, ", "oneMeat, ", "cheese, " , "greens, " , "mayo, ");
        Burger dietBurger = new Burger( ":bun, ", "oneMeat, ", "cheese, ", "greens, ");
        Burger doubleBurger = new Burger(":bun, ", "oneMeat, ", "cheese, ", "greens, ", "mayo, ", "twoMeat, ");

    }
}