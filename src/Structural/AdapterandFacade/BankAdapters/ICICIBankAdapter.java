package Structural.AdapterandFacade.BankAdapters;

import Structural.AdapterandFacade.BankApi;
import Structural.AdapterandFacade.BankApis.ICICIApi;

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
