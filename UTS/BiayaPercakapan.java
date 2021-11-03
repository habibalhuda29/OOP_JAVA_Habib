import java.util.Scanner;
public class BiayaPercakapan{
    public static void main(String[] args){
        
        int jam;

        int menit;
        
        int detik;

        Scanner Input = new Scanner(System.in);
        System.out.println("clock = ");
        jam = Input.nextInt();
        System.out.println("Minute = ");
        menit = Input.nextInt();
        System.out.print("second = ");
        detik = Input.nextInt();

        int jam1 = jam * 3600;
        int menit1 = menit * 60;

        int twaktu = jam + menit + detik;
        int pulsa = twaktu / 5;
        int biaya = pulsa * 150;

        System.out.println(jam+" jam : "+menit+" menit : "+detik+" detik ");
        System.out.println("TOTAL BIAYA YANG DIKELUARKAN = "+ biaya);
    }
}