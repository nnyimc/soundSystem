package soundSystem;

import org.springframework.stereotype.Component;

@Component("shizuokaCallingVol3")
public class ShizuokaCallingVol3 implements CompactDisc {
	
	private String title = "Shizuoka Calling #3";
	private String artist = "Various artists";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
