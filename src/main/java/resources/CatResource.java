package resources;

import entity.Cat;
import entity.Owner;
import services.CatService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/cats")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatResource {
    @Inject
    CatService catService;


    // public List<Cat> get() {
    //    return catService.get();
    // }
    @GET
    public Response get() {
        List<Cat> cats = catService.get();
        return Response.ok(cats).build();
    }

    @POST
    public void create(Cat cat) {
        catService.create(cat);

    }

    @PUT
    public void update(Cat cat) {
        catService.update(cat);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        catService.delete(id);
    }
}
