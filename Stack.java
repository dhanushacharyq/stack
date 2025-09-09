package StackPerson;

public class Stack {
	private Person arr[];
	private int top;
	private int capacity;
	
	Stack(int size){
		capacity = size;
		top=-1;
		arr= new Person[capacity];
	}
	Stack(Person[] inputArr) {
		capacity = inputArr.length;
		arr = new Person[capacity];
		for(int i=0 ; i<capacity ; i++) {
			arr[i]=inputArr[i];
		}
		top=capacity-1;
	}
	void push(Person p) {
		if(top == capacity-1) {
			System.out.println("Stack Overflow");
			return ;
		}
		arr[++top]=p;
	}
	void push(Person p1 , Person p2) {
		push(p1);
		push(p2);
	}
	
	//popping
	Person pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		return arr[top--];	
	}
	void pop(int n) {
		for(int i=0 ; i<n ; i++) {
			Person p = pop();
			if(p==null) 
			break;
			System.out.println("Popped the element");
			p.displayPerson();
		}
	}
	void display(){
		if(top == -1) {
			System.out.println("Stack is empty");
			return ;
		}
		for(int i=top ; i>=0 ; i--) {
			arr[i].displayPerson();
		}
	}
	void display(int n) {
		if(top==-1) {
			System.out.println("Stack is empty");
			return ;
		}
		int count = Math.min(n, top+1);
		for(int i=top ; i>top-count ; i--) {
			arr[i].displayPerson();
		}
	}
		
}






