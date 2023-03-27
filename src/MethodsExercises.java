public class MethodsExercises {
    //public static void main(String[] args) {
        public static int addition(int x, int y){
            return x + y;
        }

        public static int subtraction(int x, int y){
            return x - y;
        }

        public static int multiplication(int x, int y){
            return x * y;
        }

        public static int division(int x, int y){
            return x / y;
        }

        public static int modulus(int x, int y){
            return x % y;
        }

        public static int call(){
            return addition(5,5),
                    subtraction(5,5),
                    multiplication(5,5);
                    division(5,5);
                    modulus(5,5);
        }

    }
//}