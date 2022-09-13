class looping{
  public static void main(String[] args){
    
    int a = 1;
    int b = 0;
    
    while(a<=12){
      if(a==12){
        System.out.print(a);
      }
      else{
        System.out.print(a+"+");
      }
      b+=a;
      a++;
    }
    System.out.println("= "+b);

    System.out.println("\nDiatas menggunakan While Looping.");
  }
}