public class Mobil implements Comparable<Mobil> {
    String tipe;
    String merk;
    Integer tahun;

    public Mobil(String merk, String tipe, int tahun) {
        this.tipe = tipe;
        this.merk = merk;
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return this.merk + " " + this.tipe + " (" + this.tahun + ")";
    }

    @Override
    public int compareTo(Mobil anotherMobil) {
        int output = this.merk.compareTo(anotherMobil.merk);
        if (output == 0) {
            output = this.tipe.compareTo(anotherMobil.tipe);
        }
        if (output == 0) {
            output = this.tahun.compareTo(anotherMobil.tahun);
        }

        return output;
    }

    @Override
    public boolean equals(Object anotherMobil) {
        Mobil otherMobil = (Mobil) anotherMobil;
        return this.tipe.equals(otherMobil.tipe) && this.merk.equals(otherMobil.merk)
                && this.tahun.equals(otherMobil.tahun);
    }
}
