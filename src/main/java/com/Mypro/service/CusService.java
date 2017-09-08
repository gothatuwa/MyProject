package com.Mypro.service;

import com.Mypro.controller.CustomerRegisterController;
import com.Mypro.model.Customer;
import com.Mypro.util.MyproCusSaveDTO;
import org.apache.log4j.Logger;


import java.util.Map;

public interface CusService {


    Map<String,String> SaveCustomer(MyproCusSaveDTO cusSaveDTO);


    public boolean seveCustomer(MyproCusSaveDTO cusSaveDTO);
}
