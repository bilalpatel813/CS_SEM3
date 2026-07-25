public class ArrayindexExc {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index access");
        }
    }
    
}