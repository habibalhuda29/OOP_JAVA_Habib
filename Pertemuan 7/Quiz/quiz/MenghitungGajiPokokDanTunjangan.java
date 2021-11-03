import java.util.Scanner;
public class MenghitungGajiPokokDanTunjangan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pengabdian1; 
        double pengabdian2; 
        double golongan; 
        double gaji = 0; 
        double tunjangan = 0; 
        double jamKerja; 
        double jamLembur; 
        double lemburan = 0;
        
        System.out.print("Masukan Golongan: ");
        golongan = scanner.nextDouble();

        if (golongan == 1){
            gaji = 1486500;
            tunjangan = 250000;
        }
        else if (golongan == 2){
            gaji = 1926000;
            tunjangan = 300000;
        }
        else if (golongan == 3){
            gaji = 2456700;
            tunjangan = 350000;
        }
        else if (golongan == 4){
            gaji = 2899500;
            tunjangan = 400000;
        }

        System.out.println("Golongan yang dipilih: " + golongan);

        System.out.print("Masukan total jam kerja: ");
        jamKerja = scanner.nextDouble();

        if (jamKerja < 173){
          System.out.print("Jam kerja kurang dengan kontrak yang disesuaikan");
        }
        else if (jamKerja >= 173){
          jamLembur = jamKerja - 173;
          lemburan = 20000 * jamLembur;      
        }

        gaji = gaji + lemburan;

        pengabdian1 = 0.5 * gaji / 100;
        pengabdian2 = 0.5 * lemburan / 100;

        gaji  = gaji - pengabdian1;
        lemburan = lemburan + pengabdian2;

        System.out.println("total gaji anda: " + gaji);
        System.out.println("total tunjangan anda: " + tunjangan);

    }
    }