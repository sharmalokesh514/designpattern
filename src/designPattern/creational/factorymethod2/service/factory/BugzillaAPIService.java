package designPattern.creational.factorymethod2.service.factory;

import designPattern.creational.factorymethod2.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod2.model.BugzilaBugModel;
import designPattern.creational.factorymethod2.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod2.model.http.HttpRequestModel;

public class BugzillaAPIService {

    public void save( AccessibilityBugEntity accessibilityBugEntity ) {

        BugzilaBugModel bugzilaBugModel = new BugzilaBugModel();
        bugzilaBugModel.setIssueName(accessibilityBugEntity.getBugName());
        bugzilaBugModel.setIssueDetails(accessibilityBugEntity.getBugDetails());

        HttpRequestModel httpRequest = new HttpRequestModel();
        HttpHeaderModel httpHeaderModel = new HttpHeaderModel();
        httpHeaderModel.getHeaderMap().put("username","abc");
        httpRequest.setBody(bugzilaBugModel);
        httpRequest.setHeader(httpHeaderModel);
        httpRequest.setUrl("url");

        // todo : hit the request
        // todo: convert response in our standerd object and return

    }
}
