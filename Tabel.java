/**
*Author : Nadim mansuri.
Create a class Table to use Recursion.ss
**/
class Tabel {
	public int number = 2;

	static {
		System.out.println("static block");
	}

	public void tablecount() {
		System.out.println("Table exicuting :" + number);
		number = number + 2;

		if(number < 22) {
			tablecount();
		}

		System.out.println("Table end : =" + number);
	}

	public static void main(String[] args) {
		Tabel tabel = new Tabel();
		tabel.tablecount();
	} 

}