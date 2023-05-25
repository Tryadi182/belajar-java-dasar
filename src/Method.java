public class Method {
    public static void main(String[] args) {


        /**Method

        //Method adalah block kode program yang akan berjalan saat kita panggil
        //Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
        //Untuk membuat method di Java, kita bisa menggunakan kata kunci void,
        //lalu diikuti dengan nama method, kurung () dan diakhiri dengan block
        //Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
        //Di bahasa pemrograman lain, Method juga disebut dengan Function

         */

        //#ini pemanggilan method#
        sayHelloWorld();

        //#ini pemanggilan method param#
        sayMethodParam("Tryadi", "Wahyu");

        //#ini pemanggilan method return value1#
        var hasil = sum( 5,8);
        System.out.println(hasil);

        //atau bisa langsung
        System.out.println(sum(9,8));

        //#ini pemanggilan method return value2#
        System.out.println(hitung(8, "+" ,9));

        }

        //#contoh method#
    static void sayHelloWorld(){
        System.out.println("Hello World");
    }


    /**Method Parameter
    //Kita bisa mengirim informasi ke method yang ingin kita panggil
    //Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
    //Cara membuat parameter sama seperti cara membuat variabel
    //Parameter ditempatkan di dalam kurung () di deklarasi method
    //Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
     */


        // #contoh method parameter#
        static void sayMethodParam(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    /**Method Return Value
    //• Secara default, method itu tidak menghasilkan value apapun,
    //• namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai
    //• Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
    //• Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return,
    //• lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
    //• Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
     */


        //#contoh method retun value 1#

        static int sum(int value1 , int value2){
        var total = value1 + value2;
        return total;
    }
        //#contoh method retun value 2#
        static int hitung(int value1, String operasi, int value2){
        switch(operasi){
            case "+" : return value1 + value2;
            case "-" : return value1 - value2;
            case  "*" : return value1 * value2;
            default:
                return 0;
        }

                        /**materi berlanjut ke class method variable argument*/
        }

}
