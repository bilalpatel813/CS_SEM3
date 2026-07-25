//Method Overriding 

class Animal {
    void makeSound(){
        System.out.println("Animal Makes sound a lot!");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog: Barks!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat: Meow! Meow!");
    }
}
public class zoo{
    public static void main(String[] args){
        Animal d = new Dog();
        Animal c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}