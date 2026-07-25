// public class online {
//     public String name = "Jerry";

//     public void show(){
//         System.out.println("Hello, " + name);
//     }
//     public static void main(String[] args) {
//         online obj = new online();
//         obj.show();
//     }
// }
// public class online {
//     private int bal = 100;
//     private void show(){
//         System.out.println("Balance: "+ bal);
//     }

//     public static void main(String[] args) {
//         online obj = new online();
//         obj.show();
//     }
// }

public class online {
    protected void sound(){
        System.out.println("Animal Sound");
    }
    public static void main(String[] args) {
        online obj = new online();
        obj.sound();
    }
}