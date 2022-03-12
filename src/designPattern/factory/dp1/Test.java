package designPattern.factory.dp1;


import designPattern.factory.dp1.logger.Logger;

public class Test {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("message1", "db");
    }

}
