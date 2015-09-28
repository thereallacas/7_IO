package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Wc implements Command {
	@Override
	public File execute(File wd, String[] cmd) {
		int sorszam=0, szoszam = 0, betuszam = 0;
		File f = new File(wd, cmd[1]);
		try {	
			FileReader fr = new FileReader(f);
			BufferedReader bfr = new BufferedReader(fr);
			String str;
			while((str = bfr.readLine())!=null){
				StringTokenizer strt = new StringTokenizer(str);
				szoszam = szoszam + strt.countTokens();
				sorszam++;
			}
			bfr.close();
			FileReader fr2 = new FileReader(f);
			while (fr2.read()!=-1)
				betuszam++;
			fr2.close();
			System.out.println("Sorok száma: "+sorszam);
			System.out.println("Szavak száma: "+szoszam);
			System.out.println("Betuk száma: "+betuszam);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
