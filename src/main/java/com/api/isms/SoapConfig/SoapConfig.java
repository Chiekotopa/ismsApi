/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.SoapConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 *
 * @author Administrateur
 */
@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local");
        return marshaller;
    }

    @Bean
    public SmsClient soapConnector(Jaxb2Marshaller marshaller) {
        SmsClient client = new SmsClient();
        //client.setDefaultUri("http://www.csapi.org/schema/parlayx/common/v2_1");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
    
  
  }
