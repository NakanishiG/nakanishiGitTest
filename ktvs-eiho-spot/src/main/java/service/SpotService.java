package service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import bean.*;
import model.*;

@Stateless()
@WebService(
		name = "KtvsEihoService",
		targetNamespace = "http://ktvseiho.spot.jp/",
		serviceName = "SpotService")
public class SpotService {

	@Inject
	private ContractBean ejbRef;
	
    @WebMethod(operationName = "getContract", action="http://ktvseiho.spot.jp/IWsService/getContract")
    public Contract getContract(@WebParam(name = "contractNo") Integer contractNo) {
        return ejbRef.find(contractNo);
    }
}
