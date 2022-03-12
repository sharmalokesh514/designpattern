package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.model.RequestModel;
import designPattern.abstractfactory.model.StdIssueModel;

public abstract class IssueFactory {

    abstract RequestModel createIssueModel(StdIssueModel stdIssueModel);

    public static RequestModel getIssueModel(StdIssueModel stdIssueModel, String type ) {
        IssueFactory issueFactory = null;

        try {
            issueFactory = (IssueFactory) Class.forName(type).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            //todo:throw custom exception
        }
        return issueFactory.createIssueModel(stdIssueModel);
    }

}
