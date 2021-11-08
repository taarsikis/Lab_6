package Users;

public class Receiver implements User{
    private String status;
    private int id;

    public void Receiver(String status){
        this.status = status;
        this.id = IDCounter.generateID();

    }
    public void Receiver(){
        this.id = IDCounter.generateID();
    }

    @Override
    public void update(String status){
        this.status = status;
    }

}
