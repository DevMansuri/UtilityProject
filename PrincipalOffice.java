/**
*@Author : Nadim mansuri
*Date : 19/09/2021
*Basic encapsulation and  polymorphism Example.
**/
class PrincipalOffice {
	private float accaountBalance;
    public String collageName = "mist";
    private float facultySalary;   //this is encapsulation example.
    public int studentFees;

    public float getBalance(){
    	return accaountBalance;
    }
	public void copyCheck() {

		}
}

class Class1st extends PrincipalOffice {
	public void copyCheck() {
		System .out.println("yes Class1st copy is check");
	}
}

class Class2nd extends PrincipalOffice {
	public void copyCheck() {
		System.out.println("yes Class2nd copyCheck");
	}

	public static void main(String[] args) {
		PrincipalOffice principalOffice; // this is polynorphism example.
		principalOffice = new Class1st();
		principalOffice.copyCheck();

		principalOffice = new Class2nd();
		principalOffice.copyCheck();

		System.out.println("collage Name is :" + principalOffice.collageName);
		System.out.println("Account Balance is :" + principalOffice.getBalance());	
	}
} 
