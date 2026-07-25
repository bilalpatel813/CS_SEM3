class lion {
    void genre1(){
        System.out.println("King of the Jungle");
    }    
}
class tiger extends lion{
    void genre2(){
        System.out.println("Wild Predator");
    }
}

class cat extends tiger{
    void genre3(){
        System.out.println("Family friendly");
    }
}

public class main2{
    public static void main(String[] args){
        cat c = new cat();
        c.genre1();
        c.genre2();
        c.genre3();
    }
}