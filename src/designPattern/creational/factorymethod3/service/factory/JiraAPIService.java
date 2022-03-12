package designPattern.creational.factorymethod3.service.factory;

import designPattern.creational.factorymethod3.entity.AccessibilityBugEntity;
import designPattern.creational.factorymethod3.model.JiraBugModel;
import designPattern.creational.factorymethod3.model.http.HttpHeaderModel;
import designPattern.creational.factorymethod3.model.http.HttpRequestModel;

//todo: add interface
public class JiraAPIService extends APIService {

    //todo : we should remove common field and add in parrent class and can be use template Design pattern
    public void save(AccessibilityBugEntity accessibilityBugEntity) {
        JiraBugModel jiraBugModel = new JiraBugModel();
        jiraBugModel.setBugName(accessibilityBugEntity.getBugName());
        jiraBugModel.setBugDetails(accessibilityBugEntity.getBugDetails());

        HttpRequestModel httpRequest = new HttpRequestModel();
        HttpHeaderModel httpHeaderModel = new HttpHeaderModel();
        httpHeaderModel.getHeaderMap().put("username","abc");
        httpRequest.setBody(jiraBugModel);
        httpRequest.setHeader(httpHeaderModel);
        httpRequest.setUrl("url");

        // todo : hit the request
        // todo: convert response in our standerd object and return
    }

}
