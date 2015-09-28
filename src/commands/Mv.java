package commands;

import java.io.File;

public class Mv implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		File f1 = new File(wd, cmd[1]);
		File f2 = new File(wd, cmd[2]);
		boolean sikeres = f1.renameTo(f2);
		System.out.println(sikeres?"Sikeres átnevezés!44":"Nop m8");
		return null;
	}

}
