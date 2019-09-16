package hackerrankprob2;

public class DigitalWalletTransaction {
	public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException
    {
        int balance=digitalWallet.getWalletBalance();
//        try{
            // System.out.println(digitalWallet.getUserAccessToken());
            if(amount<=0){
                throw new TransactionException("Amount should be greater than zero","INVALID_AMOUNT");
            }            
            else if(digitalWallet.getUserAccessToken()==null)
            {
                throw new TransactionException("User not authorized","USER_NOT_AUTHORIZED");
            }
            else if(amount > 0 && digitalWallet.getUserAccessToken() != null){
                balance=amount+balance;
                digitalWallet.setWalletBalance(balance);
            }
//        }
//        catch(TransactionException ex)
//        {
//            System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
////        		ex.printStackTrace();
//        }
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException
    {
        int balance=digitalWallet.getWalletBalance();
//        try
//        {
            // System.out.println(digitalWallet.getUserAccessToken());
            if(amount <= 0){
                throw new TransactionException("Amount should be greater than zero","INVALID_AMOUNT");
            }
            else if(digitalWallet.getUserAccessToken() == null)
            {
                throw new TransactionException("User not authorized","USER_NOT_AUTHORIZED");
            }
            else if(digitalWallet.getWalletBalance()<amount)
            {
                throw new TransactionException("Insufficient balance","INSUFFICIENT_BALANCE");
            }
            else if(amount > 0 && digitalWallet.getUserAccessToken() != null && digitalWallet.getWalletBalance()>=amount)
            {
                balance=balance-amount;
                digitalWallet.setWalletBalance(balance);
            }
//        }
//        catch (TransactionException ex) {
//            System.out.println(ex.getErrorCode() + ": " + ex.getMessage()+".");
////        	ex.printStackTrace();
//        }
    }
}
