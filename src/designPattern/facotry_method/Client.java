package designPattern.facotry_method;

import designPattern.facotry_method.model.StdIssueModel;
import designPattern.facotry_method.request.RequestService;

public class Client {

    public static void main(String[] args) {
        RequestService requestService = new RequestService();
        StdIssueModel stdIssueModel = new StdIssueModel();
        stdIssueModel.setIssue("1");
        requestService.sendDate(stdIssueModel,"abc");
    }

}
