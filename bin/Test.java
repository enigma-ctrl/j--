
import java.lang.Double;
import java.lang.Integer;
import java.lang.System;


public static class Test{
    public static void main(String [] args){
        int x =5;
        if (x==4 || x==5) {
            System.out.println("Hello World"); //tests logical or
        }

        double y = 4.40;
        System.out.println((int)y); //cast double to an int
        double q = (double)x; //cast an int to a double

        char c = 'a'; //create char
        q = (double)c; //cast double to char


        Integer intboxedvalue = (Integer) 5;
        System.out.println((int) intboxedvalue); //unbox and print

        q=5.7;
        q =q-2.7;
        System.out.println((int)q);
        q = q + 2.5;
        System.out.println((int)q);

        x++;
        System.out.println(x); //post increment
        --x;
        System.out.println(x); //predecrement
        int i;
        for (i=0; 5 > i; ++i){
            System.out.println(x+i);
        }

    }

}