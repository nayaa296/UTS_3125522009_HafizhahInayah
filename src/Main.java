public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    SISTEM MANAGEMENT KLINIK UTAMA (UTS PBO)");
        System.out.println("=================================================\n");

        Dokter drAnandi = new Dokter("DOC-001", "dr. Anandi Sp.A", 150000, "Anak", 500000);
        Perawat perawatSiti = new Perawat("NRS-002", "Siti Amalia A.Md.Kep", 50000, "Malam", 100000);
        
        Pasien pasienAhmad = new Pasien("PSN-101", "Ahmad Fauzi", 8, "BPJS", false);
        Pasien pasienBudi = new Pasien("PSN-102", "Budi Santoso", 45, "Mandiri", true);

        System.out.println("--- [1. POLYMORPHISM ABSTRACT CLASS (HONOR MEDIS)] ---");
        TenagaMedis[] timMedis = { drAnandi, perawatSiti };
        for (TenagaMedis tm : timMedis) {
            tm.tampilkanProfil();
            System.out.println("Honor (8 Jam Kerja): Rp " + tm.hitungHonor(8));
            System.out.println("-------------------------------------------------");
        }

        System.out.println("\n--- [2. POLYMORPHIC INTERFACE (DARURAT / TRIAGE)] ---");
        DapatDiaksesDarurat[] unitDarurat = { drAnandi, pasienBudi };
        for (DapatDiaksesDarurat unit : unitDarurat) {
            System.out.println(unit.getProtokolDarurat());
            unit.aktifkanPenangananCepat();
            System.out.println();
        }

        System.out.println("--- [3. RELASI PELAYANAN & FITUR KALKULASI PENJAMIN] ---");
        PelayananKlinik p1 = new PelayananKlinik("SRV-001", pasienAhmad, drAnandi, 350000);
        p1.cetakResiPelayanan();

        System.out.println("\n=================================================");
        System.out.println("               PENGUJIAN UTS SELESAI");
        System.out.println("=================================================");
    }
}