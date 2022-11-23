package IS;

public class Car implements Comparable<Car> {
    String tipe;
    String merk;
    Integer yearOfRelease;

    public Car(String merk, String tipe, int tahun) {
        this.tipe = tipe;
        this.merk = merk;
        this.yearOfRelease = tahun;
    }

    @Override
    public String toString() {
        return this.merk + " " + this.tipe + " (" + this.yearOfRelease + ")";
    }

    @Override
    public int compareTo(Car anotherMobil) {
        int output = this.merk.compareTo(anotherMobil.merk);
        if (output == 0) {
            output = this.tipe.compareTo(anotherMobil.tipe);
        }
        if (output == 0) {
            output = this.yearOfRelease.compareTo(anotherMobil.yearOfRelease);
        }

        return output;
    }

    @Override
    public boolean equals(Object anotherMobil) {
        Car otherMobil = (Car) anotherMobil;
        return this.tipe.equals(otherMobil.tipe) && this.merk.equals(otherMobil.merk)
                && this.yearOfRelease.equals(otherMobil.yearOfRelease);
    }
}
