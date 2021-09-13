class Recurrsion {

	int count = 0;

	public void test() {
		System.out.println("Recurrsion executing..." + count);
		count++; //count = count + 1; 
		if(count <  100) {
			test();	
		}

		System.out.println("Recurrsion execution end..we can do party." + count);		
	}

	public static void main(String[] args) {
		Recurrsion recurrsion = new Recurrsion();
		recurrsion.test()  ;
	}
}