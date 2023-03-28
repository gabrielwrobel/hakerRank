package zeroReplace;

public class ZeroReplaceService {

    public int[] replaceRightArrayCell(int[] array) {
        int last = array[array.length-1];

        // shift right
        for( int index =array.length-2; index >= 0 ; index-- )
            array[index+1] = array [index];

        array[0] = last;
        return array;
    }
}


