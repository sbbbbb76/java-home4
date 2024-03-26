import java.util.ArrayList;
import java.util.Scanner;

public class JPA04 {
    public static void main (String[] args){
        Scanner d = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int a = 0 ;
        double sum = 0; 
        for (int i=1 ;i<=10 ; i++){
            System.out.print("請輸入第"+i+"個整數: ");
            int m = d.nextInt();
            al.add(m);
            if (m>60){
                sum+=m;
                a+=1;
            }
        }
        System.out.println("陣列中大於60的有"+a+"個");
        System.out.println("總合為"+sum);
        System.out.println("平均值為"+sum/a);

}
}