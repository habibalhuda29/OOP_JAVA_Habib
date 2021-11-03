import java.util.Scanner;
 
class Soal1 {
    static int penjumlahan(int a, int b, int c)
    {
        int penjumlahan = a + b + c;
        return penjumlahan;
    }

    static int rata(int a, int b, int c)
    {
        int rata = (a + b + c) / 3;
        return rata;
    }

    static int maksimum(int a, int b, int c)
    {
        return Math.max(a, Math.max(b, c));
    }

    static int minimum(int a, int b, int c)
    {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String args[]){
       
        Scanner input;
        int a, b, c;

        input = new Scanner(System.in);

        System.out.print("Input Nilai : \n");
        System.out.print("nilai a = ");
        a = input.nextInt();
        System.out.print("nilai b = ");
        b = input.nextInt();
        System.out.print("nilai c = ");
        c = input.nextInt();

        System.out.println("\nHasil input data: \nNilai A : " + a + " \nNilai B : " + b + "\nNilai C : " + c);

    
        //System.out.println(" Hasil input data, " + input);
        
    }

    
}