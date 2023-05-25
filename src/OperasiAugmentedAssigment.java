public class OperasiAugmentedAssigment {
    public static void main(String[] args) {

            /**Operasi Matematika	Augmented Assignment

            //a = a + 10	        a += 10
            //a = a - 10	        a -= 10
            //a = a * 10	        a *= 10
            //a = 10	            a = 10
            //a = a / 10	        a /= 10
            //a = a % 10	        a %= 10

            */

        int c = 100;

        c = c + 10;
        //sama dengan c = c + 10 (100 + 10 = 110)
        System.out.println(c);

        c -= 10;
        //sama dengan c = c - 10 (110 (110 dari operasi penjumlahan diatas sebelumnya) - 10 = 100)
        System.out.println(c);

        c *= 10;
        //sama dengan c = c * 10 (100 (dari operasi pengurangan diatas)* 10 = 100)
        System.out.println(c);
    }
}
