import java.util.HashMap;

class array{
  public static void main(String[] args){
    
    HashMap<String, String> datamahasiswa
      = new HashMap<String, String>();
    
    datamahasiswa.put("nama", "Rio");
    datamahasiswa.put("nim","09021382126170");
    datamahasiswa.put("hp","09021382126170");
    
      System.out.println(datamahasiswa.get("nama"));
    
  }
}