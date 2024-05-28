package matrix.gnu.bin.proto.reverse;

import java.io.IOException;
import java.io.Reader;

public class g {
    public static g ybMB(Reader logtrace, Reader logError, Reader file) throws IOException {
            if (logtrace != null) {
                logtrace = n(logtrace, logError, file);
                logtrace.skip(0);            
            } else if (logError != null) {
                logError = n(logtrace, logError, file);
                logError.skip(0);    
            } else if (file != null) {
                file = n(logtrace, logError, file);
                file.skip(0); 
            }
        return null;
    }

    private static Reader n(Reader logtrace, Reader logError, Reader file) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'n'");
    }

}
