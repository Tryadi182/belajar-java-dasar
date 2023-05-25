public class TypeDataArray {
    public static void main(String[] args) {

        /**Tipe Data Array
        //· Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        //· Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
        // Untuk cara kerjanya, tentukan  panjang arraynya berapa

        //ilustrasi
        // _______________________________________
        //|       |       |       |       |       |
        //|  [0]  |  [1]  |  [2]  |  [3]  |  [4]  |
        //|_______|_______|_______|_______|_______|

        //panjang array = 5 (index dimulai dari 0)
        //type data nya harus sama */

        String [] arrayString = new String[5];
        arrayString[0] =  "Tryadi";
        arrayString[1] =  "Wahyu";
        arrayString[2] =  "Widodo";
        arrayString[3] =  "Wicaksono";
        arrayString[4] =  "Goks";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[4]);

        /**cara cepat*/

        String[] arrayNama = {"wiwit","refo","bagus","jon","gendut"};
        System.out.println(arrayNama);

        int[] arrayInt ={10,20,30,40,50};
        System.out.println(arrayInt);


        /**
        // Operasi     	        Keterangan
        // array[index]	        Mengambil data di array
        // array[index] =        value	Mengubah data di array
        // array.length	        Mengambil panjang array
         */

        long[] arraylong ={10,20,30,40,50};
        System.out.println(arraylong.length);

        //untuk menghapus data di array tidak bisa, yang bisa dilakukan hanya mengganti value menjadi 0

        arraylong[1]=0; //berarti merubah index array 1 (20) menjadi 0


                    /** Untuk materi Selanjutnya tentang array coba cek class array dalam array*/
    }
}
