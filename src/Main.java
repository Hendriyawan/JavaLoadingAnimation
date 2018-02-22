import java.util.*;
/* 22 Februari 2018
* by Hendriyawan
* simple Java loading animation in command line
* fb : www.fb.com/hendri.glanex
* email : hendrijs44@gmail.com
*/
public class Main
{
	public static void main(String[] args)
	{
		if(args.length > 0){
			String type = args[0];
			
			if(type.equals("wave")){
				Loading wave = new Loading(true, "Loading with wave animation...", LoadingType.WAVE);
				wave.start();
			}
			
			if(type.equals("spinner")){
				Loading spinner = new Loading(true, "Loading with spinner animation...", LoadingType.SPINNER);
				spinner.start();
			}
		}
	}
}
