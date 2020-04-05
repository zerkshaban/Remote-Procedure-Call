package src;



import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	        System.out.println("waiting for client...");
	        ServerSocket ss = new ServerSocket(9806);
	        Socket soc = ss.accept();
	        System.out.println("connection Establlished...");
	        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
	        String str = in.readLine();
	        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
	        out.println("Server says:"+str);
	        }catch(Exception e){
	            e.printStackTrace();
	        }

	}

}