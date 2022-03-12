package designPattern.facotry_method.request;

import designPattern.facotry_method.factory.IssueFactory;
import designPattern.facotry_method.model.HttpBody;
import designPattern.facotry_method.model.RequestModel;
import designPattern.facotry_method.model.StdIssueModel;

public class RequestService {

    public void sendDate(StdIssueModel issueModel, String type ) {
        RequestModel requestModel = new RequestModel();

        // todo: do the same with header also
        requestModel.setHeader( new Object() );
        HttpBody httpBody = new HttpBody();
        httpBody.setBody(IssueFactory.getIssueModel(issueModel,type));
        requestModel.setHttpBody(httpBody );

        // make http request and other things \

    }

}
