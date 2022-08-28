package valuetype;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Zipcode {

    private String zip;
    private String plusFour;
}
