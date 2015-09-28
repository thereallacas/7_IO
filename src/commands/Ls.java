package commands;

import java.io.File;

public class Ls implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		String[] lista = wd.list();
		boolean attribute = (cmd.length==1) ? false : true;
		for (int i=0; i<lista.length; i++){
			System.out.print(lista[i]);
			if (attribute && cmd[1].equals("-l")){
				File temp = new File(wd, lista[i]);
				char type = temp.isDirectory() ? 'd' : 'f';
				System.out.println(" "+temp.length()+" byte "+type);
			}
			else 
				System.out.println();
		}
		return null;
	}

}
