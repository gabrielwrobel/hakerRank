
import org.junit.jupiter.api.Test;
import zeroReplace.ZeroReplaceService;

import static org.junit.jupiter.api.Assertions.*;

class ZeroReplaceServiceTest {

    @Test
    void shouldReplaceRightArrayCell() {
        //given
        int[] givenArray =  {1,0,0,1,0,0};
        int[] expectedArray =  {0,1,0,0,1,0};

        ZeroReplaceService service =  new ZeroReplaceService();
        //when
        int[] actualArray = service.replaceRightArrayCell(givenArray);
        //then
        for (int i = 0; i < expectedArray.length; i++)
            assertEquals(expectedArray[i], actualArray[i]);
    }
}