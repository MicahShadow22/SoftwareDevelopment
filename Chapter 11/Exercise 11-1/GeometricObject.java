import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated = new Date(); 
    public GeometricObject(){

    } 
    public GeometricObject(String newColor, boolean newFilled){
        color = newColor;
        filled = newFilled;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        color = (Color);
    } 
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
