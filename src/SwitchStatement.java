public class SwitchStatement {
    public static void main(String[] args) {

        /**Switch Statement

        //Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        //Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
        //Kondisi di switch statement HANYA UNTUK PERBANDINGAN == */

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Nilai Anda Bagus");
                break;  /**break digunakan dalam switch statement untuk menghentikan percabangan
            //jika tidak ada break maka kode akan dieksekusi terus ke case B , case C sampai menemukan break
            //Maka println di case C akan ikut ke print out */
            case "B":
            case "C":
                System.out.println("Nilai Anda Sedang");
                break;
            case "D":
                System.out.println("Sinauo Tel");
                break;
            default:
                System.out.println("We Salah Jurusan Rupane");
                /**bagian default ini mirip seperti else
                //jika value tidak sama dengan case yang dibuat maka akan langsung menuju default*/
        }
        /** Untuk versi kode lebih sederhana bisa menggunakan Switch Lambda


        //Switch Lambda

        //Di Java versi 14, diperkenalkan switch expression dengan lambda
        //Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break*/

        //var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Suangar");  //baris ini ->{} yang disebut lambda
            case "B", "C" -> System.out.println("Biasa");
            case "D" -> System.out.println("Tolong Ditingkatkan");
            default -> System.out.println("Astaghfirullah");
        }


        /**Kata Kunci yield
        //
        // DiJava 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk
        //mengembalikan nilai pada switch statement
        // Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement*/



        String ucapan = switch (nilai) {
            case "A":
                yield "Suangar";
            case "B", "C":
                yield  "Biasa";
            case "D" :
                yield "Tolong Ditingkatkan";
            default :
                yield "Astaghfirullah";
        };
        System.out.println(ucapan);
    }
}
