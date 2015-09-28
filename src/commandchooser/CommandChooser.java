package commandchooser;

import java.io.File;

import commands.Cat;
import commands.Cd;
import commands.Cp;
import commands.Grep;
import commands.Head;
import commands.Length;
import commands.Ls;
import commands.Mkdir;
import commands.Mv;
import commands.Pwd;
import commands.Reclist;
import commands.Rm;
import commands.Tail;
import commands.Wc;

public class CommandChooser {
	String[] cmd;
	File wd = new File(System.getProperty("user.dir"), "");
	
	public void utvalaszto(String[] cmd){
		this.cmd=cmd;
		String c = new String(cmd[0]); 

		if (c.equals("length")){
			Length l = new Length();
			l.execute(wd, cmd);
		}
		else if(c.equals("pwd")){
			Pwd p = new Pwd();
			p.execute(wd, cmd);
		}
		else if(c.equals("cd")){
			Cd cd = new Cd();
			wd = cd.execute(wd, cmd);
		}
		else if(c.equals("ls")){
			Ls ls = new Ls();
			ls.execute(wd, cmd);
		}
		else if(c.equals("tail")){
			Tail tl = new Tail();
			tl.execute(wd, cmd);
		}
		else if(c.equals("grep")){
			Grep grp = new  Grep();
			grp.execute(wd, cmd);
		}
		else if(c.equals("reclist")){
			Reclist rec = new Reclist();
			rec.execute(wd, cmd);
		}
		else if(c.equals("rm")){
			Rm rm = new Rm();
			rm.execute(wd, cmd);
		}
		else if(c.equals("mkdir")){
			Mkdir md = new Mkdir();
			md.execute(wd, cmd);
		}
		else if(c.equals("cp")){
			Cp cp = new Cp();
			cp.execute(wd, cmd);
		}
		else if(c.equals("head")){
			Head hd = new Head();
			hd.execute(wd, cmd);
		}
		else if(c.equals("mv")){
			Mv mv = new Mv();
			mv.execute(wd, cmd);
		}
		else if(c.equals("cat")){
			Cat ct = new Cat();
			ct.execute(wd, cmd);
		}
		else if(c.equals("wc")){
			Wc wc = new Wc();
			wc.execute(wd, cmd);
		}
		else if(c.equals("exit")){
			System.exit(0);
		}

	}
}
