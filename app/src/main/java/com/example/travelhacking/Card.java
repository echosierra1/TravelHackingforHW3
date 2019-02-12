package com.example.travelhacking;

public class Card
{
    private String  Name;
    private String  Date;
    private int     Spend;
    private int     points;

    public Card(String Name, String Date, int Spend, int points)
    {
        this.Name = Name;
        this.Date = Date;
        this.Spend = Spend;
        this.points = points;
    }
    public void display()
    {
        System.out.println(this.Name + " " + this.Date + " " + this.Spend + " " + this.points);
    }
}
