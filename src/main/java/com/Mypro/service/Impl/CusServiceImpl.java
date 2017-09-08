package com.Mypro.service.Impl;

import com.Mypro.controller.CustomerRegisterController;
import com.Mypro.dao.CusDao;
import com.Mypro.model.Customer;
import com.Mypro.service.CusService;
import com.Mypro.util.MyproCusSaveDTO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("CusService")

    public class CusServiceImpl implements CusService {
    private CusDao cusdao = null;
    Customer cus;
    private static final Logger logger = Logger.getLogger(CustomerRegisterController.class);
    @Override
    public Map<String, String> SaveCustomer(MyproCusSaveDTO cusSaveDTO) {

        System.out.println("CusService IMPL is loaded");
        cus.setCusid(0);
        cus.setFirstname(cusSaveDTO.getFirstname());
        cus.setLastname(cusSaveDTO.getLastname());
        cus.setAddress(cusSaveDTO.getAddress());
        cus.setCity(cusSaveDTO.getCity());
        cus.setState(cusSaveDTO.getState());
        cus.setJob(cusSaveDTO.getJob());
        cus.setPhonenumber(cus.getPhonenumber());
        cus.setEmail(cusSaveDTO.getEmail());
        cus.setTitle(cusSaveDTO.getTitle());
        cus.setCompany(cusSaveDTO.getCompany());

        cusdao.SaveCustomer(cus);

        return null;
    }

    @Override
    public boolean seveCustomer(MyproCusSaveDTO cusSaveDTO) {
        logger.debug("Customer IMPL is work");
        cus.setCusid(0);
        cus.setFirstname(cusSaveDTO.getFirstname());
        cus.setLastname(cusSaveDTO.getLastname());
        cus.setAddress(cusSaveDTO.getAddress());
        cus.setCity(cusSaveDTO.getCity());
        cus.setState(cusSaveDTO.getState());
        cus.setJob(cusSaveDTO.getJob());
        cus.setPhonenumber(cusSaveDTO.getPhonenumber());
        cus.setEmail(cusSaveDTO.getEmail());
        cus.setTitle(cusSaveDTO.getTitle());
        cus.setCompany(cusSaveDTO.getCompany());
      //  cusdao.Savecustomers(cus);
        return cusdao.Savecustomers(cus);

    }
}
