
public class PersonDemo{

    public static void main(String []args){
        Person willSmith = new Person("Will Smith","New York","2936729462846") ;
        willSmith.printInfo();
        Person jackieChan = new Person("Jackie Chan","Shanghai" ,"12312412412") ;
        jackieChan.printInfo();
        Person sherlockHolmes = new Person("Sherlock Holmes","London","37742123513");
        sherlockHolmes.printInfo();


    }
}

class Person {

    String name;
    String city;
    long phoneNumber;

    public Person(String name, String city, String phoneNumber) {


        this.name = name;
        this.city = city;
        this.phoneNumber = Long.parseLong(phoneNumber);
    }
        void printInfo () {
            System.out.println("Позвонить гражданину:" + name);
            System.out.println("из города :" + city);
            System.out.println(" можно по номеру " + phoneNumber);

        }
    }


