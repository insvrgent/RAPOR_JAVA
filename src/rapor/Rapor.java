package rapor;
import java.util.Scanner; //karena program ini membutuhkan sistem yang tidak termasuk dalam default
public class Rapor   { 
    
    static int nilaiAkhir;
    static Scanner inputText = new Scanner(System.in);
    static String inputNama;
    static String grade;
    
    public static void main(String[] args) { 
        String identitas = "Zadit Taqwa Wahdana / XRPL3 / 40";
        System.out.println("Identitas : "+ identitas);
        String [] nama = {"Vania","Indira","Reva","Elfie","Friska", "Amanda", "Fara", "Amel", "Natasha", "Iva"};
        int [] nilai = {68,47,100,64,75, 12, 65, 78, 85, 53};
        int absen;
        int indexPencarian = -1;
        
        System.out.println("Masukkan nama siswa:");   
        inputNama = inputText.next();
        for (int i = 2; i < nama.length; i++) {
            if (inputNama.equalsIgnoreCase(nama[i]))
            {
                indexPencarian = i;
                System.out.println("nama ditemukan");
                absen = indexPencarian;
                absen += 1;
                System.out.println(inputNama + " absen ke " + absen );  
                nilaiAkhir = nilai[i];
                menghitungPerilaku(args);
            }  
        }
        if (indexPencarian == -1) 
        {
            System.out.println("Data tidak ditemukan, cari nama siswa yang sesuai");
            main(nama);
        } 
    }
    public static void menghitungPerilaku(String[] args) {
        System.out.println("apakah " +inputNama+ " berkelakuan baik? (Y/N):");
        String inputPerilaku = inputText.next();
        if (inputPerilaku.equalsIgnoreCase("y")) 
        {
            nilaiAkhir +=10;
            menghitungKejujuran(args);
        }
        else if (inputPerilaku.equalsIgnoreCase("n")) 
        {
            nilaiAkhir -=10;
            menghitungKejujuran(args);
        } 
        else 
        {
            System.out.println("jawab y atau n woi");
            menghitungPerilaku(args);
        }
    }
    public static void menghitungKejujuran(String[] args) {
        System.out.println("apakah " +inputNama+ " jujur? (Y/N):");
        String inputKejujuran = inputText.next();
        if (inputKejujuran.equalsIgnoreCase("y")) 
        {
           nilaiAkhir +=10;
            menghitungKepribadian(args);
        }
        else if (inputKejujuran.equalsIgnoreCase("n")) 
        {
            nilaiAkhir -=10;
            menghitungKepribadian(args);
        } 
        else 
        {
            System.out.println("jawab y atau n woi");
            menghitungKejujuran(args);
        }
    }
    public static void menghitungKepribadian(String[] args) {
        System.out.println("apakah " +inputNama+ " rajin? (Y/N):");
        String inputKebiasaan = inputText.next();
        if (inputKebiasaan.equalsIgnoreCase("y")) 
        {
           nilaiAkhir +=10;
           menghitungKebiasaan(args);
        }
        else if (inputKebiasaan.equalsIgnoreCase("n")) 
        {
            nilaiAkhir -=10;
            menghitungKebiasaan(args);
        } 
        else 
        {
            System.out.println("jawab y atau n woi");
            menghitungKepribadian(args);
        }
    }
    public static void menghitungKebiasaan(String[] args) {
        System.out.println("apakah kebiasaan " +inputNama+ " saat kbm?");
        System.out.println("1. mendengarkan guru");
        System.out.println("2. ngelamun");
        System.out.println("3. tidur");
        System.out.println("4. main game");
        System.out.println("5. pacaran");
        int inputKelakuan = inputText.nextInt();
        if (inputKelakuan >=1 && inputKelakuan <= 5) 
        {
            switch(inputKelakuan)
            {
                case 1: nilaiAkhir +=20; break;
                case 2: nilaiAkhir +=0; break;
                case 3: nilaiAkhir -=5; break;
                case 4: nilaiAkhir -=10; break;
                case 5: nilaiAkhir -=30; break;
            }
            ngeprint(args);
        }
        else 
        {
            System.out.println("jawab angka antara 1 sampai 5 woi");
            menghitungKebiasaan(args);
        }
    }
    public static void ngeprint(String[] args) {
       if (nilaiAkhir >= 140)
       {
           grade = "A+";   
       }
       else if (nilaiAkhir >= 130 && nilaiAkhir <= 140)
       {
           grade = "A";   
       }
       else if (nilaiAkhir >= 120 && nilaiAkhir <= 130)
       {
           grade = "A-";   
       }
       else if (nilaiAkhir >= 110 && nilaiAkhir <= 120)
       {
           grade = "B+";   
       }
       else if (nilaiAkhir >= 100 && nilaiAkhir <= 110)
       {
           grade = "B";   
       }
       else if (nilaiAkhir >= 90 && nilaiAkhir <= 100)
       {
           grade = "B-";   
       }
       else if (nilaiAkhir >= 80 && nilaiAkhir <= 90)
       {
           grade = "C+";   
       }
       else if (nilaiAkhir >= 70 && nilaiAkhir <= 80)
       {
           grade = "C";   
       }
       else if (nilaiAkhir >= 60 && nilaiAkhir <= 70)
       {
           grade = "C-";   
       }
       else if (nilaiAkhir >= 0 && nilaiAkhir <= 60)
       {
           grade = "D";   
       }
       
       System.out.println("total nilai "+inputNama +" "+nilaiAkhir + "Grade "+inputNama+" "+grade);
    }
}