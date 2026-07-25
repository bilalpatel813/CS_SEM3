class student {
    String name;
    student(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){
        student s = new student("Adnan Shaikh");
        s.show();
    }
}
