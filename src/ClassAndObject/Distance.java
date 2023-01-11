package ClassAndObject;
//Add two distances in inch-feet by creating a class named 'AddDistance'.
public class Distance {
    public static void main(String[] args) {
        Distance ref = new Distance();
        System.out.println(ref.addDistance(4.5f,3.6f));

    }
    float addDistance(float dist1,float dist2){
        return dist1+dist2;
    }
}
