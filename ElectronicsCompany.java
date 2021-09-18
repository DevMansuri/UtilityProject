/**
*@Author : Nadim mansuri.
*Date  :18/09/2021
*Basic inheritence Example.ss
**/
class ElectronicsCompany {

	String mobile = "android";
	String headphones = "wireless";
	String tv  = "andriod";

	private int laptop = 10;

	public int getLaptoCount() {
		return laptop;
	}

}

class SamsungCompany extends ElectronicsCompany {
		public static void main(String[] args) {

		ElectronicsCompany electronicsCompany = new ElectronicsCompany();

		SamsungCompany samsung = new SamsungCompany();
     
    	 samsung.headphones = "wire";

     	System.out.println("Mobile : " + samsung.mobile);
     	System.out.println("Headphones : " + samsung.headphones);
     	System.out.println("Tv : " + samsung.tv);
     	System.out.println("Laptop : " + samsung.getLaptoCount());


	}


}
