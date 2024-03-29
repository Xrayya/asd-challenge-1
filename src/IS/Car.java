package IS;

public class Car implements Comparable<Car> {
    String brand;
    String tipe;
    Integer yearOfRelease;
    String vehicleNumber;

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String merk) {
        this.brand = merk;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.tipe + " (" + this.yearOfRelease + ")";
    }

    @Override
    public int compareTo(Car anotherMobil) {
        int output = this.brand.compareTo(anotherMobil.brand);
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
        return this.tipe.equals(otherMobil.tipe) && this.brand.equals(otherMobil.brand)
                && this.yearOfRelease.equals(otherMobil.yearOfRelease);
    }
}
