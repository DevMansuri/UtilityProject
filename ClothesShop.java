import java.util.Scanner;
/**
* <Class Comment>
* @Author - Nadim
* Date - 17/09/2021.
* Purpose of this class to execute basic program of Java to learn programming.
**/

class ClothesShop {
	 public void clothesvarity(String clothes , String size , String color) {
	 	switch (clothes) {
			case "shirt" :
	        	System.out.println("shirt is avalaibel");

			    switch (size) {
					case "xl"  :
					 System.out.println("xl is availabel");
					switch(color) {
						    case "black" :
							System.out.println("black is availabel");
							break;

							case "White" :
							System.out.println("white is availabel");
							break;

							case "blue" :
							System.out.println("blue is not availabel");

							break;
							default:
							System.out.println(" This color is Not availabel");
							break;
						}
				    break;
				    
				    default:
				    	System.out.println("Sorry ! Shirt size is not availabel");
	        	}
			break;

			case "jeans" :
	        	System.out.println("jeans  is avalaibel");

			    switch (size) {
					case"xl"  :
					System.out.println("xl is availabel");
					
					switch(color) {
							case "black" :
							System.out.println("black is availabel");
							break;

							case "White" :
							System.out.println("white is availabel");
							break;

							case "blue" :
							System.out.println("blue is not availabel");
							break;

							default:
							System.out.println("This color is Not availabel");
							break;
						}
				    break;

				    default :
						System.out.println("Sorry ! Jeans size  is not available.");
					break;
					}
			break;
		}
	}

	public static void main(String[] args) {

		ClothesShop clothesShop = new ClothesShop();
		Scanner scanner = new Scanner(System.in);

	    System.out.println("what do you need");
		String clothes = scanner.nextLine();

		System.out.println("what size do you need");
		String size = scanner.nextLine();


		System.out.println("Any color choice");
		String color = scanner.nextLine();
		
		clothesShop.clothesvarity( clothes,size,color);
	}
}


	 
