import java.util.ArrayList;
import java.util.Scanner;

public class JPA402 {
    public static void main (String[] args){
        Scanner d = new Scanner(System.in);
        ArrayList<Double> al = new ArrayList<Double>();
        double sum = 0; 
        System.out.print("請輸入學生人數: ");
        int n = d.nextInt();
        for (int i=1 ;i<= n ; i++){
            System.out.print("第"+i+"個學生的成績: ");
            double m = d.nextFloat();
            sum += m ;
            al.add(m);
        }
        System.out.println("人數: "+ n );
        System.out.println("總分: "+sum);
        System.out.println("平均值: "+sum/n);

}
}
