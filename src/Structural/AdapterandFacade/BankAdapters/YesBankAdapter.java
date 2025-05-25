package Structural.AdapterandFacade.BankAdapters;

import Structural.AdapterandFacade.BankApi;
import Structural.AdapterandFacade.BankApis.YesBankApis;

public class YesBankAdapter implements BankApi {
    YesBankApis yesBankApis= new YesBankApis();
    @Override
    public int checkBanlance(int balance) {
        return yesBankApis.getBalance(balance);
    }

    @Override
    public void transferMoney() {
        yesBankApis.yesTransfer();
    }
}
