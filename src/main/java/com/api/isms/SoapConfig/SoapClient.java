/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.SoapConfig;

import com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local.SendSmsResponse;
import javax.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 *
 * @author Administrateur
 */
public class SoapClient extends WebServiceGatewaySupport {

    public String getBank(String url, Object request) {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return  (String) res.getValue();
    }
}
