public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model1){

        String validModel = model1.toLowerCase();
        if(validModel.equals("Porsche") || validModel.equals("Holden")) {
                this.model = model1;
        } else {
            this.model = "Unknown";
        }

    }





    public String getModel(){
        return this.model;
    }



}
