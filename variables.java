public class variables{

    /*
        In Java, there are different types of variables, for example:

        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false 
    */
    public static void main(String[] args) {
        //Syntax : type variableName = value;

        String name = "Mert Ali Kaya";
        System.out.println(name);

        int age = 16;
        System.out.println(age);

        int sayi = 15;
        sayi=17; //Sayım şuan 17
        System.out.println(sayi);

                   
        /*            
            Final Variables
            final int sayi2 = 15;
            sayi2 = 20; hata verir çünkü final kullandık  
        */

            //Other Types
            int sayii = 5;
            float floatnum = 5.99f;
            char harf = 'M';
            boolean secim = true;
            String metin = "Mert Ali";

            System.out.println(sayii+" "+floatnum+" "+harf+" "+secim+" "+metin); //toplu yazdırdım
            
    }
}