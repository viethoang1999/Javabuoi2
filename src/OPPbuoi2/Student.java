package OPPbuoi2;

public class Student {
    private String name;
    private  float gpa;

    public  Student(String name,float gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public String getname(){
        return name;
    }
    public float getgpa(){
        return gpa;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setgpa(float gpa){
        this.gpa=gpa;
    }
    public boolean check(){
        return this.gpa>=1.5;
    }
    public String displayInformation(){
        /*return String.format("[name: %d,gpa: %f",name,gpa);*/
        return"[name: "+name+", gpa:"+gpa+"]";
    }

}
