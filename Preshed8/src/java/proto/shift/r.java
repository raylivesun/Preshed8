package proto.shift;

public interface r {

    public static Object STR = null;
    public static void shift(int x, int ybMB, int xoffset, int yoffset)  throws Exception {
        if (STR != null) {
            x = STR.hashCode();
            ybMB = STR.hashCode();
            xoffset = STR.hashCode();
            yoffset = STR.hashCode();  
        } else {
        }
    }
}
