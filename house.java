class house{
  String color = "Merah";
  int pjg = 12;
  final String harga1 = "10 Juta";
  final String harga2 = "12 Juta";
  static String diskon = " Discount 10%";
  static double harga = 12, disc = 10;

  static void new_h(){
    System.out.println("Rumah ini BARU");
  }

  static void old_h(){
    System.out.println("Rumah ini LAMA");
  }

  public static void main(String[] args){

    house house_1 = new house();

    System.out.println("\nRumah ke 1 :\n"+house_1.color);
    System.out.println(house_1.pjg+" meter");
    System.out.println(house_1.harga1);
    house_1.old_h();

    System.out.println("\nRumah ke 2 :");
    house house_2 = new house();
    house_2.color = "biru";
    System.out.println(house_2.color);
    house_2.new_h();
    System.out.println(house_2.harga2+diskon+" (Free "
                       +(harga*disc)/100+" Juta)\n");
    
  }
  
}