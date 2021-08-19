/*
Assignment No.1
Property Class 
Author : Muhammad Anwar Ul Haq
StudentID: L00162311
Module: Software development and Testing
Date: 01/05/2021
*/

public class Property
{
    private int propertyNo;
    private String street;
    private String town;
    private String county;
    private int noBeds;
    private int noBaths;
    private int noReception;
    private double price;

    private String type;
    private static int nextPropertyNo = 100;


    // Getters for Property class


    public int getPropertyNo() 
    {
        return propertyNo;
    }

    public String getStreet() 
    {
        return street;
    }

    public String getTown() 
    {
        return town;
    }

    public String getCounty() 
    {
        return county;
    }

    public int getNoBeds() 
    {
        return noBeds;
    }


    public int getNoBaths() 
    {
        return noBaths;
    }

    public int getNoReception() 
    {
        return noReception;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getType() 
    {
        return type;
    }

    public static int getNextPropertyNo() 
    {
        return nextPropertyNo;
    }

    //Constructors
    //User default constructor
    public Property()
    {
        propertyNo = nextPropertyNo++;
        street = "";
        town = "";
        county = "";
        noBeds = 0;
        noBaths = 0;;
        noReception = 0;
        price = 0.00;
        type = "";
    }
    //Constructor to set all instance variable values
    public Property(String s, String t, String c, int bed, int bath, int reception, double p, String propType)
    {
            propertyNo = nextPropertyNo++;
            street = s;
            town = t;
            county = c;
            noBeds = bed;
            noBaths = bath;
            noReception = reception;
            price = p;
            type = propType;



    }

    //Methods
    public String toString()
    {
        return "Property No:"+ propertyNo+ " Street: "+street + " Town: "+town + " County: "+county +
                " No Bedrooms: "+ noBeds + " No Bathrooms: "+noBaths + " Reception Rooms: "+ noReception+
                " Price €" +price;
    }
    public String street()
    {
        return street;
    }
    public String town()
    {
        return town;
    }
    public String county()
    {
        return county;
    }
    public int beds()
    {
        return noBeds;
    }
    public int baths()
    {
        return noBaths;
    }
    public int reception()
    {
        return noReception;
    }
    public double viewPrice()
    {
        return price;
    }
    public String type()
    {
        return type;
    }

    // Calculate the mortgage
    public String mortgage(double amount)
    {
        double limit = amount * 3;
        if(price <= limit)
        {
            return "Qualify for a mortgage";
        }
        else
        {
            return "Unfortunately you don't qualify for a mortgage";
        }
    }
    public double monthlyRepay(int years)
    {
        double repayment = 0.00;
        double monthly;
        int months = years * 12;
        monthly = (price / months);
        repayment = monthly + monthly * 0.03;
        return repayment;
    }


    public double propertyTax()
    {

        double tax =0.00;
        if (price > 0.00 && price <=100000.00)
        {
            tax = 90.00;
        }
        else if (price >=100001.00 && price <= 200000.00)
        {
            tax = 225.00;
        }
        else if (price >=200001.00 && price <=500000.00)
        {
            tax = 405.00;
        }
        else if (price >=500001.00 && price <=1000000.00)
        {
            tax = 1500.00;
        }
        else
        {
            tax = 3000.00;
        }
        return tax;
    }

 



}//End Property Class