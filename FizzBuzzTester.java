public class FizzBuzzTester{
	public static void main(String[] args){
		FizzBuzzer firstFizz = new FizzBuzzer(20);
		System.out.println(firstFizz); 
		//output: 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
		FizzBuzzer secondFizz = new FizzBuzzer(4, 7, 30);
		System.out.println(secondFizz); 
		//output: 1 2 3 fizz 5 6 buzz fizz 9 10 11 fizz 13 buzz 15 fizz 17 18 19 fizz buzz 22 23 fizz 25 26 27 fizzbuzz 29
		
		System.out.println("testing vscode");
	}
}

class FizzBuzzer{
	public int fizz;
	public int buzz;
	public int stopPoint;
	
	public FizzBuzzer(){
		fizz = 3;
		buzz = 5;
		stopPoint = 30;
	};
	
	public FizzBuzzer(int stop){
		this();
		stopPoint = stop + 1;
	}
	
	public FizzBuzzer(int fizzle, int buzzer, int stop){
		this();
		fizz = fizzle;
		buzz = buzzer;
		stopPoint = stop + 1;

	}
	
	public String toString(){
		String temp = "";
		for (int i = 1; i < stopPoint; i++){
			if (i % fizz == 0) {
				temp += "fizz";
			}
			if (i % buzz == 0) {
				temp += "buzz";
			}
			
			if (i % fizz != 0 && i % buzz != 0){
				temp += i;
			}
			if( i < stopPoint -1) {
				temp+= " ";
			}
		}
			
		return temp;
	
	}
}