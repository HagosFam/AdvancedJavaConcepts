package List;

import java.util.Objects;

public class Department {
    private String departmentCode;
    private String departmentName;
    private String location;

    public Department(){}

    public Department(String departmentCode, String departmentName, String location) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.location = location;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(getDepartmentCode(), that.getDepartmentCode()) && Objects.equals(getDepartmentName(), that.getDepartmentName()) && Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentCode(), getDepartmentName(), getLocation());
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentCode='" + departmentCode + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
