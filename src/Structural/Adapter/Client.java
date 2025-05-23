package Structural.Adapter;

import Structural.Adapter.BankAdapters.ICICIBankAdapter;
import Structural.Adapter.BankAdapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        BankApi bankApi= new YesBankAdapter();
        PhonePe phonePe= new PhonePe(bankApi);
        phonePe.payBill(12345);
    }
}
