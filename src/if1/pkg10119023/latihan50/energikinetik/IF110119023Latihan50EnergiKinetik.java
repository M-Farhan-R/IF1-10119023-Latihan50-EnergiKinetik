/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menghitung energi kinetik
 *
 */
public class IF110119023Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Soal mencari energi kinetik dan usaha
         * m = 145 gram
         * v = 25 m/s
         * untuk usaha:
         * v1 = 0
         */
        float m = 145;
        int v = 25; //kecepatan normal/akhir
        int v1 = 10; //kecepatan awal
        
        //declare class inside class
        IF110119023Latihan50EnergiKinetik.energiDanUsaha main = 
                new IF110119023Latihan50EnergiKinetik.energiDanUsaha(v, v1, m);
        main.EnergiKinetik();
        main.Usaha();
    }
    static class energiDanUsaha{
        int v,v1;
        float m,ek,w;
        energiDanUsaha(int kecepatan,int kecepatan2,float massa){
            v = kecepatan;
            v1 = kecepatan2;
            m = massa;
        }
        public void EnergiKinetik(){
            EnergiKinetik eK = new EnergiKinetik();
            eK.setMassa(m);
            eK.setKecepatan(v);
            eK.setEnergiKinetik(m, v);
            ek = eK.getEnergiKinetik();
            float m = eK.getMassa();
            
            System.out.printf("Massa Benda : %.0f g%n",m);
            System.out.println("Kecepatan Benda : "+eK.getKecepatan()+" m/s");
            System.out.println("---------------------------------");
            System.out.println("Energi Kinetik : "+ek+" J");
            System.out.println("===================================");
        }
        public void Usaha(){
            Usaha W = new Usaha(v,v1,m);
            w = W.getUsaha();
            if(v1==0){
                System.out.println("Kecepatan Awal : "+v+" m/s");
                System.out.println("Kecepatan Akhir : "+v1+" m/s");
                System.out.println("-----------------------");
                System.out.println("karena kecepatan awal = 0, maka");
                System.out.println("Usaha = Energi Kinetik");
                System.out.println(w + "J = " + ek+" J");
                System.out.println("==================================");
            }else{
                w = W.getUsaha();
                System.out.println("Kecepatan Awal : "+v+" m/s");
                System.out.println("Kecepatan Akhir : "+v1+" m/s");
                System.out.println("-----------------------");
                System.out.println("Usaha yang dibutuhkan agar mencapai");
                System.out.println("kecepatan tersebut sebesar : "+w+" J");
                System.out.println("====================================");
            }
        }
    }
    
    
}
