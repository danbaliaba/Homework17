package l24;

import java.util.Objects;

public class transports {

    public String thickness;
    public String status;

    public transports (String thickness, String status)
    {
        this.thickness = thickness;
        this.status = status;

    }
    String getStatus(){
        return this.status;
    }
    String getThickness(){
        return this.thickness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        transports that = (transports) o;
        return Objects.equals(thickness, that.thickness) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thickness, status);
    }
}
