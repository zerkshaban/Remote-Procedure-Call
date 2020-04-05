import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DivServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server_stub();
	}
	static void server(){
		try {
			System.out.println("Waiting for client...");
			ServerSocket ss3 = new ServerSocket(9809);
			Socket soc3 = ss3.accept();
			System.out.println("Connection Established...");
			 BufferedReader in3 = new BufferedReader(new InputStreamReader(soc3.getInputStream()));
			 int number_7 = Integer.parseInt(in3.readLine());
			 int number_8 = Integer.parseInt(in3.readLine());
			 PrintWriter out = new PrintWriter(soc3.getOutputStream(),true);
			 out.println("Calculate Multiplication of "+number_7+" and "+number_8+" is:"+div(number_7,number_8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void server_stub(){
		server();
	}
	static int div(int number_7,int number_8){
		try{
		return number_7/number_8;
		}catch(ArithmeticException e ){
			System.out.println("Warning:Not possible to divide by denomerator zero.");
		}
		return 0;
		}

}