package Fitness;

public class NewAccount {
    public static void main(String args[]) {
        new Account("Albert", 2, 12, 1879, "Albert@email.com", "+12345678", "Einstein", 60, 91, 14321).printAccountInfo();
        new Account("Thomas", 24, 5, 1931, "Thomas@email.com", "+47328539", "Edison", 56, 79, 9524).printAccountInfo();
        new Account("Nicola", 12, 2, 1943, "Nicola@email.com", "+87654321", "Tesla", 50, 80, 8123).printAccountInfo();
        Account thomas = new Account("Thomas", 1, 1, 1879, "Thomas@email.com", "911", "Wagner", 90, 94, 11223);
        thomas.printAccountInfo();
        thomas.setSurname("Wagner");
        thomas.setWeight(70);
        thomas.setPressure(120);
        thomas.setStepsByDay(11223);
        thomas.printAccountInfo();

        Account albert = new Account("Albert", 2, 12, 1879, "Albert@email.com", "+31577878", "Beethoven", 68, 121, 13445);
        albert.printAccountInfo();
        albert.setSurname("Beethoven");
        albert.setWeight(68);
        albert.setPressure(121);
        albert.setStepsByDay(13445);
        albert.printAccountInfo();

    }
}
