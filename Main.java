package com.guess;
import java.util.Scanner;
public class Main {
  static int picknumber(){
    double numToConvert=Math.random()*10+1;
    int numToGuess=(int) numToConvert;
    return numToGuess;
  }
  public static void main(String[] args) {
    int num=picknumber();
    int guess=11;int guesses=0;boolean exit=false;
    while (guess!=num && exit==false){
      Scanner scan=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      System.out.print("guess a number between 1 and 10:");
      guess=scan.nextInt();
      guesses++;
      System.out.print("do you want to exit?y/n: ");
      String toClose=sc.nextLine();
      if (toClose.equals("y")){
        exit=true;
        System.out.println("you guessed "+guesses+" times");
        scan.close();
        sc.close();
        guess=num;
      }else if (guess==num){
        System.out.println("Correct!");
        System.out.println("you guessed "+guesses+" times");
        scan.close();
        sc.close();
      }else{
        System.out.println("sorry, that was incorrect");
      }
    }
  }
}