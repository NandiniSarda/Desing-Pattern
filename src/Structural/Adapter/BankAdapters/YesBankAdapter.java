package Structural.Adapter.BankAdapters;

import Structural.Adapter.BankApi;
import Structural.Adapter.BankApis.YesBankApis;

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
