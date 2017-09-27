public class FizzBuzzTester{
	public static void main(String[] args){
		FizzBuzzer firstFizz = new FizzBuzzer(20);
		System.out.println(firstFizz); 
		//output: 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
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
	
	public String toString(){
		String temp = "";
		for (int i = 1; i < stopPoint; i++){
			if (i % 3 == 0) {
				temp += "fizz";
			}
			if (i % 5 == 0) {
				temp += "buzz";
			}
			
			if (i % 3 != 0 && i % 5 != 0){
				temp += i;
			}
			if( i < stopPoint -1) {
				temp+= " ";
			}
		}
			
		return temp;
	
	}
}