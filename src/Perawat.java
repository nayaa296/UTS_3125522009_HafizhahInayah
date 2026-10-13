public class Perawat extends TenagaMedis {
    private String shift; 
    private double tunjanganShift;

    public Perawat(String idMedis, String nama, double tarifDasar, String shift, double tunjanganShift) {
        super(idMedis, nama, tarifDasar);
        setShift(shift);
        setTunjanganShift(tunjanganShift);
    }

    @Override
    public double hitungHonor(int jamKerja) {
        double total = getTarifDasar() * jamKerja;
        if (shift.equalsIgnoreCase("Malam")) {
            total += tunjanganShift * 1.5; 
        } else {
            total += tunjanganShift;
        }
        return total;
    }

    @Override
    public void tampilkanProfil() {
        super.tampilkanProfil();
        System.out.println("Shift Kerja: " + shift);
        System.out.println("Tunjangan  : Rp " + tunjanganShift);
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getTunjanganShift() {
        return tunjanganShift;
    }

    public void setTunjanganShift(double tunjanganShift) {
        if (tunjanganShift >= 0) {
            this.tunjanganShift = tunjanganShift;
        } else {
            System.out.println(">> Validasi Error: Tunjangan shift tidak boleh negatif!");
        }
    }
}