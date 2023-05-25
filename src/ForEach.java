public class ForEach {
    public static void main(String[] args) {



        /**For Each
        //Kadang kita biasa mengakses data array menggunakann perulangan
        //Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
        //lalu mengakses array menggunakan counter yang kita buat
        //Namun untungnya, di Java terdapat perulangan for each,
        //yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis*/

        //contoh akses data aray menggunakan for biasa
        String[] names = {
                "tryadi", "bagus","refi","jon", "diandra"
        };
        for(var nameList = 0; nameList < names.length ; nameList++){
            //nameList = o maksudnya perulangan dimulai dari indeks ke 0 (tryadi)
            //nameList < names.length, names.length digunakan untuk mengecek jumlah data (jumlah elemen) dalam array
            //names.length, .length sendiri sudah bawaan dari java
            System.out.println(names[nameList]);
        }
        //Akses data array menggunakan for each
        System.out.println("FOR EACH");//ini untuk penanda saja
        for (var name:names){
            System.out.println(name); //kode lebih singkat dan simpel
        }
    }
}
