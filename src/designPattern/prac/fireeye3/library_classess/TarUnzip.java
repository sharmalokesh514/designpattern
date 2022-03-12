package designPattern.prac.fireeye3.library_classess;

import java.util.ArrayList;
import java.util.List;

public class TarUnzip {

    public List<String> getUnzippedFile( String tarFilePath ) {
        //todo: open tar file and share path with user
        List<String> list = new ArrayList<>();
        list.add("file1");
        list.add("file2");
        return list;
    }

}
