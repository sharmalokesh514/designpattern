package designPattern.abstractfactory;

import designPattern.abstractfactory.model.StdIssueModel;
import designPattern.abstractfactory.request.RequestService;

public class Client {

    public static void main(String[] args) {
        RequestService requestService = new RequestService();
        StdIssueModel stdIssueModel = new StdIssueModel();
        stdIssueModel.setIssue("1");
        requestService.sendDate(stdIssueModel,"abc");
    }

}
