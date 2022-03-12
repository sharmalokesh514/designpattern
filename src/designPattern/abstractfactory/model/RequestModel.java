package designPattern.abstractfactory.model;

public class RequestModel {
    private Object header;
    private HttpBody httpBody;

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public HttpBody getHttpBody() {
        return httpBody;
    }

    public void setHttpBody(HttpBody httpBody) {
        this.httpBody = httpBody;
    }
}
