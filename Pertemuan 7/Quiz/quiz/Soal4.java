import java.util.Scanner;

class Soal4
{
    public static void main(String args[])
    {
        Scanner input;
        
        int lamaPemakaian;
        int jenisPemakaian;
        int waktuPemakaian;
        int biayaInternet = 4000;
        int biayaPengetikan = 2000;
        int biayaGameOnline = 5000;
        
        char lagi;

        float totalBiaya = 0;

        // lembarScan;
        // lembarPrintHitamPutih;
        // lembarPrintWarna;
        // jmlTehBotol;
        
        input = new Scanner(System.in);

        do
        {
            System.out.print("\nTotal Biaya: " + totalBiaya);

            System.out.print("\n1. Internet\n2. Pengetikan\n3. Game-Online\n4. Keluar\nInput Jenis Pemakaian:\n");
            jenisPemakaian = input.nextInt();
            
            System.out.print("\nInput Waktu Pemakaian: (Menit)\n");
            waktuPemakaian = input.nextInt();        

            if (waktuPemakaian < 30)
            {
                waktuPemakaian = 30;
            }

            switch (jenisPemakaian) {
                case 1:
                    totalBiaya += waktuPemakaian * biayaInternet / 60; 
                    break;
                case 2:
                    totalBiaya += waktuPemakaian * biayaPengetikan / 60; 
                    break;
                case 3:
                    totalBiaya += waktuPemakaian * biayaGameOnline / 60; 
                    break;
                default:
                    totalBiaya += 0;
                    break;
            }

            System.out.print("\nApakah ingin Menambahkan Jenis Pemakaian: (y/t)\n");
            lagi = input.next().charAt(0);
        }
        while (lagi == 'Y' || lagi == 'y');
        
        System.out.print("\nTotal Biaya: " + totalBiaya);
        
    }
}