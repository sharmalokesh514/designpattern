package designPattern.creational.factorymethod4.service.factory;

import designPattern.creational.factorymethod4.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod4.model.JiraBugModel;
import designPattern.creational.factorymethod4.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod4.model.http.HttpRequestModel;

public class JiraAPIService extends APIService {

    @Override
    public void prepareHttpRequest(AccessibilityBugEntity accessibilityBugEntity) {
        JiraBugModel jiraBugModel = new JiraBugModel();
        jiraBugModel.setBugName(accessibilityBugEntity.getBugName());
        jiraBugModel.setBugDetails(accessibilityBugEntity.getBugDetails());

        HttpRequestModel httpRequest = new HttpRequestModel();
        HttpHeaderModel httpHeaderModel = new HttpHeaderModel();
        httpHeaderModel.getHeaderMap().put("username","abc");
        httpRequest.setBody(jiraBugModel);
        httpRequest.setHeader(httpHeaderModel);
        httpRequest.setUrl("url");
    }

    @Override
    public void prepareResponse() {
        // todo: convert response in our standerd object and return
    }
}
