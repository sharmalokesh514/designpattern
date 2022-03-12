package designPattern.creational.factorymethod.model.http;


public class HttpRequestModel {

    private HttpHeaderModel header;
    private Object body;
    private String url;

    public HttpHeaderModel getHeader() {
        return header;
    }

    public void setHeader(HttpHeaderModel header) {
        this.header = header;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
