class A {
    private String message;
    void hello(){
        System.out.println("Hello World!My name is A");
    }
   public  A(){}
    A(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message= message;
    }
    @Override
    public String toString() {
        hello();
        return "{message:"+message+"\n"+ "}";
    }





}
