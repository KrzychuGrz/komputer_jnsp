package drive;

import com.komputer.komputer.File;

public interface Drive {
    void addFile (File file);
    void listFile();

    File findFile(String name);
}
