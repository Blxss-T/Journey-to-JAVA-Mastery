package rw.rca.FristProject.Pillars;

    public class Student extends Person{
        private String code;
        private String school;
        private String combination;

        public Student(){};
        public Student(String firstName,String lastName,String school,String combination,int age,String code,String gender){
//        this.firstName=firstName;
//        this.lastName= lastName;
//        this.age= age ;
//        this.gender=gender;
            super(firstName,lastName,age,gender);
            this.code=code ;
            this.school= school;
            this.combination= combination;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getCombination() {
            return combination;
        }

        public void setCombination(String combination) {
            this.combination = combination;
        }
        @Override
        public void printMe(){
            System.out.println("I am a student");
             super.printMe();

        }

    }


