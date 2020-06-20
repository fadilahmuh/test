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
public class etoll extends kartu{
    private String publisher;
    private int saldo;

    public etoll() {
    }

    public etoll(String publisher, int saldo, int p, int j) {
        super(p, j);
        this.publisher = publisher;
        this.saldo = saldo;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "etoll{" +super.toString()+ "publisher=" + publisher + ", saldo=" + saldo + '}';
    }

    @Override
    public void pakai() {
        System.out.println("Tempel di gerbang toll");
    }
    
    
}
