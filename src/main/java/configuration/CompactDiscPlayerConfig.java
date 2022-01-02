package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import soundSystem.CDPlayer;
import soundSystem.CompactDisc;
import soundSystem.GaleryChill;
import soundSystem.IllTryLivingLikeThis;
import soundSystem.ShizuokaCallingVol3;
import soundSystem.WhenInDoubt;

@Configuration
public class CompactDiscPlayerConfig {
	
	@Bean
	public CompactDisc randomAlbum() {
		int choice = (int) Math.floor(Math.random() * 4);
		
		if ( choice == 0 ) {
		    	return new ShizuokaCallingVol3();
		} else if ( choice == 1 ) {
			    return new IllTryLivingLikeThis();
		} else if ( choice == 2 ) {
				return new WhenInDoubt();
		} else {
			return new GaleryChill();
		}
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(randomAlbum());
	}
}
