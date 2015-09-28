package commands;

import java.io.File;
import java.io.FileNotFoundException;

public class Rm implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		try{
			File f = new File(wd, cmd[1]);
			if (!f.exists())
				throw new FileNotFoundException();
			boolean torolte = f.delete();
			System.out.println(torolte ? "Sikeres torles44!!":"Nope m8");
		}
		catch (FileNotFoundException e) {
			System.out.println("Megvagy te hujulve, nincs is ilyen fajl???!!445");
			e.printStackTrace();
		}
		return null;
	}

}
