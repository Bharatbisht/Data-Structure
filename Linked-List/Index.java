package Collection;

import java.util.Scanner;

public class Index {
	private static Scanner sc;

	public static void main(String[]args) throws Exception{

		Linkedlist list=new Linkedlist();
		System.out.print("Enter the total nmubers=");
        sc = new Scanner(System.in);     
            int j= sc.nextInt();     
            System.out.print("Enter the nmubers=");
                 for(int i=0;i<j;i++) {
                	 
                     sc = new Scanner(System.in);     
                         int a= sc.nextInt();
                         list.insert(a);
                 }
		    System.out.println("number inserted");
		list.show();
        // }
	}
}
