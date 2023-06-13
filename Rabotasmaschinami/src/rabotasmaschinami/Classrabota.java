/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabotasmaschinami;


public class Classrabota {
    private int fuelcap;// емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон
    private int mestopas;
   
    
    
    

    Classrabota(int fuelcap, int mpg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    public int getRange() {
//        return range;
//    }
    int km;
    int carNam;
   
    
    public boolean getInfo(int km) {
        this.km = km;
        if (fuelcap * mpg >= this.km) {
            return true;
        } else {
            return false;
        }

    }
    
     public Classrabota(int fuelcap, int mpg, int mestopas) {
        this.fuelcap = fuelcap;
        this.mpg = mpg;
        this.mestopas=mestopas;
        }

    public int getMestopas() {
        return mestopas;
    }

//    public int getRange() {
//        return range;
//    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }
    public Classrabota(int mestopas ) {
     this.mestopas = mestopas;
    }
}

