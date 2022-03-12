package designPattern.prac.fireeye2.library_classess;

import java.util.ArrayList;
import java.util.List;

public class ZipFile {

    public List<String> getAllFileInsideZip(String filePath ) {
        //todo: open tar file and share path with user
        List<String> list = new ArrayList<>();
        list.add("file1");
        list.add("file2");
        return list;
    }

}
