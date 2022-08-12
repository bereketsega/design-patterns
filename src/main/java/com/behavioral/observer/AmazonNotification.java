package main.java.com.behavioral.observer;

public class AmazonNotification {
    
    public static void main(String[] args) {
        
        PrimeMember member1 = new PrimeMember("Steve");
        PrimeMember member2 = new PrimeMember("Chester");
        PrimeMember member3 = new PrimeMember("Pierre");
        PrimeMember member4 = new PrimeMember("Jenna");

        PrimeDiscount discountNotification = new PrimeDiscount();
        discountNotification.add(member1);
        discountNotification.add(member2);
        discountNotification.add(member3);
        discountNotification.add(member4);

        discountNotification.notifyObserver();

    }

}
