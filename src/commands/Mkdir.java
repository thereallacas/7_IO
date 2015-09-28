package commands;

import java.io.File;

public class Mkdir implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		File dir = new File(wd, cmd[1]);
		dir.mkdir();
		return null;
	}

}
