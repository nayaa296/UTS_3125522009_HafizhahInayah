public abstract class TenagaMedis {
    private String idMedis;
    private String nama;
    private double tarifDasar;

    public TenagaMedis(String idMedis, String nama, double tarifDasar) {
        setIdMedis(idMedis);
        setNama(nama);
        setTarifDasar(tarifDasar);
    }

    public void tampilkanProfil() {
        System.out.println("ID Medis   : " + idMedis);
        System.out.println("Nama       : " + nama);
        System.out.println("Tarif Dasar: Rp " + tarifDasar);
    }

    public abstract double hitungHonor(int jamKerja);

    public final String getIdMedis() {
        return idMedis;
    }

    public final void setIdMedis(String idMedis) {
        if (idMedis != null && !idMedis.isBlank()) {
            this.idMedis = idMedis;
        } else {
            System.out.println(">> Validasi Error: ID Medis tidak boleh kosong!");
        }
    }

    public final String getNama() {
        return nama;
    }

    public final void setNama(String nama) {
        if (nama != null && nama.trim().length() >= 3) {
            this.nama = nama;
        } else {
            System.out.println(">> Validasi Error: Nama tenaga medis minimal 3 karakter!");
        }
    }

    public final double getTarifDasar() {
        return tarifDasar;
    }

    public final void setTarifDasar(double tarifDasar) {
        if (tarifDasar >= 0) {
            this.tarifDasar = tarifDasar;
        } else {
            System.out.println(">> Validasi Error: Tarif dasar tidak boleh negatif!");
        }
    }
}