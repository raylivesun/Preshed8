package matrix.gnu.bin.proto.constructor.getOwnPropertyDescriptors;

import java.rmi.server.ObjID;

import matrix.gnu.bin.proto.constructor.create.Log;

public record Q() {
    public static void getQuery(MatchException exception, NegativeArraySizeException except, boolean add) throws Exception {
        try {
            Log.Q(exception, except, add);
        } catch (Exception e) {
            // handle exception
            e.setStackTrace(null);
        }
    }

    public static void books(ObjID oId, ObjID objID) {
        objID = oId;
    }
}
