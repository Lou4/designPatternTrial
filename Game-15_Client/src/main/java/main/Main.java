package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
	private static final String HOST = "localhost";
	private static final int PORT = 3001;
	private static BufferedReader in;
	private static PrintWriter out;
	private static BufferedReader br;
	public static void main(String[] args) {
		Socket socket;
		String res;
		br = new BufferedReader(new InputStreamReader(System.in));
			try {
				socket = new Socket(HOST, PORT);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
				while(true){
					System.out.println(in.readLine());
					res = br.readLine();
					out.write(res + "\n");
					out.flush();
					
					res = in.readLine();
					if(res == "true")
						System.out.println("Tocca a l'altro giocatore");
					else
						System.out.println(res);
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
