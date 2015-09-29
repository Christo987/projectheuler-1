public class projectheuler {
	public static void main(String[] args) {
		int sum = 0;
		for(int five = 0;five<1000;five=five+5) {
			sum = sum+five;
		}
		int sumthree =0;
		for(int three = 0;three<1000;three=three+3)   {
			sumthree = sumthree+three;
		}
		int sumfifteen =0;
		for(int fifteen = 0;fifteen<1000;fifteen=fifteen+15) {
			sumfifteen = sumfifteen+fifteen;
		}
		System.out.println(sum+sumthree-sumfifteen);
	}
}


