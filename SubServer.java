import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SubServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server_stub();
	}
	static void server(){
		try{
	        System.out.println("waiting for client...");
	        ServerSocket ss1 = new ServerSocket(9807);
	        Socket soc1 = ss1.accept();
	        System.out.println("connection Establlished...");
	        BufferedReader in1 = new BufferedReader(new InputStreamReader(soc1.getInputStream()));
	        int number_3 = Integer.parseInt(in1.readLine());
	        int number_4 = Integer.parseInt(in1.readLine());
	        PrintWriter out = new PrintWriter(soc1.getOutputStream(),true);
	        out.println("Calculate Adddition of "+number_3+" and "+number_4+" is:"+Sub(number_3,number_4));
			}catch(Exception e){
	            e.printStackTrace();
	        }
	}
	static void server_stub(){
		server();
	}
	static int Sub(int number_1,int number_2){
			return number_1 - number_2;		

	}
}