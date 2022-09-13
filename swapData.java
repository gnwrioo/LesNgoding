class swapData{
  public static void main(String[] args){
    int a = 1;
    int b = 2;
    int temp;

    System.out.println("Nilai a sebelum di swap = "+a+
                      "\nNilai b sebelum di swap = "+b);
    System.out.println();
    
    temp = a;
    System.out.println("\nnilai temp = "+temp);

    a = b;
    b = temp;

    System.out.println("\nNilai a sesudah di swap = "+a+ 
                       "\nNilai b sesudah di swap = "+b);
  }
}