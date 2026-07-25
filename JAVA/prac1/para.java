class para {
    String model, model1;
    int price, price1;
    para(){
        this("Tesla", 30000000, "Audi", 6000000);
    }
    para(String m, int p, String m1, int p1){
        this.model = m;
        this.price = p;
        this.model1 = m1;
        this.price1 = p1;
    }
    void display(){
        System.out.println("Model: " + model);
        System.out.println("Price " + price);
        System.out.println("Model: " + model1);
        System.out.println("Model: " + price1);
    }
    public static void main(String[] args){
        para p = new para();
        p.display();
    }
}
