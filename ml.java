import java.util.*;
import java.util.Scanner;
import java.io.*;

class ml{

  String name_char;
  int health;
  int power;

  

  public ml(String p_name_char,int p_health,int p_power){

    name_char = p_name_char;
    health = p_health;
    power = p_power;
  }

  public void attack(ml o){
    o.health -= this.power;
    System.out.println("\n!!! "+this.name_char + " Menyerang " + o.name_char+" !!!");
    System.out.println("\nHealth " + o.name_char + " sekarang : "+o.health);
    System.out.println("---------------------------");
  }

  public void heal(){
    this.health += 10;
    System.out.println(this.name_char+" memulihan health ");
    System.out.println("\nHealth " + this.name_char + " sekarang : "+this.health);
  }

  public static void main(String[] args){
    
    
    ml alucard = new ml("Alucard", 100, 15);

    System.out.println(alucard.name_char);
    System.out.println("Health : " + alucard.health);
    System.out.println("Power : " + alucard.power);

    ml dyroth = new ml("Dyroth", 120, 10);

    System.out.println("\n"+dyroth.name_char);
    System.out.println("Health : "+dyroth.health);
    System.out.println("Power : "+dyroth.power);

    ml lord = new ml("Lord", 100, 20);

    System.out.println("\n"+lord.name_char+" with health poin : "+lord.health+"\n");
    
    
    System.out.print("Serang lord?(y/n) ");  
    String answer;
    boolean yn;
    Scanner scan = new Scanner(System.in);

    /*while (true) {
      answer = scan.nextLine().toLowerCase();
    if (answer.equals("y")) {
      yn = true;
      dyroth.attack(lord);
      break;
    }else if (answer.equals("n")) {
      yn = false;
      break;
    }else{
      System.out.println("Sorry, I didn't catch that. Please answer y/n");
      }
    }*/
    

    for(int i = 0;i<=lord.health;i++){
          while (true) {
      answer = scan.nextLine().toLowerCase();
    if (answer.equals("y")) {
      yn = true;
      dyroth.attack(lord);
      break;
    }else if (answer.equals("n")) {
      yn = false;
      System.out.println("\n!!!Game Over!!!");
      System.exit(0);
    }else{
      System.out.println("Mohon jawab y/n");
    }
    }
      
    }
    if(lord.health==0){
      System.out.println("\n!!!Lord Has Slain!!!");
    }
  
    
  }
}