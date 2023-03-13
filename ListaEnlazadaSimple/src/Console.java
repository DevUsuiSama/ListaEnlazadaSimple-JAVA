public class Console {

    static {
        System.loadLibrary("lib/Console");
    }

    public static native void setTitle(String string);
    public static native void command(String string);

}
