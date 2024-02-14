package l17.animal;

public class animal {
    private int legsNumber;
    private String status;
    public animal(String status, int legsNumber ){
        this.legsNumber =legsNumber;
        this.status = status;

    }
    String getStatus(){
        return this.status;
    }
    int getLegsNumber(){
        return this.legsNumber;
    }


}
