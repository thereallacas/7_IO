package commands;

import java.io.File;
import java.io.FileNotFoundException;

public class Cd implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		try{
		if (cmd[1].equals("..")){
			wd=wd.getParentFile();
		}
		else {
			File test=new File(wd,cmd[1]);
			if (test.exists())
				wd=test;
			else
				throw new FileNotFoundException();
		}
		}
		catch(FileNotFoundException e){
			System.out.println("Nincs is ilyen mappa te butus");
			e.printStackTrace();
		}
		return wd;
	}

}
