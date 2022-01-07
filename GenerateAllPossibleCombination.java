// To Generate all the possible combination of  a function
// change to value of str in main function

import java.util.*;


public class GenerateAllPossibleCombination
{
    public static void generate(char[] arr, int i, String newStr, int len){
        
        if(i==0  ){
            System.out.println(newStr);
            return;
        }
        
        for(int j=0; j<len; j++){
            String appended = newStr + arr[j];
            generate( arr, i-1, appended, len );
        }
    }
    
    public static void lexo(char[] arr, int len){
        for(int i=1; i<=len; i++){
            generate(arr,i,"",len);
        }
        return;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to genrate its combinations: ");
		String str = sc.next();
		sc.close();
		
		lexo( str.toCharArray(), str.length() );
		return;
	}
}
