package StackPerson;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Stack st = null;
	 
	 System.out.println("Choose initialization:");
	 System.out.println("1.Empty Stack with size");
	 System.out.println("2.Stack initialized with array of Person");
	 int choice = sc.nextInt();
	 
	 if(choice == 1) {
		 System.out.println("Enter the Size:");
		 int size = sc.nextInt();
		 st = new Stack(size);
	 }else if(choice == 2) {
		 System.out.println("Enter the Number of persons:");
		 int n = sc.nextInt();
		 Person arr[] = new Person[n];
		 for(int i=0 ; i<n ; i++) {
			 System.out.println("Enter the name :");
			 String name = sc.next();
			 System.out.println("Enter the age :");
			 int age = sc.nextInt();
			 System.out.println("Enter the gender :");
			 String genderInput = sc.next().toUpperCase();
			 Gender gender = Gender.valueOf(genderInput);
			 
			 arr[i] = new Person(name, age ,gender);
		 }
		 st= new Stack(arr);
	 }
	 
	 int option;
	 do {
		 System.out.println("\n Menu");
		 System.out.println("1. Push one Person");
		 System.out.println("2. Push two persons");
		 System.out.println("3. Pop one Person");
		 System.out.println("4. Pop multiple Person");
		 System.out.println("5. Display all Person");
		 System.out.println("6. Display top n Person");
		 System.out.println("7. Exit");
		 System.out.println("Enter your choice:");
		 option = sc.nextInt();
		 
		 switch(option) {
		 case 1:
			System.out.println("Enter the name");
			String name = sc.next();
			
			System.out.println("Enter the age");
			int age = sc.nextInt();
			
			System.out.println("Enter the gender :");
			 String genderInput = sc.next().toUpperCase();
			 Gender gender = Gender.valueOf(genderInput);
			 
			 Person p = new Person(name , age , gender);
			 st.push(p);
			 break;
		 case 2:
			 System.out.println("Enter the name of person 1 ");
				String name1 = sc.next();
				
				System.out.println("Enter the age of person 1 ");
				int age1 = sc.nextInt();
				
				System.out.println("Enter person 1 gender :");
				 String genderInput1 = sc.next().toUpperCase();
				 Gender gender1 = Gender.valueOf(genderInput1);
				 
				 System.out.println("Enter the name of person 2 ");
					String name2 = sc.next();
					
					System.out.println("Enter the age of person 2 ");
					int age2 = sc.nextInt();
					
					System.out.println("Enter person 2 gender :");
					 String genderInput2 = sc.next().toUpperCase();
					 Gender gender2 = Gender.valueOf(genderInput2);
					 break;
		 case 3:
			 Person popped = st.pop();
             if (popped != null) popped.displayPerson();
             break;
		 case 4:
			 System.out.print("Enter number of Persons to pop: ");
             int n = sc.nextInt();
             st.pop();
             break;
		 case 5:
			 st.display();
			 break;
		 case 6:
			 System.out.print("Enter number of top Persons: ");
             int topN = sc.nextInt();
             st.display(topN);
             break;
		 case 7:
			 System.out.println("Exiting...");
             break;
		 default :
			 System.out.println("Invalid choice!!");
		 }
	 }
		 while(option != 7);
	}

}


