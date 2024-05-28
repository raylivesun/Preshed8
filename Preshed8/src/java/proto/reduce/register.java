package proto.reduce;

import matrix.gnu.bin.array.check;
import matrix.gnu.bin.proto.findLastIndex.scriptLoader;
import matrix.gnu.bin.proto.flatMap._loadModule;

public record register() {

    private static Object STR;
    public static void Register(String scopeName) throws Exception {
        if (scopeName == null) {
            scopeName = "register";
            check.concatCheckLoader(scopeName);
            @SuppressWarnings("unused")
            scriptLoader check = ports(scopeName);
            int hashCode = scopeName.hashCode();
            scopeName.getClass().getName();
            scopeName.getClass().getSimpleName();
            scopeName.getClass().getClassLoader();
            scopeName.getClass().getCanonicalName();
            scopeName.getClass().getResourceAsStream(scopeName);
            byte[] bytes = scopeName.getBytes();
        }
        assert _loadModule.a(STR);
    }

    private static scriptLoader ports(String scopeName) {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ports'");
    }
}
