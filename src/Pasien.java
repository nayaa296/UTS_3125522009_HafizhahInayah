public class Pasien implements DapatDiaksesDarurat {
    private String idPasien;
    private String nama;
    private int umur;
    private String penjamin; 
    private boolean statusKritis;

    public Pasien(String idPasien, String nama, int umur, String penjamin, boolean statusKritis) {
        setIdPasien(idPasien);
        setNama(nama);
        setUmur(umur);
        setPenjamin(penjamin);
        this.statusKritis = statusKritis;
    }

    public void tampilkanInfoPasien() {
        System.out.println("ID Pasien : " + idPasien);
        System.out.println("Nama      : " + nama);
        System.out.println("Umur      : " + umur + " Tahun");
        System.out.println("Penjamin  : " + penjamin);
        System.out.println("Prioritas : " + (statusKritis ? "TRIAGE MERAH (Gawat Darurat)" : "TRIAGE HIJAU (Rutin)"));
    }

    @Override
    public String getProtokolDarurat() {
        return "Pasien " + nama + " (" + (statusKritis ? "Kritis" : "Stabil") + ") butuh penanganan segera!";
    }

    @Override
    public void aktifkanPenangananCepat() {
        System.out.println(">> TRIAGE SISTEM: Jalur Cepat IGD diaktifkan untuk pasien " + nama);
    }

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        if (idPasien != null && !idPasien.isBlank()) {
            this.idPasien = idPasien;
        } else {
            System.out.println(">> Validasi Error: ID Pasien wajib diisi!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0 && umur <= 120) {
            this.umur = umur;
        } else {
            System.out.println(">> Validasi Error: Umur pasien tidak valid!");
        }
    }

    public String getPenjamin() {
        return penjamin;
    }

    public void setPenjamin(String penjamin) {
        if (penjamin.equalsIgnoreCase("BPJS") || penjamin.equalsIgnoreCase("Asuransi") || penjamin.equalsIgnoreCase("Mandiri")) {
            this.penjamin = penjamin;
        } else {
            System.out.println(">> Validasi Error: Penjamin harus BPJS, Asuransi, atau Mandiri!");
            this.penjamin = "Mandiri";
        }
    }

    public boolean isStatusKritis() {
        return statusKritis;
    }

    public void setStatusKritis(boolean statusKritis) {
        this.statusKritis = statusKritis;
    }
}