package pabrikan;

import Kendaraan.sepedaMotor;

public class HandoBeat extends sepedaMotor {
    public HandoBeat(String warna) {
        super(warna);
        this.ukuranTanki = 4;
    }

    public boolean jalan() {
        if (super.jalan() == true) {
            System.out.println("Motor Beat akan bensin pada " + super.cekKapanHabis());
        }
        return false;
    }
}
