import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello data!");
        System.out.println(10+10);
        System.out.println("me and my bro");
        int number1=10;
        int number2=3;
        System.out.println(number2+number1);
        double pi=3.14;
        boolean isAdult=true;
        char a='e';
        byte n=  126;
        int amount=1_000_000_008;
        System.out.println(amount);
        //arithmetic
        int numberOne=10;
        int numberTwo=20;
        System.out.println(numberOne+numberTwo);
        System.out.println(numberOne-numberTwo);
        System.out.println(numberOne*numberTwo);
        System.out.println(numberOne/numberTwo);
        System.out.println(numberOne%numberTwo);
        //increment and decrement
        int number=0;
//        int increment=number+1;
//        int decrement=number-1;
//        System.out.println(increment);
//        System.out.println(decrement);
        System.out.println(number++);
        System.out.println(number);
        System.out.println(number--);
        //Naming variables
        int goals=0;
        System.out.println(goals);
         //booleans
        boolean hasCat=false;
         //strings
        String phone_number="356-5332-3342";
        System.out.println(phone_number);
        //Reference types and objects
            int age=21;
        Point pointA=new Point(10,10);
        System.out.println("PointA="+pointA);
        System.out.println(pointA.distanceSq(44,33));
        //Arrays
        int[] numbers=new int[3];
        numbers[0]=3;
        numbers[1]=321;
        numbers[2]=33;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        int[] numbers2={3,5,7,3,2,6,7,};
        System.out.println(numbers2.length);
        numbers2[2]=45;
        String[] names={"Ndeta", "vome","moumeni"};
        System.out.println(Arrays.toString(names));
        //Array null numbers

    }
}