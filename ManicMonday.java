import java.text.*;
import java.util.*;
public class ManicMonday{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter how many Pairs of socks Sam has: ");
      int pairs = sc.nextInt();  
      double seconds = 0.0;
      ArrayList<Integer> socks = new ArrayList<Integer>();
      for(int i = 0; i < pairs;i++){
         socks.add(i);
         socks.add(i);
      
      }
      Collections.shuffle(socks);
      int totalSocksDrawn = 0;
      int initialSock = socks.remove(0);
      totalSocksDrawn+=1;
      seconds+=5.0;
      int total = socks.size();
      for(int j = 0; j < total;j++){
         int currentSock = socks.remove(0);
         totalSocksDrawn+=1;
         seconds+=5.0;
         if(currentSock == initialSock&& seconds<=120.0){
            System.out.println("NOT LATE TO WORK");
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println(f.format(seconds/60.0));
            System.out.println(totalSocksDrawn);
            break;
         }
         else if(seconds>120){
            System.out.println("LATE TO WORK");
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println(f.format(seconds/60.0));
            System.out.println(totalSocksDrawn);   
            break;
         }
      
      }
   }

}