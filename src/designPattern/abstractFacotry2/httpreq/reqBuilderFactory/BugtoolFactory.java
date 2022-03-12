package designPattern.abstractFacotry2.httpreq.reqBuilderFactory;

import designPattern.abstractFacotry2.model.BugModel;
import designPattern.abstractFacotry2.model.HttpRequest;

public interface BugtoolFactory {
     void buildHttpRequest(HttpRequest httpRequest, BugModel bugModel);
}
