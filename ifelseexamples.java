public class ifelseexamples{
    public static void main(String[] args) {

        //example1
        int doorCode = 5858;
        if(doorCode == 5858){
            System.out.println("Kapı kodu doğru kapı açılıyor...");
        }
        else{
            System.out.println("Kapı kodu yanlış tekrar deneyiniz.");
        }

        //example2
        int sayi = 10;

        if(sayi > 0){
            System.out.println("Bu sayı pozitif bir sayıdır.");
        }
        else if(sayi < 0){
            System.out.println("Bu sayı negatiftir.");
        }
        else{
            System.out.println("Bu sayı 0'dır.");
        }
    }
}