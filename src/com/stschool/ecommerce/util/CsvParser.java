package com.stschool.ecommerce.util;


import com.stschool.ecommerce.enums.Gender;
import com.stschool.ecommerce.enums.MemberShip;
import com.stschool.ecommerce.enums.Status;
import com.stschool.ecommerce.exception.UserNotFoundException;
import com.stschool.ecommerce.model.Address;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.model.Product;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    /*
    Method to convert products.csv file
    into list of product

    Method Name
    arguments
    returntype
    access modifier
     */
   public List<Product> getProductFromCsv() throws IOException {
       List<Product> products = new ArrayList<>();
       File file = new File("D://product.csv");
       BufferedReader br = new BufferedReader(new FileReader(file));
       br.readLine();
       String productData = br.readLine();
       while (productData != null){
           String[] split = productData.split(",");
           Product product = new Product();
           product.setId(Integer.parseInt(split[0]))
                   .setName(split[1])
                   .setMaxRetailPrice(Integer.parseInt(split[2]))
                   .setDiscountPercentage(Double.parseDouble(split[3]))
                   .setAvailable(Boolean.parseBoolean(split[4]))
                   .setCompany(split[5])
                   .setCategory(split[6])
                   .setManufacturedYear(Integer.parseInt(split[7]));
           products.add(product);


       }
       return products;




   }
    public List <Customer> getCustomerFromCsv() throws UserNotFoundException, IOException {
       List<Customer> customers = new ArrayList<>();
        File file = new File("D://product.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();
        String customerData = br.readLine();
        while (customerData != null){
            String[] split = customerData.split(":");
            Customer customer = new Customer();
            customer.setId(Integer.parseInt(split[0]))
                    .setName(split[1])
                    .setEmail(split[2])
                    .setPhoneNumber(split[3])
                    .setAge(Byte.parseByte(split[4]))
                    .setGender(Gender.valueOf(split[5]))
                    .setMemberShip(MemberShip.valueOf(split[6]))
                    .setStatus(Status.valueOf(split[7]));
            Address shipping = parserAddress(split[8]);
            Address residential = parserAddress(split[9]);
            customer.setShippingAddress(shipping);
            customer.setResidentalAddress(residential);

            customers.add(customer);





        }
        return customers;



    }
    private Address parserAddress(String addressData){
        String[] split = addressData.split(":");
        return new Address()
                .setHouseNumber(split[1])
                .setAreaName(split[2])
                .setLandMark(split[3])
                .setCity(split[4])
                .setPinCode(split[5])
                .setState(split[6]);

    }
}
