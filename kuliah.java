import java.util.Scanner;
class kuliah{
    static float MencariRata(int n, int[] nilai)
    {
        int jum = 0;
        for(int i = 0; i < n; i++) {
            jum = jum + nilai[i];
        }
        return jum/n;
    }

    static void bubbleSort(int n, int[] nilai, int[] nim) {  
        int tempnim = 0;
        int tempnilai = 0;

        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(nim[j-1] > nim[j]){ 
                    tempnim = nim[j-1];  
                    nim[j-1] = nim[j];  
                    nim[j] = tempnim;

                    tempnilai = nilai[j-1];  
                    nilai[j-1] = nilai[j];  
                    nilai[j] = tempnilai; 
                }      
            }  
        }

        for(int k = 0; k < n; k++){
            System.out.println(nim[k] + ", " + nilai[k]);
        }
   }

    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );

        int[] nilai;
        int[] nim;
        int n;

        System.out.print("Jumlah Mahasiswa : ");
        n = input.nextInt();
        nilai = new int[n];
        nim = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Masukkan NIM : ");
            nim[i] = input.nextInt();
            System.out.print("Masukkan Nilai : ");
            nilai[i] = input.nextInt();
            System.out.println("====");
        }

        int terbesar = 0;
        int terkecil = 0;

        for(int j = 1; j < n; j++) {
            if (nilai[terbesar] < nilai[j]){
                terbesar = j;
            }
            if (nilai[terkecil] > nilai[j]){
                terkecil = j;
            }
        }

        System.out.println("Nilai mahasiswa terbaik: " + nim[terbesar] + ", " + nilai[terbesar]);
        System.out.println("Nilai mahasiswa terbawah: " + nim[terkecil] + ", " + nilai[terkecil]);
        System.out.println("Nilai rata-rata mahasiswa: " + MencariRata(n, nilai));
        System.out.println("Urutan nilai mahasiswa per nim");
        bubbleSort(n, nilai, nim);
    }
}