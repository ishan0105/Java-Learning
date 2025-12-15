package PackageTwo;

import PackageOne.AccessModifier_Parent;

public class AccessModifier_Child extends AccessModifier_Parent {

    public void testAccess() {
        // ✔ public accessible everywhere
        System.out.println(publicVar);
        publicMethod();

        // ✔ protected accessible (because Child extends Parent)
        System.out.println(protectedVar);
        protectedMethod();

        // ❌ default NOT accessible (different package)
        // System.out.println(defaultVar);
        // defaultMethod();

        // ❌ private NOT accessible anywhere except Parent itself
        // System.out.println(privateVar);
        // privateMethod();
    }
}
