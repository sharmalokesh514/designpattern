package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.model.BugzilaIssueModel;
import designPattern.abstractfactory.model.RequestModel;
import designPattern.abstractfactory.model.StdIssueModel;

public class BugzilaIssueFactory extends IssueFactory {

    // todo:convert this in same manner like jira
    @Override
    RequestModel createIssueModel(StdIssueModel stdIssueModel) {

        return null;
    }
}
