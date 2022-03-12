package designPattern.facotry_method.factory;

import designPattern.facotry_method.model.IssueModel;
import designPattern.facotry_method.model.JiraIssueModel;
import designPattern.facotry_method.model.StdIssueModel;

public class JiraIssueFactory extends IssueFactory {

    @Override
    IssueModel createIssueModel(StdIssueModel stdIssueModel) {

        JiraIssueModel jiraIssueModel = new JiraIssueModel();
        jiraIssueModel.setBug(stdIssueModel.getIssue());
        jiraIssueModel.setDescription(stdIssueModel.getDescription());

        return jiraIssueModel;
    }
}
