class animal{
    void makeSound(){
        System.out.println("Animal makes sound a lot!");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Dogs: Barks on everyting!");
    }
}

public class main{
    public static void main(String[] args){
        dog d = new dog();
        d.makeSound();
        d.bark();
    }
}