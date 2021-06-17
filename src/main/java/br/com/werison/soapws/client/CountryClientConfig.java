package br.com.werison.soapws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

//@Configuration
public class CountryClientConfig {

    //@Bean
    public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("br.com.igastei.soapws.gen");
            return marshaller;
    }

    //@Bean
    public CountryClient countryClient(Jaxb2Marshaller marshaller) {
            CountryClient client = new CountryClient();
            client.setDefaultUri("http://localhost:8083/ws");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
    }
}