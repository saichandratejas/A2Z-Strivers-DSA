class DoWhile { // do-while statements r used when v dont know the no of iteration of loop , but should atleat execute the statement once . 
    //It is also called as " Exit Controlled Statement "
    public static void main(String[] args) {
    
        int i=0;
        System.out.println("This is do statement , executed atleast once");
        do{
            System.out.println("Value of i = " +i);
            i=i+2;
        }while(i <=10);
}
}
