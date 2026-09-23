public class Location {
    private final String label;
    private final double x;
    private final double y;

    public Location(String label, double x, double y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }
    public Location(double x, double y) {
        this.label = "Unknown";
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double distanceTo(Location other){
        double xx= other.getX()-this.getX();
        double yy= other.getY()-this.getY();
        return Math.sqrt(xx*xx+yy*yy);
    }

    @Override
    public String toString(){
        return label+" ("+String.format("%.2f", getX())+", "+String.format("%.2f",getY())+")";
    }
}
