
package capanegocio;

public class Author {
    
    private String auId;
    private String auLName;
    private String auFName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean contract;

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getAuLName() {
        return auLName;
    }

    public void setAuLName(String auLName) {
        this.auLName = auLName;
    }

    public String getAuFName() {
        return auFName;
    }

    public void setAuFName(String auFName) {
        this.auFName = auFName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }
    
}
