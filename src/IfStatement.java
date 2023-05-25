public class IfStatement {
    public static void main(String[] args) {


        /**#If Statement#
        //·
        //Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
        //Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        // Hampir di semua bahasa pemrograman mendukung if expression*/

        var nilai = 80;
        var absen = 60;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("selamat anda lulus");
        }else {
            System.out.println("anda belum lulus");
        }

            /**Else Statement#

            //else di tempatkan setelah block if selesai
            //Blok if akan dieksekusi ketika kondisi if bernilai true
            //Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
            //Hal ini bisa dilakukan menggunakan else expression

            //jika nilai nya false maka akan berpindah ke else


            //#Else If Statement#
            //Kadang dalam If, kita butuh membuat beberapa kondisi
            //Kasus seperti ini, di Java kita bisa menggunakan Else If expression
            // Else if di Java bisa lebih dari satu*/

            if (nilai >= 80 && absen >=80){
                System.out.println("Nilai anda A");
            } else if (nilai >= 70 && absen >= 70) {
                System.out.println("Nilai anda B");
            } else if (nilai >= 60 && absen >=60) {
                System.out.println("Nilai anda C");
            } else if (nilai >= 50 && absen >=60) {
                System.out.println("Nilai anda D");
            }else {
                System.out.println("Anda Sehat?");

        }
                            /**untuk guide selnjutnya if bisa cek class tenarry operator*/
        }
    }

