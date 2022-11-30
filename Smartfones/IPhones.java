package Smartfones;
class main {
    public static void main(String[] args) {

        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iOS();
    }
}


class IPhones implements Smartphones, SmartphonesIPhones {


    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }

    @Override
    public void iOS() {

    }


}
