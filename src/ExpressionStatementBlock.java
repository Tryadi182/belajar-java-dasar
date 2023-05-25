
import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {

        /**#Expression#

        //Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi
        //sebuah single value
        //Expression adalah core component dari statement
         */

        int value;
        value = 100; //berikut adalah baris expression(int value, value = 100) jika sudah ada tanda ; dia menjadi staement

        System.out.println(value = 100);
        //bagian  System.out.println(value = 100); ini adalah statement, sedangkan untuk value = 100 itu expression


        /**#Statement#

        //Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
        //Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma Ada beberapa jenis statement:
        //Assignment expression
        //Penggunaan ++ dan --
        //Method invocation
        //O Object creation expression */

        //contoh

        // assignment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date();



        /**#Block#

        //Block adalah kumpulan statement yang terdiri dari nol atau lebih statement. •
        //Block diawali dan diakhiri dengan kurung kurawal {}*/


        //Contoh Block

        //public class ExpressionApp {
        //   public static void main(String[] args) {
        //        double aValue = 8933.234;
        //        aValue++;
        //        System.out.println("Hello World!");
        //        Date date = new Date();
        //    }

            // bagian ini

            //public static void main(String[] args) {
            //   double aValue = 8933.234;
            //    aValue++;
            //    System.out.println("Hello World!");
            //    Date date = new Date();

            // adalah kumpulan statement dalam satu block (tanda {})
        }
    }
