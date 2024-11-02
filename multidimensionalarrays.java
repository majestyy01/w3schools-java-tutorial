public class multidimensionalarrays{
    public static void main(String[] args) {
        //example1
        int[][] sayilar = {{1,2,3,4},{5,6,7}};
        System.out.println(sayilar[1][2]); //0dan başlıyor ilk oalrak 1.küme yani sağdakine geldik son oalrak 0,1,2 olarak 7yi seçtik

        //example2
        int[][] sayilarr = {{1,2,3,4},{5,6,7}};
        sayilarr[1][2] = 9; //7yi 9la değiştirdik
        System.err.println(sayilarr[1][2]);

        //example3 döngü(loop)
        int[][] sayilarrr = {{1,2,3,4},{5,6,7}};
        for(int i = 0;i<sayilarrr.length;++i){
            for(int j =0;j < sayilarrr[i].length;j++){
                
                System.out.println(sayilarrr[i][j]);
            }
        }
        //example4 döngü 2 (loop)
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}