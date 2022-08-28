package valuetype;

import domain.PhoneServiceProvider;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PhoneNumber {

    private String areaCode;
    private String localNumber;
    @ManyToOne
    @JoinColumn(name = "phoneServiceProvider_id")
    PhoneServiceProvider provider;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public PhoneServiceProvider getProvider() {
        return provider;
    }

    public void setProvider(PhoneServiceProvider provider) {
        this.provider = provider;
    }
}