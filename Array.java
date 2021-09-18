
/**
* <Class Comment>
* @Author - Nadim
* Date - 26th Aug 21
* Purpose of this class to execute basic program of Java to learn programming.
**/

class Array {
/*
    * <Method comment>
    * Date - 26th Aug 21
    */	
	
public void firstArray() {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
  
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
    	}
	}

/*
    * <Method comment>
    * Date - 26th Aug 21
    */
	public void secondArray() {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        int[][] c = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]);
            }

	}
}
public void thirdArray() {

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] c = new int[3][3];
        
  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	c[i][j] = a[i][j]-b[i][j];
                System.out.println(c[i][j]);
            }
	}
}
public void fourthArray() {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] c = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	c[i][j] = a[i][j] * b[i][j];
                System.out.println(c[i][j]);
            }
	}
}


public static void main(String[] args) {
	Array array = new Array();
	array.firstArray();
	//array.secondArray();
	//array.thirdArray();
	//array.fourthArray();
}
		
}					