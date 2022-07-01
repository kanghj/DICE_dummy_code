package tutorial.io;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class FileOutStream extends FileOutputStream {
    public FileOutStream(String name) throws FileNotFoundException {
        super(name != null ? new File(name) : null, false);
    }
}
