import java.util.Scanner;

class PrefixCheck{
   String s1,s2;

   void commonprefix(String s1, String s2){
      String pre="";
      int s1len=s1.length();
      int s2len=s2.length();

      if (s1len>s2len){
         for(int i=0;i<s2len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
               pre=s1.substring(0,i+1);
            }
            else{
               break;
            }
         }
      }
      else if (s1len<=s2len){
         for(int i=0;i<s1len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
               pre=s1.substring(0,i+1);
            }
            else{
               break;
            }
         }
      }
      
      System.out.println("Common prefix: " + pre);
   }
}

class PrefixTest{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      PrefixCheck ob=new PrefixCheck();

      System.out.println("TO CHECK FOR COMMON PREFIX OF STRINGS");

      System.out.println("Enter string 1: ");
      ob.s1=input.next();
      System.out.println("Enter string 2: ");
      ob.s2=input.next();

      ob.commonprefix(ob.s1,ob.s2);
   }
}