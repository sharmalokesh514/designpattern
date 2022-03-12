package designPattern.facotry_method.factory;

import designPattern.facotry_method.model.BugzilaIssueModel;
import designPattern.facotry_method.model.IssueModel;
import designPattern.facotry_method.model.StdIssueModel;

public class BugzilaIssueFactory extends IssueFactory {

    @Override
    IssueModel createIssueModel(StdIssueModel stdIssueModel) {
        BugzilaIssueModel bugzilaIssueModel = new BugzilaIssueModel();
        bugzilaIssueModel.setIssue(stdIssueModel.getIssue());
        bugzilaIssueModel.setDescription(stdIssueModel.getDescription());
        return bugzilaIssueModel;
    }
}
