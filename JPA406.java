package javh4;

public class JPA406 {
    public static void main (String[] args){
    int[] A = {2,3,5,8};
    int mo=0;
    for(int i = 0; i < A.length ; i++){
        System.out.println("停車時數: "+A[i]+"小時");
        if (A[i]<=2){
            mo = A[i]*30; 
        }else if (A[i]>2 && A[i]<=4){
            mo = 60+(A[i]-2)*50;
        }else if (A[i]>4 && A[i]<=6){
            mo = 160+(A[i]-4)*80;
        }else if (A[i]>6){
            mo = 320+(A[i]-6)*100;
        }
        System.out.println("應繳費用: "+mo+"元整");
        System.out.println("--------------------");
    } 
}
}
