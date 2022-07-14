import DTO.SomeObj;
import Service.SomeServiceimpl;

public class TestApp {
    public static void main(String[] args) {
        SomeObj obj = new SomeObj();
        obj.setReq("필수값");

//        obj.setNotReq("다른값");
        SomeServiceimpl test = new SomeServiceimpl();
        test.getData(obj);
    }
}
