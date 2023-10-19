package in.com.exception;

public class  LoginException extends RuntimeException {
  public LoginException() {
	  super("Invalid Synatx");
  }
}
