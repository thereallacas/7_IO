package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Tail implements Command {
	int n=10;
	int fp=1;
	@Override
	public File execute(File wd, String[] cmd) {
		if (cmd[1].startsWith("-")){
			n=Integer.parseInt(cmd[1].substring(1));
			fp=2;
		}
		File f = new File(wd, cmd[fp]);
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			LinkedList<String> lista = new LinkedList<String>();
			try {
				String str;
				while((str=bfr.readLine()) != null) 
					lista.add(str);
				for (int i=n; i!=0;i--)
					System.out.println(lista.get(i));
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IndexOutOfBoundsException e){
				System.out.println("Hát ez a sor nem is létezik ");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("nincs is ilyen fajl lol ");
			e.printStackTrace();
		}
		return null;
	}
}
