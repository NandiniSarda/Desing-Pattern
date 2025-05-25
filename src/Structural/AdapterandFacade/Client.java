package Structural.AdapterandFacade;

import Structural.AdapterandFacade.BankAdapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        BankApi bankApi= new YesBankAdapter();
        PhonePe phonePe= new PhonePe(bankApi);
        phonePe.payBill(12345);
    }
}
