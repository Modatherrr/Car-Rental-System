package carrentalsystem;

/**
 *
 * @author Modather
 */
public class InformationSave {
    private String StoreName;
    private int CarCount;
    
    //Setters
    public void SetStoreName(String Str){
        this.StoreName = Str;
    }
    public void SetCarCount(int Count){
        this.CarCount = Count;
    }
    
    //Getters
    public String GetStoreName(){
        return this.StoreName;
    }
    public int GetCarCount(){
        return this.CarCount;
    }
    
}
