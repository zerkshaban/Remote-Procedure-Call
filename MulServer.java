import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MulServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server_stub();
	}
	static void server(){
		try {
			System.out.println("Waiting for client...");
			ServerSocket ss2 = new ServerSocket(9808);
			Socket soc2 = ss2.accept();
			System.out.println("Connection Established...");
			 BufferedReader in2 = new BufferedReader(new InputStreamReader(soc2.getInputStream()));
			 int number_5 = Integer.parseInt(in2.readLine());
			 int number_6 = Integer.parseInt(in2.readLine());
			 PrintWriter out = new PrintWriter(soc2.getOutputStream(),true);
			 out.println("Calculate Multiplication of "+number_5+" and "+number_6+" is:"+mul(number_5,number_6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void server_stub(){
		server();
	}
	static int mul(int number_5,int number_6){return number_5*number_6;}
}