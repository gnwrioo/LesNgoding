import java.util.Scanner;

class no_1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nama : ");
    String userName = scan.nextLine();

    System.out.println("Nama anda adalah: " + userName);

    Scanner hitung = new Scanner(System.in);

    System.out.print("Nilai panjang : ");
    int panjang = hitung.nextInt();

    System.out.print("Nilai Lebar : ");
    int lebar = hitung.nextInt();

    System.out.println("Hasilnya = "+ panjang*lebar);
  }
}