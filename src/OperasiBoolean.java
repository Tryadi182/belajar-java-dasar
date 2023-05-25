public class OperasiBoolean {
    public static void main(String[] args) {

        /**   Operator	    Keterangan
        //      &&	        Logika AND. Menghasilkan true jika kedua
        //                  operan bernilai true, dan false jika salah
        //                  satu atau kedua operan bernilai false.


        //       !	        Logika NOT. Menghasilkan kebalikan dari nilai
        //                  operan. Jika operan bernilai true, hasilnya
        //                  false, dan sebaliknya.

        //       ||	        Logika OR. operan bernilai true, dan false
        //                  jika kedua  operan bernilai false.



        // Table Guide &&

        //            Nilai 1	  Operator	    Nilai 2	    Hasil
        //            true	        &&	        true	    true
        //            true	        &&	        false	    false
        //            false	        &&	        true	    false
        //            false	        &&	        false	    false

        // Table Guide ||

        //            Nilai 1	  Operator	    Nilai 2	    Hasil
        //            true	        ||	        true	    true
        //            true	        ||	        false	    true
        //            false	        ||	        true	    true
        //            false	        ||	        false	    false

        // Table Guide !


        //  Nilai       Operator	    Hasil
        //  true	       !            false
        //  false	       !            true
         */

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir; //lulus absen false, lulus nilai akhir true maka hasil false (lihat tabel)
        var lulus2 = lulusAbsen || lulusNilaiAkhir;//lulus absen false, lulus nilai akhir true maka hasil true (lihat tabel)

        System.out.println(lulus);
        System.out.println(lulus2);


    }
}
