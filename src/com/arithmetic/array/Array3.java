package com.arithmetic.array;

/**
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 2:05 下午
 **/
public class Array3 {

    String str = "aa";
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Array3 ex = new Array3();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str +"and");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]){
        str = str + "test ok";
        ch[0]= 'g';
    }
}
