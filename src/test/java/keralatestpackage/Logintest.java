
package keralatestpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import keralabasepackage.BaseClass;

public class Logintest extends BaseClass {

    @Test(priority = 1)
    public void titleverificationmethod() {

        String actualtitle = loginobj.titlemethod();

        System.out.println(actualtitle);

        Assert.assertEquals(actualtitle, "Post your Property - Login | Keralaproperty");
    }

    @Test(priority = 2)
    public void loginvalidationmethod() {

        loginobj.LoginMethod("abc@gmail.com", "1234");
    }
}
