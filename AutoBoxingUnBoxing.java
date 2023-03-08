class AutoBoxing {
    public void autoBoxingExample() {
        int num = 100;  
        Integer num2 = new Integer(num); //Boxing  
        Integer num3 = 10; //Boxing
        System.out.println("AutoBoxing " + num2 + " " + num3);
        System.out.println("------------------------------------------------------------");
    }
}
class UnBoxing {
    public void unBoxingExample() {    
        Integer num = new Integer(50);  
        int a = num;  
        System.out.println("UnBoxing  " + a );
    }
}
class Main {
    public static void main(String[]args) {
        AutoBoxing auto = new AutoBoxing();
        auto.autoBoxingExample();

        UnBoxing unbox = new UnBoxing();
        unbox.unBoxingExample();

    }
}