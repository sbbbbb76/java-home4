package javh4;

public class JPA404 {
    public static void main (String[] args){
        int[] A = new int[10];
        for (int i =0;i<=1;i++){
            A[i]=i;
        }
        for (int i =2;i<A.length;i++){
            A[i] = A[i-1]+A[i-2];
        } 
        for (int i =0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
