package addressservice.controllers;

import addressservice.models.AddressBook;
import addressservice.models.Me;
import addressservice.models.MyAddresses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    private Me me;

    private AddressBook addressBook;

    private MyAddresses myAddresses;

    public AddressController(Me me, MyAddresses myAddresses, AddressBook addressBook) {
        this.me = me;
        this.addressBook = addressBook;
        this.myAddresses = myAddresses;
    }

    @GetMapping("/me")
    public Me getMe() {
        return me;
    }

    @GetMapping("/addressbook")
    public AddressBook getAddressBook() {
        return addressBook;
    }

    @GetMapping("/myaddresses")
    public MyAddresses getMyAddresses() {
        return myAddresses;
    }

}
