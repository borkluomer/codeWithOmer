package WildCoding;

public class armStrongNumbers {

    public static void main(String[] args) {

        int number = 1634;
        int len=0;
        int myNumber=number;
        int myNumber1=number;
        int result=0;

        while(number!=0){  //153
            len++;
            number= number/10;}
        System.out.println(len);

        while(myNumber!=0) {
            int temp=1;
            int lastdigit=myNumber%10;
            for (int i = 1; i <=len ; i++) { temp *= lastdigit;}

            result += temp;
            myNumber=myNumber/10;}

        if ( result == myNumber1 )  {System.out.println("arms");}
        else  {System.out.println("not");}
    }
}
