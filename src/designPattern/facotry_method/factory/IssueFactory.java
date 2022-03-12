package designPattern.facotry_method.factory;

import designPattern.facotry_method.model.IssueModel;
import designPattern.facotry_method.model.StdIssueModel;

public abstract class IssueFactory {

    abstract IssueModel createIssueModel(StdIssueModel stdIssueModel);

    public static IssueModel getIssueModel(StdIssueModel stdIssueModel, String type ) {
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
