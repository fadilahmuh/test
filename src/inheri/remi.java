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
public class remi extends kartu{
    private String merk;
    private int harga;

    public remi() {
    }

    public remi(String pembuat, int harga, int p, int j) {
        super(p, j);
        this.merk = pembuat;
        this.harga = harga;
    }

    public String getPembuat() {
        return merk;
    }

    public void setPembuat(String pembuat) {
        this.merk = pembuat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "remi{" + super.toString()+ "pembuat=" + merk + ", harga=" + harga + '}';
    }

    @Override
    public void pakai() {
        System.out.println("OPEN TABLE!!");
    }
    
    
    
}
