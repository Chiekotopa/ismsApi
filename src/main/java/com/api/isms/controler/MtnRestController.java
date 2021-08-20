/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.isms.controler;

import com.api.isms.entities.PojoSms;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ChargingInformation;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.NamedParameterList;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.PolicyException;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ServiceException;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.SimpleReference;
import com.api.isms.org.csapi.wsdl.parlayx.sms.send.v2_2.service.SendSmsService;
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
        NamedParameterList namedParameterList = new NamedParameterList();
        SimpleReference simpleReference = new SimpleReference();
        simpleReference.setCorrelator("00001");
        simpleReference.setEndpoint("http://41.206.4.162:8310/notify");
        ChargingInformation chargingInformation = new ChargingInformation();

        simpleReference.setInterfaceName("SmsNotification");
        try {
            
            SendSmsService service = new SendSmsService();
           reponse= service.getSendSms().sendSms(pojoSms.getAddresses(), pojoSms.getSenderName(), chargingInformation, pojoSms.getMessage(), simpleReference, "0", 8080, 8310, 788, 4525, namedParameterList);

            System.out.println(pojoSms.getAddresses());
            //reponse = sendSms.sendSms(pojoSms.getAddresses(), pojoSms.getSenderName(), chargingInformation, pojoSms.getMessage(), simpleReference, "0", 8080, 8310, 788, 4525, namedParameterList);

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
