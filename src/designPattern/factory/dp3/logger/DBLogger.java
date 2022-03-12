package designPattern.factory.dp3.logger;

import static designPattern.constants.Constant.*;

public class DBLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(BLUE+ "open connection");
        System.out.println(BLUE + "written logs : " + message);
        System.out.println(BLUE + "connection closed");
    }
}
