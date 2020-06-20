/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri;

/**
 *
 * @author Fadil
 */
public abstract class kartu {
    private int p,j;

    public kartu() {
    }

    public kartu(int p, int j) {
        this.p = p;
        this.j = j;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }    
    
    public void pakai(){
        
    }
    
    @Override
    public String toString() {
        return "kartu{" + "panjang =" + p + ", lebar =" + j + '}';
    }
    
    
    
}
