package com.sl.orderservice.Controller;

import com.sl.orderservice.Model.Customer;
import com.sl.orderservice.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/addCustomer",method= RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }
}
