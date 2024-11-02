public class arrayloop{
    public static void main(String[] args) {
        String[] isimler = {"Mert","Ali","Kaya","majestyy01"};
        for(int i = 0;i< isimler.length;i++){
            System.out.println(isimler[i]);
        }

        //foreach
        String[] cars = {"Volvo","Mercedes","BMW","Ford"};
        for(String i : cars){
            System.out.println(i);
        }

    }
}