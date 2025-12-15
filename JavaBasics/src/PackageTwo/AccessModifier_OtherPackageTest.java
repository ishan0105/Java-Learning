package PackageTwo;

import PackageOne.AccessModifier_Parent;

public class AccessModifier_OtherPackageTest {
    public static void main(String[] args) {
        AccessModifier_Parent p = new AccessModifier_Parent();

        // ✔ public accessible
        System.out.println(p.publicVar);
        p.publicMethod();

        // ❌ protected NOT accessible (no inheritance, different package)
        // System.out.println(p.protectedVar);
        // p.protectedMethod();

        // ❌ default NOT accessible (different package)
        // System.out.println(p.defaultVar);
        // p.defaultMethod();

        // ❌ private NEVER accessible
        // System.out.println(p.privateVar);
        // p.privateMethod();
    }
}
