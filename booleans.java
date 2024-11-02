public class booleans{
    /*
        Very often, in programming, you will need a data type that can only have one of two values, like:

        YES / NO
        ON / OFF
        TRUE / FALSE
     */
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean iscelerytasty = false;
        
        System.out.println(isJavaFun);
        System.out.println(iscelerytasty);

        //example2
        int x = 10;
        int y = 9;
        System.out.println(x > y); // true

        //example3 (easier than example2)
        System.out.println(10>9); // true

        //example4
        int xx =10;

        System.out.println(xx == 10); //true

        //example5
        System.out.println(10 > 15); //false

        //example6
        int yasim = 25;
        int secimyasi = 18;
        System.out.println(yasim >= secimyasi); //true

        //example7
        int yasim2 = 16;
        int secimyasi2 = 18;

        if(yasim>=secimyasi2){
            System.out.println("Yasiniz oy kullanacak kadar yeterli degil!!");
        }
        else{
            System.out.println("Yasiniz oy kullanmak için yeterli");
        }
    }
}