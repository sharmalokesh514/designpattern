package designPattern.prac.fireeye.service;

import designPattern.prac.fireeye.entity.FileEntity;
import designPattern.prac.fireeye.library_classess.TarUnzip;
import designPattern.prac.fireeye.library_classess.ZipFile;
import designPattern.prac.fireeye.repo.FileSingletonRepository;

public class FileServiceImpl {

    private FileSingletonRepository fileSingletonRepository = FileSingletonRepository.getInstance();

    public void save(String filePath, String type) {
        //todo: type can be get from file name also
        FileEntity fileEntity = new FileEntity();
        //todo: file path should be aws-s2 file path
        fileEntity.setPath(filePath);

        //todo: remove if-else to another place, not following srp rule
        if(type.equalsIgnoreCase("zip")) {
            ZipFile zipFile = new ZipFile();
            fileEntity.setAllFiles( zipFile.getAllFileInsideZip(filePath) );
        } else if ( type.equalsIgnoreCase("tar") ) {
            TarUnzip tarUnzip = new TarUnzip();
            fileEntity.setAllFiles( tarUnzip.getUnzippedFile(filePath) );
        }
        fileSingletonRepository.saveFileRecord(fileEntity);
    }

    public FileEntity getFile( int id ) {
        return fileSingletonRepository.getFileEntity(id);
    }

}
