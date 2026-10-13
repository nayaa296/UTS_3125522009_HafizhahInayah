public class PelayananKlinik {
    private String idPelayanan;
    private Pasien pasien;
    private TenagaMedis tenagaMedis;
    private double biayaTindakan;

    public PelayananKlinik(String idPelayanan, Pasien pasien, TenagaMedis tenagaMedis, double biayaTindakan) {
        this.idPelayanan = idPelayanan;
        this.pasien = pasien;
        this.tenagaMedis = tenagaMedis;
        this.biayaTindakan = biayaTindakan;
    }

    public double hitungTotalBiaya() {
        double total = biayaTindakan;
        if (pasien.getPenjamin().equalsIgnoreCase("BPJS")) {
            total = total * 0.20; 
        } else if (pasien.getPenjamin().equalsIgnoreCase("Asuransi")) {
            total = total * 0.50; 
        }
        return total;
    }

    public void cetakResiPelayanan() {
        System.out.println("===== RESI PELAYANAN KLINIK =====");
        System.out.println("ID Layanan   : " + idPelayanan);
        System.out.println("Nama Pasien  : " + pasien.getNama() + " (" + pasien.getPenjamin() + ")");
        System.out.println("Tenaga Medis : " + tenagaMedis.getNama());
        System.out.println("Biaya Normal : Rp " + biayaTindakan);
        System.out.println("Biaya Final  : Rp " + hitungTotalBiaya() + " (Setelah Potongan Penjamin)");
        System.out.println("=================================");
    }
}