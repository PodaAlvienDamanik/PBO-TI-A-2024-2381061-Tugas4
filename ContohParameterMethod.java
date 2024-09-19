public class ContohParameterMethod {

    public static int Kalidua(int angka) {
        return angka * 2;
    }


    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }


    public static void main(String[] args) {
        int hasilkalidua = Kalidua(5);
        System.out.println("5 x 2= " + hasilkalidua);
    }
}
