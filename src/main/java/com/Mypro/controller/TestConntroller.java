package com.Mypro.controller;

import com.Mypro.model.Customer;
import com.Mypro.service.CusService;
import com.Mypro.util.JsonResponse;
import com.Mypro.util.ResponseClass;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/mycontroll")
public class TestConntroller {
    private CusService cusService = null;
    @RequestMapping(value = "myproCusSave/{firstname}/{lastname}/{address}/{city}/{statee}/{job}/{titlee}/{comname}/{phone}/{email}", method = RequestMethod.GET)
    public ResponseEntity<ResponseClass> cityUserSave(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname, @PathVariable("address") String address, @PathVariable("city") String city, @PathVariable("statee") String statee, @PathVariable("job") String job, @PathVariable("titlee") String titlee, @PathVariable("comname") String comname, @PathVariable("phone") String phone, @PathVariable("email") String email){
       // JsonResponse saveCustomer(HttpServletRequest request, HttpServletResponse response)  {//System.out.print("this call");
        Customer customer = new Customer();
//        customer.setFirstname(request.getParameter("firstname"));
//        customer.setLastname(request.getParameter("lastname"));
//        customer.setAddress(request.getParameter("address"));
//        customer.setCity(request.getParameter("city"));
//        customer.setState(request.getParameter("statee"));
//        customer.setJob(request.getParameter("job"));
//        customer.setTitle(request.getParameter("titlee"));
//        customer.setCompany(request.getParameter("comname"));
//        customer.setPhonenumber(Integer.parseInt(request.getParameter("phone")));
//        customer.setEmail(request.getParameter("email"));
        customer.setFirstname(firstname);
        customer.setLastname(lastname);
        customer.setAddress(address);
        customer.setCity(city);
        customer.setState(statee);
        customer.setJob(job);
        customer.setTitle(titlee);
        customer.setCompany(comname);
        customer.setPhonenumber(Integer.parseInt(phone));
        customer.setEmail(email);


        JsonResponse res = new JsonResponse();


        try {

          //  cusService.proCustomeSave(customer);
            res.setStatus("200");

        } catch (Exception e) {
            res.setStatus("500");

            e.printStackTrace();
        }

        return null;
    }

    }
