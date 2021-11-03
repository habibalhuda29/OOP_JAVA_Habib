import java.util.Scanner;
public class Menghitung10Buah {
    public static void main(String[] args) {
        int jumlahBilangan = 10;
        float[] daftarBilangan = new float[jumlahBilangan];
        float total = 0;
        float rerata, max, min;
        
        Scanner userInput = new Scanner(System.in);
       
        System.out.println("ARRAY MENYIMPAN 10 BILANGAN FLOAT");
        for (int i = 0; i < daftarBilangan.length; i++) {
            System.out.print("Bilangan ke-" + (i+1) + " : ");
            daftarBilangan[i] = scanInput.nextFloat();
            total += daftarBilangan[i];
        }
       
        System.out.println("");
        rerata = total / jumlahBilangan;
        System.out.println("Nilai rata-rata bilangan di array = " + rerata);
       
        max = min = daftarBilangan[0];
        for (int i = 1; i < daftarBilangan.length; i++) {
            if(max < daftarBilangan[i])
            {
                max = daftarBilangan[i];
            }else if(min > daftarBilangan[i])
            {
                min = daftarBilangan[i];
            }
        }
       
        System.out.println("Bilangan terbesar = " + max);
        System.out.println("Bilangan terkecil = " + min);
    }
}