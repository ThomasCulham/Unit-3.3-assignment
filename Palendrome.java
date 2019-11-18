import java.util.Scanner;public class Palendrome{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("apple "+palen ("apple"));
        System.out.println("racecar " + palen ("racecar"));
        System.out.println("Amy, must I jujitsu my ma? " + palen("Amy, must I jujitsu my ma?"));

    }

    public static boolean palen(String a) {  
        String r = ".? !,";
        String b = "";
        a=a.toLowerCase();
        for(int i=0; i<a.length(); i++){
            if(r.contains(a.substring(i,i+1))){
                a=a.replace(a.substring(i,i+1),"");
            }
        }
        
        for(int i=a.length()-1; i>=0; i--){
            b+=a.charAt(i);
        }
        System.out.println(a+" "+b);
        if(a.equals(b)){
            return true;
        }else return false;
    }
}