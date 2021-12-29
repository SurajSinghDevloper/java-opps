package classes1;

public class Car {
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void  setmodel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("holden"))
        this.model=model;
        else{
            this.model="unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
