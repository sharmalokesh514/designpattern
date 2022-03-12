package designPattern.creational.factorymethod4.service.factory;

import designPattern.creational.factorymethod4.entity.AccessibilityBugEntity;

public abstract class APIService {
    public final void save(AccessibilityBugEntity accessibilityBugEntity){
        prepareHttpRequest(accessibilityBugEntity);
        // todo : hit the request
        prepareResponse();
    }

    public abstract void prepareHttpRequest(AccessibilityBugEntity accessibilityBugEntity);
    public abstract void prepareResponse();

    public final void saveInBugTool(AccessibilityBugEntity accessibilityBugEntity, String bugTool ) {
        APIService apiService = null;
        if( bugTool.equalsIgnoreCase("jira") ) {
            apiService = new JiraAPIService();

        } else if( bugTool.equalsIgnoreCase("bugzilla") ) {
            apiService = new BugzillaAPIService();
        }

        apiService.save(accessibilityBugEntity);
    }
}
