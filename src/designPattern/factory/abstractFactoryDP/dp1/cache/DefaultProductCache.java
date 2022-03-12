package designPattern.factory.abstractFactoryDP.dp1.cache;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Objects;

public class DefaultProductCache {

    private static DefaultProductCache defaultProductCache;

    HashMap<String,HashMap<String,Double>> productCache;

    private DefaultProductCache(){
        productCache = new HashMap<>();

        productCache.put( "default",new HashMap<>() );
        productCache.get("default").put("default",10.0);
    }

    public Double getValue( String product, String item ) {
        return productCache.get(product).get(item);
    }

    public Double getDefault(  ) {
        return 10.0;
    }

    public static synchronized DefaultProductCache getInstance() {
        if(Objects.isNull(defaultProductCache) ){
            defaultProductCache = new DefaultProductCache();
        }

        return defaultProductCache;
    }

}
