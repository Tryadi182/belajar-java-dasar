public class OperasiMatematika {
    public static void main(String[] args) {

        /**operasi matematika

        // Operator 	Deskripsi	                                Contoh

        //   +	        Penjumlahan	                                int hasil = 4 + 2;
        //   -	        Pengurangan	                                int hasil = 7 - 3;
        //   *	        Perkalian	                                int hasil = 5 * 6;
        //   /	        Pembagian	                                int hasil = 10 / 2;
        //   %	        Modulo (Sisa Pembagian)	                    int hasil = 10 % 3;
        //   ++	        Penambahan 1 (Increment)	                int angka = 5; angka++;
        //   --	        Pengurangan 1 (Decrement)	                int angka = 7; angka--;
        //   +=	        Penambahan dengan Penugasan	                int angka = 3; angka += 2;
        //   -=	        Pengurangan dengan Penugasan	            int angka = 8; angka -= 4;
        //   *=	        Perkalian dengan Penugasan	                int angka = 2; angka *= 3;
        //   /=	        Pembagian dengan Penugasan	                int angka = 10; angka /= 2;
        //   %=	        Modulo dengan Penugasan	                    int angka = 7; angka %= 3;
        //   ==	        Perbandingan Kesamaan	                    boolean hasil = (5 == 5);
        //   !=	        Perbandingan Ketidaksamaan	                boolean hasil = (7 != 3);
        //    >	        Perbandingan Lebih Besar	                boolean hasil = (8 > 4);
        //    <	        Perbandingan Lebih Kecil	                boolean hasil = (3 < 7);
        //    >=	    Perbandingan Lebih Besar atau Sama Dengan	boolean hasil = (6 >= 6);
        //    <=	    Perbandingan Lebih Kecil atau Sama Dengan	boolean hasil = (2 <= 5);

         */

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a * b);

        int value1 = 100;
        int value2 = 100;
        int d =7;
        int e =3;

        System.out.println(value1 > value2);//false
        System.out.println(value1 < value2);//false
        System.out.println(value1 >= value2);//true
        System.out.println(value1 <= value2);//true
        System.out.println(value1 == value2);//true
        System.out.println(value1 != value2);//false
        System.out.println(d %= e); /**Dalam operasi ini, 7 dibagi dengan 3 menghasilkan hasil pembagian 2 dengan sisa 1.
                                    //Jadi, nilai dari angka akan diupdate
                                    //menjadi 1, yang merupakan sisa bagi dari operasi tersebut*/
        System.out.println(a *= b);
        System.out.println(a /= b);
    }
}
