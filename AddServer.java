import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AddServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server_stub();
	}
	static void server(){
		try{
	        System.out.println("waiting for client...");
	        ServerSocket ss = new ServerSocket(9806);
	        Socket soc = ss.accept();
	        System.out.println("connection Establlished...");
	        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	        int number_1 = Integer.parseInt(in.readLine());
	        int number_2 = Integer.parseInt(in.readLine());
	        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
	        out.println("Calculate Adddition of "+number_1+" and "+number_2+" is:"+Add(number_1,number_2));
			}catch(Exception e){
	            e.printStackTrace();
	        }
	}
	static void server_stub(){
		server();
	}
	static int Add(int number_1,int number_2){
			return number_1 + number_2;		
			
	}
}