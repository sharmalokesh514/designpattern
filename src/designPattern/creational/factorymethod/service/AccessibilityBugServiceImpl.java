package designPattern.creational.factorymethod.service;

import designPattern.creational.factorymethod.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod.model.BugzilaBugModel;
import designPattern.creational.factorymethod.model.JiraBugModel;
import designPattern.creational.factorymethod.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod.model.http.HttpRequestModel;
import designPattern.creational.factorymethod.repo.BugToolSingletonRepo;

//todo: save into
public class AccessibilityBugServiceImpl {

    private BugToolSingletonRepo bugToolSingletonRepo = BugToolSingletonRepo.getInstance();

    //todo: create a model for service layer
    public void saveBug(AccessibilityBugEntity accessibilityBugEntity) {
        bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
    }

    public AccessibilityBugEntity getBug( int id ) {
        return bugToolSingletonRepo.getAccessibilityBugEntity(id);
    }

    //todo : method is doing alot of thing and not following SRP so we need to make it simplified more
    public boolean pushBugToBugReportingTool( int id, String bugTool ) {
        AccessibilityBugEntity accessibilityBugEntity = bugToolSingletonRepo.getAccessibilityBugEntity(id);
        if( bugTool.equalsIgnoreCase("jira") ) {

            JiraBugModel jiraBugModel = new JiraBugModel();
            jiraBugModel.setBugName(accessibilityBugEntity.getBugName());
            jiraBugModel.setBugDetails(accessibilityBugEntity.getBugDetails());

            HttpRequestModel httpRequest = new HttpRequestModel();
            HttpHeaderModel httpHeaderModel = new HttpHeaderModel();
            httpHeaderModel.getHeaderMap().put("username","abc");
            httpRequest.setBody(jiraBugModel);
            httpRequest.setHeader(httpHeaderModel);
            httpRequest.setUrl("url");

            // todo : hit the request
            // todo: convert response in our standerd object and save in the DB

            accessibilityBugEntity.setPushed(true);
            bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
            return true;

        } else if( bugTool.equalsIgnoreCase("bugzilla") ) {

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
            // todo: convert response in our standerd object and save in the DB

            accessibilityBugEntity.setPushed(true);
            bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
            return true;

        }
        return false;
    }

}
