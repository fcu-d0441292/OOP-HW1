
public class Homework1 {
	public static void main(String[] args){
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		String lyricsChange;
		lyricsChange=lyrics.replaceAll("it", "her");
		lyricsChange=lyrics.replaceFirst("Cannot", "Can't");
		System.out.println(lyricsChange);
		
	}

}

