package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        Scanner in= new Scanner(System.in);
        System.out.println("Task 1");
        List<String> m =sequence(500);
        System.out.println(m);
        System.out.println("Task 2");
        System.out.println(reverse("make install"));
        System.out.println("Task 3");
        System.out.print("a=");
        float a= in.nextFloat();
        System.out.print("b=");
        float b= in.nextFloat();
        System.out.print("c=");
        float c= in.nextFloat();
        List<String> unknowns =equation(a,b,c);
        if (unknowns==null){System.out.println("There are no real roots");}
        else {System.out.println(unknowns);}
        System.out.println("Task 4");
        System.out.println(sum());
        System.out.println("Task 5");
        System.out.println(palindrome("Do geese see God"));

    }
    public static List<String> sequence(int n){
        if (n<0){return null;}
        List<String> sequence =new ArrayList<>();
        for (int i=1; i<=n;i++){
            if (i % 5 == 0){
                sequence.add("fizz");
                if(i % 7 == 0){
                    sequence.set(i-1,"fizzbuzz");
                }
            } else if (i % 7 == 0) {
                sequence.add("buzz");
            }else {
                sequence.add(String.valueOf(i));
            }
        }
        return sequence;
    }
    public static String reverse(String n){
        StringBuilder reverse = new StringBuilder();
        for (int i = n.length()-1;i>=0; i--){
            reverse.append(n.charAt(i));
        }
        return reverse.toString();
    }
    public static List<String> equation(float a,float b,float c){
        List<String> unknowns =new ArrayList<>();
        float d=b*b-4*a*c;
        if(d<0){
            return null;
        } else if (d>0) {
            unknowns.add(String.valueOf((-b-Math.sqrt(d))/(2*a)));
            unknowns.add(String.valueOf((-b+Math.sqrt(d))/(2*a)));
        }else {
            unknowns.add(String.valueOf((b/(2*a))*-1));
        }
        return unknowns;
    }
    public static float sum (){
        float sum=0;
        float n=1;
        for (float i=2;n>=Math.pow(10,-6);i++){
            n=1/(i*i+i-2);
            sum = sum +n;
        }
        return sum;
    }
    public static boolean palindrome(String str){
        String strReverse=reverse(str).replaceAll(" ","");
        str=str.replaceAll(" ","");
        return str.equalsIgnoreCase(strReverse);
    }
}
