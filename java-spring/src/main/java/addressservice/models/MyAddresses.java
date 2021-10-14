package addressservice.models;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("myaddresses")
public class MyAddresses {

    private Map<String, Address> addresses;

    public void setAddress(Map<String, Address> addresses) {
        setAddresses(addresses);
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

}
