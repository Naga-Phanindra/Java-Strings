import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
    }
}

class String1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String last=sc.nextLine();
        if(name.compareTo(last)==0){   // if equal 0 greater positive lesser value
            System.out.println("Strings are equal");
        }else
        System.out.println("Strings are not equal");
    }
}
// why we are not using == case if(new String("tony")==new String("tony")) it fails



//substring
//substring(beginning index,ending index)
class String2{
    public static void main(String args[]){
        String sentence="My name is vaishnavi";
        System.out.println(sentence.substring(11,sentence.length()));
        //strings are immutable
        //once we define the string we cannot change
    }
}

//parseInt menthod of integer class
 class String3 {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
       
       
    }
 }
// Use Integer. parseInt() to Convert a String to an Integer. This method returns the string as a primitive type int. 
//  Use Integer. valueOf() to Convert a String to an Integer. This method returns the string as an integer object.
class String4{
     public static void main(String args[]){
         String id= "12";
        String name=String.valueOf(id);
         System.out.println(name);

     }
 }
// interger to string
 class String5{ 
     public static void main(String args[]){
         int a=200;
         String s=Integer.toString(a);
         System.out.println(a+100);
         System.out.println(s+100);
     }
 }

 class String6 {
    public static void main(String args[]) {
       int number = 123;
       String str = Integer.toString(number);
       System.out.println(str.length());
       
       
    }
 }

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

 class String7{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int size = sc.nextInt();
         String StringList[] = new String[size];
         int totlength = 0;
         for(int i=0;i<size;i++){
             StringList[i]=sc.next();
             totlength +=StringList[i].length();

         }

       System.out.println(totlength);
     }
 }
 
//   Input a string from the user. 
// create a new string called ‘result’
// in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

class String8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
              result += 'i';
            } else {
              result += str.charAt(i);
            }
          }
      
          System.out.println(result);
        }
     
     
    }

    // Input an email from the user.
    //  You have to create a username from the email by deleting the part that comes after ‘@’.
    //  Display that username to the user.

class String9{
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String email=sc.nextLine();
    String userName = "";
 
     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }
 
     System.out.println(userName);
   }
 }
    

class String10{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String output="";
    for(int i=0;i<input.length();i++){
        if(input.charAt(i)=='s'){
            break;
        }else
        output+=input.charAt(i);
        
    }
    System.out.println(output);
}

}

//reverse of a string
class String11{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        String rev ="";
        for(int i=input.length()-1;i>=0;i--){
           rev+= input.charAt(i);   //a+=b is same as a=a+b
        }
        System.out.println(rev);
    }
}

//
class String12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence:");
        String str=sc.nextLine();
        String out="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='f'){
                out+='t';
            }else
            out+=str.charAt(i);
        }
        System.out.println(out);
        }
}

class String13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        String username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else
            username+=email.charAt(i);
        }
        System.out.println(username);

    }
}




 class m{
    public static void main(String args[]){
        float f=0.7;
        if(f)
        System.out.println(" i m less");
        else
        System.out.println("i m e");

    }
 }