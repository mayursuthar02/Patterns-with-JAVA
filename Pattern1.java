public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // System.out.println();
        // pattern2(n);
        // System.out.println();
        // pattern3(n);
        // System.out.println();
        // pattern4(n);
        // System.out.println();
        // pattern5(n);
        // System.out.println();
        // pattern6(n);
        // System.out.println();
        // pattern7(n);
        // System.out.println();
        pattern8(n);
        System.out.println();

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfCol = n - row;
            for (int col = 1; col <=n; col++) {
                if (col > numberOfCol) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfCol = n - row + 1;
            for (int col = 1; col <= numberOfCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            int oneCol = n - row;
            int secCol = n + row;
            for (int col = 1; col <= 2 * n -1; col++) {
                if (col > oneCol && col < secCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // the formula is "n - n + row - 1" so here n - n is distroy then the formula is row - 1
            int oneCol = row - 1;
            int secCol = n + (n - row + 1);
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col > oneCol && col < secCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == 5 || row == 3) {
                    System.out.print("* ");
                }else {
                    if (col == 3) {
                        System.out.print("* ");
                    }else {
                        if (col > 1 && col < n) {
                            System.out.print("  ");
                        }else {
                            System.out.print("* ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int oneCol = n - row + 1;
            int secCol = n + row - 1;
            for (int col = 1; col <= 2 * n -1; col++) {
                if (row == 5) {
                    System.out.print("*");
                } else {
                    if (col == oneCol || col == secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (row < n) {
                    int oneCol = n - row + 1;
                    int secCol = n + row - 1;
                    if (col == oneCol || col == secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    int oneCol = row - n + 1;
                    int secCol = 3 * n - row - 1;
                    if (col == oneCol || col == secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (row <= n) {
                    int oneCol = n - row + 1;
                    int secCol = n + row - 1;
                    if (col <= oneCol || col >= secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    int oneCol = row - n + 1;
                    int secCol = 3 * n - row - 1;
                    if (col <= oneCol || col >= secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    
}