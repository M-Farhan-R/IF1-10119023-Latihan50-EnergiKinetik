/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan50.energikinetik;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Usaha {
    private float w,m;
    private int v,v1;
    
    Usaha(int v,int v1,float m){
        this.v = v;
        this.v1 = v1;
        this.m = m;
        this.w = 0.5f*m*(v*v-v1*v1);
    }
    
    public float getUsaha(){
        return w;
    }
}
