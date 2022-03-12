package designPattern.prac.fireeye2.repo;

import designPattern.prac.fireeye2.entity.FileEntity;

import java.util.HashMap;
import java.util.Objects;

public class FileSingletonRepository {

    private static FileSingletonRepository instance;

    private HashMap<Integer, FileEntity> fileEntityHashMap;

    private FileSingletonRepository(){
        fileEntityHashMap = new HashMap<>();
    }

    public FileEntity getFileEntity(int id ) {
        //todo: handle exception
        if( fileEntityHashMap.containsKey(id) ) {
            return fileEntityHashMap.get(id);
        }
        return null;
    }

    public void saveFileRecord( FileEntity fileEntity ) {
        fileEntityHashMap.put(fileEntity.getId(),fileEntity);
    }

    public static FileSingletonRepository getInstance() {
        if(Objects.isNull(instance)) {
            synchronized (FileSingletonRepository.class) {
                if( Objects.isNull(instance) ) {
                    instance = new FileSingletonRepository();
                }
            }
        }
        return instance;
    }

}
