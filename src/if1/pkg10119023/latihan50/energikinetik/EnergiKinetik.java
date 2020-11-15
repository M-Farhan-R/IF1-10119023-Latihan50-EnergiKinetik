/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.lahitan50.energikinetik;

/**
 *
 * @author Muhammad Farhan R 
 */
public class EnergiKinetik {
    //rumus Ek = 1/2m.v^2
    //m dengan satuan kg
    public  int kecepatan;
    public float massa,energiKinetik;
    
    public float getMassa(){
        return massa;
    }
    
    public void setMassa(float massa){
        this.massa = massa;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(int kecepatan){
        this.kecepatan =  kecepatan;
    }
    
    public void setEnergiKinetik(float massa, int kecepatan){
        energiKinetik = massa*kecepatan*kecepatan*0.5f;
    }
    
    public float getEnergiKinetik(){
        return energiKinetik;
    }
}
