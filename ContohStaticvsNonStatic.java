public class ContohStaticvsNonStatic {

    public static double hitungluaspersegi(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luaspersegi = ContohStaticvsNonStatic.hitungluaspersegi(20);
        System.out.println("Luas Persegi: " + luaspersegi);

        ContohStaticvsNonStatic object = new ContohStaticvsNonStatic();
        object.tampilkanselamatdatang("Poda Alvien Damanik");
    }

    public void tampilkanselamatdatang(String nama) {
        System.out.println("Selamat datang " + nama + "!");
    }
}
