/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.SoapConfig;

/**
 *
 * @author Administrateur
 */
import com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local.SendSms;
import com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local.SendSmsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SmsClient extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(SmsClient.class);

  public SendSmsResponse sendSms(String url, SendSms request) {

    //SendSms s = new SendSms();
    //request.setName(country);

    log.info("Requesting location for " + request);

    SendSmsResponse response = (SendSmsResponse) getWebServiceTemplate()
        .marshalSendAndReceive(url, request,
            new SoapActionCallback(
                "file:/C:/Users/Administrateur.WIN-I3614B19KM9/Documents/wsdlisms/(Part4 SMS)/parlayx_sms_send_service_2_2.wsdl"));

    return response;
  }

}