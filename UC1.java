public class UC1 {
        public static void main(String[] args) {
            int FULL_TIME = 1;
            double empcheck = Math.floor(Math.random() * 10) % 2;
            if (empcheck == FULL_TIME)
                System.out.println("employee is present");
            else
                System.out.println("employee is abscent");
        }
    }

