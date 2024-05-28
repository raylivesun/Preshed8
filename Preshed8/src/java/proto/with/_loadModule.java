package matrix.gnu.bin.proto.with;

import java.io.IOException;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.UIEvent;

public class _loadModule {
    private static EventTarget _loadModule;
    private static EventTarget target;

    public static <let> void b(Appendable appendable, UIEvent event, Class<char[]> eval) throws IOException {
            if (_loadModule != appendable) {
                EventTarget target = port(event).getTarget();
                boolean obj = target.equals(target);
                defineModule(obj, eval);            
            }
            try {
                event(eval, eval, target);
            } catch (Exception e) {
                // handle exception
                e.setStackTrace(null);
            }
       }

    private static void event(Object obj, Class<char[]> eval, EventTarget target2) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'event'");
    }

    private static void defineModule(boolean obj, Class<char[]> eval) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defineModule'");
    }

    public static EventTarget getTarget() {
        return target;
    }

    public static void setTarget(EventTarget target) {
        _loadModule = target;
    }

    private static UIEvent port(UIEvent event) {
        return event;
    }

    public static boolean a(Object notifyAll) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'a'");
    }   
}
