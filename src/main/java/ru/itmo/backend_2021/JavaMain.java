package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
    System.out.println(fib(10));
  }
// SEQUENCE NUMBERING BEGINS FROM 1 AND NOT FROM 0. SO 1st NUMBER IS 0 AND NOT 1
  public static int fib(int n) {
    // Your code goes here
    int n1=0,n2=1,k=2,temp=0;
    if(n==1){return 0;}
    else if(n==2){return 1;}
    else{
     while (k!=n){
       temp=n1+n2;
       n1=n2;
       n2=temp;
       k++;
     }
     return n2;}
    }
   //throw new NotImplementedError("");
    // And ends there
  }

