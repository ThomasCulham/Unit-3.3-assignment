import java.util.Scanner;public class PPAP{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        song ("apple", "pen");
        song ("car", "dog");
        song ("person", "straw");
        song ("child", "knife");

    }
    public static String song(String a, String b) {  
        System.out.println("I have a " + a +"I have a " + b );
        System.out.println("Uhh " + b + " " + a);
        System.out.println("");
        return null;
    }
}