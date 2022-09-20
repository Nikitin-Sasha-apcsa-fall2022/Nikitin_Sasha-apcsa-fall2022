package asses;
public class NumbersRunner
{
    public static void main(String[] args)
    {
    	Numbers runner = new Numbers();
        runner.isSilly(12);
        runner.isSilly(15);
        runner.isSilly(26);
        runner.isSilly(8);
        runner.isSilly(1234);
        runner.getSomeSillyNumbers(3);
        runner.getSomeSillyNumbers(15);
    }
}