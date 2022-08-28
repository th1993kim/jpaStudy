package valuetype;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class Period {
    @Temporal(TemporalType.TIMESTAMP)
    Date startDtm;
    @Temporal(TemporalType.TIMESTAMP)
    Date endDtm;
}
