package designPattern.prac.fireeye3.libraryAdapter;

import designPattern.prac.fireeye3.library_classess.ZipFile;

import java.util.List;

public class ZipFileWrapper implements UnPackage {

    private ZipFile zipFile;

    public ZipFileWrapper() {
        zipFile = new ZipFile();
    }

    @Override
    public List<String> unPackage(String filePath) {
        return zipFile.getAllFileInsideZip(filePath);
    }
}
