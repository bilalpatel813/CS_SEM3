class car {
    String model;
    car(String m){
        model = m;
    }
    car(car c){
        model = c.model;
    }
    void display(){
        System.out.println("Model: " + model);
    }
    public static void main(String[] args){
        car c1 = new car("toyota");
        car c2 = new car(c1);
        c2.display();
    }
}
