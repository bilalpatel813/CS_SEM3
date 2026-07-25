abstract class vehicle {
    
    abstract void start();
    
    void fuel_type(String type){
        System.out.println("The vehicle uses " + type + " Fuel");
    }
}
class three_vehicle extends vehicle{
    @Override
    void start(){
        System.out.println("The Tesla has started");
    }
    void price(int value){
        System.out.println("The price of Tesla is "+ value + " lakhs");
    }
}
class four_vehicle extends three_vehicle{
    @Override
    void start(){
        System.out.println("The audi has started.");
    }
    void price(int value){
        System.out.println("The price of Audi is "+ value + " lakhs");
    }
}

public class motor{
    public static void main(String[] args) {
        three_vehicle ob1 = new three_vehicle();
        ob1.start();
        ob1.fuel_type("Petrol");
        ob1.price(3);
        four_vehicle ob2 = new four_vehicle();
        ob2.start();
        ob2.fuel_type("Diesel");
        ob2.price(68);
    }
}