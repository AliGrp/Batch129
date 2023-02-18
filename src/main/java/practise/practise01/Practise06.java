package practise.practise01;



public class Practise06 {
    private static int notKnow(int a,int s,int d){
        return a/d*s;
    }
  private static int aliBaba(int f,int g,int h){
      return f*g+h;
  }


    public static void main(String[] args) {
        //verilen 3 sayıdan ilk ikisini çarpan çıkan sonuçla üçüncü topla
        int sonuç= aliBaba(5,6,7);
        System.out.println(sonuç);

        int sonuç2 = notKnow(4,65,2);
        System.out.println(sonuç2);
    }


}
