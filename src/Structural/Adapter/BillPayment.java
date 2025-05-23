package Structural.Adapter;

public class BillPayment {

    public  void payBill(BankApi bankApi, int account)
    {
        if (bankApi.checkBanlance(account) < 15000)
        {
            bankApi.transferMoney();
            System.out.println("balance checked");
        }
        else {
            System.out.println("no tranfer");
        }
    }
}
