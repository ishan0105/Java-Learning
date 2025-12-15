package PackageOne;

public class AccessModifier_Parent {
    public String publicVar = "PUBLIC";
    public String privateVar = "PRIVATE";
    protected String protectedVar = "PROTECTED";
    String defaultVar = "DEFAULT (package-private)";

    public void publicMethod(){
        System.out.println("Public method!");
    }

    private void privateMethod(){
        System.out.println("Private method!");
    }

    protected void protectedMethod(){
        System.out.println("Protected method!");
    }

    void defaultMethod(){
        System.out.println("Default method!");
    }

    // Same class access: ALL are accessible here
    public void showAccessInsideClass() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);

        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}
