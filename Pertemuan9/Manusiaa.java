abstract class Satu{
    public abstract void nama();
    public abstract void hobi();
    public abstract void umur();
}
class Dua extends Satu{
    public void nama(){
        System.out.println("Nama        : Bulbasaur");
    }
    public void hobi(){
        System.out.println("Hobi        : Makan");
    }
    public void umur(){
        System.out.println("Umur        : 20");
    }
}
class Manusiaa{
    public static void main(String[] args) {
        Dua v = new Dua();
        v.nama();
        v.hobi();
        v.umur();
    }
}