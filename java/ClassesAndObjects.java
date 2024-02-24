// class ClassesAndObjects {
//     int rollNo;
//     String name;
//     public static void main(String args[]){
//         ClassesAndObjects obj = new ClassesAndObjects();
        
//         System.out.println(obj.rollNo=111);
//         System.out.println(obj.name="damini");

//     }
// }


class ClassesAndObjects {
    int rollNo;
    String name;
    void student(){
        rollNo=111;
        name="Damini";
    }/* to perferm particular task v use methods , main adv is code reuablility , code optimization  , used to define state and behaviour of an object */
    public static void main(String args[]){
        ClassesAndObjects obj = new ClassesAndObjects();
        obj.student();
    }
}
