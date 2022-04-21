//Alan Huang CSE114.02 L10 HW3 #2
import java.util.Scanner;
public class Hw3problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents : ");
        int[] list1 = new int[input.nextInt()];
		for(int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
        System.out.print("Enter list2 size and contents : ");
		int[] list2 = new int[input.nextInt()];
		for(int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
        System.out.print("List1 is ");
        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        System.out.print("List2 is ");
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        int[] merge = merge(list1,list2);
        System.out.print("The merged list is ");
        for(int i = 0; i < merge.length; i++){
            System.out.print(merge[i] + " ");
        }
        input.close();

    }
    public static int[] merge(int[] list1, int[] list2){
        int[] x = new int[list1.length + list2.length];
        int count = 0;
        for(int i = 0; i < list1.length; i++){
            x[i] = list1[i];
        }
        for(int i = list1.length; i < x.length; i++){
            x[i] = list2[count];
            count++;
        }
        int temp;
        for(int i = 0; i < x.length; i++){
            for(int j = 0;j < x.length; j++){
                if(x[j] > (x[i]) ){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}
