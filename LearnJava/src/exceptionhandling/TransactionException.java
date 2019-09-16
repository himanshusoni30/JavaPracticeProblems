package exceptionhandling;

public class TransactionException extends Exception{
	
	private String errorMessage;
    private String errorCode;

    public TransactionException(String errorMessage, String errorCode){
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }

    public String getErrorCode(){
        return errorCode;
    }

    public String getMessage(){
        return errorMessage;
    }
}
