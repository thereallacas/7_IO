package commands;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cp implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		try {
		File f1 = new File(wd, cmd[1]);
		File f2 = new File(wd, cmd[2]);
		if (!f2.exists())
			f2.createNewFile();
			FileInputStream fis = new FileInputStream(f1); 
			FileOutputStream fos = new FileOutputStream(f2);
			while(fis.available()!=0){
				byte[] b = new byte[1024];
				fis.read(b);
				fos.write(b);
			}
			fis.close(); fos.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
