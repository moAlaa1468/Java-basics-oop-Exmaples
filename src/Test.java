import javax.xml.transform.Result;

public class Test {
    public int length;
    public int width;

    public Test(){}
    public Test(int length, int width){
            this.length= length;
            this.width=width;
    }
    public Test adding(Test test){
        this.length=this.length+test.length;
        this.width=this.width+test.width;
        return this;
    }
    public Test addingByCreatedAnotherObject(Test x){
        Test ResultObject=new Test();
        ResultObject.width=this.width+x.width;
        ResultObject.length=this.length+x.length;

        return ResultObject;
    }


}
