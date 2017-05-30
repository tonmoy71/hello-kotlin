package interop;

import java.io.IOException;

/**
 * Created by tonmoy on 30-May-17.
 */
public class TalkToKotlin {

    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, null, null, null);

        customerKotlin.setEmail("name@email.com");

        int value = customerKotlin.someField;

        customerKotlin.changeStatus(Status.CURRENT);
        customerKotlin.changeStatus();
        customerKotlin.preferential();

        UtilityClass.prefix("some", "value");
        int copyrightYear = UtilityClass.CopyrightYear;

        CustomerKotlinKt.extension(customerKotlin);
    }
}
