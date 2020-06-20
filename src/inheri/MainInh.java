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
public class MainInh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        debit dbt = new debit ("BNI","Fadil",4234, 8, 5);
        etoll tol = new etoll("Flazz",30000,9,5);
        remi rem = new remi("CardsBee",20000,9,6);
       
        kartu[] myCard = {dbt,tol,rem};
        for(kartu cd : myCard){
            System.out.println(cd.toString());
            cd.pakai();
        }                    
    }
    
}
