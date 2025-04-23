public class fifth_task {
    static class Parallelepiped{
        private double a;
        private double b;
        private double c;
        public Parallelepiped(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
        public double getC(){
            return c;
        }
        public static double Volume(Parallelepiped p){
            return p.getA() * p.getB() * p.getC();
        }
        public static double SurfaceArea(Parallelepiped p) {
            return 2 * (p.getA() * p.getB() + p.getB() * p.getC() + p.getA() * p.getC());
        }
    }
        public static void main(String[] args) {
            Parallelepiped myParallelepiped = new Parallelepiped(2.0, 3.0, 4.0);
            double volume = Parallelepiped.Volume(myParallelepiped);
            System.out.println("Объем параллелепипеда: " + volume);
            double surfaceArea =Parallelepiped.SurfaceArea(myParallelepiped);
            System.out.println("Площадь поверхности параллелепипеда: " + surfaceArea);
        }
}