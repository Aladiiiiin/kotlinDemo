package Annotation;

public class Test {

    public static void main(String args[]){
        UserInfoRequest request = new UserInfoRequest();
        request.setName("dfsafueusdsadsafsafdsaf");
        try {
            AnnotationChecker.checkParam(request);
            System.out.println(request.getName());
        } catch (PostingException e) {
            System.out.println(e.getErrorCode()+":"+e.getErrorMessage());
        }
    }

}
