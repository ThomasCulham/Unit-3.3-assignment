import java.util.Scanner;public class decToBi{
    public static void main (String[]args){
        System.out.println(Bi(100));
        System.out.println(Bi(95));
    }

    public static int Bi(int i) { 
        int ans=0;
        int count=0;
        while (i>0){
            if(i%2==0){
              i/=2;
            }else{
              i=(i-1)/2;
              ans+=1*Math.pow(10,count);
            }
            count++;
        }
        return ans;
    }
}