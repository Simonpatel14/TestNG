package NullAndGarbageTimeComplexity;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
  //if it will run 1000 times but still it will execute one time so it called
		//O(1)---BIG O-- Time Complexity
		int i1 =20;
		System.out.println(i+i1);//O(1)
		
		int n =10;
		for(int a1=0; a1<n; a1++) {
			System.out.println(a1);
		}
		//1+n+n+n===>1+3n===>3n===>n===>O(n)
		//Linear equation
		
		
		for(int b=0; b<n;b++) {
			for(int c=0; c<n;c++) {
				for(int u=0;u<n;u++) {
				System.out.println(b+""+c+""+u+" ");
				}
			}
		}
		
		//(1+n+n)(1+n+n+n)+n==>(1+2n)(1+3n)+n==>1(1+3n)+2n(1+3n)+n=1+3n+2n+6n^2+n==>1+6n+6n^2==>6(n+n^2)==>n+n^2==>n(1+n)==>O(n^2)
		//Quadratic equation
		
	 //(1+n)(1+n)(1+n)==>1+n^3==>n^3==>O(n^3)
	    //O(log n)==>Binary search
	
	for (int s=1; s==1;) {
		System.out.println(s);//O(1)
		break;//1+1+1
	}

}
}
