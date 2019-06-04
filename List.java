package pack1;
import java.util.*;
public class List{
	public int j; //number present in array
	public int d=3; //no. of array
    Scanner sc=new Scanner(System.in);
	int a[] = new int[d];

  public void operation(){
	System.out.println("enter operation=");
    String s = sc.next();
    //insert number into array
   switch(s){
	case "create":
		create();
	    operation();//recursion function
	    break; 

    //read array

    case "read":
        read();
	    operation();
	    break;

	//show empty array

    case "empty":		
	    empty();
		operation();
		break;

	//insert the no.

    case "insert":
       insert();
       operation();
       break;

    //insert the no. with position  

    case "write":
        write();
        operation();
       break;
	case "exit":
	  break;

}//switch
}//List function

// To create array...

public void create(){
	System.out.println("define array=");
        j=sc.nextInt();
        System.out.println("enter "+j+" number=");
		for(int i=0; i<j; i++){
		  a[i]=sc.nextInt();
	    }
  }

  //To read the number of array...

public void read(){
	if(j>0){
	    System.out.println("your number=");
	    for(int i=0; i<j; i++){
	      System.out.println(a[i]);
	    }
	   }
	   else{
	   	System.out.println("first insert the no !");
	   }
}	    

//To show the empty array...

public void empty(){
       
       // System.out.println(j?" array is not empty " : " array is empty")

		 if(j==0){
		 	System.out.println("Array is empty");
		 }
		 else{
		 	System.out.println("Array has some values.");
		 }
}

//To insert the no. in last of array...

public void insert(){
 if(j>0){
 	   increase();
        System.out.println(a.length);
       System.out.println("enter the no.=");
  	   int v=sc.nextInt();
       a[j]=v;
       	j++; 
      }
     else{
       System.out.println("first insert the no !");
     }
}

//To write the no. with thier position...

public void write(){
	if(j>0){
		increase();		
    	System.out.println("enter the no.=");
    	int v=sc.nextInt();
    	System.out.println("enter the position of given no.=");
    	int p=sc.nextInt();
        if(p<j){
           a[p]=v;
        }
    }
}

//increase the size of array...

public void increase(){
 if(j == a.length){
 	d=d*2;
    int temp[] = new int[d];
    for(int i=0; i<a.length; i++){
    	temp[i]=a[i];
    }
    a=temp;
    System.out.println(a.length);
  }
}

}//List class
