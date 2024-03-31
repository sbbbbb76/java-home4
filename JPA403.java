package javh4;
public class JPA403 {
    public static void main (String[] args){
        int A[][]={{1,2,3},{4,5,6}};
        int B[][]={{7,8,9},{10,11,12}};
        System.out.println("陣列A的內容為:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("陣列B的內容為:");
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[i].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("陣列A+B=C, 陣列C的內容為:");
        for (int i = 0;i<A.length;i++){
            for(int j=0; j<A[i].length; j++){
                System.out.print(A[i][j]+B[i][j] + " ");
            }
            System.out.println();
        }
        }
}
