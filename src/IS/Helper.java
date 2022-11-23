package IS;

import java.util.Locale;

import ADT.ILinkList;
import ADT.LinkList;

class Helper {

    static ILinkList<Service> initializeServices() {
        ILinkList<Service> services = new LinkList<>();

        services.addLast(new Service(
                "Ganti Oli",
                500000,
                "Layanan ganti oli adalah layanan standar untuk mengganti oli pada mesin. Layanan ini tidak"
                        + "membutuhkan waktu yang lama. Harga standar dari layanan ini adalah Rp. 500.000"));

        services.addLast(new Service(
                "Operasi Mobil",
                2000000,
                "Mobil Anda mengalami mogok mendadak? Tidak bisa dinyalakan? Tenang, kami memiliki tenaga" +
                        " ahli untuk mengoperasi mobil Anda. Cukup dengan Rp.  2.000.000, mobil Anda akan sehat" +
                        " seperti sedia kala"));

        services.addLast(new Service(
                "Ketok Magic",
                3000000,
                "Ketok Magic adalah layanan sulap untuk menghilangkan penyok pada body" +
                        " mobil. Apapun masalahnya, BIM SALABIM, bakal waras! Rogoh kantong Anda" +
                        " sebanyak Rp. 3.000.000 dan dapatkan mobil baru seperti sedia kala."));

        services.addLast(new Service(
                "Mobil Racing",
                5000000,
                "Bagi kalian jiwa muda yang ingin balapan, kami bisa modifikasi mobil kalian" +
                        " dengan tambahan NOS, serta body standar untuk balapan seharga Rp. 5.000.000" +
                        " saja dan mobil Anda siap untuk menembus angin."));

        services.addLast(new Service(
                "Mobil Elektrik",
                5500000,
                "Modifikasi ini adalah modifikasi baru pada layanan bengkel kami, dimana Anda" +
                        " dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik dengan" +
                        " harga Rp. 5.500.000."));

        return services;
    }

    // static boolean authentication(String username, String password) {
    // // Rubah Kode di sini
    // for (int i = 0; i < Main.admins.length; i++) {
    // if (Main.admins[i].isMatch(username, password)) {
    // return true;
    // }
    // }
    // return false;
    // }

    static String getFormattedPrice(int price) {
        return String.format(Locale.ITALY, "Rp. %,d", price);
    }
}
