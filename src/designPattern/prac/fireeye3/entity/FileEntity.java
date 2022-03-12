package designPattern.prac.fireeye3.entity;

import java.util.List;

public class FileEntity {

    private int id;
    private static int ID = 1;

    //todo: can be file also but for now taking it normaly
    private List<String> allFiles;
    private String path;

    public FileEntity() {
        setId();
    }

    public int getId() {
        return id;
    }

    private void setId() {
        synchronized (FileEntity.class) {
            this.id = ID;
            ID = ID+1;
        }
    }

    public List<String> getAllFiles() {
        return allFiles;
    }

    public void setAllFiles(List<String> allFiles) {
        this.allFiles = allFiles;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
