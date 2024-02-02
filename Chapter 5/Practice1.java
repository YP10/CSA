public class Practice1 {
    public static String scroll(String s){
        String s1=s.substring(1);
        String s2=s.substring(0,1);
        return s1+s2;
    }
    public static String convertName(String s){
        int comma=s.indexOf(",");
        String lastName=s.substring(0,comma);
        String firstName=s.substring(comma+1);
        lastName=lastName.trim();
        firstName=firstName.trim();
        return firstName+" "+lastName;
    }
    public static String negative(String s){
        String s1=s.replace("1", "2");
        s1=s1.replace("0","1");
        s1=s1.replace("2","0");
        return s1;

    }
    public static boolean startsWith(String s, String prefix){
        int lengthP=prefix.length();
        if(lengthP>s.length()) return false;
        if(s.substring(0,lengthP).equals(prefix)) return true;
        else return false;
        
    }
    public static String stutter(String s){
        String b=""; 
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            b=b+a+a;
        }
        return b;
    }
    public static void printBackward(String s){
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    public static boolean isPalindrome(String s){
        int length=s.length();
        int j=0;
        for(int i=length-1;i>=0;i--){
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(a!=b)return false;
            else if(i==0&&a==b)return true;
            j++;
        }
        return false;
    }
    public static String removeAll(String s,char a){
        int length=s.length();
        String b="";
        for(int i=0;i<=length-1;i++){
            char s1=s.charAt(i);
            if(s1!=a){
                b=b+s1;
            }
        }
        return b;
    }
    public static boolean containsTwice(String s,char a){
        if(s.indexOf(a)==-1) return false;
        int b=s.indexOf(a);
        if(s.indexOf(a,b+1)==-1) return false;
        else return true;

    }
    public static String repeat(String s, int a){
        if(a<=0) return "";
        String b="";
        for(int i=0;i<a;i++){
            b=b+s;
        }
        return b;
    }
     public static void printBackward0(String s){
        int length=s.length();
        if(length==0) System.out.println("");
        for(int i=length-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
     }   
     public static String reverse(String s){
        int length=s.length();
        String b="";
        for(int i=length-1;i>=0;i--){
            b=b+s.charAt(i);
        }
        return b;
     }
    
    public static void main(String []args){
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        System.out.println();
        System.out.println(isPalindrome("civic"));
        System.out.println(removeAll("how are you doing", 'o'));
        System.out.println(containsTwice("hello", 'l'));
        System.out.println(stutter("hello"));
        System.out.println(repeat("hi", 6));
        System.out.println(reverse("Pikachu"));
        printBackward("how are you doing?");
        System.out.println();
        printBackward0("hello there!");


    }
}
