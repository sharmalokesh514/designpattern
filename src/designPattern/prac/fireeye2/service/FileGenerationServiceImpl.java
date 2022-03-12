package designPattern.prac.fireeye2.service;

import designPattern.prac.fireeye2.library_classess.TarUnzip;
import designPattern.prac.fireeye2.library_classess.ZipFile;

import java.util.List;

public class FileGenerationServiceImpl {

    public List<String> getAllFiles( String filePath, String type ) {
        //todo: remove if-else, there might be a-lot of request
        if(type.equalsIgnoreCase("zip")) {
            ZipFile zipFile = new ZipFile();
            return zipFile.getAllFileInsideZip(filePath) ;
        } else if ( type.equalsIgnoreCase("tar") ) {
            TarUnzip tarUnzip = new TarUnzip();
            return tarUnzip.getUnzippedFile(filePath);
        }
        //todo: throw exception
        return null;
    }

}
