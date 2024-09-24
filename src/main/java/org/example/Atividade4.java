package org.example;

public class Atividade4 {
    static int x = 10;
    int y = 5;

    public static void main(String[] args){
        Atividade4 a = new Atividade4();
        Atividade4 b = new Atividade4();
        a.x = a.x + a.y;
        b.x = b.x + b.y;
        a.y = a.x + 1;
        b.y = a.y + b.y;
        Atividade4.x = 0;

        System.out.println(a.x); //0 (x é uma variável static, sempre que atribuído um novo valor e chamá-la em outro local, setará o novo valor)
        System.out.println(a.y); //21
        System.out.println(b.x); //0
        System.out.println(b.y); //26

    }
}
