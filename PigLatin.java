import java.util.Scanner;public class PigLatin{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        while (1<2){
            System.out.println("Enter string:");
            String in = sc.nextLine();
            System.out.println(Pig(in));
            System.out.println("");
        }
    }

    public static String Pig(String in) {  
        String ans="";
        int e=0;
        int b=0;
        for(int i=0; i<in.length(); i++){
            if(in.substring(i,i+1).equals(" ")){
                e=i;
                String word= in.substring(b,e);
                if((e-b)>2){
                    ans=ans + word.substring(1,word.length())+word.charAt(0)+"ay ";
                }else{
                    ans= ans + word+ " ";
                }
                b=(e+1);
            }

            if(i==in.length()-1){
                e=i+1;
                String word= in.substring(b,e);
                if((e-b)>2){
                    ans= ans + word.substring(1,word.length())+word.charAt(0)+"ay ";
                }else{
                    ans= ans + word + " ";
                }
            }

        }
        return ans;
    }
}