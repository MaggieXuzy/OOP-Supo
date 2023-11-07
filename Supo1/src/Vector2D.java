public class Vector2D {
  public float x;
  public float y;

  public Vector2D(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public Vector2D addition(Vector2D a) {
    return new Vector2D((a.x + this.x), (a.y + this.y));
  }

  public float scalarProduct(Vector2D a) {
    return a.x * this.x + a.y * this.y;
  }

  public double magnitude() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

  public void normalisation(){
    double length = this.magnitude();
    this.x = (float) (this.x / length);
    this.y = (float) (this.y / length);
  }
}
