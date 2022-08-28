package domain;

import java.io.Serializable;

public class MemberProductId implements Serializable {

    private Long member;
    private Long product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberProductId that = (MemberProductId) o;

        if (member != null ? !member.equals(that.member) : that.member != null) return false;
        return product != null ? product.equals(that.product) : that.product == null;
    }

    @Override
    public int hashCode() {
        int result = member != null ? member.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
