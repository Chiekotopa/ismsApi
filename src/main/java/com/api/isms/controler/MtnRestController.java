/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.controler;

import com.api.isms.SoapConfig.SmsClient;
import com.api.isms.cn.com.huawei.schema.common.v2_1.RequestSOAPHeader;
import com.api.isms.entities.PojoSms;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ChargingInformation;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.NamedParameterList;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ObjectFactory;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.SimpleReference;
import com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local.SendSms;
import com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local.SendSmsResponse;
import com.api.isms.org.csapi.wsdl.parlayx.sms.send.v2_2.service.SendSmsService;
import java.util.ArrayList;
import java.util.List;
import javax.wsdl.extensions.soap.SOAPBody;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 *
 * @author Administrateur
 */
@RestController
@RequestMapping("/api/smsMtn")
public class MtnRestController {

    private static PojoSms pojoSms;

    @Autowired
    private SmsClient smsClient;
    private SendSmsResponse reponse;

    @PostMapping("sendSms")
    public SendSmsResponse sendSmsApi(@RequestBody PojoSms pojoSms) {
       
        
        System.out.println("start++++++++++++++");

        WebServiceTemplate template = new WebServiceTemplate();
        System.out.println(pojoSms.getSenderName());
        NamedParameterList namedParameterList = new NamedParameterList();
        SimpleReference simpleReference = new SimpleReference();
        simpleReference.setCorrelator("00001");
        simpleReference.setEndpoint("http://41.206.4.162:8310/notify");
        ChargingInformation chargingInformation = new ChargingInformation();
        SendSms sendSms = new SendSms();
        SendSmsService sendSmsService = new SendSmsService();
        SendSmsResponse response = new SendSmsResponse();
        RequestSOAPHeader requestSOAPHeader = new RequestSOAPHeader();
        ObjectFactory objectFactory = new ObjectFactory();
        simpleReference.setInterfaceName("SmsNotification");
        BindingProvider bindingProvider = null;
        Object resp = new Object();
        System.out.println("before try");
        try {
            requestSOAPHeader.setBundleID("237011280");
            requestSOAPHeader.setOA("237675440124");
            requestSOAPHeader.setFA("237675440124");
            requestSOAPHeader.setSpId("2370110013161");
            requestSOAPHeader.setSpPassword("C1353E6F9301AED11B4700BCAD0F46BD");
            requestSOAPHeader.setTimeStamp("20100731064245");
           // sendSmsService.
            sendSms.setMessage(pojoSms.getMessage());
            sendSms.setSenderName(pojoSms.getSenderName());
            System.out.println(pojoSms.getAddresses());
            sendSms.setAddresses(pojoSms.getAddresses());
            sendSms.setReceiptRequest(simpleReference);
            
            //response= sendSmsService.getSendSms().sendSms(addresses, reponse, chargingInformation, reponse, simpleReference, reponse, Integer.SIZE, Integer.MIN_VALUE, Integer.SIZE, Integer.MAX_VALUE, namedParameterList);
                
            // System.out.println(sendSmsinteface.sendSms(pojoSms.getAddresses(), pojoSms.getSenderName(), chargingInformation, pojoSms.getMessage(), simpleReference, "0", 8080, 8310, 788, 4525, namedParameterList)); 
            //reponse=sendSmsService.getSendSms().sendSms(pojoSms.getAddresses(), pojoSms.getSenderName(), chargingInformation, pojoSms.getMessage(), simpleReference, "0", 8080, 8310, 788, 4525, namedParameterList);
//            System.out.println(pojoSms.getAddresses());
            reponse=smsClient.sendSms("http://41.206.4.162:8310/SendSmsService/services/SendSms", sendSms);
            //resp = template.marshalSendAndReceive("http://41.206.4.162:8310/SendSmsService/services/SendSms", sendSms);
            System.out.println(response);
            return reponse;
        } catch (Exception e) {
            System.out.println("inside catch");
            e.printStackTrace();
        }
        return reponse;
    }

