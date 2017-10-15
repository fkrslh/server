import java.io.*;
import java.net.*;

class server
{
	public static void main(String [] args)
	{
		try
		{
			ServerSocket SS = new ServerSocket(1201);
			Socket S = SS.accept();

			DataInputStream Din = new DataInputStream(S.getInputStream());
			DataOutputStream Dout = new DataOutputStream(S.getOutputStream());
			BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			String msgin ="",msgout="";

			while(!msgin.equals("end"))
			{
				msgin = Din.readUTF();
				System.out.println(msgin);
				msgout = BR.readLine();
				Dout.writeUTF(msgout);
				Dout.flush();
			}
			S.close();
		}
		catch(Exception e)
		{
		}
	}
}

