package designPattern.creational.factorymethod4.service.factory;

import designPattern.creational.factorymethod4.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod4.model.BugzilaBugModel;
import designPattern.creational.factorymethod4.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod4.model.http.HttpRequestModel;

public class BugzillaAPIService extends APIService {

    @Override
    public void prepareHttpRequest(AccessibilityBugEntity accessibilityBugEntity) {
        BugzilaBugModel bugzilaBugModel = new BugzilaBugModel();
        bugzilaBugModel.setIssueName(accessibilityBugEntity.getBugName());
        bugzilaBugModel.setIssueDetails(accessibilityBugEntity.getBugDetails());
        HttpRequestModel httpRequest = new HttpRequestModel();
        HttpHeaderModel httpHeaderModel = new HttpHeaderModel();
        httpHeaderModel.getHeaderMap().put("username","abc");
        httpRequest.setBody(bugzilaBugModel);
        httpRequest.setHeader(httpHeaderModel);
        httpRequest.setUrl("url");
    }

    @Override
    public void prepareResponse() {
        // todo: convert response in our standerd object and return
    }
}
