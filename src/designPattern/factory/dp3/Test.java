package designPattern.factory.dp3;

import designPattern.factory.dp3.logger.LoggerSimpleFactory;

public class Test {

    public static void main(String[] args) {
        LoggerSimpleFactory loggerSimpleFactory = new LoggerSimpleFactory();
        loggerSimpleFactory.logMessage("disk").log("message1");
    }

}
