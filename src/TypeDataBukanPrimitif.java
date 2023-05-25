public class TypeDataBukanPrimitif {
    public static void main(String[] args) {

        /**
        //Tipe Data Bukan Primitif


        //Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
        //Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
        //Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
        //Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
        //Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya

        //Tipe Data Primitif	Tipe Data Bukan Primitif

        //byte                 	Byte
        //short             	Short
        //int               	Integer
        //long	                Long
        //float	                Float
        //double	            Double
        //char	                Character
        //boolean	            Boolean


        //perhatikan perbedaan huruf awal */

        /**Tipe Data Primitif*/
        int iniInt = 100;
        long iniLong = 10000L;
        boolean iniBoolean = true;

        /**Tipe Data Bukan Primitif*/
        Integer iniInteger = 1000;
        Long iniLong2 = 10000L;
        Boolean iniBoolean2 = false;

        //kasus dibawah ini jika menggunakan type data bukan primitif maka bisa di run
        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //kasus dibawah ini jika menggunakan type data  primitif maka error, hapus// untuk melihat
        //byte iniByte2 = null;
        //System.out.println(iniByte);

        //iniByte = 100;
        //System.out.println(iniByte);


        /**cara konversi dari primirif ke bukan primitif*/

        Integer  iniObject = iniInt;

        /**
        //iniInt di konversi ke variabel iniObject dengan type data bukan primitif
        //bagaimana jika ingin konversi ke type data primitif dan berbeda type data? */

        short iniShort = iniObject.shortValue();
        long iniLong3 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        /**
        //perbedaan yang paling mencolok adalah disini type data bukan primitif(iniObject) bisa memanggil method bawaan seperti (.shortValue(), .longValue() dll)
        //sementara untuk data primitif tidak bisa
        //untuk operasi matematika dan logika menggunakan type data primitif sedangkan untuk type data bukan primitif kita harus konversi dulu ke type data primitif

        // jadi intinya
        //Secara keseluruhan, perbedaan antara tipe data primitif dan tipe data bukan primitif (wrapper class) adalah sebagai berikut:
        //
        //Tipe Data Primitif:
        //
        //Merupakan tipe data dasar yang telah ditentukan dalam bahasa pemrograman.
        //Menyimpan nilai langsung pada variabel.
        //Tidak memiliki metode atau fungsi tambahan.
        //Contoh tipe data primitif: byte, short, int, long, float, double, char, boolean.
        //Tipe Data Bukan Primitif (Wrapper Class):
        //
        //Merupakan kelas yang membungkus tipe data primitif.
        //Menggunakan objek untuk menyimpan nilai primitif.
        //Menyediakan metode dan fungsi tambahan melalui kelas tersebut.
        //Memungkinkan akses ke operasi tambahan yang tidak tersedia dalam tipe data primitif.
        //Contoh tipe data bukan primitif: Byte, Short, Integer, Long, Float, Double, Character, Boolean.
        //Beberapa perbedaan antara keduanya adalah:
        //
        //Tipe data primitif lebih efisien dalam penggunaan memori dan kinerja program karena tidak memerlukan alokasi objek yang kompleks.
        //Tipe data bukan primitif (wrapper class) menyediakan metode dan fungsi tambahan yang dapat digunakan untuk melakukan operasi dan manipulasi data.
        //Tipe data primitif dapat digunakan secara langsung untuk operasi matematika dan logika, sementara tipe data bukan primitif (wrapper class) memerlukan konversi ke tipe data primitif sebelum dapat digunakan dalam operasi tersebut.
        //Tipe data bukan primitif (wrapper class) dapat digunakan dalam konteks yang membutuhkan objek, seperti dalam koleksi (collections) atau penggunaan dengan API tertentu yang mengharuskan penggunaan objek.
        //Tipe data primitif biasanya digunakan dalam keadaan di mana kinerja dan penggunaan memori menjadi faktor penting, sementara tipe data bukan primitif (wrapper class) digunakan saat operasi tambahan atau pemrosesan objek diperlukan.
        //Perbedaan ini penting untuk dipahami karena penggunaan tipe data primitif atau tipe data bukan primitif (wrapper class) dapat memengaruhi kinerja, penggunaan memori, dan fungsionalitas dari program yang dibangun.*/

    }
}
