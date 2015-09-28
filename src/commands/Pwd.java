package commands;

import java.io.File;
import java.io.IOException;

public class Pwd implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		try {
			System.out.println(wd.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
