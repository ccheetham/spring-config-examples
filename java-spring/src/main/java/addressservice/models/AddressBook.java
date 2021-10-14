package addressservice.models;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("addressbook")
public class AddressBook {

    private List<Address> addresses;

    public void setAddress(List<Address> addresses) {
        setAddresses(addresses);
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

}
