package matrix.gnu.bin.proto.some;

import java.io.File;
import java.nio.channels.IllegalChannelGroupException;

import matrix.gnu.bin.proto.every.resolver;

public interface hidden {
     public static void create(File file, boolean isHiden, byte[] data) throws IllegalChannelGroupException {
        if (isHiden && data.length == 0) {
            file.mkdirs();
            file.getAbsolutePath();
            file.getParentFile();
            file.getName();
            file.toPath();
            file.delete();
            file.deleteOnExit();
            file.isAbsolute();
            file.exists();

        } else if (isHiden && data.length == 0) {
            resolver.Counter.compareTo(null);
        }
     }  
}
