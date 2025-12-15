package PackageOne;

public class AccessModifier_SamePackageTest {
    public static void main(String[] args) {
        AccessModifier_Parent p = new AccessModifier_Parent();

        // Accessible (same package)
        System.out.println(p.publicVar);
        System.out.println(p.protectedVar);
        System.out.println(p.defaultVar);

        p.publicMethod();
        p.protectedMethod();
        p.defaultMethod();

        // ❌ Not accessible — private is only inside Parent
        // System.out.println(p.privateVar);
        // p.privateMethod();
    }
}
