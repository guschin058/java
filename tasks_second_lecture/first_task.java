public class first_task {
    static class A {
        public int count(int a, int b) {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        }
        public void show() {
            System.out.println(this.getClass().getSimpleName());
        }
    }

    static class B extends A {
        @Override
        public int count(int a, int b) {
            int difference = a - b;
            System.out.println(difference);
            return difference;
        }
    }

    static class C extends A {
        @Override
        public int count(int a, int b) {
            int product = a * b;
            System.out.println(product);
            return product;
        }
    }

    static class D extends B {
        @Override
        public int count(int a, int b) {
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return 0;
            }
            int quotient = a / b;
            System.out.println(quotient);
            return quotient;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        a.count(4, 5);  
        b.count(4, 5);  
        c.count(4, 5);  
        d.count(10, 5); 
        
        a.show();  
        b.show();  
        c.show();  
        d.show();  
    }
}