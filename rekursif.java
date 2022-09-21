class rekursif{





  
  public static int jumlah_deret (int a){
    if(a > 0){

      return a + jumlah_deret(a);
    }else{

      return 0;
    }
  }

  public static void kurang_prosedur(int a, int b){

    int jumlah = a - b;
    System.out.println(jumlah);
  }

  public static void main(String[] args){

    int res = jumlah_deret(10);

    System.out.println(res);
  }
}