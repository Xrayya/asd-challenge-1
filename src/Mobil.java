public class Mobil {
    String tipe;
    String merk;
    int tahun;

    public Mobil(String merk, String tipe, int tahun) {
        this.tipe = tipe;
        this.merk = merk;
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return this.merk + " " + this.tipe + " (" + this.tahun + ")";
    }
}
