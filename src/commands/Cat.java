package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cat implements Command {
	@Override
	public File execute(File wd, String[] cmd) {
		File f = new File(wd, cmd[1]);
		try {	
			BufferedReader bfr = new BufferedReader(new FileReader(f));

			String str;
			while((str=bfr.readLine())!=null) {
				System.out.println(str);
			}
			bfr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
