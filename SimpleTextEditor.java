package acciojob;

import java.util.*;

class SimpleTextEditor{
	public static void main(String[] args){
	
		Stack<String> stk = new Stack<>();
		Stack<Integer> stkOpn = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		String s = ""; 
		
		int Q = sc.nextInt();
		
		for(; Q>0; Q--){
			//System.out.println("String is: "+s);
			int opn = sc.nextInt();
			
			switch(opn){
				case 1:
					String word = sc.next();
					s += word;
					
					stk.push(word);
					stkOpn.push(1);
					continue;

				case 2:
					int d = sc.nextInt();
					int subs = s.length()-d;

					//System.out.println("s: "+s+"\tsubs: "+subs+"\td: "+d);
					stk.push( s.substring( subs, s.length() ) );
					s = s.substring(0, subs );
					
					stkOpn.push(2);
					continue;
				
				case 3:
					int index = sc.nextInt();
					System.out.println( s.charAt(index-1) );
					continue;

				case 4:
					if( stkOpn.peek() == 1 ){
						s = deleteK( s, stk.peek().length() );
						stk.pop();
						stkOpn.pop();
					}
					else if( stkOpn.peek()==2 ){
						s = addWord(s, stk.peek() );
						stk.pop();
						stkOpn.pop();
					}
					continue;
			}
		
		}

		sc.close();
		return;
	}

	public static String addWord( String s, String word ){
		return s+word;
	}

	public static String deleteK( String s, int n ){
		return s.substring(0, s.length()-n );
	}

}
