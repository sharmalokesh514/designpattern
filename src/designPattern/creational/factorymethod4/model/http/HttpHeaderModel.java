package designPattern.creational.factorymethod4.model.http;

import java.util.HashMap;

public class HttpHeaderModel {

    private HashMap<String,String> headerMap;

    public HttpHeaderModel() {
        headerMap = new HashMap<>();
    }

    public HashMap<String, String> getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(HashMap<String, String> headerMap) {
        this.headerMap = headerMap;
    }
}
