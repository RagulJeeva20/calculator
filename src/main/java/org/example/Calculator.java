package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Calci
{
    int a;
    int b;
    public void toset(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int toget1()
    {
        return a;
    }
    public int toget2()
    {
        return b;
    }
    public int Cal(int a,int b)
    {
        return 0;
    }
}
class Addition extends Calci
{

    public int Cal(int a, int b) {
        return a+b;
    }
}
class Subraction extends Calci
{

    public int Cal(int a,int b) {
        return a-b;
    }
}
class Multi extends Calci
{

    public int Cal(int a,int b) {
        return a*b;
    }
}
class Division extends Calci
{

    public int Cal(int a,int b) {
        return a%b;
    }
}

public class Calculator {

    public static void main(String[] args) {
        Logger l = Logger.getLogger("tyler");
        Scanner s = new Scanner(System.in);
        l.info("Enter the num1:");
        int a = s.nextInt();
        l.info("Enter the num2:");
        int b = s.nextInt();
        l.info("1.Addition");
        l.info("2.Subtraction");
        l.info("3.Multiplication");
        l.info("4.Division");
        l.info("Enter a choice");
        int sel = s.nextInt();
        Calci c = new Calci();
        switch (sel) {
            case 1:
                Addition ad = new Addition();
                c = ad;
                c.toset(a, b);
                l.log(Level.INFO, () -> "Addition of 2 numbers is:" + ad.Cal(ad.toget1(), ad.toget2()));
                break;
            case 2:
                Subraction su = new Subraction();
                c = su;
                c.toset(a, b);
                l.log(Level.INFO, () -> "Subtraction of 2 numbers is:" + su.Cal(su.toget1(), su.toget2()));
                break;
            case 3:
                Multi m = new Multi();
                c = m;
                c.toset(a, b);
                l.log(Level.INFO, () -> "Multiplication of 2 numbers is:" + m.Cal(m.toget1(), m.toget2()));
                break;
            case 4:
                Division d = new Division();
                c = d;
                c.toset(a, b);
                l.log(Level.INFO, () -> "Multiplication of 2 numbers is:" + d.Cal(d.toget1(), d.toget2()));
                break;

            default:
                l.info("Invalid Input");
                break;
        }
    }
}