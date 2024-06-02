package com.example.Controller.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Controller.CustomerOperation;
import com.example.model.Address1;
import com.example.model.Customer;
import com.example.model.Orders;

@Controller
@ResponseBody
public class CustomerController implements CustomerOperation {

  @Override
  public List<Customer> getAll() {
    System.out.println("start getAll");
    Address1 a1 = new Address1("as", "as", "as");
    Address1 a2 = new Address1("as", "as", "as");
    Address1 a3 = new Address1("as", "as", "as");

    Orders o1 = new Orders(1, a1);
    Orders o2 = new Orders(2, a2);
    Orders o3 = new Orders(3, a3);

    List<Orders> orderList1 = new ArrayList<>();
    orderList1.add(o1);
    List<Orders> orderList2 = new ArrayList<>();
    orderList2.add(o2);
    orderList2.add(o3);

    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("Vincent", LocalDate.of(2013, 10, 1), orderList1));
    customers.add(new Customer("Jenny", LocalDate.of(2011, 11, 1), orderList2));

    System.out.println(customers); // print
    return customers;
  }

}