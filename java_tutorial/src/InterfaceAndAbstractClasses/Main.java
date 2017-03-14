package InterfaceAndAbstractClasses;

public class Main {
	
	 public static void main(String[] args) {
	        ITelephone timsPhone;
	        timsPhone = new DeshPhone(123456);
	        timsPhone.powerOn();
	        timsPhone.callPhone(123456);
	        timsPhone.answer();
	    }
}

