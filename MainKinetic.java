/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author cindy
 */
public class MainKinetic {
    
    String kecepatan, massa;

    public String getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
    
    public double HitungMainKinetic(){
        return 20 * 0.5 * Math.pow(2, 2);
    }
    
    public static void main(String[] args) {
        MainKinetic mainkinetic = new MainKinetic ();
        mainkinetic.setKecepatan("2");
        mainkinetic.setMassa("20");
        
        System.out.println(mainkinetic.HitungMainKinetic()+" N");
       
        
        
      
    }
    
}
