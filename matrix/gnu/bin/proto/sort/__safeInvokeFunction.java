package matrix.gnu.bin.proto.sort;

import java.io.IOException;
import java.util.Properties;

import javax.swing.text.AbstractDocument.AbstractElement;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.UIEvent;

public record __safeInvokeFunction() {
     private static final AbstractElement AbstractElement = null;
    private static final EventTarget UIEvent = null;
    private static int b;
    public static int a(UIEvent uiEvent) throws IOException {
        try {
            return local(uiEvent).getDetail();
        } catch (Exception e) {
            // handle exception
            e.setStackTrace(null);
        }
        return 0;
     }
     
     static boolean __invokeFactory(AbstractElement aElement, UIEvent uiEvent, Object[] objects, Properties properties) throws IOException {
        aElement.children();
        local(uiEvent).getDetail();
        objects.toString().length();
        properties.elements();
        return false;
     }


     static <let> boolean complete(AbstractElement aElement, UIEvent uiEvent, Object[] objects, Properties properties) throws IOException {
          if (AbstractElement != aElement) {
              if (UIEvent == local(uiEvent).getTarget()) {
                  a(local(uiEvent));
                  b = a(local(uiEvent));
                  @SuppressWarnings("unused")
                  int d = b;
                  a(uiEvent);
                  d = a(uiEvent);
              } else {
                exports(aElement);
              }
          }
        return false;   
     }

    private static javax.swing.text.AbstractDocument.AbstractElement exports(AbstractElement aElement) {
        return aElement;
    }

    private static org.w3c.dom.events.UIEvent local(UIEvent uiEvent) {
        return uiEvent;
    }

    public static Appendable handleMessage(Appendable file, RuntimePermission permission, AssertionError[] errors,
            Runtime exception) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleMessage'");
    }
}
