package AnimalRescue;

public class VetMed {

    private String name = "Alfonso";
    private String Specialization = "Dogs";

    public VetMed(String name, String Specialization) {
        this.name = name;
        this.Specialization = Specialization;
    }

    public void Rescuername() {
        System.out.println("The Rescuer name is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
}
