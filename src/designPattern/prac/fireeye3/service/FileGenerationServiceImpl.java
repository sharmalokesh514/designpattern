package designPattern.prac.fireeye3.service;

import designPattern.prac.fireeye3.libraryAdapter.TarUnzipWrapper;
import designPattern.prac.fireeye3.libraryAdapter.UnPackage;
import designPattern.prac.fireeye3.libraryAdapter.ZipFileWrapper;
import designPattern.prac.fireeye3.library_classess.TarUnzip;
import designPattern.prac.fireeye3.library_classess.ZipFile;

import java.util.List;

public class FileGenerationServiceImpl {


    public List<String> getAllFiles( String filePath, String type ) {
        //todo: remove if-else, there might be a-lot of request
        //todo: please conside it as simple factory or create new factory to remove this
        if(type.equalsIgnoreCase("zip")) {
            UnPackage unPackage = new ZipFileWrapper();
            return unPackage.unPackage(filePath) ;
        } else if ( type.equalsIgnoreCase("tar") ) {
            UnPackage unPackage = new TarUnzipWrapper();
            return unPackage.unPackage(filePath) ;
        }
        //todo: throw exception
        return null;
    }

}
