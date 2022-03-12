package designPattern.factory.dp3.logger;

import static designPattern.constants.Constant.*;

public class DiskLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(BLUE + "file opened in Disk");
        System.out.println(BLUE+ "written in file : " + message);
        System.out.println(BLUE + "file closed");
    }
}
