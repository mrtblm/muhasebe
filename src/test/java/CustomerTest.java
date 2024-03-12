import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muhasebe.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerGun() {
        Hesaplama hesaplama = new Hesaplama();
        int calismaGun = hesaplama.maas();
        assertEquals(5,calismaGun);
        System.out.println("Junit Test");
    }

}
