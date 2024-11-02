public class reallifeexamples{

    public static void main(String[] args) {

        //Ogrenci Bilgileri
        String studentName = "Mert";
        int studentID = 5;
        int studentAge = 16;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        //print variables
        System.out.println("Ogrenci Adi: "+studentName);
        System.out.println("Ogrenci Numarasi: "+studentID);
        System.out.println("Ogrenci Yasi: "+studentAge);
        System.out.println("Ogrenci Ucreti: "+studentFee);
        System.out.println("Ogrenci Notu: "+studentGrade);

        //Diktdörtgen alanı hesaplama
        int length = 5;
        int width = 10;
        int area;

        area = length * width;

        System.out.println("Length: "+ length);
        System.out.println("Width: "+ width);
        System.out.println("Area of the rectangle is: "+ area);

    }
}