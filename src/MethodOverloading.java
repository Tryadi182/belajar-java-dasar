public class MethodOverloading {
    public static void main(String[] args) {

        /**Method Overloading
        //• Method overloading adalah kemampuan mmbuat method dengan nama yang sama lebih dari sekali.
        //• Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, entah jumlah atau tipe data parameternya
        //• Jika ada yang sama, maka program Java kita akan error
         */


        sayHello();
        sayHello("Tryadi");
        sayHello("Tryadi", "Wahyu");

        //pemanggilan method tanpa recursive
        System.out.println(factorialLoop(5));

        //pemanggilan method dengan recursive
        System.out.println(factorialRecursive(5));

    }
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " +lastName);
    }



    /**Recursive Method
    //• Recursive method adalah kemampuan method memanggil method dirinya sendiri
    //• Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method,
    // seperti contohnya kasus factorial (contoh factorial 3 = 3x3, 3x2, 3x1)
     */


    //contoh method tanpa recursive
    static int factorialLoop(int value){
        var result = 1;

        for (var counter = 1 ; counter <= value ; counter++){
            result *= counter;
        }
        return result;

    }

    //kali ini kita gunakan recursive

    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }
        else {
           return value * factorialRecursive(value -1);
        }
        /** NOTE!!!!!
        //  Problem Dengan Recursive
        //• Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
        //• Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
        //• Kenapa problenn ini bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain,
        //• maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow
            */
         }
}
