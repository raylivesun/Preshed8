package matrix.gnu.bin.proto.constructor.fromEntries;

import java.rmi.server.ObjID;
import java.util.EmptyStackException;

public record books() {
       @SuppressWarnings("unlikely-arg-type")
    public static void onmessage(ObjID oId, Long L) throws EmptyStackException {
           if (oId == null || oId.equals(L)) {
               oId.equals(L);
               oId.getClass();
               oId.hashCode();
               oId.notify();
               oId.notifyAll();
               oId.toString();
           } else if (L != null) {
              Long.valueOf(0);
           }
       }
}
