/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanh
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank mybank = BankFactory.getBank(BankType.BIDV);
        System.out.println(mybank.getBankName());
        
        Bank mybank2 = BankFactory.getBank(BankType.MBBANK);
        System.out.println(mybank2.getBankName());
        
        Bank mybank3 = BankFactory.getBank(BankType.ACB);
        System.out.println(mybank3.getBankName());
    }
    
}
