import java.util.Scanner;
 
class Soal3 extends Soal1 {
    public static void main(String args[]){
        Soal1 soal1 = new Soal1();

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

        System.out.println("\nHasil Maksimum data: " + soal1.maksimum(a, b, c));
        System.out.println("\nHasil Minimum data: " + soal1.minimum(a, b, c));
    }
}