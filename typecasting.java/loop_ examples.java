class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
class ForLoopStep2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}


class SumExample {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of 1 to 10: " + sum);
    }
}


class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}


class WhileConditionExample {
    public static void main(String[] args) {
        int num = 10;
