package commands;

import java.io.File;
import java.io.FileNotFoundException;

public class Length implements Command{
	@Override
	public File execute(File wd, String[] cmd) {
		try{
			File f = new File(wd, cmd[1]);
			if (f.equals(null))
				throw new FileNotFoundException();
			System.out.println(f.length()+" byte");
		}
		catch (FileNotFoundException e){

		}
		return null;
	}

}
