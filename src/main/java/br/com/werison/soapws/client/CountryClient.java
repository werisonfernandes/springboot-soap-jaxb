package br.com.werison.soapws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.igastei.soapws.gen.GetCountryRequest;
import br.com.igastei.soapws.gen.GetCountryResponse;

public class CountryClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CountryClient.class);

    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        logger.info("Requesting information for " + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

}