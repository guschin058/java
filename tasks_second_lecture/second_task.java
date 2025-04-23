public class second_task {
    static class Cylinder {
        public double surface_area(int r,int h){
            double result=2*3.14*r*(r+h);
            System.out.println("Площадь поверхности цилиндра:"+result);
            return result;
        }
        public double surface_area(double r, double h){
            double result=2*3.14*r*(r+h);
            System.out.println("Площадь поверхности цилиндра:"+result);
            return result;       
        }
        public double volume(double r,double h){
            double result=3.14*r*r*h;
            System.out.println("Объём цилиндра:" + result);
            return result;
        }
        public double surface_area(String r,String h){
            double result=2*3.14*Integer.parseInt(r)*(Integer.parseInt(r)+Integer.parseInt(h));
            System.out.println("Плозадь поверхности цилиндра: "+result);
            return result;
        }
        public double volume(String r,String h){
            double result=2*3.14*Integer.parseInt(r)*Integer.parseInt(h);
            System.out.println("Объём цилиндра:" + result);
            return result;
    }}
    public static void main(String[] args){
        Cylinder cylinder=new Cylinder();
        cylinder.volume("5", "4");
        cylinder.volume(3.3, 6.6);
        cylinder.volume(5, 3);
        cylinder.surface_area("3", "9");
        cylinder.surface_area(3.2, 3.1);
        cylinder.surface_area(5, 4);
    }
}
