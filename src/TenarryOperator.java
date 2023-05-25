public class TenarryOperator {
    public static void main(String[] args) {


        /**Ternary Operator

        //Ternary operator adalah operator sederhana dari if statement
        //Ternary operator terdiri dari kondisi yang dievaluasi,
        //jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil


        // jika biasanya menggunakan if seperti ini

        // var nilai = 75;
        // String ucapan;
        // if (nilai >=75){
        //    System.out.println("selamat anda lulus");
        //} else {
        //    System.out.println("anda belum lulus");
        //}

        //jika menggunakan tenarry operator maka menjadi sperti ini*/

        var nilai = 75;
        String ucapan = nilai >= 75 ? "selamat anda lulus" : "anda belum lulus";
        System.out.println(ucapan);

    }
}
