import DTO.SomeObj;
import Service.SomeServiceImpl;

public class TestApp {
    public static void main(String[] args) {
        SomeObj obj = new SomeObj();
//        obj.setReq("필수값");

//        obj.setNotReq("다른값");
        SomeServiceImpl test = new SomeServiceImpl();
        test.getData(obj);
    }
}
