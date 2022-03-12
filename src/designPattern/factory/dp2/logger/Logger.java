package designPattern.factory.dp2.logger;

public class Logger {

    public static final String ANSI_BLUE = "\u001B[34m";

    public void logMessage( String message, String type ) {
        if( type.equalsIgnoreCase("Disk") ) {
            writeOnDisk(message);
        } else if( type.equalsIgnoreCase("DB") ) {
            writeInDB(message);
        } else if ( type.equalsIgnoreCase("Memorylog") ) {
            writeInMemory(message);
        }
    }

    public void writeOnDisk( String message ) {
        System.out.println(ANSI_BLUE + "file opened in Disk");
        System.out.println(ANSI_BLUE+ "written in file : " + message);
        System.out.println(ANSI_BLUE + "file closed");
    }

    public void writeInDB( String message ) {
        System.out.println(ANSI_BLUE+ "open connection");
        System.out.println(ANSI_BLUE + "written logs : " + message);
        System.out.println(ANSI_BLUE + "connection closed");
    }

    public void writeInMemory( String message ) {
        System.out.println(ANSI_BLUE + "logged inMemory : " + message);
    }

}
