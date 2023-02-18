package practise.Practise05;

public class PractiseForLoop06 {
    public static void main(String[] args) {
        // 5 den 10a kadar tam sayıların toplamını bulan kodu yaznız
        int sum=0;
        for(int i=5; i<=10; i++){
            sum+=i;


        }
        System.out.println(sum);

        int cbum=1;
        for(int n=6; n>=3; n--){
            cbum*=n;
            //System.out.println(cbum);
        }
        System.out.println(cbum);

   //bir tam sayının rakamlarının toplamını yazan kodu oluşturun

        int numb=3568;
        int num=0;

        for(int i=numb; i>0; i=i/10){
            num=num+i%10;
        }
        System.out.println(num);

    }
}
