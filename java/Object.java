class Object {
    int rollNo;
    String name;

    Object(int roll,String n){
        rollNo=roll;
        name=n;
    }

    void student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    void display(){
        System.out.println(rollNo + " " +  name);
    }
    /* to perferm particular task v use methods , 
    main adv is code reusablility , 
    code optimization  , 
    used to define state and behaviour of an object */
    public static void main(String args[]){
        Object obj = new Object(111,"damini");
        obj.display();
        obj.student(111 ,"damini");
        obj.display();
    }
}
