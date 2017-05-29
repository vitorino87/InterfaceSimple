/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesimple;

/**
 *
 * @author tiago.lucas
 */
public class InterfaceSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.showA();
        
        A a1 = new Test();
        a1.showA();
        
        a1 = t1;
        a1.showA();
    }
    
}
