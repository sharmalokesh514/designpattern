package designPattern.creational.factorymethod3.service.factory;

import designPattern.creational.factorymethod3.entity.AccessibilityBugEntity;

//todo:
public abstract class APIService {
    public abstract void save(AccessibilityBugEntity accessibilityBugEntity);

    public void saveInBugTool( AccessibilityBugEntity accessibilityBugEntity, String bugTool ) {
        APIService apiService = null;
        if( bugTool.equalsIgnoreCase("jira") ) {
            apiService = new JiraAPIService();

        } else if( bugTool.equalsIgnoreCase("bugzilla") ) {
            apiService = new BugzillaAPIService();
        }

        apiService.save(accessibilityBugEntity);
    }
}
