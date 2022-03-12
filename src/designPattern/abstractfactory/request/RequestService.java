package designPattern.abstractfactory.request;

import designPattern.abstractfactory.factory.IssueFactory;
import designPattern.abstractfactory.model.HttpBody;
import designPattern.abstractfactory.model.RequestModel;
import designPattern.abstractfactory.model.StdIssueModel;

public class RequestService {

    public void sendDate(StdIssueModel issueModel, String type ) {
        RequestModel requestModel = new RequestModel();

        // todo: do the same with header also
        // todo: change it to abstract-factory manner
        requestModel.setHeader( new Object() );
        HttpBody httpBody = new HttpBody();
        httpBody.setBody(IssueFactory.getIssueModel(issueModel,type));
        requestModel.setHttpBody(httpBody );

        // make http request and other things \

    }

}
