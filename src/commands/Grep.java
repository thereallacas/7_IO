package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Grep implements Command {

	@Override
	public File execute(File wd, String[] cmd) {
		try{
			CharSequence s = "\"";
			if (cmd[1].contains(s)){
				for (int i=2; i<cmd.length; i++){
					if (cmd[i].contains(s)){
						cmd[1]=cmd[1].concat(" ");
						cmd[1]=cmd[1].concat(cmd[i]);
						break;
					}
					else {
						cmd[1]=cmd[1].concat(" ");
						cmd[1]=cmd[1].concat(cmd[i]);
					}
				}
			
			cmd[1]=cmd[1].substring(1, (cmd[1].length()-1));
			cmd[2]=cmd[(cmd.length)-1];
			}
			Integer a=cmd.length;
			if (a<3)
				throw new ArrayIndexOutOfBoundsException();
			File f = new File(wd, cmd[2]);
			int line=0;
			BufferedReader bfr;
			bfr = new BufferedReader(new FileReader(f)); 
			String str;
			while((str=bfr.readLine()) != null){ 
				if (str.matches(cmd[1])){
					System.out.println(str+" ("+(line+1)+".sor)");
				}
				line++;
			} 
			bfr.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.print("kihagytál egy paramétert ");
			e.printStackTrace();
		}
		return null;
	}
}
