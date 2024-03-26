package th.ac.ku.kps.eng.cpe.controller;

import java.util.List;

public class CustomerRequest {
    private String name;
    private List<PhonenumberRequest> phonenumbers;

    // Getters and setters for name and phonenumbers
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PhonenumberRequest> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(List<PhonenumberRequest> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }
}
