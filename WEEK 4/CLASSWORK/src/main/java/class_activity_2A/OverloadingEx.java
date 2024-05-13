package class_activity_2A;

public class OverloadingEx {
    static int add(int a,int b){
        return  a + b;
    }

    static int add(int a,int b, int c){
        return  a + b + c;
    }

    static double add(int a,int b, int c, int d){
        return  a + b + c + d;
    }
}