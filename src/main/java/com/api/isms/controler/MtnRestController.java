/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.controler;


import com.api.isms.entities.PojoSms;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrateur
 */
@RestController
@RequestMapping("/api/smsMtn")
public class MtnRestController {

    @PostMapping("sendSms")
    public String sendSmsApi(@RequestBody PojoSms pojoSms) {
        String reponse = "truuu";
        System.out.println(pojoSms.getSenderName());
//        NamedParameterList namedParameterList = new NamedParameterList();
//        SimpleReference simpleReference = new SimpleReference();
//        simpleReference.setCorrelator("00001");
//        simpleReference.setEndpoint("http://41.206.4.162:8310/notify");
//        ChargingInformation chargingInformation = new ChargingInformation();
//        SendSms sendSms=new SendSms();
//        SendSmsService sendSmsService=new SendSmsService();
//        SendSmsResponse response=new SendSmsResponse();
//        RequestSOAPHeader requestSOAPHeader=new RequestSOAPHeader();
      //  simpleReference.setInterfaceName("SmsNotification");
        try {
//            requestSOAPHeader.setBundleID("237011280");
//            requestSOAPHeader.setOA("237675440124");
//            requestSOAPHeader.setFA("237675440124");
//            requestSOAPHeader.setSpId("2370110013161");
//            requestSOAPHeader.setSpPassword("C1353E6F9301AED11B4700BCAD0F46BD");
//            requestSOAPHeader.setTimeStamp("20100731064245");
//            sendSms.setMessage(pojoSms.getMessage());
//            sendSms.setSenderName(pojoSms.getSenderName());
//            sendSms.setAddresses(pojoSms.getAddresses());
//            sendSms.setReceiptRequest(simpleReference);
//          
            
             //sendSms.sendSms(pojoSms.getAddresses(), pojoSms.getSenderName(), chargingInformation, pojoSms.getMessage(), simpleReference, "0", 8080, 8310, 788, 4525, namedParameterList);
//            SendSmsService service = new SendSmsService();
//            sendSms = service.getSendSms();

            System.out.println(pojoSms.getAddresses());

            return reponse;
        } catch (Exception e) {

            return e.getMessage();
        }
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

}
