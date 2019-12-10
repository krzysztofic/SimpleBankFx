package bank;

public class AccountsException extends Exception {

    private String message;

    public AccountsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
