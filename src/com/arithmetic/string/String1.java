package com.arithmetic.string;

/**
 *
 * String初始化之后，指向不改变
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 3:52 下午
 **/
public class String1 {

    String str = "aa";
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        String1 ex = new String1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str +"and");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]){
        str = str + "test ok";
        ch[0]= 'g';
    }
}
