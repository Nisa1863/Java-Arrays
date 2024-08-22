import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers= new int[7];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=100;
        numbers[3]= 'a';

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        /* bize ciktimizda java nesnelerin bellekteki adresine
        gore hesaplanan diziyi dondurur peki dizideki gercek
        ogeleri nasil gorebiliriz arrays.tostring yazarak
        ve bu methodumuzu ekranda gormek icin sytem.out println
        icine koyarak gorebiliriz ve biz 4,5,6ve 7. terimleri
        yazmamisiz ama ciktimizda 0 gozukuyor neden burda devreye
        boolen faktoru giriyor true or false bir sonucumuz yok o
        yuzden sifir olur
        numbers[4]= 'iki'; PEKI bu kodumuz olur mu olmaz
        harfimizde olmustu  ama burada bir kelime var
         */


        /* peki karakter yani string harf olsa ne olur
        harf olursa harfimizin ASCII koduna gider ve harfi
        nulmak icin tek tirnak kulandim neden cift tirnak degil
        ciftt tirnak o harfi direkt yazdirir ama burada dizin
        oldugu icin harfi okuyamayacagindan hata verir
         */



        // farkli bir yontem daha var//
        int []numbers1={2,3,4,5,7,8,'a','5',9};
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        /* peki sayilarin siralanmasini istersek ne yapmamiz
        lazim Arrays.sort() kullanmamiz lazim
         */



    }


}