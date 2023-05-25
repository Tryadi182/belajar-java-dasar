public class ForLoop {
    public static void main(String[] args) {


        /**For Loop

        //For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        //Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi


        //Sintak Perulangan For
        //for(init statement; kondisi; post statement){
        //}
        //block perulangan
        //Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        //Kondisi akan dilakukan pengecekan dalam setiap perulangan,
        //jika true perulangan akan dilakukan, jika false perulangan akan berhenti
        //Post statement akan dieksekusi setiap kali diakhir perulangan
        //Init statement, Kondisi dan Post Statement tidak wajib diisi,
        //jika Kondisi tidak diisi, berarti kondisi selalu bernilai true*/

        //kondisi perulangan tanpa henti

        //   for (;;){ //kode ;; berarti tidak ada kondisi dan expression, maka sistem akan print out tanpa henti
        //       System.out.println("Perulangan tanpa henti");
        //   }
        //perulangan dengan kondisi
        var counter = 1;


        for (; counter <= 10; ) {
            System.out.println("Perulangan " + counter);    // ketika counter <=10, maka akan masuk ke perintah print out
            // karena ada counter ++ maka akan ditambah satu terus
            //setelah kondisi terpenuhi yaitu counter sudah mencapai 10 maka perulangan berhenti
            counter++;
        }
        System.out.println(counter);    /**pengecekan jumlah counter hasilnya akan 11, karena pengulangan terjadi 11 kali
        //karena sudah lebih dari 10 maka kondisinya false dan akan terhenti*/


        //pengulangan dengan innit statement


        for (var initCounter = 1; initCounter <= 10; ) {
            System.out.println("Perulangan2 " + initCounter);
            initCounter++;
        }

        //pengulangan dengan post statement


        for (var postCounter = 1; postCounter <= 10; postCounter++) {
            System.out.println("Perulangan3 " + postCounter);

        }


        /**While Loop


        //While loop adalah versi perulangan yang lebih sederhana dibanding for loop
        //•
        //Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement*/

        var whileCount = 1;
        while (whileCount <=10){
            System.out.println("Perulangan4 " + whileCount);

            whileCount++;
        }


        /**Do While Loop

        //Do While loop adalah perulangan yang mirip dengan while
        //Perbedaannya hanya pada pengecekan kondisi
        //Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan,
        //sedangkan di do while loop dilakukan setelah perulangan dilakukan
        //Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true*/


        var doWhileCounter = 1;
        do {
            System.out.println("Perulangan5 " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter <= 10);
    } //jika doWhileCounter misalkan 100 maka kondisi sudah false,maka sistem akan printout Perulangan5 100, kode akan dieksekusi minimal sekali
}
                                        /**materi akan berlanjut di class Break & continue*/
