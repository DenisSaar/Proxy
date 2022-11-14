
public class Burger {

    public Burger(String s) {
        String bun;
        String meat;
        String cheese;
        String greens;
        String mayo;
        String doubleMeat;

    }


    public static void main(String[] args) {

        Burger regularBurger = new Burger("bun" + "meat" + "cheese" + "greens" + "mayo");
        regularBurger.printInfo();
        Burger dietBurger = new Burger("bun" + "meat" + "cheese" + "greens");
        dietBurger.printInfo();
        Burger bigBurger = new Burger("bun" + "doubleMeat" + "cheese" + "greens" + "mayo");
        bigBurger.printInfo();

    }

    private void printInfo() {
    }

    class BurgerMain {
        String bun;
        String meat;
        String cheese;
        String greens;
        String mayo;
        String doubleMeat;

        public void regularBurger(String bun, String meat, String cheese, String greens, String mayo) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.greens = greens;
            this.mayo = mayo;
        }

        public void dietBurger(String bun, String meat, String cheese, String greens) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.greens = greens;
        }

        public void bigBurger(String bun, String cheese, String greens, String mayo, String doubleMeat) {
            this.bun = bun;
            this.cheese = cheese;
            this.greens = greens;
            this.mayo = mayo;
            this.doubleMeat = doubleMeat;
        }

        void printInfo() {
            System.out.println("regularBurger" + bun + meat+ cheese + greens + mayo);
            System.out.println("dietBurger" + bun + meat+ cheese + greens);
            System.out.println("doubleBurger" + bun + meat+ cheese + greens + mayo +doubleMeat);


        }
    }
}












