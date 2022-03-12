package designPattern.creational.factorymethod1.service;

import designPattern.creational.factorymethod1.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod1.model.BugzilaBugModel;
import designPattern.creational.factorymethod1.model.JiraBugModel;
import designPattern.creational.factorymethod1.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod1.model.http.HttpRequestModel;
import designPattern.creational.factorymethod1.repo.BugToolSingletonRepo;

//todo: SRP is not followed on class level
public class AccessibilityBugServiceImpl {

    private BugToolSingletonRepo bugToolSingletonRepo = BugToolSingletonRepo.getInstance();

    //todo: create a model for service layer
    public void saveBug(AccessibilityBugEntity accessibilityBugEntity) {
        bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
    }

    public AccessibilityBugEntity getBug(int id ) {
        return bugToolSingletonRepo.getAccessibilityBugEntity(id);
    }

    // todo : hgandle exception
    public boolean pushBugToBugReportingTool( int id, String bugTool ) {
        AccessibilityBugEntity accessibilityBugEntity = bugToolSingletonRepo.getAccessibilityBugEntity(id);
        if( bugTool.equalsIgnoreCase("jira") ) {
            saveInJira(accessibilityBugEntity);

        } else if( bugTool.equalsIgnoreCase("bugzilla") ) {
            saveInBugzilla(accessibilityBugEntity);
        }

        //todo : save standerd object in the DB
        accessibilityBugEntity.setPushed(true);
        bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
        return true;
    }

    public void saveInJira( AccessibilityBugEntity accessibilityBugEntity ) {

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
        // todo: convert response in our standerd object and return

    }

    public void saveInBugzilla( AccessibilityBugEntity accessibilityBugEntity ) {

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
