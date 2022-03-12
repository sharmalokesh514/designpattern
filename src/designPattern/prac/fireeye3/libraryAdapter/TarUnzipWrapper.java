package designPattern.prac.fireeye3.libraryAdapter;

import designPattern.prac.fireeye3.library_classess.TarUnzip;

import java.util.List;

public class TarUnzipWrapper implements UnPackage {

    private TarUnzip tarUnzip;

    public TarUnzipWrapper() {
        tarUnzip = new TarUnzip();
    }

    @Override
    public List<String> unPackage(String filePath) {
        return tarUnzip.getUnzippedFile(filePath);
    }

}
