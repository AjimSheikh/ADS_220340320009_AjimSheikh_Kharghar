import java.lang.*;
import java.util.*;

class Stack{
	int top1;
	int top2;
	int max;
	int s1[];
	Stack(int s){
		top1=-1;
		top2=s/2;
		max = s;
		s1=new int[max];
	}
	void push1(int n){
		if(top1>=top2){
			System.out.println("Stack  1 is Overflow");
			return;
		}
		s1[++top1]=n;
	}
	void push2(int n){
		if(top2==max-1){
			System.out.println("Stack 2 is Overflow");
			return;
		}
		s1[++top2]=n;
	}

	void pop1(){
		if(top1<0){
			System.out.println("Stack  1 is Underflow");
			return;
		}
		int x  = s1[top1--];
		System.out.println("Popped element from stack1 is "+x);
	}
	void pop2(){
		if(top2<max/2){
			System.out.println("Stack  2 is Underflow");
			return;
		}
		int x  = s1[top2--];
		System.out.println("Popped element from stack2 is "+x);
	}
}
public class TwoStackArray{
	
	public static void main(String args[]){
		Stack st = new Stack(10);
		st.push1(5);
		st.push2(10);
		st.push2(15);
		st.push1(11);
		st.push2(7);
		st.push2(40);
		st.pop1();
		st.pop2();
	}
}