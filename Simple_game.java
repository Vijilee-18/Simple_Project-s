import java.util.Scanner;
public class Simple_game {
	public static void main (String[] args) {
		System.out.println("Welcome to Predict the Number Game....");
		Scanner user_input=new Scanner(System.in);
		int toCountinue=1,sucessful_predict=0,unsucessful_predict=0;
		while(toCountinue!=0) {
			System.out.println("Choose a number between 0 and 20:");
			int num=user_input.nextInt();
			int random_number=(int)(Math.random()*20);
			if(num==random_number) {
				System.out.println("Wow...You predicted the Correct Number");
				sucessful_predict=sucessful_predict+1;
			}
			else {
				System.out.println("Oh So Close ...The Number was:"+random_number);
				unsucessful_predict=unsucessful_predict+1;
			}
			System.out.println("To Continue: Click:1 and To exit :Click:0 :");
			toCountinue=user_input.nextInt();
		}
		System.out.println("You have Predicted the Correct Number for:"+sucessful_predict+"Times");
		System.out.println("And You had Choosed the Wrong Number for:"+unsucessful_predict+ "Times");
		System.out.println("Thankyou...");
	}

}
