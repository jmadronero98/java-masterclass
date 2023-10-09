public class a_51codingExerciseWallArea {
    public static void main (String  []args) {

    }

    private double width;
    private double height;

    public a_51codingExerciseWallArea() {

    }

    public a_51codingExerciseWallArea(double width, double height) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height < 0 ) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}
