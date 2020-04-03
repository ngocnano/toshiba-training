package part4;

public class Point3D extends point2D{
	
	private float z = 0.0f;

	public Point3D() {
		super();
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) 
	{
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	
	public float[] getXYZ() 
	{
		float[] xyz = new float[3];
		xyz[0] = this.getX();
		xyz[1] = this.getY();
		xyz[2] = z;
		return xyz;
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}
  
}
