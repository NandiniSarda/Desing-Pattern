package Structural.Adapter.BankApis;

public class ICICIApi {
    public int fetchBalance(int balance)
    {
        System.out.println("icici bank check balance");
        return 1500;
    }
    public void iciciTransfer()
    {
        System.out.println("icici bank transfer");
    }

}
