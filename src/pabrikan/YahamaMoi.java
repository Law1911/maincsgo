package pabrikan;

import Kendaraan.sepedaMotor;

public class YahamaMoi extends sepedaMotor {
    public YahamaMoi(String warna) {
        super(warna);
        this.ukuranTanki = 5;
    }

    public boolean jalan() {
        if (super.jalan() == true) {
            System.out.println("Bensin akan habis pada " + super.cekKapanHabis());
        }
        return false;
    }
}
