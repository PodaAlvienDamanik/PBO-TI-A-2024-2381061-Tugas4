import javax.imageio.ImageTranscoder;

public class ContohMethodOverLoading {

    public static double hitungluas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungluas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungluas(double jarijari, boolean isiLingkaran) {
        if (isiLingkaran) {
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungluas(5);
        System.out.println("luas Persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungluas(5, 6);
        System.out.println("luas Persegi Panjang: " + luasPersegiPanjang);

        double luaslingkaran = hitungluas(5, true);
        System.out.println("luas Lingkaran: " + luaslingkaran);

    }
}
