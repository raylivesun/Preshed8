package matrix.gnu.bin.proto.constructor.valueOf;

import javax.management.ValueExp;

import matrix.gnu.bin.proto.constructor.toString.values;

public record vector() {
    public static void WindowOf(ValueExp value, Object vals) throws Exception {
         if (value == null || values.VMID == values.values) {
             value.apply(null);
             value.hashCode();
             value.notify(); 
         }
       constructor(vals);   
    }

    private static void constructor(Object vals) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'constructor'");
    }

    
}