    @GetMapping("getlist")
    public PojoSms getListe() {
        PojoSms pojoSms = new PojoSms();
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("yop");
        list.add("pop");
        list.add("tic");
        pojoSms.setAddresses(list);

        return pojoSms;
    }
    
    @PostMapping("sendSms2")
    public Object sendSmsApi2(@RequestBody PojoSms pojoSms) {
         MtnRestController.pojoSms=pojoSms;
     String soapEndpointUrl = "http://41.206.4.162:8310/SendSmsService/services/SendSms";
        String soapAction = "http://41.206.4.162:8310/SendSmsService/services/SendSms";

        callSoapWebService(soapEndpointUrl, soapAction);
        return null;
    }
    
    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String v2 = "v2";
        String myNamespaceURI = "http://www.huawei.com.cn/schema/common/v2_1";
      String loc = "loc";
        String myNamespaceURI2 = "http://www.csapi.org/schema/parlayx/sms/send/v2_2/local";
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(v2, myNamespaceURI);
        envelope.addNamespaceDeclaration(loc, myNamespaceURI2);

            /*
            Constructed SOAP Request Message:
            <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:myNamespace="http://www.webserviceX.NET">
                <SOAP-ENV:Header/>
                <SOAP-ENV:Body>
                    <myNamespace:GetInfoByCity>
                        <myNamespace:USCity>New York</myNamespace:USCity>
                    </myNamespace:GetInfoByCity>
                </SOAP-ENV:Body>
            </SOAP-ENV:Envelope>
            */

            //Soap header
            javax.xml.soap.SOAPHeader soapHeader = envelope.getHeader();
          
            SOAPElement soapHeaderElement = soapHeader.addChildElement("RequestSOAPHeader",v2);
              
            soapHeaderElement.addChildElement("spId",v2).addTextNode("2370110013161");
            soapHeaderElement.addChildElement("spPassword",v2).addTextNode("C1353E6F9301AED11B4700BCAD0F46BD");
            soapHeaderElement.addChildElement("serviceId",v2);
            soapHeaderElement.addChildElement("timeStamp",v2).addTextNode("20100731064245");
            soapHeaderElement.addChildElement("OA",v2).addTextNode(pojoSms.getAddresses().get(0));
            soapHeaderElement.addChildElement("oauth_token",v2);
            soapHeaderElement.addChildElement("FA",v2).addTextNode(pojoSms.getAddresses().get(0));
            soapHeaderElement.addChildElement("token",v2);
            soapHeaderElement.addChildElement("watcher",v2);
            soapHeaderElement.addChildElement("presentity",v2);
            soapHeaderElement.addChildElement("authId",v2);
            soapHeaderElement.addChildElement("linkid",v2);
            soapHeaderElement.addChildElement("presentid",v2);
            soapHeaderElement.addChildElement("bundleID",v2).addTextNode("237011280");


            soapHeader.addChildElement("RequestSOAPHeader",v2);
            System.out.println("+++++++++++++++++++++++++++++");
             
        // SOAP Body
        javax.xml.soap.SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("sendSms", loc);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("addresses", loc);
        soapBodyElem1.addTextNode("tel:"+pojoSms.getAddresses().get(0));
        
        soapBodyElem.addChildElement("senderName", loc).addTextNode(pojoSms.getSenderName());
        SOAPElement chargimg = soapBodyElem.addChildElement("charging", loc);
        chargimg.addChildElement("description").addTextNode("test");
        chargimg.addChildElement("currency").addTextNode("XAF");
        chargimg.addChildElement("amount");
        chargimg.addChildElement("code").addTextNode("88488648");
        soapBodyElem.addChildElement("message", loc).addTextNode(pojoSms.getMessage());
        SOAPElement receiptRequest = soapBodyElem.addChildElement("receiptRequest", loc);
        receiptRequest.addChildElement("endpoint").addTextNode("http://41.206.4.162:8310/notify");
        receiptRequest.addChildElement("interfaceName").addTextNode("SmsNotification");
        receiptRequest.addChildElement("correlator").addTextNode("00001");


    }

    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }


}
