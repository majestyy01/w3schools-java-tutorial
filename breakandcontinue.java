public class breakandcontinue{
    public static void main(String[] args) {
        //example1
        for(int i = 0;i<=10;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }

        //example2
                for(int i = 0;i<=10;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        //example3
        int i =0;
        while(i <10){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }
        //example4
        int b = 2;
        while(b < 10){
            if(i==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++; // bu kısımda sınırsız döngüye girer çalıştırmanızı tavsiye etmiyorum eğer kaydetmediyseniz

        }

    }
}