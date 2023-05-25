public class PenggunaanFinal {
    public static void main(String[] args) {

        /**Kata Kunci final

        //· Secara default, variable di Java bisa diubah-ubah nilainya
        //Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat,
        // kita bisa menggunakan kata kunci final
        //· Istilah variabel seperti ini, banyak juga yang menyebutnya konstan*/

        var name = "Tryadi";
        var age = 28;
        var address = "Malang";

        //contoh final
        final String application = "Belajar Java";

        //jika mencoba merubah value seperti ini maka akan eror
        //application = "belajar PHP";

        System.out.print("Hello my name is " + name + ", im a " +age + " old guy, who live in "+address);
    }
}
