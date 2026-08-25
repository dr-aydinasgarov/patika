package Giris;

public class test {
    static void main(String[] args) {
        int i = 1, j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");
                j++;
            } while (j < 4);
            i++;
        }
    }
}
//1,2,3,1,2,3, olmur
//1,2,3,4, olur