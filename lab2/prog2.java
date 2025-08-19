class car {
    String brand;
    int year;
    
    //constructor 
    car(String b, int y){
        brand=b;
        year=y;
    }
    void displayInfo(){
        System.out.println("car: " + brand + ", year: "+ year);
        
    }
    public static void main(String[] args){
        car c1= new car("Toyota", 2020);
        car c2= new car("Honda", 2022);
        c1.displayInfo();
        c2.displayInfo();
    }
    
}
