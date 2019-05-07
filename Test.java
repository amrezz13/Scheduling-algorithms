/**

 * 
 */

package test;

/**
 * @author ezzjr
 *
 */
import java.util.*;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static int n;
	public static int[] processtime= new int[n] ;

	

	public static void main(String[] args) {
		FCFS FCFS = new FCFS();
		SJF SJF =new SJF();
		System.out.println("1-FCFS  \n2-SJF ");
		int  choose   = input.nextInt();
		
		if (choose==1) {
			System.out.println("enter number of process");
			n=input.nextInt();
			enterdata(n);
			FCFS.calculate(processtime);
		}
		
		else  {
			System.out.println("enter number of process");
			n=input.nextInt();
			enterdata(n);
			SJF.Sort(processtime);
			FCFS.calculate(processtime);	
		}
		
		
		
	//	input.close();
	}
	
	public static void enterdata(int n) {
		processtime= new int [n]  ;
		for(int i=0 ;i < processtime.length;i++) {
			System.out.println("enter process "+(i+1)+" time.");
			processtime[i]=input.nextInt();		
	}
}
}