package Structural.Adapter;

public class PhonePe {
    BillPayment billPayment;
    BankApi bankApi;
    public  PhonePe(BankApi bankApi)
    {
        this.bankApi= bankApi;
        billPayment= new BillPayment();
    }
    public void payBill(int account)
    {
        billPayment.payBill(bankApi,account);
    }
}
