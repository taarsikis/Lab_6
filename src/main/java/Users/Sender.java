package Users;

public class Sender implements User{
    private String status;
    private int id;


    public void Sender(String status){
        this.status = status;
    }

    public void Sender(){
        this.id = IDCounter.generateID();
    }

    @Override
    public void update(String status){
        this.status = status;
    }
}
