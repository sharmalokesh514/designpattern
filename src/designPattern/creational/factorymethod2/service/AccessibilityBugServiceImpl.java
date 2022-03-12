package designPattern.creational.factorymethod2.service;

import designPattern.creational.factorymethod2.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod2.model.BugzilaBugModel;
import designPattern.creational.factorymethod2.model.JiraBugModel;
import designPattern.creational.factorymethod2.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod2.model.http.HttpRequestModel;
import designPattern.creational.factorymethod2.repo.BugToolSingletonRepo;
import designPattern.creational.factorymethod2.service.factory.BugzillaAPIService;
import designPattern.creational.factorymethod2.service.factory.JiraAPIService;

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
        //todo : we should remove if-else from here
        if( bugTool.equalsIgnoreCase("jira") ) {
            JiraAPIService jiraAPIService = new JiraAPIService();
            jiraAPIService.save(accessibilityBugEntity);

        } else if( bugTool.equalsIgnoreCase("bugzilla") ) {
            BugzillaAPIService bugzillaAPIService = new BugzillaAPIService();
            bugzillaAPIService.save(accessibilityBugEntity);
        }

        //todo : save standerd object in the DB
        accessibilityBugEntity.setPushed(true);
        bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
        return true;
    }


}
