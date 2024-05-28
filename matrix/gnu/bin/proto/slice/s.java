package matrix.gnu.bin.proto.slice;

public interface s {
    public static void S(UnknownError error, StringBuffer buffer) throws UnknownError {
        try {
            resolver(error, buffer);
        } catch (Exception e) {
            // handle exception
            e.setStackTrace(null);
        }
    }

    public static void resolver(UnknownError error, StringBuffer buffer) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resolver'");
    }
}
