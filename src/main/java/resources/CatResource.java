package resources;

import entity.Cat;
import services.CatService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cats")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatResource {
    @Inject
    CatService catService;

    @GET
    public List<Cat> get() {
        return catService.get();
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
