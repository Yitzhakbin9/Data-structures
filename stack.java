package DataStructures;
import java.util.Iterator;
import java.util.Stack;


public class stack {
	public static void main(String[] args) {
		//		Stack<String> st = new Stack<String>();
		//		st.add("first");
		//		st.add("second");
		//		st.add("third");
		//		System.out.println("size: "+st.size());
		//		System.out.println(st.elementAt(2));
		//		st.remove(0);
		//		st.remove("third");
		//		System.out.println("size: "+st.size());
		//		System.out.println(st.elementAt(0));


		String num = "243..342";
		//		System.out.println(Q2(num));

		// Q1:
		System.out.println(Q1("{[(3*4) + 6] % [(2+2+2)/(9*9)]}"));


	}


	public static boolean Q1(String num){

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < num.length(); i++) {
//			if (st.empty()) return false;
			char x = num.charAt(i);
			if (x == '(' || x== '[' || x== '{') st.push(x);

			switch (x){
			case ')' :
				if (st.peek() == '(') st.pop();
				break;

			case ']' :
				if (st.peek() == '[') st.pop();
				break;

			case '}' :
				if (st.peek() == '{') st.pop();
				break;

			default:
				break;
			}

		}
		if (st.empty()) return true;
		else return false;
	}



	public static boolean Q2(String num) {

		int len = num.length()/2 +1;
		char middle = num.charAt(len);
		if (middle != '.') {
			System.out.println("The middle is not dot");
			return false;
		}
		if(num.length()/2 % 2 == 0) {
			System.out.println("The length is not odd");
			return false;
		}

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < num.length()/2; i++) {
			char a = num.charAt(i);
			if (a != '.') st.push(a);
			else if (a == '.') return false;  // if the dot appears before the middle - return false. 
		}

		for (int i = num.length()/2+1; i < num.length(); i++) {
			if(st.peek() == num.charAt(i)) st.pop();
			else return false;
		}
		return true;
	}

}
