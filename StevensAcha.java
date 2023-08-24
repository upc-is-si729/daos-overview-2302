public class StevensAcha {
    private Integer id;
    private String lasName;
    private String firstName;

    public StevensAcha(){

    }

    public StevensAcha(Integer id){
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public String getLasName() {
        return lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
