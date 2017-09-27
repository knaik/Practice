//Returns true when value is from fibonacci series, similar to fizzbuzz
//this does not use recursive calls to calculate fibonacci series, uses memoization
public class FibonacciTester{
	public static void main(String[] args){
		Fibtest test = new Fibtest(30);
		System.out.print(test);
		//output: 0 inFib inFib inFib 4 inFib 6 7 inFib 9 10 11 12 inFib 14 15 16 17 18 19 20 inFib 22 23 24 25 26 27 28 29 30
		
		//might need closed form solution for calculating fibonacci numbers. Fibgen.size needed to change
	}
}

class Fibgen{
	int[] calc;
	int size;
	
	public Fibgen(){
		size = 10;
		arrayFib(size);
	}
	
	private void arrayFib(int stop){
		int[] temp = new int[stop];
		temp[0] = 1;
		temp[1] = 1;
		for (int i = 0; i < stop-2; i++){
			temp[i+2] = temp[i] + temp[i+1];
		}
		//System.out.println(temp[2]);
		calc = temp;
	}
}

class Fibtest {
	int testlength;
	int[] fib;
	
	public Fibtest(){
		System.out.println("No value specified, error");
	}
	
	public Fibtest(int testlen){
		testlength = testlen + 1;
		Fibgen test = new Fibgen();
		fib = test.calc;
	}
	public String toString(){
		String out = "";
		int currIndexFibArray = 0;
		for (int i = 0; i < testlength; i++){
			if (i < fib[currIndexFibArray]) {
				out += (i + " ");
			}
			else {
				out += ("inFib ");
				while( i == fib[currIndexFibArray]){
					currIndexFibArray++;
				}
			}
		}
		return out;
	}


}