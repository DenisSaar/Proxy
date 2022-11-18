package bun;


public class Burger {


            String bun;
            String oneMeat;
            String cheese;
            String greens;
            String mayo;
            String twoMeat;


        public Burger(String bun, String oneMeat, String cheese, String greens, String mayo) {
                this.bun = bun;
                this.oneMeat = oneMeat;
                this.cheese = cheese;
                this.greens = greens;
                this.mayo = mayo;
                System.out.println("regularBurger" + bun + oneMeat + cheese + greens + mayo);
            }

        public Burger(String bun, String oneMeat, String cheese, String greens) {
                this.bun = bun;
                this.oneMeat = oneMeat;
                this.cheese = cheese;
                this.greens = greens;
                System.out.println("dietBurger" + bun + oneMeat + cheese + greens);
            }

        public Burger(String bun, String oneMeat, String cheese, String greens, String mayo, String twoMeat) {
                this.bun = bun;
                this.oneMeat = oneMeat;
                this.cheese = cheese;
                this.greens = greens;
                this.mayo = mayo;
                this.twoMeat = twoMeat;
                System.out.println("doubleBurger" + bun + oneMeat + cheese + greens + mayo + twoMeat);
            }
        }













