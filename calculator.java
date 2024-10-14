package assignments;

import java.util.*;

class Calculator {
public static double Add(double a, double b){
return a+b;}
public static double Sub(double a, double b){
return a-b;}
public static double Mult(double a, double b){
return a*b;}
public static double Div(double a, double b){
return a/b;}




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();

char op= sc.next().charAt(0);
switch(op){
case '+':
System.out.println(Add(a,b));
break;
case '-':
System.out.println(Sub(a,b));
break;
case '*':
System.out.println(Mult(a,b));
break;
case '/':
System.out.println(Div(a,b));
break;
default:
System.out.println("Wrong Input");


}
}
              }