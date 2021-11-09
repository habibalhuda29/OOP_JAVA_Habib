package id.ac.upj;

public class Pegawai extends Manusia {
    private String gelar = null;

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public void datasingkat() {
        this.lengkap();
        System.out.println("Umur            : " + this.getUmur() + " Tahun");
    }

    @Override
    public void lengkap() {
        System.out.println("Nama Pegawai    : " + this.getDepan() + " " + this.getBelakang() + " " + getGelar());
    }

    public static void main(String[] args) {
        Pegawai p = new Pegawai();

        p.setDepan("Budi");
        p.setBelakang("Rio");
        p.setUmur(20);
        p.setGelar("S.kom");

        p.datasingkat();
    }
}