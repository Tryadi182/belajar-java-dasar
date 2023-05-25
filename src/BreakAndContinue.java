public class BreakAndContinue {
    public static void main(String[] args) {


        /**Break & Continue


        //Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
        //Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan. Namun berbeda dengan continue,
        //continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya
        */

       //Break


        var counter =1;
        while (true){
            System.out.println("perulangan "+ counter);
            counter++;

                    if(counter > 10){
                        break;
                    }
        }
        System.out.println("Perulangan Berhenti");

    //Continue

        for (var counter2 = 1;counter2 <= 10;counter2++){
            if (counter2 % 2 == 1){
                continue;
            }
            System.out.println("Perulangan Genap " + counter2);

        }
        System.out.println("Perulangan Genap Berhenti");
    }
                        /**materi akan berlanjut di class for each untuk array*/
}
