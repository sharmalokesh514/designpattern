package designPattern.prac.fireeye2;

import designPattern.prac.fireeye2.entity.FileEntity;
import designPattern.prac.fireeye2.service.FileServiceImpl;

public class Client {

    public static void main(String[] args) {

        FileServiceImpl fileService = new FileServiceImpl();
        String filePath1 = "zip";
        fileService.save(filePath1,"zip");

        String filePath2 = "tar";
        fileService.save(filePath2,"tar");

        FileEntity fileEntity1 = fileService.getFile(1);
        FileEntity fileEntity2 = fileService.getFile(2);

        System.out.println( fileEntity1.getId() + " : " + fileEntity1.getAllFiles() );

        System.out.println( fileEntity2.getId() + " : " + fileEntity2.getAllFiles() );


    }

}
