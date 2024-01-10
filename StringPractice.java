public class StringPractice {
    public static String scroll(String s){

        String s1=s.substring(0,1);
        String s2=s.substring(1);
        String s3=s2+s1;
        return s3;
    }
    public static String convertName(String s){
        int a=s.indexOf(",");
        String b=s.substring(0,a);
        String c=s.substring(a+1);
        b= b.trim();
        c=c.trim();
        String d=c+" "+b;
        return d;
    }
    public static String negative(String s){
        String s1=s.replace("0","3");
        String s2=s1.replace("1","0");
        String s3=s2.replace("3","1");
        return s3;
    }
    public static String convertDate(String dateStr){
        int a=dateStr.indexOf("/");
        String b=dateStr.substring(0,a);
        int a1=dateStr.indexOf("/",a+1);
        String b1=dateStr.substring(a+1,a1);
        int a2=dateStr.lastIndexOf("/");
        String b2=dateStr.substring(a2+1);
        String c=b1+"-"+b+"-"+b2;
        return c;
    }
    public static String convertDate2(String s){
        int a=s.indexOf("/");
        String b=s.substring(0,a);
        int a1=s.indexOf("/",a+1);
        String b1=s.substring(a+1,a1);
        int a2=s.lastIndexOf("/");
        String b2=s.substring(a2+1);

        if(b1.length()<=1){
        
            b1="0"+b1;
        }
        if(b2.length()<=1){
            b2="0"+ b2;
        }
        if(b.length()<=1){
            b="0"+b;
        }


    String c=b1+"-"+b+"-"+b2;
    return c;

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

        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));

      
    }
}