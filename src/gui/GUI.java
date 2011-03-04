package gui;
import java.lang.ClassLoader;
class GUI extends ClassLoader {
    String host;
    int port;

    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
		return null;
        // load the class data from the connection
    }
}