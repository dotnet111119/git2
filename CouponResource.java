package masters.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("coupon")
public class CouponResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Coupon> getIt() {
        ArrayList<Coupon> list = new ArrayList<>();
        list.add(new Coupon(1, "Cafe"));
        list.add(new Coupon(2, "Maafe"));
        list.add(new Coupon(3, "Ugga"));
        return list;
    }	
	
}
