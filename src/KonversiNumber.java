public class KonversiNumber {
    public static void main(String[] args) {


        /**Konversi Tipe Data Number
        //Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double (bilangan kecil ke bilangan besar)
        // Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte (bilangan besar ke bilangan kecil)*/

        //Widening Casting (Otomatis)
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Narrowing Casting (Manual) (tambahkan tipe data dalam kurung)
        int iniInt2 = 1000;
        short iniShort2 = (short)iniInt2;
        byte iniByte2 = (byte)iniShort2;



    }
}
