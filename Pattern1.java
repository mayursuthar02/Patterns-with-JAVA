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
        // pattern8(n);
        // System.out.println();
        // pattern9(n);
        // System.out.println();
        // pattern10(n);
        // System.out.println();
        pattern11(4);
        System.out.println();

    }

    // Pattern 1
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
    
    // Pattern 2
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfCol = n - row + 1;
            for (int col = 1; col <= numberOfCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Pattern 3
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
    
    // Pattern 4
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
    
    // Pattern 5
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
    
    // Pattern 6
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
    
    // Pattern 7
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
    
    // Pattern 8
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
    
    // Pattern 9
    static void pattern9(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n; col++) {
                if (row <= n) {
                    int secCol = 2*n - row + 1;
                    if (col <= row || col >= secCol) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    int oneCol = 2*n - row;
                    int secCol = row + 1;
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

    static void pattern10(int n) {
        char[] printChar = {'E', 'D', 'C', 'B', 'A'};
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print(printChar[j]);
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 0; i < 2*n - 1; i++) {
            for (int j = 0; j < 2*n - 1 ; j++) {
                if (i < n) {
                    int firCol = i;
                    int secCol = 2*n - 2 - i;
                    if (j >= firCol && j <= secCol) {
                        System.out.print(4-i + " ");
                    }   
                    if (j < n) {
                        if (j < firCol || j > secCol) {
                            System.out.print(4-j + " ");
                        }
                    } else {
                        if (j < firCol || j > secCol) {
                            System.out.print(j - 4 + 2 + " ");
                        } 
                    }

                } else {
                    int firCol = 2*n - i - 2;
                    int secCol = i;
                    if (j >= firCol && j <= secCol) {
                        System.out.print(i - 4 + 2 + " ");
                    }
                    if (j < n) {
                        if (j < firCol || j > secCol) {
                            System.out.print(4-j + " ");
                        }
                    } else {
                        if (j < firCol || j > secCol) {
                            System.out.print(j - 4 + 2 + " ");
                        } 
                    }
                }
            }
            System.out.println();
        }
    }



    
}