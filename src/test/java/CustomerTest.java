
import org.muhasebe.*;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test(groups = "unit")
    public void testCustomerGun() {
        Hesaplama hesaplama = new Hesaplama();

        int calismaGun = hesaplama.maas();
        assertEquals(5,calismaGun);
        System.out.println("testNG");
    }

}
