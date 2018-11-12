
package inheritance;

public class Teacher1 extends Person1 {
    //setName(), getName(), setAge(), getAge()
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void displayInformation()
    {
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+getQualification());
    }
    
}
