package stereoSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
 
import org.junit.Rule;
import org.junit.Test;
import org.junit .runner.RunWith;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import configuration.CDPlayerConfig; 
import soundSystem.CompactDisc;
import soundSystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		player.play();
		assertEquals(
				"Playing Shizuoka Calling #3 by Various artists\n"
				, log.getLog()
		);
	}
}
