package designPattern.abstractFacotry2.httpreq.reqBuilderFactory;

import designPattern.abstractFacotry2.model.BugModel;
import designPattern.abstractFacotry2.model.HttpRequest;

public class HttpBuilderFactory {

    public HttpRequest getHttpRequest(BugModel bugModel, String type ) {

        if(type.equals("jira")) {

        }
        return null;
    }

}
