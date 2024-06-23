//class no 1
class Student{
    int regNo;
    String name;
    int marks;
}

//class no 2
class Parent{
    int id;
    String name;

    Parent(int id, String name){
        this.id = id;
        this.name=name;
    }
}


public class ObjectArray {   
    public static void main(String[] args) {

        // obj and array creation of class one
        Student s1 = new Student();
        s1.regNo=23;
        s1.name="Tanisha";
        s1.marks=89;

        Student s2 = new Student();
        s2.regNo=24;
        s2.name="Bulbul";
        s2.marks=96;

        Student s3 = new Student();
        s3.regNo=25;
        s3.name="Nisha";
        s3.marks=87;

        Student arr[]={s1,s2,s3};

        for (Student s:arr){
            System.out.println(s.regNo + " : " + s.name + " : " + s.marks);
        }


        //obj and array creation of class 2
        Parent arr2[]=new Parent[3];

        arr2[0]=new Parent(1,"Madhu");
        arr2[1]=new Parent(2,"Sanjeev");
        arr2[2]=new Parent(3,"Himanshi");

        for (Parent p:arr2){
            System.out.println(p.id + ":" + p.name);
        }
        
    }  
}
