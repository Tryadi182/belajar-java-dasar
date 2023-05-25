public class ArrayDalamArray {
    public static void main(String[] args) {

        /**Array dalam array
        //illustrasi
        // _________________________
        //|         |          |    |
        //|  "try"  | "aldous" |    |
        //|_________|__________|____|
        //|         |          |    |
        //|  "budi" | "doremi" |    |
        //|_________|__________|____|
        //|         |          |    |
        //|"macbeth"|          |    |
        //|_________|__________|____|

         */



        String[][] members= {
                {"try" , "aldous"},
                {"budi", "doremi"},
                {"macbeth"}
        };

        //ambil data "aldous"
        System.out.println(members [0][1]); //aldous ada di index ke 2[1] di baris pertama [0]
        //ambil data "budi"
        System.out.println(members [1][0]); //budi ada di index ke pertama [0] di baris kedua [1]
        //ambil data "macbeth"
        System.out.println(members[2][0]); //macbeth ada di index ke pertama [0] di baris ketiga [2]
    }
}
