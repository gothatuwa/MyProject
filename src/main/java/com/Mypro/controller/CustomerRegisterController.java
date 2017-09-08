package com.Mypro.controller;



import com.Mypro.model.Customer;
import com.Mypro.service.CusService;

import com.Mypro.util.JsonResponse;
import com.Mypro.util.MyproCusSaveDTO;
import com.Mypro.util.ResponseClass;
import org.apache.commons.collections.SequencedHashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/CustomerRegisterController")
public class CustomerRegisterController {
   // private CusService guaranteesDtlManager;
   private static final Logger logger = Logger.getLogger(CustomerRegisterController.class);
    private CusService cusService;



   @ RequestMapping(value="/savePostMethod",method=RequestMethod.POST)

    public  @ResponseBody String  saveCustomer(@RequestBody Customer cus, HttpServletRequest request,HttpServletResponse response) {


       String customerDetails[]={"first name","second name","Address","city","state","job","Title","company","phone Number","Email"};
       Customer customer = new Customer();
       customer.setFirstname(cus.getFirstname());
       customer.setLastname(cus.getLastname());
       customer.setAddress(cus.getAddress());
       customer.setCity(cus.getCity());
       customer.setState(cus.getState());
       customer.setJob(cus.getJob());
       customer.setTitle(cus.getTitle());
       customer.setCompany(cus.getCompany());
       customer.setPhonenumber(cus.getPhonenumber());
       customer.setEmail(cus.getEmail());


       HashSet getset=new HashSet();
       getset.add(customer);

           System.out.println("valuse in one by one="+getset);







       MyproCusSaveDTO CusSaveDTO=new MyproCusSaveDTO();
       CusSaveDTO.setFirstname(cus.getFirstname());
       CusSaveDTO.setLastname(cus.getLastname());
       CusSaveDTO.setAddress(cus.getAddress());
       CusSaveDTO.setCity(cus.getCity());
       CusSaveDTO.setState(cus.getState());
       CusSaveDTO.setJob(cus.getJob());
       CusSaveDTO.setTitle(cus.getTitle());
       CusSaveDTO.setPhonenumber(cus.getPhonenumber());
       CusSaveDTO.setCompany(cus.getCompany());

     //  sessionOne.beginTransaction();

       try {
          System.out.println("try"+CusSaveDTO);
         //  Map<String, String> map = cusService.SaveCustomer(CusSaveDTO);
           boolean check=false;
           check= cusService.seveCustomer(CusSaveDTO);
           System.out.println("boolean value="+check);
           if (check==true){
          System.out.println("cus service is executed.");
           }
           else
           {
               System.out.println("cus service is false");
           }

       } catch (Exception e) {
          System.out.println(e);
           e.printStackTrace();
       }
     // Map<String, String> map = cusService.SaveCustomer(CusSaveDTO);

      ResponseClass res = new ResponseClass();
     //  res.setResponce(map);
      logger.debug("*****************/Exit cityUserSave inCustomerFormController /*************");
    //  return new ResponseEntity<ResponseClass>(res,headers, HttpStatus.CREATED);
     return null;
   }


}
