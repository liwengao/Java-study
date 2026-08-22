package chap04;

public class StaticFactoryMethodDemo {
    static void main(String[] args) {

    }
    public static Result queryStudentByID(int id)
    {
        if(id <0)
        {
            //查询失败
          return Result.fail("id不能小于0");
        }
        Student student = new Student("男", 1, "张三");
        //查询成功
        return  Result.ok(student);
    }
    public static Result deleteByID2(int id)
    {
        if(id <0)
        {
            //查询失败
           return Result.fail("id不能小于0");
        }
       return Result.ok();
    }
}
