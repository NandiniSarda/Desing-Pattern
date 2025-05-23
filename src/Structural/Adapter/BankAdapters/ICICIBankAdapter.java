package Structural.Adapter.BankAdapters;

import Structural.Adapter.BankApi;
import Structural.Adapter.BankApis.ICICIApi;

public class ICICIBankAdapter implements BankApi {
    ICICIApi iciciApi= new ICICIApi();
    @Override
    public int checkBanlance(int balance) {
        return iciciApi.fetchBalance(balance);
    }

    @Override
    public void transferMoney() {
        iciciApi.iciciTransfer();
    }
}
