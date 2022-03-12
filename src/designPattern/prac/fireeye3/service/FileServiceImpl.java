package designPattern.prac.fireeye3.service;

import designPattern.prac.fireeye3.entity.FileEntity;
import designPattern.prac.fireeye3.repo.FileSingletonRepository;

public class FileServiceImpl {

    private FileSingletonRepository fileSingletonRepository = FileSingletonRepository.getInstance();

    private FileGenerationServiceImpl fileGenerationService = new FileGenerationServiceImpl();

    public void save(String filePath, String type) {
        //todo: type can be get from file name also
        FileEntity fileEntity = new FileEntity();
        fileEntity.setPath(filePath);
        fileEntity.setAllFiles(fileGenerationService.getAllFiles(filePath,type));
        fileSingletonRepository.saveFileRecord(fileEntity);
    }

    public FileEntity getFile(int id ) {
        return fileSingletonRepository.getFileEntity(id);
    }

}
