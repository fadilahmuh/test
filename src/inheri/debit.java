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
public class debit extends kartu{
    private String bank,pemilik;
    private int no_kartu;

    public debit() {
    }

    public debit(String bank, String pemilik, int no_kartu, int p, int j) {
        super(p, j);
        this.bank = bank;
        this.pemilik = pemilik;
        this.no_kartu = no_kartu;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public int getNo_kartu() {
        return no_kartu;
    }

    public void setNo_kartu(int no_kartu) {
        this.no_kartu = no_kartu;
    }

    @Override
    public String toString() {
        return "debit{" +super.toString()+ "bank=" + bank + ", pemilik=" + pemilik + ", no_kartu=" + no_kartu + '}';
    }

    @Override
    public void pakai() {
        System.out.println("Masukan ke ATM");
    }
    
    
    
}
