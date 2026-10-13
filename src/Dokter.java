public class Dokter extends TenagaMedis implements DapatDiaksesDarurat {
    private String spesialisasi;
    private double insentifTindakan;

    public Dokter(String idMedis, String nama, double tarifDasar, String spesialisasi, double insentifTindakan) {
        super(idMedis, nama, tarifDasar);
        setSpesialisasi(spesialisasi);
        setInsentifTindakan(insentifTindakan);
    }

    // Overriding Abstract Method
    @Override
    public double hitungHonor(int jamKerja) {
        return (getTarifDasar() * jamKerja) + insentifTindakan;
    }

    @Override
    public void tampilkanProfil() {
        super.tampilkanProfil();
        System.out.println("Spesialis  : Dokter " + spesialisasi);
        System.out.println("Insentif   : Rp " + insentifTindakan);
    }

    @Override
    public String getProtokolDarurat() {
        return "Dokter Spesialis " + spesialisasi + " SIAP untuk Operasi/Tindakan Kritis Darurat!";
    }

    @Override
    public void aktifkanPenangananCepat() {
        System.out.println(">> ALARM DARURAT: Dokter " + getNama() + " dipanggil ke Ruang Resusitasi!");
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public double getInsentifTindakan() {
        return insentifTindakan;
    }

    public void setInsentifTindakan(double insentifTindakan) {
        if (insentifTindakan >= 0) {
            this.insentifTindakan = insentifTindakan;
        } else {
            System.out.println(">> Validasi Error: Insentif tidak boleh negatif!");
        }
    }
}