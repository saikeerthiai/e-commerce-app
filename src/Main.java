import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.service.CustomerService;
import com.stschool.ecommerce.ui.CustomerMenu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        CustomerService customerService = new CustomerService();
        CustomerRepository customerRepository = new CustomerRepository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.signup");
        System.out.println("2.Display ALl Customers");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = customerMenu.inputCustomerSignupData();

                Customer newCustomer =  customerController.handleSignup(customer);
                System.out.println("Sucessfully Registerd:");


                //customerService.displayCustomerInfo(newCustomer);
                break;

            case 2:
                Customer[] customers = customerController.getAllCustomers();
                for(Customer cust : customers){
                    System.out.println("ID: "+cust.getId());
                    System.out.println("FirstName: "+cust.getFirstName());
                    System.out.println("LastName: "+cust.getLastName());
                    System.out.println("email: "+cust.getEmail());
                    System.out.println("contactNo: "+cust.getContactNo());

                }
            break;
        }
        scanner.close();


    }
}