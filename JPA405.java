package javh4;

public class JPA405 {
    public static void main (String[] args){
        String[] x= {"A","B","C","D","E","F","G","H","I","J"}; 
        System.out.print("反轉陣列資料前: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.print("\n反轉陣列資料後: ");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }
}