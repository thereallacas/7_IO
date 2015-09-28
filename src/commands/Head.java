package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Head implements Command {
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
			try {
				String str;
				int i=0;
				while((str=bfr.readLine())!=null&&i!=n) {
					System.out.println(str); 
					i++;
				}
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("nincs is ilyen fajl lol ");
			e.printStackTrace();
		}
		return null;
	}
}
