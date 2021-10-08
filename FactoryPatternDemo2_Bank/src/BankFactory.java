/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanh
 */
public class BankFactory {
    public static final Bank getBank(BankType type){
        switch(type){
            case MBBANK:
                return new MBBank();
            case BIDV:
                return new BIDV();
            default:
                throw new IllegalArgumentException("This bank is not supported yet");
        }
    }
}
