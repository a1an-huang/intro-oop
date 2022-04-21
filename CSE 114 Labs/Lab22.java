//Alan Huang CSE114.02 L10 Lab 22
public class Lab22 {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(array);
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {         
				System.out.print(array[i][j] );
                if(j % 2 == 0 && j < array.length - 1){
                    System.out.print(", ");
                }
                if(j % 2 != 0 && i != array.length - 1){
                    System.out.print("}, {");
                }
			}
		}   
        System.out.println("}");   
        MyInteger i1 = new MyInteger(3);
        MyInteger i2 = new MyInteger(6);
        System.out.println("Is 3 Odd : " + i1.isOdd());
        System.out.println("Is 3 Even : " + i1.isEven());
        System.out.println("Is 3 Prime : " + i1.isPrime());
        System.out.println("Is 6 Odd : " + i2.isOdd());
        System.out.println("Is 6 Even : " + i2.isEven());
        System.out.println("Is 6 Prime : " + i2.isPrime());
        System.out.println("Is the numbers equal : " + i1.equals(i2.getValue()));
    }
    public static void sort(int m[][]){
        int[] min = new int[2];
        for (int i = 0; i < m.length - 1; i++){
            min[0] = m[i][0]; 
            min[1] = m[i][1]; 
            int index = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] <= min[0] && (m[j][0] < min[1] || m[j][1] < min[0] || m[j][1] < min[1])) { 
                    min[0] = m[j][0];
                    min[1] = m[j][1];
                    index = j;
                }
            }
            if (index != i){
                m[index][0] = m[i][0];
                m[index][1] = m[i][1];
                m[i][0] = min[0];
                m[i][1] = min[1]; 
            }
        }
    }   
}
