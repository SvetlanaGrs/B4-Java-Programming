package day40_exception.bank;
//Any class that is child class of RunTimeexception Class is  UNCHECKED or runtime exception class
//Any class that is child class of Exception class is checked /CompileTime exception[ except runtime exc]
public class NotEnoughBalanceException extends RuntimeException{
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
