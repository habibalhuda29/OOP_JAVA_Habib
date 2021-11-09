abstract class Hewan2 {
    //Abstract Method (tidak memiliki body)
    public abstract void suara();

    //Regular Method
    public void tidur(){
        System.out.println("ZZZZ.....");
    }
}
class Ayam2 extends Hewan2 {
    public void suara(){
        System.out.println("Suara ayam: kukuruyuk.....");
    }
}
class Abstrak1{
    public static void main(String[] args) {
        //Membuat objek ayam2
        Ayam2 ayam = new Ayam2();
        ayam.suara();
        ayam.tidur();
    }
}