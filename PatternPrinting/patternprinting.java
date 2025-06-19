public class patternprinting {
    static void solidrectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightangledtriangle(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedtriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfpyramid() {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void hollowrectangle() {
        int rows = 4;
        int cols = 5;
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        solidrectangle();
        System.out.println("------------");
        rightangledtriangle();
        System.out.println("------------");
        invertedtriangle();
        System.out.println("------------");
        halfpyramid();
        System.out.println("------------");
        hollowrectangle();


    }
}
