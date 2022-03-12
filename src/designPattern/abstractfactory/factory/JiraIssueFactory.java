package designPattern.abstractfactory.factory;

import designPattern.abstractfactory.model.*;

public class JiraIssueFactory extends IssueFactory {

    @Override
    RequestModel createIssueModel(StdIssueModel stdIssueModel) {

        RequestModel requestModel = new RequestModel();
        setHeader(requestModel);
        HttpBody httpBody = new HttpBody();
        httpBody.setBody(convert(stdIssueModel));
        requestModel.setHttpBody(httpBody);

        return requestModel;
    }

    public JiraIssueModel convert( StdIssueModel stdIssueModel ) {
        JiraIssueModel jiraIssueModel = new JiraIssueModel();
        jiraIssueModel.setBug(stdIssueModel.getIssue());
        jiraIssueModel.setDescription(stdIssueModel.getDescription());
        return jiraIssueModel;
    }

    public void setHeader( RequestModel requestModel ) {
        requestModel.setHeader(new Object());
    }
}
