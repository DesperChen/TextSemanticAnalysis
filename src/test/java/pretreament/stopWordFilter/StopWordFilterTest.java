package pretreament.stopWordFilter;

import org.junit.Test;
import pretreatment.stopWordFilter.StopWordFilter;

/**
 * Created by 51157 on 2017/7/27.
 */
public class StopWordFilterTest {
    @Test
    public void readStopWordTest() {
        new StopWordFilter(null).readStopWord();
    }
}
