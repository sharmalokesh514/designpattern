package designPattern.creational.factorymethod3;

import designPattern.creational.factorymethod3.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod3.service.AccessibilityBugServiceImpl;

public class Client {

    public static void main(String[] args) {

        AccessibilityBugServiceImpl accessibilityBugService = new AccessibilityBugServiceImpl();

        AccessibilityBugEntity bug1 = new AccessibilityBugEntity();
        bug1.setBugName("bug1");
        bug1.setBugDetails("bug1");
        bug1.setPushed(false);
        accessibilityBugService.saveBug(bug1);

        AccessibilityBugEntity bug2 = new AccessibilityBugEntity();
        bug2.setBugName("bug2");
        bug2.setBugDetails("bug3");
        bug2.setPushed(false);
        accessibilityBugService.saveBug(bug2);

        AccessibilityBugEntity bug3 = new AccessibilityBugEntity();
        bug3.setBugName("bug3");
        bug3.setBugDetails("bug3");
        bug3.setPushed(false);
        accessibilityBugService.saveBug(bug3);

        accessibilityBugService.pushBugToBugReportingTool(1,"jira");

        accessibilityBugService.pushBugToBugReportingTool(2,"bugzilla");

        bug1 = null;
        bug2 = null;
        bug3 = null;

        bug1 = accessibilityBugService.getBug(1);
        bug2 = accessibilityBugService.getBug(2);
        bug3 = accessibilityBugService.getBug(3);
        System.out.println( "bug1 - " + bug1.isPushed() );
        System.out.println( "bug2 - " + bug2.isPushed() );
        //System.out.println( "bug3 - " + bug3.isPushed() );



    }

}
