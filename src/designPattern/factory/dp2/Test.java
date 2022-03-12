package designPattern.factory.dp2;

import designPattern.factory.dp2.logger.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("message1", "db");
    }
}
