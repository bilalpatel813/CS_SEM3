class Bank {
    boolean open = false;
    synchronized void waitForOpening(String name){
        System.out.println(name + ":Waiting for bank to open");
        while(!open){
            try{
                wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + ":Bank is Open");
    }

    synchronized void openBank(){
        System.out.println("Bank:Opening bank");
        open = true;
        notifyAll();
    }
}   
    public class BankApp {
        public static void main(String[] args){
            Bank bank = new Bank();
            Thread c1 = new Thread(() -> bank.waitForOpening("Adnan"));
            Thread c2 = new Thread(() -> bank.waitForOpening("Farhan"));
            Thread c3 = new Thread(() -> bank.waitForOpening("Obaid"));

            c1.start();
            c2.start();
            c3.start();
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                bank.openBank();
            }).start();
        }
    }

