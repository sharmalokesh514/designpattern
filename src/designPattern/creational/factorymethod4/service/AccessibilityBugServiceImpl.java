package designPattern.creational.factorymethod4.service;

import designPattern.creational.factorymethod4.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod4.repo.BugToolSingletonRepo;

public class AccessibilityBugServiceImpl{

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


        //todo : save standerd object in the DB
        accessibilityBugEntity.setPushed(true);
        bugToolSingletonRepo.saveAccessibilityBugEntity(accessibilityBugEntity);
        return true;
    }


}
