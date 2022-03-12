package designPattern.factory.dp1.logger;

public class Logger {

    public static final String ANSI_BLUE = "\u001B[34m";

    public void logMessage( String message, String type ) {
        if( type.equalsIgnoreCase("Disk") ) {
            System.out.println(ANSI_BLUE + "file opened in Disk");
            System.out.println(ANSI_BLUE+ "written in file : " + message);
            System.out.println(ANSI_BLUE + "file closed");
        } else if( type.equalsIgnoreCase("DB") ) {
            System.out.println(ANSI_BLUE+ "open connection");
            System.out.println(ANSI_BLUE + "written logs : " + message);
            System.out.println(ANSI_BLUE + "connection closed");
        } else if ( type.equalsIgnoreCase("Memory log") ) {
            System.out.println(ANSI_BLUE + "logged inMemory : " + message);
        }
    }

}
