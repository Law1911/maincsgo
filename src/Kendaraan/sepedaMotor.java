package Kendaraan;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class sepedaMotor {
    private String warnaMotor;
    protected int ukuranTanki;
    private LocalDateTime waktuIsiBensin;

    public sepedaMotor(String warna) {
        this.warnaMotor = warna;
        this.ukuranTanki = 3;
        this.waktuIsiBensin = null;
    }

    public void isiTankiFull() {
        waktuIsiBensin = LocalDateTime.now();
    }

    public String cekKapanHabis() {
        LocalDateTime wh = this.waktuIsiBensin.plusHours(this.ukuranTanki * 1);
        DateTimeFormatter waktu = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        String waktuH = waktu.format(wh);
        return waktuH;
    }

    public boolean jalan() {
        boolean go = false;
        if (waktuIsiBensin != null) {
            System.out.println("Sepeda motor sedang berjalan");
            go = true;
        } else {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
        }
        return go;
    }
}
