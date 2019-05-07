package test;


public class FCFS {
	public float totaltime =0 ;
	public float waitingtime=0;
	public int n ;
	int[] timeofprocess ;

	
	public void calculate(int timeofprocess[]) {
		
	 for(int i=0;i<timeofprocess.length;i++) {
		waitingtime=timeofprocess[i]+waitingtime;
		totaltime = waitingtime+totaltime;
		System.out.println("process "+(i+1)+" time "+waitingtime);
		n=i+1;
	 }
	 System.out.print("total average waiting time "+((totaltime-waitingtime)/n));
    }
}
