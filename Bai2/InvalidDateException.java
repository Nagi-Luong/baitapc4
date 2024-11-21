package chuong4;

public class InvalidDateException extends Exception{
	public InvalidDateException(){
		
	 }
	
	public InvalidDateException(String mess) {
		super(mess);
	}
}