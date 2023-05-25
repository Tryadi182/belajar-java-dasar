public class MethodVariableArgument {
    public static void main(String[] args) {

        /**Method Variable Argument

        //• Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
        // • Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
        // • Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
        // • Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
         */

        //#Pemanggilan Method array tanpa Variable Argument
        int valuesList[] = {40,60,80,50,90};
        sayCongrats("Tryadi", valuesList );

        ////#Pemanggilan Method array dengan Variable Argument, lebih simple dan cepat
        sayCongrats2("Tryadi",80,80,80,85,90 );

    }

    //#contoh Method array tanpa Variable Argument
    static  void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total/ values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name +", Anda lulus(dan ini hasil method tanpa variable argument)");
        }else {
            System.out.println("Maaf " + name +", Anda Tidak lulus(dan ini hasil method tanpa variable argument)");
        }
    }
    static  void sayCongrats2(String name, int... values){ //penggunaan ...  pada parameter int akan mempermudah pemanggilan
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total/ values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name +", Anda lulus(dan ini hasil method dengan variable argument)");
        }else {
            System.out.println("Maaf " + name +", Anda Tidak lulus(dan ini hasil method dengan variable argument)");
        }
    }
                        /**untuk selnjutnya silakan lihat class Method Overloading*/
}
