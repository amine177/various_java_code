import java.util.Date;

public class SimpleGeometricObject {
  public String color = "white";
  public boolean filled;
  public Date dateCreated;

  public SimpleGeometricObject() {
    dateCreated = new java.util.Date();
  }

  public SimpleGeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    dateCreated = new java.util.Date();
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
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

  public String toString() {
    return "A SimpleGeometricObject";
  }
}
