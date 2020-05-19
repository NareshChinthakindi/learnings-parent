package com.rohinisha.java8.repeatannotation;

public class RepeatAnnotationMain {

    @MultiAccess({
            @Access(value = Role.ADMIN, env = "prod"),
            @Access(value = Role.SUPER_USER, env = "test")})
    public View getAccountView() {
        return createAccountView();
    }

    private View createAccountView() {
        //just returning null, it's not important in this example
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        for (Access a : RepeatAnnotationMain.class.getMethod("getAccountView")
                .getDeclaredAnnotationsByType(Access.class)) {
            System.out.println(a.value());
        }

        //another way
        MultiAccess m = RepeatAnnotationMain.class.getMethod("getAccountView")
                .getDeclaredAnnotation(MultiAccess.class);
        for (Access a : m.value()) {
            System.out.println(a.value());
        }

    }
}
