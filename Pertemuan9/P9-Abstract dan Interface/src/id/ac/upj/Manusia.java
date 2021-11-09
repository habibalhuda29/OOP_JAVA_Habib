package id.ac.upj;

abstract class Manusia {

    protected  String depan;
    protected  String belakang;
    protected  int umur;

    public String getDepan() {
        return depan;
    }

    public void setDepan(String depan) {
        this.depan = depan;
    }

    public String getBelakang() {
        return belakang;
    }

    public void setBelakang(String belakang) {
        this.belakang = belakang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    //Abstract Method
    public abstract void datasingkat();
    public abstract  void lengkap();

}