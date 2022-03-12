package designPattern.factory.dp3.logger;

public class LoggerSimpleFactory {

    public Logger logMessage( String type ) {
        if( type.equalsIgnoreCase("Disk") ) {
            return new DiskLogger();
        } else if( type.equalsIgnoreCase("DB") ) {
            return new DBLogger();
        } else if ( type.equalsIgnoreCase("Memorylog") ) {
            // Todo: memory logger
        }
        return null;
    }
}
