package com.example.travelhacking;

public class Program
{
    private String  Name;
    private String  Bank;
    private int     Balance;

    public Program(String Name, String Bank, int Balance)
    {
        this.Name = Name;
        this.Bank = Bank;
        this.Balance = Balance;


    }
    public void display()
    {
        System.out.println(this.Name + " " + this.Bank + " " + this.Balance);
    }
}
