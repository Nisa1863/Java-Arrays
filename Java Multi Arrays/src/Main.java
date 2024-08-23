import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][]numbers=new int[2][3];
        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[1][0]=3;
        numbers[1][2]=4;
        System.out.println(Arrays.toString(numbers));
        /*ciktimiz [[I@5f184fc6, [I@3feba861] bu swkilde cikti
        peki neden System.out.println(arrays.toString(numbers))
        dememize ragmen cunku burada cok boyutlu diziyle ugrasiyoruz
        bunu cok boyutlu bir dizide yapmamiz icin deepToString
        olarak kullanmamiz gerekiyorgormeniz icin asagida bir
        daha yazacagim
         */
        System.out.println(Arrays.deepToString(numbers));


        //baska bir yolu//
        int[][]numbers1={{1,2,3},{9,8,6,4,3}};
        /* sayilari sayi atayarakta degistirebiliriz
        numbers1[0][2]=5;
        numbers1[1][3]=7;

         */
        System.out.println(Arrays.deepToString(numbers1));
    }
}