package com.arithmetic.prototype;

import com.arithmetic.prototype.deep.AddressDeep;
import com.arithmetic.prototype.deep.CustomerDeep;
import com.arithmetic.prototype.shallow.Address;
import com.arithmetic.prototype.shallow.Customer;

import java.io.IOException;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 2:47 下午
 **/
public class PrototypeClient {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //浅拷贝
        Address address = new Address();
        address.setCode(1);
        address.setStreet("abc");

        Customer customer = new Customer();
        customer.setName("Tom");
        customer.setAddress(address);

        Customer customer_clone = customer.clone();

        System.out.println("name===" + (customer_clone == customer));
        System.out.println("address===" + (customer_clone.getAddress() == customer.getAddress()));

        //深拷贝
        AddressDeep addressDeep = new AddressDeep();
        addressDeep.setCode(2);
        addressDeep.setStreet("def");

        CustomerDeep customerDeep = new CustomerDeep();
        customerDeep.setAddress(addressDeep);
        customerDeep.setName("Jerry");

        CustomerDeep customerDeep_clone = customerDeep.deepclone();

        System.out.println("deep_name====" + (customerDeep_clone.getName() == customerDeep.getName()));
        System.out.println("deep_address====" + (customerDeep_clone.getAddress() == customerDeep.getAddress()));

    }

}
