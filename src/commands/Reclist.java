package commands;

import java.io.File;
import java.io.IOException;

public class Reclist implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		execute2(wd, "\t");
		return null;
	}
	public File execute2(File wd, String tab){
		String[] tomb = wd.list();
		for (int i=0; i<tomb.length; i++){
			System.out.println(tab+tomb[i]);
			File uj;
			try {
				uj = new File(wd.getCanonicalPath(), tomb[i]);
				if (uj.isDirectory())
					this.execute2(uj, tab+"   ");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}