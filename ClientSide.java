import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
	static void client(){
		try {
			System.out.println("Client Started...");
			System.out.println("Select operation:");
			Scanner input1 = new Scanner(System.in);
			String operator = input1.nextLine();
			switch(operator){
			case "+":
			Socket soc = new Socket("localhost",9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first name:");
			int number_1 = Integer.parseInt(userInput.readLine());
			System.out.println("Enter the second name:");
			int number_2 = Integer.parseInt(userInput.readLine());
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println(number_1);
			out.println(number_2);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
			break;
			case "-":
				Socket soc1 = new Socket("localhost",9807);
				BufferedReader userInput1 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the first name:");
				int number_3 = Integer.parseInt(userInput1.readLine());
				System.out.println("Enter the second name:");
				int number_4 = Integer.parseInt(userInput1.readLine());
				PrintWriter out1 = new PrintWriter(soc1.getOutputStream(),true);
				out1.println(number_3);
				out1.println(number_4);
				BufferedReader in1 = new BufferedReader(new InputStreamReader(soc1.getInputStream()));
				System.out.println(in1.readLine());
				break;
			case "*":
				Socket soc3 = new Socket("localhost",9808);
				BufferedReader userInput2 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the first name:");
				int number_5 = Integer.parseInt(userInput2.readLine());
				System.out.println("Enter the second name:");
				int number_6 = Integer.parseInt(userInput2.readLine());
				PrintWriter out2 = new PrintWriter(soc3.getOutputStream(),true);
				out2.println(number_5);
				out2.println(number_6);
				BufferedReader in2 = new BufferedReader(new InputStreamReader(soc3.getInputStream()));
				System.out.println(in2.readLine());
				break;
			case "/":
				Socket soc4 = new Socket("localhost",9809);
				BufferedReader userInput3 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the first name:");
				int number_7 = Integer.parseInt(userInput3.readLine());
				System.out.println("Enter the second name:");
				int number_8 = Integer.parseInt(userInput3.readLine());
				PrintWriter out3 = new PrintWriter(soc4.getOutputStream(),true);
				out3.println(number_7);
				out3.println(number_8);
				BufferedReader in3 = new BufferedReader(new InputStreamReader(soc4.getInputStream()));
				System.out.println(in3.readLine());
				break;
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	static void client_stub(){
		client();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		client_stub();
	}
}