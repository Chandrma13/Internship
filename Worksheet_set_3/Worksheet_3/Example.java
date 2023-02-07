 class Example
 {
     int number;
    String name;

    //Defining accessor(getter)
    public int getNumber() 
    { return number; }

    public String getName() 
    { return name; }

    //Defining mutator(setter)
    public void setNumber(int number) 
    { this.number = number; }

    public void setName(String name)
     { this.name = name; }

    void printDetails()
     {
       System.out.println(name);
       System.out.println(number);
    }


    
}
