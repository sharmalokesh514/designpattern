package designPattern.creational.factorymethod4.repo;

import designPattern.creational.factorymethod4.entity.AccessibilityBugEntity;

import java.util.HashMap;
import java.util.Objects;

public class BugToolSingletonRepo {

    private static BugToolSingletonRepo instance;
    HashMap<Integer, AccessibilityBugEntity> bugEntityHashMap;

    private BugToolSingletonRepo() {
        bugEntityHashMap = new HashMap<>();
    }

    public AccessibilityBugEntity getAccessibilityBugEntity(int id) {
        //todo: handle exception
        return bugEntityHashMap.get(id);
    }

    public AccessibilityBugEntity saveAccessibilityBugEntity(AccessibilityBugEntity accessibilityBugEntity ) {
        bugEntityHashMap.put(accessibilityBugEntity.getId(),accessibilityBugEntity);
        return accessibilityBugEntity;
    }

    public static BugToolSingletonRepo getInstance() {
        if(Objects.isNull(instance)) {
            synchronized (BugToolSingletonRepo.class) {
                if( Objects.isNull(instance) ) {
                    instance = new BugToolSingletonRepo();
                }
            }
        }
        return instance;
    }

}
