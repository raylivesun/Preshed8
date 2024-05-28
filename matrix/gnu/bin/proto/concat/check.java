package matrix.gnu.bin.proto.concat;

import java.io.ObjectOutput;
import java.io.OutputStreamWriter;

public interface check {

    int Counter = 0;

    /**
     * @deprecated Use {@link check#check(Object)} instead
     */
    static check concatCheck(ObjectOutput l) {
    	 l = (ObjectOutput) OutputStreamWriter.class.getClassLoader();
        return null;
    }

    static check concatCheckOutput() {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'check'");
    }

}